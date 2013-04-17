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
package shadowmage.ancient_warfare.common.soldiers.ai.objectives;

import shadowmage.ancient_warfare.common.config.Config;
import shadowmage.ancient_warfare.common.pathfinding.waypoints.WayPoint;
import shadowmage.ancient_warfare.common.soldiers.NpcBase;
import shadowmage.ancient_warfare.common.soldiers.ai.NpcAIObjective;
import shadowmage.ancient_warfare.common.soldiers.ai.tasks.AIMoveToTarget;
import shadowmage.ancient_warfare.common.utils.TargetType;

public class AIStayNearHome extends NpcAIObjective
{

int leashRange;
int chokeRange;

/**
 * @param npc
 * @param maxPriority
 */
public AIStayNearHome(NpcBase npc, int maxPriority, int range, int chokeRange)
  {
  super(npc, maxPriority);
  this.leashRange = range;
  this.chokeRange = chokeRange;
  }

@Override
public void addTasks()
  {
  this.aiTasks.add(new AIMoveToTarget(npc, chokeRange, false));
  }

@Override
public void updatePriority()
  {
  if(!npc.wayNav.hasHomePoint())
    {
    this.currentPriority = 0;
    }
  else
    {    
    WayPoint home = npc.wayNav.getHomePoint();
    float range = (float) npc.getDistance(home.x, home.y, home.z);
    if(range>leashRange)
      {
      this.currentPriority = this.maxPriority; 
      }
    else
      {
      if(this.currentPriority>0)
        {
        this.currentPriority--;
        }
      }
    }
  }

@Override
public void onRunningTick()
  {
  WayPoint home = npc.wayNav.getHomePoint();
  if(home==null)
    {
    Config.logDebug("ai stay near home: sensing no home point: setting finished");
    this.isFinished = true;
    this.cooldownTicks = this.maxCooldownticks;
    }
  else
    {
    float range = (float) npc.getDistance(home.x, home.y, home.z);
    if(range<chokeRange)
      {
      Config.logDebug("ai stay near home: sensing entity is within choke range: setting finished");
      this.isFinished = true;
      this.cooldownTicks = this.maxCooldownticks;
      }
    }  
  }

@Override
public void onObjectiveStart()
  {
  WayPoint home = npc.wayNav.getHomePoint();
  if(home!=null)
    {
    Config.logDebug("ai stay near home: setting move target");
    npc.setTargetAW(npc.targetHelper.getTargetFor(home.x, home.y, home.z, TargetType.MOVE));
    }
  else
    {
    Config.logDebug("ai stay near home: no home point: setting finished: clearing path and target");
    this.isFinished = true;
    this.cooldownTicks = this.maxCooldownticks;
    }  
  }

@Override
public void stopObjective()
  {
  Config.logDebug("ai stay near home: setting finished: clearing path and target");  
  npc.setTargetAW(null);
  npc.clearPath();
  }


}