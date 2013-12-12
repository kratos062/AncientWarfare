//auto-generated model template
//template generated by MEIM
//template v 1.0
//author Shadowmage45 (shadowage_catapults@hotmail.com)
 
package shadowmage.ancient_warfare.client.model;

import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import shadowmage.ancient_framework.common.utils.Trig;
 
 
public class ModelBoatCatapult extends ModelVehicleBase
{
 
ModelRenderer bottomP1;
ModelRenderer bow;
ModelRenderer leftHull1;
ModelRenderer leftHull2;
ModelRenderer bow2;
ModelRenderer leftHull3;
ModelRenderer leftHull4;
ModelRenderer leftHull5;
ModelRenderer leftHull6;
ModelRenderer bow4P1;
ModelRenderer bowTop;
ModelRenderer bow3;
ModelRenderer bow3P1;
ModelRenderer leftRight1;
ModelRenderer rightHull2;
ModelRenderer rightHull3;
ModelRenderer rightHull4;
ModelRenderer rightHull5;
ModelRenderer rightHull6;
ModelRenderer stern;
ModelRenderer paddleLeft;
ModelRenderer paddleRight;
ModelRenderer padleAxle;
ModelRenderer sokeL1;
ModelRenderer paddle2;
ModelRenderer paddle6;
ModelRenderer sokeR1;
ModelRenderer sokeL2;
ModelRenderer paddle1;
ModelRenderer paddle5;
ModelRenderer sokeR2;
ModelRenderer sokeR3;
ModelRenderer sokeR4;
ModelRenderer sokeL3;
ModelRenderer paddle4;
ModelRenderer paddle7;
ModelRenderer sokeL4;
ModelRenderer paddle3;
ModelRenderer paddle8;
ModelRenderer paddleLeft2;
ModelRenderer paddleRight2;
ModelRenderer bow5P1;
ModelRenderer bow6P2;
ModelRenderer bow5P2;
ModelRenderer bow4P2;
ModelRenderer bow6P1;
ModelRenderer bow3P2;
ModelRenderer bottomP2;
ModelRenderer bottomP3;
ModelRenderer bottomP4;
ModelRenderer chairBrace;
ModelRenderer chairBottom;
ModelRenderer chairBack;
ModelRenderer deckP2;
ModelRenderer deckP3;
ModelRenderer deckP1;
ModelRenderer deckP4;
ModelRenderer turretMidBeam;
ModelRenderer upright1;
ModelRenderer upright2;
ModelRenderer turretTopHorizontal;
ModelRenderer turretLeftAngled;
ModelRenderer turretRightAngled;
ModelRenderer pulleyAxle;
ModelRenderer pulleyArm1;
ModelRenderer pulleyArm2;
ModelRenderer turretFrontBeam;
ModelRenderer turretRearBeam;
ModelRenderer armMain;
ModelRenderer bucket1;
ModelRenderer bucket3;
ModelRenderer bucket6;
ModelRenderer bucket4;
ModelRenderer bucket2;
ModelRenderer turretLeftBeam1;
ModelRenderer turretLeftBeam2;
ModelRenderer turretRightBeam1;
ModelRenderer turretRightBeam2;
ModelRenderer turretLeftAngle2;
ModelRenderer turretRightAngle2;
ModelRenderer standP1;
ModelRenderer standP2;
ModelRenderer standP3;
ModelRenderer standP4;
ModelRenderer flagPole;
ModelRenderer flagCloth;
public ModelBoatCatapult(){
  bottomP1 = new ModelRenderer(this,"bottomP1");
  bottomP1.setTextureOffset(0,31);
  bottomP1.setTextureSize(256,256);
  bottomP1.setRotationPoint(0.0f, 0.0f, 0.0f);
  setPieceRotation(bottomP1,0.0f, 0.0f, 0.0f);
  bottomP1.addBox(-15.0f,-1.0f,-24.0f,15,1,24);
  bow = new ModelRenderer(this,"bow");
  bow.setTextureOffset(161,89);
  bow.setTextureSize(256,256);
  bow.setRotationPoint(0.0f, 0.0f, -24.0f);
  setPieceRotation(bow,-0.7853974f, 0.0f, 3.120892E-9f);
  bow.addBox(-15.5f,-1.0f,-16.0f,31,1,16);
  bottomP1.addChild(bow);
  leftHull1 = new ModelRenderer(this,"leftHull1");
  leftHull1.setTextureOffset(157,28);
  leftHull1.setTextureSize(256,256);
  leftHull1.setRotationPoint(15.0f, -1.0f, 0.0f);
  setPieceRotation(leftHull1,0.0f, 0.0f, 0.0f);
  leftHull1.addBox(0.0f,-12.0f,-24.0f,1,12,48);
  bottomP1.addChild(leftHull1);
  leftHull2 = new ModelRenderer(this,"leftHull2");
  leftHull2.setTextureOffset(93,86);
  leftHull2.setTextureSize(256,256);
  leftHull2.setRotationPoint(15.0f, -12.0f, -35.0f);
  setPieceRotation(leftHull2,0.0f, 0.0f, 0.0f);
  leftHull2.addBox(0.0f,-1.0f,0.0f,1,3,11);
  bottomP1.addChild(leftHull2);
  bow2 = new ModelRenderer(this,"bow2");
  bow2.setTextureOffset(154,5);
  bow2.setTextureSize(256,256);
  bow2.setRotationPoint(0.0f, 0.0f, -25.0f);
  setPieceRotation(bow2,-0.7853974f, 0.0f, 3.120892E-9f);
  bow2.addBox(14.5f,-2.0f,-17.0f,2,2,17);
  bottomP1.addChild(bow2);
  leftHull3 = new ModelRenderer(this,"leftHull3");
  leftHull3.setTextureOffset(132,76);
  leftHull3.setTextureSize(256,256);
  leftHull3.setRotationPoint(15.0f, -9.0f, -33.0f);
  setPieceRotation(leftHull3,0.0f, 0.0f, 0.0f);
  leftHull3.addBox(0.0f,-1.0f,0.0f,1,2,9);
  bottomP1.addChild(leftHull3);
  leftHull4 = new ModelRenderer(this,"leftHull4");
  leftHull4.setTextureOffset(115,76);
  leftHull4.setTextureSize(256,256);
  leftHull4.setRotationPoint(15.0f, -7.0f, -31.0f);
  setPieceRotation(leftHull4,0.0f, 0.0f, 0.0f);
  leftHull4.addBox(0.0f,-1.0f,0.0f,1,2,7);
  bottomP1.addChild(leftHull4);
  leftHull5 = new ModelRenderer(this,"leftHull5");
  leftHull5.setTextureOffset(102,76);
  leftHull5.setTextureSize(256,256);
  leftHull5.setRotationPoint(15.0f, -5.0f, -29.0f);
  setPieceRotation(leftHull5,0.0f, 0.0f, 0.0f);
  leftHull5.addBox(0.0f,-1.0f,0.0f,1,2,5);
  bottomP1.addChild(leftHull5);
  leftHull6 = new ModelRenderer(this,"leftHull6");
  leftHull6.setTextureOffset(93,76);
  leftHull6.setTextureSize(256,256);
  leftHull6.setRotationPoint(15.0f, -3.0f, -27.0f);
  setPieceRotation(leftHull6,0.0f, 0.0f, 0.0f);
  leftHull6.addBox(0.0f,-1.0f,0.0f,1,2,3);
  bottomP1.addChild(leftHull6);
  bow4P1 = new ModelRenderer(this,"bow4P1");
  bow4P1.setTextureOffset(91,33);
  bow4P1.setTextureSize(256,256);
  bow4P1.setRotationPoint(0.001f, 0.0f, -9.0f);
  setPieceRotation(bow4P1,0.0f, 0.0f, 3.120892E-9f);
  bow4P1.addBox(14.5f,-2.0f,-16.0f,2,2,25);
  bottomP1.addChild(bow4P1);
  bowTop = new ModelRenderer(this,"bowTop");
  bowTop.setTextureOffset(154,0);
  bowTop.setTextureSize(256,256);
  bowTop.setRotationPoint(0.0f, -0.5f, -24.0f);
  setPieceRotation(bowTop,-0.7853974f, 0.0f, 3.120892E-9f);
  bowTop.addBox(-15.5f,-1.0f,-17.0f,31,2,2);
  bottomP1.addChild(bowTop);
  bow3 = new ModelRenderer(this,"bow3");
  bow3.setTextureOffset(154,5);
  bow3.setTextureSize(256,256);
  bow3.setRotationPoint(1.0f, 0.0f, -25.0f);
  setPieceRotation(bow3,-0.7853973f, 0.0f, 3.120892E-9f);
  bow3.addBox(-17.5f,-2.0f,-17.0f,2,2,17);
  bottomP1.addChild(bow3);
  bow3P1 = new ModelRenderer(this,"bow3P1");
  bow3P1.setTextureOffset(91,33);
  bow3P1.setTextureSize(256,256);
  bow3P1.setRotationPoint(-32.001f, 0.0f, -9.0f);
  setPieceRotation(bow3P1,0.0f, 0.0f, 3.120892E-9f);
  bow3P1.addBox(15.5f,-2.0f,-16.0f,2,2,25);
  bottomP1.addChild(bow3P1);
  leftRight1 = new ModelRenderer(this,"leftRight1");
  leftRight1.setTextureOffset(157,28);
  leftRight1.setTextureSize(256,256);
  leftRight1.setRotationPoint(-16.0f, -1.0f, 0.0f);
  setPieceRotation(leftRight1,0.0f, 0.0f, 0.0f);
  leftRight1.addBox(0.0f,-12.0f,-24.0f,1,12,48);
  bottomP1.addChild(leftRight1);
  rightHull2 = new ModelRenderer(this,"rightHull2");
  rightHull2.setTextureOffset(93,86);
  rightHull2.setTextureSize(256,256);
  rightHull2.setRotationPoint(-16.0f, -12.0f, -35.0f);
  setPieceRotation(rightHull2,0.0f, 0.0f, 0.0f);
  rightHull2.addBox(0.0f,-1.0f,0.0f,1,3,11);
  bottomP1.addChild(rightHull2);
  rightHull3 = new ModelRenderer(this,"rightHull3");
  rightHull3.setTextureOffset(132,76);
  rightHull3.setTextureSize(256,256);
  rightHull3.setRotationPoint(-16.0f, -9.0f, -33.0f);
  setPieceRotation(rightHull3,0.0f, 0.0f, 0.0f);
  rightHull3.addBox(0.0f,-1.0f,0.0f,1,2,9);
  bottomP1.addChild(rightHull3);
  rightHull4 = new ModelRenderer(this,"rightHull4");
  rightHull4.setTextureOffset(115,76);
  rightHull4.setTextureSize(256,256);
  rightHull4.setRotationPoint(-16.0f, -7.0f, -31.0f);
  setPieceRotation(rightHull4,0.0f, 0.0f, 0.0f);
  rightHull4.addBox(0.0f,-1.0f,0.0f,1,2,7);
  bottomP1.addChild(rightHull4);
  rightHull5 = new ModelRenderer(this,"rightHull5");
  rightHull5.setTextureOffset(102,76);
  rightHull5.setTextureSize(256,256);
  rightHull5.setRotationPoint(-16.0f, -5.0f, -29.0f);
  setPieceRotation(rightHull5,0.0f, 0.0f, 0.0f);
  rightHull5.addBox(0.0f,-1.0f,0.0f,1,2,5);
  bottomP1.addChild(rightHull5);
  rightHull6 = new ModelRenderer(this,"rightHull6");
  rightHull6.setTextureOffset(93,76);
  rightHull6.setTextureSize(256,256);
  rightHull6.setRotationPoint(-16.0f, -3.0f, -27.0f);
  setPieceRotation(rightHull6,0.0f, 0.0f, 0.0f);
  rightHull6.addBox(0.0f,-1.0f,0.0f,1,2,3);
  bottomP1.addChild(rightHull6);
  stern = new ModelRenderer(this,"stern");
  stern.setTextureOffset(93,61);
  stern.setTextureSize(256,256);
  stern.setRotationPoint(0.0f, 0.0f, 39.999f);
  setPieceRotation(stern,0.0f, 0.0f, 3.120892E-9f);
  stern.addBox(-16.0f,-13.0f,-16.0f,32,13,1);
  bottomP1.addChild(stern);
  paddleLeft = new ModelRenderer(this,"paddleLeft");
  paddleLeft.setTextureOffset(0,67);
  paddleLeft.setTextureSize(256,256);
  paddleLeft.setRotationPoint(9.0f, -10.0f, 25.0f);
  setPieceRotation(paddleLeft,0.0f, 0.0f, 0.0f);
  paddleLeft.addBox(0.0f,0.0f,0.0f,1,6,8);
  bottomP1.addChild(paddleLeft);
  paddleRight = new ModelRenderer(this,"paddleRight");
  paddleRight.setTextureOffset(0,67);
  paddleRight.setTextureSize(256,256);
  paddleRight.setRotationPoint(-9.0f, -10.0f, 25.0f);
  setPieceRotation(paddleRight,0.0f, 0.0f, 0.0f);
  paddleRight.addBox(0.0f,0.0f,0.0f,1,6,8);
  padleAxle = new ModelRenderer(this,"padleAxle");
  padleAxle.setTextureOffset(0,64);
  padleAxle.setTextureSize(256,256);
  padleAxle.setRotationPoint(-1.0f, 3.0f, 8.5f);
  setPieceRotation(padleAxle,0.0f, 0.0f, 1.2483568E-8f);
  padleAxle.addBox(-0.0f,-0.5f,-0.5f,21,1,1);
  sokeL1 = new ModelRenderer(this,"sokeL1");
  sokeL1.setTextureOffset(0,98);
  sokeL1.setTextureSize(256,256);
  sokeL1.setRotationPoint(18.0f, 0.0f, 0.0f);
  setPieceRotation(sokeL1,0.0f, 0.0f, 0.0f);
  sokeL1.addBox(-0.5f,-0.5f,-7.5f,1,1,14);
  paddle2 = new ModelRenderer(this,"paddle2");
  paddle2.setTextureOffset(0,57);
  paddle2.setTextureSize(256,256);
  paddle2.setRotationPoint(-14.0f, 0.0f, 0.0f);
  setPieceRotation(paddle2,0.0f, 0.0f, 0.0f);
  paddle2.addBox(-0.5f,-0.5f,1.5f,14,1,5);
  sokeL1.addChild(paddle2);
  paddle6 = new ModelRenderer(this,"paddle6");
  paddle6.setTextureOffset(0,57);
  paddle6.setTextureSize(256,256);
  paddle6.setRotationPoint(-14.0f, 0.0f, 0.0f);
  setPieceRotation(paddle6,0.0f, 0.0f, 0.0f);
  paddle6.addBox(-0.5f,-0.5f,-7.5f,14,1,5);
  sokeL1.addChild(paddle6);
  padleAxle.addChild(sokeL1);
  sokeR1 = new ModelRenderer(this,"sokeR1");
  sokeR1.setTextureOffset(0,98);
  sokeR1.setTextureSize(256,256);
  sokeR1.setRotationPoint(3.0f, 0.0f, 0.0f);
  setPieceRotation(sokeR1,1.0402973E-9f, 0.0f, 0.0f);
  sokeR1.addBox(-0.5f,-0.5f,-7.5f,1,1,14);
  padleAxle.addChild(sokeR1);
  sokeL2 = new ModelRenderer(this,"sokeL2");
  sokeL2.setTextureOffset(0,98);
  sokeL2.setTextureSize(256,256);
  sokeL2.setRotationPoint(18.0f, 0.0f, 0.0f);
  setPieceRotation(sokeL2,1.5707964f, 0.0f, 0.0f);
  sokeL2.addBox(-0.5f,-0.5f,-7.5f,1,1,14);
  paddle1 = new ModelRenderer(this,"paddle1");
  paddle1.setTextureOffset(0,57);
  paddle1.setTextureSize(256,256);
  paddle1.setRotationPoint(-14.0f, 0.0f, 0.0f);
  setPieceRotation(paddle1,0.0f, 0.0f, 0.0f);
  paddle1.addBox(-0.5f,-0.5f,1.5f,14,1,5);
  sokeL2.addChild(paddle1);
  paddle5 = new ModelRenderer(this,"paddle5");
  paddle5.setTextureOffset(0,57);
  paddle5.setTextureSize(256,256);
  paddle5.setRotationPoint(-14.0f, 0.0f, 0.0f);
  setPieceRotation(paddle5,0.0f, 0.0f, 0.0f);
  paddle5.addBox(-0.5f,-0.5f,-7.5f,14,1,5);
  sokeL2.addChild(paddle5);
  padleAxle.addChild(sokeL2);
  sokeR2 = new ModelRenderer(this,"sokeR2");
  sokeR2.setTextureOffset(0,98);
  sokeR2.setTextureSize(256,256);
  sokeR2.setRotationPoint(3.0f, 0.0f, 0.0f);
  setPieceRotation(sokeR2,1.5707964f, 0.0f, 0.0f);
  sokeR2.addBox(-0.5f,-0.5f,-7.5f,1,1,14);
  padleAxle.addChild(sokeR2);
  sokeR3 = new ModelRenderer(this,"sokeR3");
  sokeR3.setTextureOffset(0,98);
  sokeR3.setTextureSize(256,256);
  sokeR3.setRotationPoint(3.0f, 0.0f, 0.0f);
  setPieceRotation(sokeR3,0.7853982f, 0.0f, 0.0f);
  sokeR3.addBox(-0.5f,-0.5f,-7.5f,1,1,14);
  padleAxle.addChild(sokeR3);
  sokeR4 = new ModelRenderer(this,"sokeR4");
  sokeR4.setTextureOffset(0,98);
  sokeR4.setTextureSize(256,256);
  sokeR4.setRotationPoint(3.0f, 0.0f, 0.0f);
  setPieceRotation(sokeR4,-0.7853982f, 0.0f, 0.0f);
  sokeR4.addBox(-0.5f,-0.5f,-7.5f,1,1,14);
  padleAxle.addChild(sokeR4);
  sokeL3 = new ModelRenderer(this,"sokeL3");
  sokeL3.setTextureOffset(0,98);
  sokeL3.setTextureSize(256,256);
  sokeL3.setRotationPoint(18.0f, 0.0f, 0.0f);
  setPieceRotation(sokeL3,0.7853982f, 0.0f, 0.0f);
  sokeL3.addBox(-0.5f,-0.5f,-7.5f,1,1,14);
  paddle4 = new ModelRenderer(this,"paddle4");
  paddle4.setTextureOffset(0,57);
  paddle4.setTextureSize(256,256);
  paddle4.setRotationPoint(-14.0f, 0.0f, 0.0f);
  setPieceRotation(paddle4,0.0f, 0.0f, 0.0f);
  paddle4.addBox(-0.5f,-0.5f,1.5f,14,1,5);
  sokeL3.addChild(paddle4);
  paddle7 = new ModelRenderer(this,"paddle7");
  paddle7.setTextureOffset(0,57);
  paddle7.setTextureSize(256,256);
  paddle7.setRotationPoint(-14.0f, 0.0f, 0.0f);
  setPieceRotation(paddle7,0.0f, 0.0f, 0.0f);
  paddle7.addBox(-0.5f,-0.5f,-7.5f,14,1,5);
  sokeL3.addChild(paddle7);
  padleAxle.addChild(sokeL3);
  sokeL4 = new ModelRenderer(this,"sokeL4");
  sokeL4.setTextureOffset(0,98);
  sokeL4.setTextureSize(256,256);
  sokeL4.setRotationPoint(18.0f, 0.0f, 0.0f);
  setPieceRotation(sokeL4,-0.7853982f, 0.0f, 0.0f);
  sokeL4.addBox(-0.5f,-0.5f,-7.5f,1,1,14);
  paddle3 = new ModelRenderer(this,"paddle3");
  paddle3.setTextureOffset(0,57);
  paddle3.setTextureSize(256,256);
  paddle3.setRotationPoint(-14.0f, 0.0f, 0.0f);
  setPieceRotation(paddle3,0.0f, 0.0f, 0.0f);
  paddle3.addBox(-0.5f,-0.5f,1.5f,14,1,5);
  sokeL4.addChild(paddle3);
  paddle8 = new ModelRenderer(this,"paddle8");
  paddle8.setTextureOffset(0,57);
  paddle8.setTextureSize(256,256);
  paddle8.setRotationPoint(-14.0f, 0.0f, 0.0f);
  setPieceRotation(paddle8,0.0f, 0.0f, 0.0f);
  paddle8.addBox(-0.5f,-0.5f,-7.5f,14,1,5);
  sokeL4.addChild(paddle8);
  padleAxle.addChild(sokeL4);
  paddleRight.addChild(padleAxle);
  bottomP1.addChild(paddleRight);
  paddleLeft2 = new ModelRenderer(this,"paddleLeft2");
  paddleLeft2.setTextureOffset(54,57);
  paddleLeft2.setTextureSize(256,256);
  paddleLeft2.setRotationPoint(9.0f, -9.0f, 33.0f);
  setPieceRotation(paddleLeft2,0.0f, 0.0f, 0.0f);
  paddleLeft2.addBox(0.0f,0.0f,0.0f,1,4,2);
  bottomP1.addChild(paddleLeft2);
  paddleRight2 = new ModelRenderer(this,"paddleRight2");
  paddleRight2.setTextureOffset(54,57);
  paddleRight2.setTextureSize(256,256);
  paddleRight2.setRotationPoint(-9.0f, -9.0f, 33.0f);
  setPieceRotation(paddleRight2,0.0f, 0.0f, 0.0f);
  paddleRight2.addBox(0.0f,0.0f,0.0f,1,4,2);
  bottomP1.addChild(paddleRight2);
  bow5P1 = new ModelRenderer(this,"bow5P1");
  bow5P1.setTextureOffset(89,0);
  bow5P1.setTextureSize(256,256);
  bow5P1.setRotationPoint(0.001f, -11.125f, -19.25f);
  setPieceRotation(bow5P1,0.0f, 0.0f, 3.120892E-9f);
  bow5P1.addBox(14.5f,-2.0f,-16.0f,2,2,30);
  bottomP1.addChild(bow5P1);
  bow6P2 = new ModelRenderer(this,"bow6P2");
  bow6P2.setTextureOffset(89,0);
  bow6P2.setTextureSize(256,256);
  bow6P2.setRotationPoint(-31.001f, -11.125f, 10.75f);
  setPieceRotation(bow6P2,0.0f, 0.0f, 3.120892E-9f);
  bow6P2.addBox(14.5f,-2.0f,-16.0f,2,2,30);
  bottomP1.addChild(bow6P2);
  bow5P2 = new ModelRenderer(this,"bow5P2");
  bow5P2.setTextureOffset(89,0);
  bow5P2.setTextureSize(256,256);
  bow5P2.setRotationPoint(0.001f, -11.125f, 10.75f);
  setPieceRotation(bow5P2,0.0f, 0.0f, 3.120892E-9f);
  bow5P2.addBox(14.5f,-2.0f,-16.0f,2,2,30);
  bottomP1.addChild(bow5P2);
  bow4P2 = new ModelRenderer(this,"bow4P2");
  bow4P2.setTextureOffset(91,33);
  bow4P2.setTextureSize(256,256);
  bow4P2.setRotationPoint(0.001f, 0.0f, 16.0f);
  setPieceRotation(bow4P2,0.0f, 0.0f, 3.120892E-9f);
  bow4P2.addBox(14.5f,-2.0f,-16.0f,2,2,25);
  bottomP1.addChild(bow4P2);
  bow6P1 = new ModelRenderer(this,"bow6P1");
  bow6P1.setTextureOffset(89,0);
  bow6P1.setTextureSize(256,256);
  bow6P1.setRotationPoint(-31.001f, -11.125f, -19.25f);
  setPieceRotation(bow6P1,0.0f, 0.0f, 3.120892E-9f);
  bow6P1.addBox(14.5f,-2.0f,-16.0f,2,2,30);
  bottomP1.addChild(bow6P1);
  bow3P2 = new ModelRenderer(this,"bow3P2");
  bow3P2.setTextureOffset(91,33);
  bow3P2.setTextureSize(256,256);
  bow3P2.setRotationPoint(-32.001f, 0.0f, 16.0f);
  setPieceRotation(bow3P2,0.0f, 0.0f, 3.120892E-9f);
  bow3P2.addBox(15.5f,-2.0f,-16.0f,2,2,25);
  bottomP1.addChild(bow3P2);
  bottomP2 = new ModelRenderer(this,"bottomP2");
  bottomP2.setTextureOffset(0,31);
  bottomP2.setTextureSize(256,256);
  bottomP2.setRotationPoint(0.0f, 0.0f, 24.0f);
  setPieceRotation(bottomP2,0.0f, 0.0f, 0.0f);
  bottomP2.addBox(-15.0f,-1.0f,-24.0f,15,1,24);
  bottomP1.addChild(bottomP2);
  bottomP3 = new ModelRenderer(this,"bottomP3");
  bottomP3.setTextureOffset(0,31);
  bottomP3.setTextureSize(256,256);
  bottomP3.setRotationPoint(15.0f, 0.0f, 24.0f);
  setPieceRotation(bottomP3,0.0f, 0.0f, 0.0f);
  bottomP3.addBox(-15.0f,-1.0f,-24.0f,15,1,24);
  bottomP1.addChild(bottomP3);
  bottomP4 = new ModelRenderer(this,"bottomP4");
  bottomP4.setTextureOffset(0,31);
  bottomP4.setTextureSize(256,256);
  bottomP4.setRotationPoint(15.0f, 0.0f, 0.0f);
  setPieceRotation(bottomP4,0.0f, 0.0f, 0.0f);
  bottomP4.addBox(-15.0f,-1.0f,-24.0f,15,1,24);
  bottomP1.addChild(bottomP4);
  chairBrace = new ModelRenderer(this,"chairBrace");
  chairBrace.setTextureOffset(70,59);
  chairBrace.setTextureSize(256,256);
  chairBrace.setRotationPoint(-1.5f, -11.0f, -15.0f);
  setPieceRotation(chairBrace,0.0f, 0.0f, 0.0f);
  chairBrace.addBox(0.0f,0.0f,-8.0f,3,1,7);
  chairBottom = new ModelRenderer(this,"chairBottom");
  chairBottom.setTextureOffset(54,68);
  chairBottom.setTextureSize(256,256);
  chairBottom.setRotationPoint(-3.5f, -1.5f, -1.0f);
  setPieceRotation(chairBottom,0.1570796f, 0.0f, 0.0f);
  chairBottom.addBox(0.0f,0.0f,-9.0f,10,1,9);
  chairBrace.addChild(chairBottom);
  chairBack = new ModelRenderer(this,"chairBack");
  chairBack.setTextureOffset(49,79);
  chairBack.setTextureSize(256,256);
  chairBack.setRotationPoint(-3.5f, -1.0f, -1.0f);
  setPieceRotation(chairBack,-0.1745329f, 0.0f, 0.0f);
  chairBack.addBox(0.0f,-10.0f,0.0f,10,10,1);
  chairBrace.addChild(chairBack);
  bottomP1.addChild(chairBrace);
  deckP2 = new ModelRenderer(this,"deckP2");
  deckP2.setTextureOffset(0,0);
  deckP2.setTextureSize(256,256);
  deckP2.setRotationPoint(0.0f, -9.25f, 19.9f);
  setPieceRotation(deckP2,0.0f, 0.0f, 0.0f);
  deckP2.addBox(-15.0f,-1.0f,-24.0f,15,1,29);
  bottomP1.addChild(deckP2);
  deckP3 = new ModelRenderer(this,"deckP3");
  deckP3.setTextureOffset(0,0);
  deckP3.setTextureSize(256,256);
  deckP3.setRotationPoint(15.0f, -9.25f, 19.9f);
  setPieceRotation(deckP3,0.0f, 0.0f, 0.0f);
  deckP3.addBox(-15.0f,-1.0f,-24.0f,15,1,29);
  bottomP1.addChild(deckP3);
  deckP1 = new ModelRenderer(this,"deckP1");
  deckP1.setTextureOffset(0,0);
  deckP1.setTextureSize(256,256);
  deckP1.setRotationPoint(0.0f, -9.25f, -9.1f);
  setPieceRotation(deckP1,0.0f, 0.0f, 0.0f);
  deckP1.addBox(-15.0f,-1.0f,-24.0f,15,1,29);
  bottomP1.addChild(deckP1);
  deckP4 = new ModelRenderer(this,"deckP4");
  deckP4.setTextureOffset(0,0);
  deckP4.setTextureSize(256,256);
  deckP4.setRotationPoint(15.0f, -9.25f, -9.1f);
  setPieceRotation(deckP4,0.0f, 0.0f, 0.0f);
  deckP4.addBox(-15.0f,-1.0f,-24.0f,15,1,29);
  bottomP1.addChild(deckP4);
  turretMidBeam = new ModelRenderer(this,"turretMidBeam");
  turretMidBeam.setTextureOffset(0,134);
  turretMidBeam.setTextureSize(256,256);
  turretMidBeam.setRotationPoint(0.0f, -15.0f, 5.0f);
  setPieceRotation(turretMidBeam,1.7685053E-8f, 4.5513007E-6f, 0.0f);
  turretMidBeam.addBox(-10.0f,-1.0f,-1.5f,20,2,3);
  upright1 = new ModelRenderer(this,"upright1");
  upright1.setTextureOffset(0,147);
  upright1.setTextureSize(256,256);
  upright1.setRotationPoint(-13.0f, -19.0f, -1.5f);
  setPieceRotation(upright1,0.0f, 0.0f, 0.0f);
  upright1.addBox(0.0f,0.0f,0.0f,3,20,3);
  turretMidBeam.addChild(upright1);
  upright2 = new ModelRenderer(this,"upright2");
  upright2.setTextureOffset(0,147);
  upright2.setTextureSize(256,256);
  upright2.setRotationPoint(10.0f, -19.0f, -1.5f);
  setPieceRotation(upright2,0.0f, 0.0f, 0.0f);
  upright2.addBox(0.0f,0.0f,0.0f,3,20,3);
  turretMidBeam.addChild(upright2);
  turretTopHorizontal = new ModelRenderer(this,"turretTopHorizontal");
  turretTopHorizontal.setTextureOffset(0,140);
  turretTopHorizontal.setTextureSize(256,256);
  turretTopHorizontal.setRotationPoint(-10.0f, -19.0f, -1.5f);
  setPieceRotation(turretTopHorizontal,0.0f, 0.0f, 0.0f);
  turretTopHorizontal.addBox(0.0f,0.0f,0.0f,20,3,3);
  turretMidBeam.addChild(turretTopHorizontal);
  turretLeftAngled = new ModelRenderer(this,"turretLeftAngled");
  turretLeftAngled.setTextureOffset(13,147);
  turretLeftAngled.setTextureSize(256,256);
  turretLeftAngled.setRotationPoint(10.5f, -19.0f, -1.0f);
  setPieceRotation(turretLeftAngled,-0.61086476f, 0.0f, 0.0f);
  turretLeftAngled.addBox(0.0f,0.0f,0.0f,2,22,2);
  turretMidBeam.addChild(turretLeftAngled);
  turretRightAngled = new ModelRenderer(this,"turretRightAngled");
  turretRightAngled.setTextureOffset(13,147);
  turretRightAngled.setTextureSize(256,256);
  turretRightAngled.setRotationPoint(-12.5f, -19.0f, -1.0f);
  setPieceRotation(turretRightAngled,-0.61086273f, 0.0f, 0.0f);
  turretRightAngled.addBox(0.0f,0.0f,0.0f,2,22,2);
  turretMidBeam.addChild(turretRightAngled);
  pulleyAxle = new ModelRenderer(this,"pulleyAxle");
  pulleyAxle.setTextureOffset(59,128);
  pulleyAxle.setTextureSize(256,256);
  pulleyAxle.setRotationPoint(2.0f, -3.0f, 0.0f);
  setPieceRotation(pulleyAxle,-4.9455734E-6f, 0.0f, 0.0f);
  pulleyAxle.addBox(-18.0f,-0.5f,-0.5f,30,1,1);
  pulleyArm1 = new ModelRenderer(this,"pulleyArm1");
  pulleyArm1.setTextureOffset(59,131);
  pulleyArm1.setTextureSize(256,256);
  pulleyArm1.setRotationPoint(-18.0f, 0.0f, 0.0f);
  setPieceRotation(pulleyArm1,0.0f, 0.0f, 0.0f);
  pulleyArm1.addBox(-0.5f,-0.5f,-4.5f,1,1,9);
  pulleyArm2 = new ModelRenderer(this,"pulleyArm2");
  pulleyArm2.setTextureOffset(80,131);
  pulleyArm2.setTextureSize(256,256);
  pulleyArm2.setRotationPoint(0.0f, 0.0f, 0.0f);
  setPieceRotation(pulleyArm2,0.0f, 0.0f, 0.0f);
  pulleyArm2.addBox(-0.5f,-4.5f,-0.5f,1,9,1);
  pulleyArm1.addChild(pulleyArm2);
  pulleyAxle.addChild(pulleyArm1);
  turretMidBeam.addChild(pulleyAxle);
  turretFrontBeam = new ModelRenderer(this,"turretFrontBeam");
  turretFrontBeam.setTextureOffset(0,128);
  turretFrontBeam.setTextureSize(256,256);
  turretFrontBeam.setRotationPoint(0.0f, 0.0f, -13.0f);
  setPieceRotation(turretFrontBeam,0.0f, 0.0f, 0.0f);
  turretFrontBeam.addBox(-13.0f,-1.0f,-1.5f,26,2,3);
  turretMidBeam.addChild(turretFrontBeam);
  turretRearBeam = new ModelRenderer(this,"turretRearBeam");
  turretRearBeam.setTextureOffset(0,128);
  turretRearBeam.setTextureSize(256,256);
  turretRearBeam.setRotationPoint(0.0f, 0.0f, 13.0f);
  setPieceRotation(turretRearBeam,0.0f, 0.0f, 0.0f);
  turretRearBeam.addBox(-13.0f,-1.0f,-1.5f,26,2,3);
  turretMidBeam.addChild(turretRearBeam);
  armMain = new ModelRenderer(this,"armMain");
  armMain.setTextureOffset(0,172);
  armMain.setTextureSize(256,256);
  armMain.setRotationPoint(0.0f, -3.0f, 0.0f);
  setPieceRotation(armMain,0.0f, 0.0f, 0.0f);
  armMain.addBox(-1.0f,-1.0f,-1.5f,2,2,29);
  bucket1 = new ModelRenderer(this,"bucket1");
  bucket1.setTextureOffset(0,204);
  bucket1.setTextureSize(256,256);
  bucket1.setRotationPoint(-4.0f, -1.5f, 27.0f);
  setPieceRotation(bucket1,0.0f, 0.0f, 0.0f);
  bucket1.addBox(0.0f,0.0f,0.0f,8,4,1);
  armMain.addChild(bucket1);
  bucket3 = new ModelRenderer(this,"bucket3");
  bucket3.setTextureOffset(0,210);
  bucket3.setTextureSize(256,256);
  bucket3.setRotationPoint(4.0f, -1.5f, 28.0f);
  setPieceRotation(bucket3,0.0f, 0.0f, 0.0f);
  bucket3.addBox(0.0f,0.0f,0.0f,1,4,8);
  armMain.addChild(bucket3);
  bucket6 = new ModelRenderer(this,"bucket6");
  bucket6.setTextureOffset(0,204);
  bucket6.setTextureSize(256,256);
  bucket6.setRotationPoint(-4.0f, -1.5f, 36.0f);
  setPieceRotation(bucket6,0.0f, 0.0f, 0.0f);
  bucket6.addBox(0.0f,0.0f,0.0f,8,4,1);
  armMain.addChild(bucket6);
  bucket4 = new ModelRenderer(this,"bucket4");
  bucket4.setTextureOffset(19,204);
  bucket4.setTextureSize(256,256);
  bucket4.setRotationPoint(-4.0f, 2.5f, 28.0f);
  setPieceRotation(bucket4,0.0f, 0.0f, 0.0f);
  bucket4.addBox(0.0f,0.0f,0.0f,8,1,8);
  armMain.addChild(bucket4);
  bucket2 = new ModelRenderer(this,"bucket2");
  bucket2.setTextureOffset(0,210);
  bucket2.setTextureSize(256,256);
  bucket2.setRotationPoint(-5.0f, -1.5f, 28.0f);
  setPieceRotation(bucket2,0.0f, 0.0f, 0.0f);
  bucket2.addBox(0.0f,0.0f,0.0f,1,4,8);
  armMain.addChild(bucket2);
  turretMidBeam.addChild(armMain);
  turretLeftBeam1 = new ModelRenderer(this,"turretLeftBeam1");
  turretLeftBeam1.setTextureOffset(22,147);
  turretLeftBeam1.setTextureSize(256,256);
  turretLeftBeam1.setRotationPoint(10.0f, 0.0f, -11.5f);
  setPieceRotation(turretLeftBeam1,0.0f, 0.0f, 0.0f);
  turretLeftBeam1.addBox(0.0f,-1.0f,0.0f,3,2,10);
  turretMidBeam.addChild(turretLeftBeam1);
  turretLeftBeam2 = new ModelRenderer(this,"turretLeftBeam2");
  turretLeftBeam2.setTextureOffset(22,147);
  turretLeftBeam2.setTextureSize(256,256);
  turretLeftBeam2.setRotationPoint(10.0f, 0.0f, 1.5f);
  setPieceRotation(turretLeftBeam2,0.0f, 0.0f, 0.0f);
  turretLeftBeam2.addBox(0.0f,-1.0f,0.0f,3,2,10);
  turretMidBeam.addChild(turretLeftBeam2);
  turretRightBeam1 = new ModelRenderer(this,"turretRightBeam1");
  turretRightBeam1.setTextureOffset(22,147);
  turretRightBeam1.setTextureSize(256,256);
  turretRightBeam1.setRotationPoint(-13.0f, 0.0f, -11.5f);
  setPieceRotation(turretRightBeam1,0.0f, 0.0f, 0.0f);
  turretRightBeam1.addBox(0.0f,-1.0f,0.0f,3,2,10);
  turretMidBeam.addChild(turretRightBeam1);
  turretRightBeam2 = new ModelRenderer(this,"turretRightBeam2");
  turretRightBeam2.setTextureOffset(22,147);
  turretRightBeam2.setTextureSize(256,256);
  turretRightBeam2.setRotationPoint(-13.0f, 0.0f, 1.5f);
  setPieceRotation(turretRightBeam2,0.0f, 0.0f, 0.0f);
  turretRightBeam2.addBox(0.0f,-1.0f,0.0f,3,2,10);
  turretMidBeam.addChild(turretRightBeam2);
  turretLeftAngle2 = new ModelRenderer(this,"turretLeftAngle2");
  turretLeftAngle2.setTextureOffset(13,147);
  turretLeftAngle2.setTextureSize(256,256);
  turretLeftAngle2.setRotationPoint(10.5f, -19.0f, 1.0f);
  setPieceRotation(turretLeftAngle2,0.6108646f, 0.0f, 0.0f);
  turretLeftAngle2.addBox(0.0f,0.0f,-2.0f,2,22,2);
  turretMidBeam.addChild(turretLeftAngle2);
  turretRightAngle2 = new ModelRenderer(this,"turretRightAngle2");
  turretRightAngle2.setTextureOffset(13,147);
  turretRightAngle2.setTextureSize(256,256);
  turretRightAngle2.setRotationPoint(-12.5f, -19.0f, 1.0f);
  setPieceRotation(turretRightAngle2,0.61086476f, 1.4044014E-7f, 0.0f);
  turretRightAngle2.addBox(0.0f,0.0f,-2.0f,2,22,2);
  turretMidBeam.addChild(turretRightAngle2);
  bottomP1.addChild(turretMidBeam);
  standP1 = new ModelRenderer(this,"standP1");
  standP1.setTextureOffset(19,67);
  standP1.setTextureSize(256,256);
  standP1.setRotationPoint(11.0f, -14.0f, -9.5f);
  setPieceRotation(standP1,0.0f, 0.0f, 0.0f);
  standP1.addBox(0.0f,0.0f,0.0f,2,4,2);
  bottomP1.addChild(standP1);
  standP2 = new ModelRenderer(this,"standP2");
  standP2.setTextureOffset(19,67);
  standP2.setTextureSize(256,256);
  standP2.setRotationPoint(-13.0f, -14.0f, -9.5f);
  setPieceRotation(standP2,0.0f, 0.0f, 0.0f);
  standP2.addBox(0.0f,0.0f,0.0f,2,4,2);
  bottomP1.addChild(standP2);
  standP3 = new ModelRenderer(this,"standP3");
  standP3.setTextureOffset(19,67);
  standP3.setTextureSize(256,256);
  standP3.setRotationPoint(-13.0f, -14.0f, 17.5f);
  setPieceRotation(standP3,0.0f, 0.0f, 0.0f);
  standP3.addBox(0.0f,0.0f,0.0f,2,4,2);
  bottomP1.addChild(standP3);
  standP4 = new ModelRenderer(this,"standP4");
  standP4.setTextureOffset(19,67);
  standP4.setTextureSize(256,256);
  standP4.setRotationPoint(11.0f, -14.0f, 17.5f);
  setPieceRotation(standP4,0.0f, 0.0f, 0.0f);
  standP4.addBox(0.0f,0.0f,0.0f,2,4,2);
  bottomP1.addChild(standP4);
  flagPole = new ModelRenderer(this,"flagPole");
  flagPole.setTextureOffset(19,78);
  flagPole.setTextureSize(256,256);
  flagPole.setRotationPoint(-14.0f, -29.0f, 24.0f);
  setPieceRotation(flagPole,0.0f, 0.0f, 0.0f);
  flagPole.addBox(0.0f,0.0f,0.0f,1,16,1);
  flagCloth = new ModelRenderer(this,"flagCloth");
  flagCloth.setTextureOffset(24,78);
  flagCloth.setTextureSize(256,256);
  flagCloth.setRotationPoint(-14.0f, -29.0f, 25.0f);
  setPieceRotation(flagCloth,0.0f, 0.0f, 0.0f);
  flagCloth.addBox(0.0f,0.0f,0.0f,1,8,11);
  }
 
@Override
public void render(Entity entity, float f1, float f2, float f3, float f4, float f5, float f6)
  {
  super.render(entity, f1, f2, f3, f4, f5, f6);
  setRotationAngles(f1, f2, f3, f4, f5, f6, entity);
  bottomP1.render(f6);
  flagPole.render(f6);
  }
 
public void setPieceRotation(ModelRenderer model, float x, float y, float z)
  {
  model.rotateAngleX = x;
  model.rotateAngleY = y;
  model.rotateAngleZ = z;
  }

public void setWheelRotations(float fl, float fr, float rl, float rr)
  {
  this.padleAxle.rotateAngleX = Trig.toRadians(fr);
  }

public void setArmRotation(float pitch)
  {
  this.armMain.rotateAngleX = Trig.toRadians(pitch);
  }

public void setCrankRotations(float angle)
  {
  this.pulleyAxle.rotateAngleX = Trig.toRadians(angle);
  }
@Override
public void renderFlag()
  {
  flagCloth.render(0.0625f);
  }
}
