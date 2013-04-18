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
package shadowmage.ancient_warfare.common.npcs.ai;

import java.util.Random;

import shadowmage.ancient_warfare.common.npcs.NpcBase;

public abstract class NpcAITask
{

public static final int NONE = 0;
public static final int WANDER = 1;
public static final int FOLLOW = 2;
public static final int ATTACK = 4;
public static final int HEAL = 8;
public static final int REPAIR = 16;
public static final int HARVEST = 32;
public static final int MOVE_TO = 64;
public static final int MOUNT_VEHICLE = 128;

protected NpcBase npc;
protected int taskType = 0;
protected int exclusiveTasks = 0;
protected final Random rng = new Random();

public NpcAITask(NpcBase npc)
  {
  this.npc = npc;
  }

public abstract void onTick();

public abstract boolean shouldExecute();

public boolean canExecute(int mutex)
  {
  return (this.exclusiveTasks & mutex) == 0;
  }


}