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
package shadowmage.ancient_warfare.common.civics.worksite.te.farm;

import java.util.Iterator;

import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import shadowmage.ancient_warfare.common.civics.TECivic;
import shadowmage.ancient_warfare.common.civics.WorkType;
import shadowmage.ancient_warfare.common.civics.worksite.WorkPoint;
import shadowmage.ancient_warfare.common.civics.worksite.WorkPointFarm;
import shadowmage.ancient_warfare.common.config.Config;
import shadowmage.ancient_warfare.common.network.GUIHandler;
import shadowmage.ancient_warfare.common.npcs.NpcBase;

public abstract class TEWorkSiteFarm extends TECivic
{

int mainBlockID;//the blockID that this civic looks for within its work bounds
int tilledEarthID = Block.tilledField.blockID;//the 'plantable' block. these are the 'plant' points, if y+1 is not mainBlockID
int mainBlockMatureMeta;

public TEWorkSiteFarm()
  {
  
  }

@Override
public boolean onInteract(World world, EntityPlayer player)
  {
  if(!world.isRemote)
    {
    GUIHandler.instance().openGUI(GUIHandler.CIVIC_BASE, player, world, xCoord, yCoord, zCoord);
    }
  //TODO set a control GUI
  return true;
  }

@Override
public void updateWorkPoints()
  {
  super.updateWorkPoints();
  for(int x = this.minX; x<=this.maxX; x++)
    {
    for(int y = this.minY; y<=this.maxY; y++)
      {
      for(int z = this.minZ; z<=this.maxZ; z++)
        {        
        this.updateOrAddWorkPoint(x, y, z);
        }
      }
    }
  }

protected void updateOrAddWorkPoint(int x, int y, int z)
  {
  WorkPointFarm p;
  WorkType t = null;
  if(worldObj.getBlockId(x, y, z)==tilledEarthID)
    {
    t = WorkType.FARM_PLANT;
    }
  else if(worldObj.getBlockId(x, y-1, z)==tilledEarthID)
    {
    t = WorkType.FARM_HARVEST;
    }
  else
    {
    return;
    }
  p = new WorkPointFarm(x,y,z, t, mainBlockID, mainBlockMatureMeta);
  if(!this.workPoints.contains(p))
    {    
    this.workPoints.add(p);
    }
  }

}
