/**
   Copyright 2012-2013 John Cummens (aka Shadowmage, Shadowmage4513)
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
package buildcraft.api.power;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraftforge.common.ForgeDirection;
import buildcraft.api.core.SafeTimeTracker;

public final class PowerHandler
{

public static enum Type 
{
ENGINE, GATE, MACHINE, PIPE, STORAGE;
public boolean canReceiveFromPipes()
  {
  return false;
  }

public boolean eatsEngineExcess()
  {
  return false;
  }
}

public static class PerditionCalculator
{

public PerditionCalculator()
  {
  
  }

public PerditionCalculator(float powerLoss)
  {
 
  }

public float applyPerdition(PowerHandler powerHandler, float current, long ticksPassed)
  {
  return 0.f;
  }
}

public PowerHandler(IPowerReceptor receptor, Type type)
  {
 
  }

public PowerReceiver getPowerReceiver()
  {
  return null;
  }

public float getMinEnergyReceived()
  {
  return 0.f;
  }

public float getMaxEnergyReceived()
  {
  return 0.f;
  }

public float getMaxEnergyStored()
  {
  return 0.f;
  }

public float getActivationEnergy() 
  {
  return 0.f;
  }

public float getEnergyStored() 
  {
  return 0.f;
  }

public void configure(float minEnergyReceived, float maxEnergyReceived, float activationEnergy, float maxStoredEnergy) 
  {
 
  }

public void configurePowerPerdition(int powerLoss, int powerLossRegularity) 
  {
 
  }

public void setPerdition(PerditionCalculator perdition) 
  {
 
  }

public PerditionCalculator getPerdition() 
  {
  return null;
  }

public void update() 
  {
 
  }

private void applyPerdition() 
  {
 
  }

private void applyWork() 
  {
 
  }

private void updateSources(ForgeDirection source) 
  {
 
  }

public float useEnergy(float min, float max, boolean doUse) 
  {
  return 0.f;
  }

public void readFromNBT(NBTTagCompound data) 
  {

  }

public void readFromNBT(NBTTagCompound data, String tag) 
  {
  
  }

public void writeToNBT(NBTTagCompound data) 
  {

  }

public void writeToNBT(NBTTagCompound data, String tag) 
  {
  
  }

public final class PowerReceiver 
{

private PowerReceiver() 
  {
  }

public float getMinEnergyReceived()
  {
  return 0.f;
  }

public float getMaxEnergyReceived()
  {
  return 0.f;
  }

public float getMaxEnergyStored()
  {
  return 0.f;
  }

public float getActivationEnergy() 
  {
  return 0.f;
  }

public float getEnergyStored() 
  {
  return 0.f;
  }

public Type getType() 
  {
  return null;
  }

public void update() 
  {
  
  }

public float powerRequest() 
  {
  return 0.f;
  }

public float receiveEnergy(Type source, final float quantity, ForgeDirection from) 
  {
  return 0.f;
  }
}

public float addEnergy(float quantity) 
  {
  return 0.f;
  }

public void setEnergy(float quantity) 
  {
 
  }

public boolean isPowerSource(ForgeDirection from) 
  {
  return false;
  }

private void validateEnergy() 
  {

  }

}
