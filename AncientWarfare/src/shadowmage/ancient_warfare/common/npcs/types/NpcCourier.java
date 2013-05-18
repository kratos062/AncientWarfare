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
package shadowmage.ancient_warfare.common.npcs.types;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.entity.player.EntityPlayer;
import shadowmage.ancient_warfare.common.civics.CivicWorkType;
import shadowmage.ancient_warfare.common.civics.TECivic;
import shadowmage.ancient_warfare.common.config.Config;
import shadowmage.ancient_warfare.common.network.GUIHandler;
import shadowmage.ancient_warfare.common.npcs.NpcBase;
import shadowmage.ancient_warfare.common.npcs.NpcTypeBase;
import shadowmage.ancient_warfare.common.npcs.ai.NpcAIObjective;
import shadowmage.ancient_warfare.common.npcs.ai.objectives.AICourier;
import shadowmage.ancient_warfare.common.npcs.ai.objectives.AIDepositGoods;
import shadowmage.ancient_warfare.common.npcs.ai.objectives.AIFollowPlayer;
import shadowmage.ancient_warfare.common.npcs.ai.objectives.AINpcUpkeepObjective;
import shadowmage.ancient_warfare.common.npcs.ai.objectives.AISeekShelter;
import shadowmage.ancient_warfare.common.npcs.ai.objectives.AIStayNearHome;
import shadowmage.ancient_warfare.common.npcs.ai.objectives.AIWander;
import shadowmage.ancient_warfare.common.npcs.helpers.NpcTargetHelper;
import shadowmage.ancient_warfare.common.npcs.helpers.targeting.AITargetEntry;
import shadowmage.ancient_warfare.common.targeting.TargetType;

public class NpcCourier extends NpcTypeBase
{

/**
 * @param type
 */
public NpcCourier(int type)
  {
  super(type); 
  this.displayName = "Courier";
  this.tooltip = "Transports Items";
  this.iconTexture = "npcWorker1";  
  this.addLevel("Courier Novice", Config.texturePath + "models/npc/npcCourier.png", getToolStack(0), null).addTargetType(CivicWorkType.COURIER).setInventorySize(9).setActionTicks(40);
  this.addLevel("Courier Adept", Config.texturePath + "models/npc/npcCourier.png", getToolStack(1), null).addTargetType(CivicWorkType.COURIER).setInventorySize(18).setActionTicks(30);
  this.addLevel("Courier Master", Config.texturePath + "models/npc/npcCourier.png", getToolStack(2), null).addTargetType(CivicWorkType.COURIER).setInventorySize(27).setActionTicks(20);
  this.isCombatUnit = false;
  this.defaultTargets = new String[]{"Zombie", "Spider","Creeper", "CaveSpider", "Blaze", 
      "Enderman", "Ghast", "Giant", "LavaSlime", "PigZombie", "Silverfish", "Skeleton", "Slime"};
  this.configName = "civilian";
  }

@Override
public void addTargets(NpcBase npc, NpcTargetHelper helper)
  {
  helper.addTargetEntry(new AITargetEntry(npc, TargetType.WORK, TECivic.class, 0, false, 140));
  }

@Override
public List<NpcAIObjective> getAI(NpcBase npc, int level)
  {
  ArrayList<NpcAIObjective> aiEntries = new ArrayList<NpcAIObjective>();   
  aiEntries.add(new AIFollowPlayer(npc, 90));
  aiEntries.add(new AISeekShelter(npc, 85));
  aiEntries.add(new AINpcUpkeepObjective(npc, 82));
  aiEntries.add(new AICourier(npc, 80));
//  aiEntries.add(new AIGoToWork(npc, 80));  
  aiEntries.add(new AIDepositGoods(npc, 80));
  aiEntries.add(new AIStayNearHome(npc, 70, 40, 15));
  aiEntries.add(new AIWander(npc, 10));
  return aiEntries;
  }

@Override
public void openGui(EntityPlayer player, NpcBase npc)
  {  
  GUIHandler.instance().openGUI(GUIHandler.NPC_COURIER, player, npc.worldObj, npc.entityId, 0, 0);
  }

}
