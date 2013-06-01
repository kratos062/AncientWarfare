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
package shadowmage.ancient_warfare.common.crafting;

import java.util.Comparator;

public class RecipeSorterAZ implements Comparator<ResourceListRecipe>
{
/**
 * 
 */
public RecipeSorterAZ()
  {
  // TODO Auto-generated constructor stub
  }

@Override
public int compare(ResourceListRecipe arg0, ResourceListRecipe arg1)
  {
  if(arg0==null && arg1!=null){return -1;}
  else if(arg0!=null && arg1==null){return 1;}
  else if(arg0==null && arg1==null){return 0;}
  return arg0.getDisplayName().compareTo(arg1.getDisplayName());
  }

}
