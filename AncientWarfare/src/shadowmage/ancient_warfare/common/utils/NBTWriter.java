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
package shadowmage.ancient_warfare.common.utils;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

import net.minecraft.nbt.CompressedStreamTools;
import net.minecraft.nbt.NBTTagCompound;

import com.google.common.io.ByteArrayDataInput;
import com.google.common.io.ByteArrayDataOutput;

public class NBTWriter
{


/**
 * Writes a compressed NBTTagCompound to the OutputStream
 */
public static void writeNBTTagCompound(NBTTagCompound tag, DataOutputStream data) throws IOException
  {
  if (tag == null)
    {
    data.writeShort(-1);
    }
  else
    {
    byte[] var2 = CompressedStreamTools.compress(tag);
    data.writeShort((short)var2.length);
    data.write(var2);
    }
  }

/**
 * Reads a compressed NBTTagCompound from the InputStream
 */
public static NBTTagCompound readNBTTagCompound(DataInputStream data) throws IOException
  {
  short var1 = data.readShort();
  
  if (var1 < 0)
    {
    return null;
    }
  else
    {
    byte[] var2 = new byte[var1];
    data.readFully(var2);
    return CompressedStreamTools.decompress(var2);
    }
  }

/**
 * read a tag from a datastream, using google iowrapper
 * @param data
 * @return
 */
public static NBTTagCompound readTagFromStream(ByteArrayDataInput data)
  {
  short var1 = data.readShort();  
  if (var1 < 0)
    {
    return null;
    }
  else
    {
    byte[] var2 = new byte[var1];
    data.readFully(var2);
    try
      {
      return CompressedStreamTools.decompress(var2);
      } 
    catch (IOException e)
      {
      e.printStackTrace();
      }
    }
  return new NBTTagCompound();
  }

public static void writeTagToStream(NBTTagCompound tag, ByteArrayDataOutput data)
  {
  if (tag == null)
    {
    data.writeShort(-1);
    }
  else
    {
    byte[] var2;
    try
      {
      var2 = CompressedStreamTools.compress(tag);
      data.writeShort((short)var2.length);
      data.write(var2);
      } 
    catch (IOException e)
      {
      e.printStackTrace();      
      }
    }
  
  }

}