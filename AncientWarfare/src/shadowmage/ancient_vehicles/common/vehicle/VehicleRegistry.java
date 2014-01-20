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
package shadowmage.ancient_vehicles.common.vehicle;

import java.util.HashMap;

public class VehicleRegistry
{

private static HashMap<String, Class> firingHelpers = new HashMap<String, Class>();
private static HashMap<String, Object> moveTypes = new HashMap<String, Object>();

/**
 * should be called from pre/init to load vehicle types from definition file
 * will then register the necessary stuff with language/item/descriptions/etc
 */
public static void loadVehicles()
  {
  
  }

public static Class getFiringHelperClass(String name)
  {
  return firingHelpers.get(name);
  }

public static Object getMoveType(String name)
  {
  return moveTypes.get(name);
  }



}