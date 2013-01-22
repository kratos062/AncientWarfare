/**
   Copyright 2012 John Cummens (aka Shadowmage, Shadowmage4513)
   This software is distributed under the terms of the GNU General Public Licence.
   Please see COPYING for precise license information.

   This file is part of Ancient Warfare.

   Ancient Warfare is free software: you can redistribute it and/or modify
   it under the terms of the GNU General Public License as published by
   the Free Software Foundation, either version 3 of the License, or
   (at your option) any later version.

   Ancient Warfare is distributed in the hope that it will be useful,
   but WITHOUT ANY WARRANTY; without even the implied warranty of
   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
   GNU General Public License for more details.

   You should have received a copy of the GNU General Public License
   along with Ancient Warfare.  If not, see <http://www.gnu.org/licenses/>.
 */
package shadowmage.ancient_warfare.common.aw_core.tracker;

import java.io.File;
import java.io.IOException;

import net.minecraft.nbt.CompressedStreamTools;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.dedicated.DedicatedServer;
import net.minecraft.world.World;
import shadowmage.ancient_warfare.common.aw_core.config.Config;
import shadowmage.ancient_warfare.common.aw_structure.AWStructureModule;

/**
 * handles saving and loading of game data to world directory
 * @author Shadowmage
 *
 */
public class GameDataTracker
{

private static GameDataTracker INSTANCE;
private GameDataTracker()
  {  
  }
public static GameDataTracker instance()
  {
  if(INSTANCE==null)
    {
    INSTANCE = new GameDataTracker();
    }
  return INSTANCE;
  }

private String lastSavePath = "";
private long lastLoadedTimeStamp = -1L;

public void resetAllTrackedData()
  {
  PlayerTracker.instance().clearAllData();
  TeamTracker.instance().clearAllData();
  AWStructureModule.instance().clearAllData();
  this.lastLoadedTimeStamp = -1L;
  }

public void handleWorldLoad(World world)
  {
  /**
   * load stats file, populate globalTag
   */  
  File part1 = MinecraftServer.getServer().getFile("");
  String part2 = MinecraftServer.getServer().getFolderName();      
  String filePart2 = part1+"/saves/"+part2;
  if((MinecraftServer.getServer() instanceof DedicatedServer))
    {
    filePart2 = part1+"/"+part2;
    }

  if(!filePart2.equals(lastSavePath))
    {
    this.lastSavePath = filePart2;
    this.resetAllTrackedData();
    }

  File rawFile = new File(filePart2,"AWWorldData.dat");
  NBTTagCompound tag = null;
  try
    {
    tag = CompressedStreamTools.read(rawFile);
    }
  catch (IOException e)
    {
    Config.logError("could not load AWWorldData, no such file, or improper format");
    return;
    }
  if(tag==null)
    {
    Config.logError("Null data tag loaded from file, aborting loading of world stats");
    return;
    }
  long time = tag.getLong("tS");
  
  if(this.lastLoadedTimeStamp>0)
    {
    /**
     * compare timestamps...if the just read one is OLDER/THE SAME as the existing copy....do nothing
     */    
    if(time <= this.lastLoadedTimeStamp)
      {        
      return;
      }    
    //      if(!this.compareDates(globalTag.getLong("tS"), time))
    //        {
    //        return;
    //        }
    }   
  this.lastLoadedTimeStamp = time;
  
  if(tag.hasKey("playerData"))
    {
    PlayerTracker.instance().readFromNBT(tag.getCompoundTag("playerData"));
    }
  if(tag.hasKey("teamData"))
    {
    TeamTracker.instance().readFromNBT(tag.getCompoundTag("teamData"));
    }
  if(tag.hasKey("builders"))
    {
    AWStructureModule.instance().readFromNBT(tag.getCompoundTag("builders"));
    }  
  }

public void handleWorldSave(World world)
  {
  NBTTagCompound tag = new NBTTagCompound();
  /**
   * save system time into tag
   */
  tag.setLong("tS", System.currentTimeMillis());
  File part1 = MinecraftServer.getServer().getFile("");
  String part2 = MinecraftServer.getServer().getFolderName();      
  String filePart2 = part1+"/saves/"+part2;
  if((MinecraftServer.getServer() instanceof DedicatedServer))
    {
    filePart2 = part1+"/"+part2;
    }
  File rawFile = new File(filePart2,"AWWorldData.dat");  
  try
    {
    this.lastSavePath = filePart2;
    NBTTagCompound setTag = PlayerTracker.instance().getNBTTag();
    if(setTag!=null)
      {
      tag.setCompoundTag("playerData", setTag);
      }
    setTag = TeamTracker.instance().getNBTTag();
    if(setTag!=null)
      {
      tag.setCompoundTag("teamData", setTag);
      }
    setTag = AWStructureModule.instance().getNBTTag();
    if(setTag!=null)
      {
      tag.setCompoundTag("builders", setTag);
      }
    CompressedStreamTools.write(tag, rawFile);
    }
  catch (IOException e)
    {
    Config.logError("SEVERE ERROR SAVING WORLD STATS FILE TO WORLD FOLDER");
    return;
    }  
  }


}
