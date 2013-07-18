//auto-generated model template
//template generated by MEIM
//template v 1.0
//author Shadowmage45 (shadowage_catapults@hotmail.com)
 
package foo.bad.pkg.set.yours.here;
 
 
public class ModelEngine extends ModelBase
{
 
ModelRenderer engineBase;
ModelRenderer enginePiston;
ModelRenderer engineCore;
ModelRenderer engineTrunk1;
ModelRenderer engineTrunk2;
ModelRenderer engineTrunk3;
ModelRenderer engineTrunk4;
ModelRenderer engineTrunk5;
ModelRenderer engineTrunk6;
ModelRenderer engineTrunk7;
ModelRenderer engineTrunk8;
public ModelEngine(){
  engineBase = new ModelRenderer(this,"engineBase");
  engineBase.setTextureOffset(0,0);
  engineBase.setTextureSize(96,96);
  engineBase.setRotationPoint(0.0f, 0.0f, 0.0f);
  setPieceRotation(engineBase,0.0f, 0.0f, 0.0f);
  engineBase.addBox(-8.0f,-8.0f,4.0f,16,16,4);
  enginePiston = new ModelRenderer(this,"enginePiston");
  enginePiston.setTextureOffset(0,21);
  enginePiston.setTextureSize(96,96);
  enginePiston.setRotationPoint(0.0f, 0.0f, -7.99f);
  setPieceRotation(enginePiston,0.0f, 0.0f, 0.0f);
  enginePiston.addBox(-8.0f,-8.0f,0.0f,16,16,4);
  engineBase.addChild(enginePiston);
  engineCore = new ModelRenderer(this,"engineCore");
  engineCore.setTextureOffset(41,0);
  engineCore.setTextureSize(96,96);
  engineCore.setRotationPoint(0.0f, 0.0f, 0.0f);
  setPieceRotation(engineCore,0.0f, 0.0f, 0.0f);
  engineCore.addBox(-4.0f,-4.0f,-8.0f,8,8,12);
  engineBase.addChild(engineCore);
  engineTrunk1 = new ModelRenderer(this,"engineTrunk1");
  engineTrunk1.setTextureOffset(41,21);
  engineTrunk1.setTextureSize(96,96);
  engineTrunk1.setRotationPoint(0.0f, 0.0f, 3.0f);
  setPieceRotation(engineTrunk1,0.0f, 0.0f, 0.0f);
  engineTrunk1.addBox(-4.5f,-4.5f,0.0f,9,9,1);
  engineBase.addChild(engineTrunk1);
  engineTrunk2 = new ModelRenderer(this,"engineTrunk2");
  engineTrunk2.setTextureOffset(41,32);
  engineTrunk2.setTextureSize(96,96);
  engineTrunk2.setRotationPoint(0.0f, 0.0f, 2.0f);
  setPieceRotation(engineTrunk2,0.0f, 0.0f, 0.0f);
  engineTrunk2.addBox(-4.5f,-4.5f,0.0f,9,9,1);
  engineBase.addChild(engineTrunk2);
  engineTrunk3 = new ModelRenderer(this,"engineTrunk3");
  engineTrunk3.setTextureOffset(41,21);
  engineTrunk3.setTextureSize(96,96);
  engineTrunk3.setRotationPoint(0.0f, 0.0f, 1.0f);
  setPieceRotation(engineTrunk3,0.0f, 0.0f, 0.0f);
  engineTrunk3.addBox(-4.5f,-4.5f,0.0f,9,9,1);
  engineBase.addChild(engineTrunk3);
  engineTrunk4 = new ModelRenderer(this,"engineTrunk4");
  engineTrunk4.setTextureOffset(41,32);
  engineTrunk4.setTextureSize(96,96);
  engineTrunk4.setRotationPoint(0.0f, 0.0f, 0.0f);
  setPieceRotation(engineTrunk4,0.0f, 0.0f, 0.0f);
  engineTrunk4.addBox(-4.5f,-4.5f,0.0f,9,9,1);
  engineBase.addChild(engineTrunk4);
  engineTrunk5 = new ModelRenderer(this,"engineTrunk5");
  engineTrunk5.setTextureOffset(41,21);
  engineTrunk5.setTextureSize(96,96);
  engineTrunk5.setRotationPoint(0.0f, 0.0f, -1.0f);
  setPieceRotation(engineTrunk5,0.0f, 0.0f, 0.0f);
  engineTrunk5.addBox(-4.5f,-4.5f,0.0f,9,9,1);
  engineBase.addChild(engineTrunk5);
  engineTrunk6 = new ModelRenderer(this,"engineTrunk6");
  engineTrunk6.setTextureOffset(41,32);
  engineTrunk6.setTextureSize(96,96);
  engineTrunk6.setRotationPoint(0.0f, 0.0f, -2.0f);
  setPieceRotation(engineTrunk6,0.0f, 0.0f, 0.0f);
  engineTrunk6.addBox(-4.5f,-4.5f,0.0f,9,9,1);
  engineBase.addChild(engineTrunk6);
  engineTrunk7 = new ModelRenderer(this,"engineTrunk7");
  engineTrunk7.setTextureOffset(41,21);
  engineTrunk7.setTextureSize(96,96);
  engineTrunk7.setRotationPoint(0.0f, 0.0f, -3.0f);
  setPieceRotation(engineTrunk7,0.0f, 0.0f, 0.0f);
  engineTrunk7.addBox(-4.5f,-4.5f,0.0f,9,9,1);
  engineBase.addChild(engineTrunk7);
  engineTrunk8 = new ModelRenderer(this,"engineTrunk8");
  engineTrunk8.setTextureOffset(41,32);
  engineTrunk8.setTextureSize(96,96);
  engineTrunk8.setRotationPoint(0.0f, 0.0f, -4.0f);
  setPieceRotation(engineTrunk8,0.0f, 0.0f, 0.0f);
  engineTrunk8.addBox(-4.5f,-4.5f,0.0f,9,9,1);
  engineBase.addChild(engineTrunk8);
  }
 
@Override
public void render(Entity entity, float f1, float f2, float f3, float f4, float f5, float f6)
  {
  super.render(entity, f1, f2, f3, f4, f5, f6);
  setRotationAngles(f1, f2, f3, f4, f5, f6, entity);
  engineBase.render(f6);
  }
 
public void setPieceRotation(ModelRenderer model, float x, float y, float z)
  {
  model.rotateAngleX = x;
  model.rotateAngleY = y;
  model.rotateAngleZ = z;
  }
}
