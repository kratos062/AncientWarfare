/**
   Copyright 2012 John Cummens (aka Shadowmage, Shadowmage4513)
   This software is distributed under the terms of the GNU General Public License.
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
package shadowmage.ancient_structures.common.village_gen;

import java.util.List;
import java.util.Random;

import net.minecraft.world.gen.structure.ComponentVillageStartPiece;
import net.minecraft.world.gen.structure.StructureBoundingBox;
import net.minecraft.world.gen.structure.StructureComponent;
import net.minecraft.world.gen.structure.StructureVillagePieceWeight;
import cpw.mods.fml.common.registry.VillagerRegistry.IVillageCreationHandler;

public class VillageGenHook implements IVillageCreationHandler
{

int maxNum;
int weight;
ProcessedStructure structure;
Class<? extends VillageGenComponent> componentClass;

public VillageGenHook(Class<? extends VillageGenComponent> clz, int max, int weight, ProcessedStructure structure)
  {
  this.componentClass = clz;
  this.maxNum = max;
  this.weight = weight;
  this.structure = structure;
  }

@Override
public StructureVillagePieceWeight getVillagePieceWeight(Random random, int i)
  {
  return new StructureVillagePieceWeight(componentClass, weight, random.nextInt(maxNum+1));
  }

@Override
public Class<?> getComponentClass()
  {
  return componentClass;
  }

@Override
public Object buildComponent(StructureVillagePieceWeight villagePiece, ComponentVillageStartPiece startPiece, List pieces, Random random, int x, int y, int z, int face, int type)
  {
	if(structure==null){return null;}
  StructureBoundingBox structureboundingbox = StructureBoundingBox.getComponentToAddBoundingBox(x, y, z, 0, -structure.verticalOffset, 0, structure.xSize, structure.ySize, structure.zSize, face);  
  boolean canGenerate = (structureboundingbox != null && structureboundingbox.minY > 10);
  if(canGenerate)
    {
    canGenerate = StructureComponent.findIntersecting(pieces, structureboundingbox) == null ? true : false;
    }
  return canGenerate ? VillageGenerator.constructComponent(componentClass, startPiece, type, face,  structure, x, y, z, structureboundingbox) : null;
  }


}