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
package shadowmage.ancient_framework.client.model;

public class ModelBaseAWPickable extends ModelBaseAW
{

public ModelBaseAWPickable()
  {
 
  }


public void renderForSelection()
  {
  int startColor = 0xff000000;
  for(ModelPiece piece : this.basePieces)
    {
    startColor = piece.renderForSelection(startColor);
    }
  }

public Primitive getSelectedPrimitive(int startNum, int selection)
  {  
  selectedPrimitive = null;
  for(ModelPiece piece : this.basePieces)
    {
    startNum = piece.getSelectedPrimitive(startNum, selection);
    if(selectedPrimitive!=null)
      {
      return selectedPrimitive;
      }
    }
  return null;
  } 

}
