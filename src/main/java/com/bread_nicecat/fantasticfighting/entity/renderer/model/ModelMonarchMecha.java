package com.bread_nicecat.fantasticfighting.entity.renderer.model;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;

import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelMonarchMecha extends EntityModel<Entity> {

	private ModelRenderer xiabanshen;
	private ModelRenderer xiabanshen_r1;
	private ModelRenderer xiabanshen_r2;
	private ModelRenderer xiabanshen_r3;
	private ModelRenderer xiabanshen_r4;
	private ModelRenderer xiabanshen_r5;
	private ModelRenderer xiabanshen_r6;
	private ModelRenderer xiabanshen_r7;
	private ModelRenderer xiabanshen_r8;
	private ModelRenderer xiabanshen_r9;
	private ModelRenderer xiabanshen_r10;
	private ModelRenderer xiabanshen_r11;
	private ModelRenderer xiabanshen_r12;
	private ModelRenderer xiabanshen_r13;
	private ModelRenderer xiabanshen_r14;
	private ModelRenderer xiabanshen_r15;
	private ModelRenderer xiabanshen_r16;
	private ModelRenderer xiabanshen_r17;
	private ModelRenderer xiabanshen_r18;
	private ModelRenderer xiabanshen_r19;
	private ModelRenderer xiabanshen_r20;
	private ModelRenderer xiabanshen_r21;
	private ModelRenderer xiabanshen_r22;
	private ModelRenderer xiabanshen_r23;
	private ModelRenderer xiabanshen_r24;
	private ModelRenderer xiabanshen_r25;
	private ModelRenderer xiabanshen_r26;
	private ModelRenderer xiabanshen_r27;
	private ModelRenderer xiabanshen_r28;
	private ModelRenderer xiabanshen_r29;
	private ModelRenderer xiabanshen_r30;
	private ModelRenderer xiabanshen_r31;
	private ModelRenderer xiabanshen_r32;
	private ModelRenderer xiabanshen_r33;
	private ModelRenderer xiabanshen_r34;
	private ModelRenderer xiabanshen_r35;
	private ModelRenderer xiabanshen_r36;
	private ModelRenderer shangbanshen;
	private ModelRenderer shangbanshen_r1;
	private ModelRenderer shangbanshen_r2;
	private ModelRenderer shangbanshen_r3;
	private ModelRenderer shangbanshen_r4;
	private ModelRenderer shangbanshen_r5;
	private ModelRenderer shangbanshen_r6;
	private ModelRenderer shangbanshen_r7;
	private ModelRenderer shangbanshen_r8;
	private ModelRenderer shangbanshen_r9;
	private ModelRenderer shangbanshen_r10;
	private ModelRenderer shangbanshen_r11;
	private ModelRenderer shangbanshen_r12;
	private ModelRenderer shangbanshen_r13;
	private ModelRenderer shangbanshen_r14;
	private ModelRenderer shangbanshen_r15;
	private ModelRenderer shangbanshen_r16;
	private ModelRenderer shangbanshen_r17;
	private ModelRenderer shangbanshen_r18;
	private ModelRenderer shangbanshen_r19;
	private ModelRenderer shangbanshen_r20;
	private ModelRenderer shangbanshen_r21;
	private ModelRenderer shangbanshen_r22;
	private ModelRenderer shangbanshen_r23;
	private ModelRenderer shangbanshen_r24;
	private ModelRenderer shangbanshen_r25;
	private ModelRenderer shangbanshen_r26;
	private ModelRenderer shangbanshen_r27;
	private ModelRenderer shangbanshen_r28;
	private ModelRenderer shangbanshen_r29;
	private ModelRenderer shangbanshen_r30;
	private ModelRenderer shangbanshen_r31;
	private ModelRenderer shangbanshen_r32;
	private ModelRenderer shangbanshen_r33;
	private ModelRenderer shangbanshen_r34;
	private ModelRenderer shangbanshen_r35;
	private ModelRenderer shangbanshen_r36;
	private ModelRenderer shangbanshen_r37;
	private ModelRenderer shangbanshen_r38;
	private ModelRenderer shangbanshen_r39;
	private ModelRenderer shangbanshen_r40;
	private ModelRenderer shangbanshen_r41;
	private ModelRenderer shangbanshen_r42;
	private ModelRenderer shangbanshen_r43;
	private ModelRenderer shangbanshen_r44;
	private ModelRenderer shangbanshen_r45;
	private ModelRenderer shangbanshen_r46;
	private ModelRenderer zuoshou;
	private ModelRenderer zuoshou_r1;
	private ModelRenderer zuoshou_r2;
	private ModelRenderer zuoshou_r3;
	private ModelRenderer zuoshou_r4;
	private ModelRenderer zuoshou_r5;
	private ModelRenderer zuoshou_r6;
	private ModelRenderer zuoshou_r7;
	private ModelRenderer zuoshou_r8;
	private ModelRenderer zuoshou_r9;
	private ModelRenderer zuoshou_r10;
	private ModelRenderer zuoshou_r11;
	private ModelRenderer zuoshou_r12;
	private ModelRenderer zuoshou_r13;
	private ModelRenderer zuoshou_r14;
	private ModelRenderer zuoshou_r15;
	private ModelRenderer zuoshou_r16;
	private ModelRenderer zuoshou_r17;
	private ModelRenderer zuoshou_r18;
	private ModelRenderer zuoshou_r19;
	private ModelRenderer zuoshou_r20;
	private ModelRenderer zuoshou_r21;
	private ModelRenderer zuoshou_r22;
	private ModelRenderer zuoshou_r23;
	private ModelRenderer zuoshou_r24;
	private ModelRenderer zuoshou_r25;
	private ModelRenderer zuoshou_r26;
	private ModelRenderer zuoshou_r27;
	private ModelRenderer zuoshou_r28;
	private ModelRenderer zuoshou_r29;
	private ModelRenderer dao3;
	private ModelRenderer dao3_r1;
	private ModelRenderer dao3_r2;
	private ModelRenderer dao3_r3;
	private ModelRenderer dao3_r4;
	private ModelRenderer dao3_r5;
	private ModelRenderer dao3_r6;
	private ModelRenderer dao3_r7;
	private ModelRenderer dao3_r8;
	private ModelRenderer dao3_r9;
	private ModelRenderer dao3_r10;
	private ModelRenderer dao3_r11;
	private ModelRenderer dao3_r12;
	private ModelRenderer bone144;
	private ModelRenderer bone144_r1;
	private ModelRenderer bone144_r2;
	private ModelRenderer bone144_r3;
	private ModelRenderer bone144_r4;
	private ModelRenderer bone145;
	private ModelRenderer bone145_r1;
	private ModelRenderer bone145_r2;
	private ModelRenderer bone145_r3;
	private ModelRenderer bone145_r4;
	private ModelRenderer bone146;
	private ModelRenderer bone146_r1;
	private ModelRenderer bone146_r2;
	private ModelRenderer bone146_r3;
	private ModelRenderer bone147;
	private ModelRenderer bone147_r1;
	private ModelRenderer bone147_r2;
	private ModelRenderer bone147_r3;
	private ModelRenderer bone147_r4;
	private ModelRenderer bone3;
	private ModelRenderer bone3_r1;
	private ModelRenderer bone3_r2;
	private ModelRenderer bone3_r3;
	private ModelRenderer bone3_r4;
	private ModelRenderer bone3_r5;
	private ModelRenderer bone42;
	private ModelRenderer bone42_r1;
	private ModelRenderer bone42_r2;
	private ModelRenderer bone42_r3;
	private ModelRenderer bone42_r4;
	private ModelRenderer bone42_r5;
	private ModelRenderer bone42_r6;
	private ModelRenderer bone42_r7;
	private ModelRenderer bone42_r8;
	private ModelRenderer bone42_r9;
	private ModelRenderer bone42_r10;
	private ModelRenderer bone42_r11;
	private ModelRenderer bone42_r12;
	private ModelRenderer bone42_r13;
	private ModelRenderer bone42_r14;
	private ModelRenderer bone42_r15;
	private ModelRenderer bone42_r16;
	private ModelRenderer bone42_r17;
	private ModelRenderer bone42_r18;
	private ModelRenderer bone43;
	private ModelRenderer bone43_r1;
	private ModelRenderer bone43_r2;
	private ModelRenderer bone43_r3;
	private ModelRenderer bone43_r4;
	private ModelRenderer bone43_r5;
	private ModelRenderer bone43_r6;
	private ModelRenderer bone43_r7;
	private ModelRenderer bone43_r8;
	private ModelRenderer bone43_r9;
	private ModelRenderer qiang;
	private ModelRenderer qiang_r1;
	private ModelRenderer qiang_r2;
	private ModelRenderer qiang_r3;
	private ModelRenderer qiang_r4;
	private ModelRenderer qiang_r5;
	private ModelRenderer qiang_r6;
	private ModelRenderer qiang_r7;
	private ModelRenderer qiang_r8;
	private ModelRenderer qiang_r9;
	private ModelRenderer qiang_r10;
	private ModelRenderer qiang_r11;
	private ModelRenderer qiang_r12;
	private ModelRenderer qiang_r13;
	private ModelRenderer qiang_r14;
	private ModelRenderer qiang_r15;
	private ModelRenderer qiang_r16;
	private ModelRenderer qiang_r17;
	private ModelRenderer qiang_r18;
	private ModelRenderer qiang_r19;
	private ModelRenderer qiang_r20;
	private ModelRenderer qiang_r21;
	private ModelRenderer qiang_r22;
	private ModelRenderer bone122;
	private ModelRenderer bone122_r1;
	private ModelRenderer bone122_r2;
	private ModelRenderer bone122_r3;
	private ModelRenderer bone122_r4;
	private ModelRenderer bone122_r5;
	private ModelRenderer bone31;
	private ModelRenderer bone31_r1;
	private ModelRenderer bone31_r2;
	private ModelRenderer bone37;
	private ModelRenderer bone37_r1;
	private ModelRenderer bone37_r2;
	private ModelRenderer bone32;
	private ModelRenderer bone32_r1;
	private ModelRenderer bone32_r2;
	private ModelRenderer bone38;
	private ModelRenderer bone38_r1;
	private ModelRenderer bone38_r2;
	private ModelRenderer bone56;
	private ModelRenderer bone56_r1;
	private ModelRenderer bone56_r2;
	private ModelRenderer bone57;
	private ModelRenderer bone57_r1;
	private ModelRenderer bone57_r2;
	private ModelRenderer bone29;
	private ModelRenderer bone29_r1;
	private ModelRenderer bone29_r2;
	private ModelRenderer bone30;
	private ModelRenderer bone30_r1;
	private ModelRenderer bone30_r2;
	private ModelRenderer bone26;
	private ModelRenderer bone26_r1;
	private ModelRenderer bone26_r2;
	private ModelRenderer bone26_r3;
	private ModelRenderer bone26_r4;
	private ModelRenderer bone39;
	private ModelRenderer bone39_r1;
	private ModelRenderer bone39_r2;
	private ModelRenderer bone39_r3;
	private ModelRenderer bone39_r4;
	private ModelRenderer bone27;
	private ModelRenderer bone27_r1;
	private ModelRenderer bone27_r2;
	private ModelRenderer bone27_r3;
	private ModelRenderer bone27_r4;
	private ModelRenderer bone40;
	private ModelRenderer bone40_r1;
	private ModelRenderer bone40_r2;
	private ModelRenderer bone40_r3;
	private ModelRenderer bone40_r4;
	private ModelRenderer bone28;
	private ModelRenderer bone28_r1;
	private ModelRenderer bone28_r2;
	private ModelRenderer bone28_r3;
	private ModelRenderer bone28_r4;
	private ModelRenderer bone41;
	private ModelRenderer bone41_r1;
	private ModelRenderer bone41_r2;
	private ModelRenderer bone41_r3;
	private ModelRenderer bone41_r4;
	private ModelRenderer bone25;
	private ModelRenderer bone25_r1;
	private ModelRenderer bone25_r2;
	private ModelRenderer bone58;
	private ModelRenderer bone58_r1;
	private ModelRenderer bone58_r2;
	private ModelRenderer bone21;
	private ModelRenderer bone21_r1;
	private ModelRenderer bone10;
	private ModelRenderer bone10_r1;
	private ModelRenderer bone22;
	private ModelRenderer bone22_r1;
	private ModelRenderer bone23;
	private ModelRenderer bone23_r1;
	private ModelRenderer bone88;
	private ModelRenderer bone88_r1;
	private ModelRenderer bone88_r2;
	private ModelRenderer bone88_r3;
	private ModelRenderer bone91;
	private ModelRenderer bone91_r1;
	private ModelRenderer bone91_r2;
	private ModelRenderer bone91_r3;
	private ModelRenderer bone89;
	private ModelRenderer bone89_r1;
	private ModelRenderer bone89_r2;
	private ModelRenderer bone89_r3;
	private ModelRenderer bone92;
	private ModelRenderer bone92_r1;
	private ModelRenderer bone92_r2;
	private ModelRenderer bone92_r3;
	private ModelRenderer bone90;
	private ModelRenderer bone90_r1;
	private ModelRenderer bone90_r2;
	private ModelRenderer bone90_r3;
	private ModelRenderer bone93;
	private ModelRenderer bone93_r1;
	private ModelRenderer bone93_r2;
	private ModelRenderer bone93_r3;
	private ModelRenderer bone85;
	private ModelRenderer bone85_r1;
	private ModelRenderer bone85_r2;
	private ModelRenderer bone85_r3;
	private ModelRenderer bone85_r4;
	private ModelRenderer bone85_r5;
	private ModelRenderer bone85_r6;
	private ModelRenderer bone85_r7;
	private ModelRenderer bone85_r8;
	private ModelRenderer bone85_r9;
	private ModelRenderer bone85_r10;
	private ModelRenderer bone85_r11;
	private ModelRenderer bone85_r12;
	private ModelRenderer bone87;
	private ModelRenderer bone87_r1;
	private ModelRenderer bone87_r2;
	private ModelRenderer bone87_r3;
	private ModelRenderer bone87_r4;
	private ModelRenderer bone87_r5;
	private ModelRenderer bone87_r6;
	private ModelRenderer bone87_r7;
	private ModelRenderer bone86;
	private ModelRenderer bone86_r1;
	private ModelRenderer bone86_r2;
	private ModelRenderer bone86_r3;
	private ModelRenderer bone86_r4;
	private ModelRenderer bone86_r5;
	private ModelRenderer bone86_r6;
	private ModelRenderer bone86_r7;
	private ModelRenderer bone86_r8;
	private ModelRenderer dao;
	private ModelRenderer dao_r1;
	private ModelRenderer dao_r2;
	private ModelRenderer dao_r3;
	private ModelRenderer dao_r4;
	private ModelRenderer dao_r5;
	private ModelRenderer dao_r6;
	private ModelRenderer dao_r7;
	private ModelRenderer dao_r8;
	private ModelRenderer dao_r9;
	private ModelRenderer dao_r10;
	private ModelRenderer dao_r11;
	private ModelRenderer dao_r12;
	private ModelRenderer bone55;
	private ModelRenderer bone55_r1;
	private ModelRenderer bone55_r2;
	private ModelRenderer bone55_r3;
	private ModelRenderer bone55_r4;
	private ModelRenderer bone48;
	private ModelRenderer bone48_r1;
	private ModelRenderer bone48_r2;
	private ModelRenderer bone48_r3;
	private ModelRenderer bone48_r4;
	private ModelRenderer bone49;
	private ModelRenderer bone49_r1;
	private ModelRenderer bone49_r2;
	private ModelRenderer bone49_r3;
	private ModelRenderer bone50;
	private ModelRenderer bone50_r1;
	private ModelRenderer bone50_r2;
	private ModelRenderer bone50_r3;
	private ModelRenderer bone50_r4;
	private ModelRenderer bone51;
	private ModelRenderer bone51_r1;
	private ModelRenderer bone51_r2;
	private ModelRenderer bone52;
	private ModelRenderer bone52_r1;
	private ModelRenderer bone52_r2;
	private ModelRenderer bone52_r3;
	private ModelRenderer bone53;
	private ModelRenderer bone53_r1;
	private ModelRenderer bone53_r2;
	private ModelRenderer bone53_r3;
	private ModelRenderer bone54;
	private ModelRenderer bone54_r1;
	private ModelRenderer bone54_r2;
	private ModelRenderer bone54_r3;
	private ModelRenderer bone44;
	private ModelRenderer bone44_r1;
	private ModelRenderer bone44_r2;
	private ModelRenderer bone44_r3;
	private ModelRenderer bone44_r4;
	private ModelRenderer bone45;
	private ModelRenderer bone45_r1;
	private ModelRenderer bone133;
	private ModelRenderer bone133_r1;
	private ModelRenderer bone133_r2;
	private ModelRenderer bone46;
	private ModelRenderer bone46_r1;
	private ModelRenderer bone132;
	private ModelRenderer bone132_r1;
	private ModelRenderer bone132_r2;
	private ModelRenderer youshou;
	private ModelRenderer youshou_r1;
	private ModelRenderer youshou_r2;
	private ModelRenderer youshou_r3;
	private ModelRenderer youshou_r4;
	private ModelRenderer youshou_r5;
	private ModelRenderer youshou_r6;
	private ModelRenderer youshou_r7;
	private ModelRenderer youshou_r8;
	private ModelRenderer youshou_r9;
	private ModelRenderer youshou_r10;
	private ModelRenderer youshou_r11;
	private ModelRenderer youshou_r12;
	private ModelRenderer youshou_r13;
	private ModelRenderer youshou_r14;
	private ModelRenderer youshou_r15;
	private ModelRenderer youshou_r16;
	private ModelRenderer youshou_r17;
	private ModelRenderer youshou_r18;
	private ModelRenderer youshou_r19;
	private ModelRenderer youshou_r20;
	private ModelRenderer youshou_r21;
	private ModelRenderer youshou_r22;
	private ModelRenderer youshou_r23;
	private ModelRenderer youshou_r24;
	private ModelRenderer youshou_r25;
	private ModelRenderer youshou_r26;
	private ModelRenderer youshou_r27;
	private ModelRenderer youshou_r28;
	private ModelRenderer youshou_r29;
	private ModelRenderer dao2;
	private ModelRenderer dao2_r1;
	private ModelRenderer dao2_r2;
	private ModelRenderer dao2_r3;
	private ModelRenderer dao2_r4;
	private ModelRenderer dao2_r5;
	private ModelRenderer dao2_r6;
	private ModelRenderer dao2_r7;
	private ModelRenderer dao2_r8;
	private ModelRenderer dao2_r9;
	private ModelRenderer dao2_r10;
	private ModelRenderer dao2_r11;
	private ModelRenderer dao2_r12;
	private ModelRenderer bone76;
	private ModelRenderer bone76_r1;
	private ModelRenderer bone76_r2;
	private ModelRenderer bone76_r3;
	private ModelRenderer bone76_r4;
	private ModelRenderer bone77;
	private ModelRenderer bone77_r1;
	private ModelRenderer bone77_r2;
	private ModelRenderer bone77_r3;
	private ModelRenderer bone77_r4;
	private ModelRenderer bone78;
	private ModelRenderer bone78_r1;
	private ModelRenderer bone78_r2;
	private ModelRenderer bone78_r3;
	private ModelRenderer bone134;
	private ModelRenderer bone134_r1;
	private ModelRenderer bone134_r2;
	private ModelRenderer bone134_r3;
	private ModelRenderer bone134_r4;
	private ModelRenderer bone73;
	private ModelRenderer bone73_r1;
	private ModelRenderer bone73_r2;
	private ModelRenderer bone73_r3;
	private ModelRenderer bone73_r4;
	private ModelRenderer bone73_r5;
	private ModelRenderer bone74;
	private ModelRenderer bone74_r1;
	private ModelRenderer bone74_r2;
	private ModelRenderer bone74_r3;
	private ModelRenderer bone74_r4;
	private ModelRenderer bone74_r5;
	private ModelRenderer bone74_r6;
	private ModelRenderer bone74_r7;
	private ModelRenderer bone74_r8;
	private ModelRenderer bone74_r9;
	private ModelRenderer bone74_r10;
	private ModelRenderer bone74_r11;
	private ModelRenderer bone74_r12;
	private ModelRenderer bone74_r13;
	private ModelRenderer bone74_r14;
	private ModelRenderer bone74_r15;
	private ModelRenderer bone74_r16;
	private ModelRenderer bone74_r17;
	private ModelRenderer bone74_r18;
	private ModelRenderer bone75;
	private ModelRenderer bone75_r1;
	private ModelRenderer bone75_r2;
	private ModelRenderer bone75_r3;
	private ModelRenderer bone75_r4;
	private ModelRenderer bone75_r5;
	private ModelRenderer bone75_r6;
	private ModelRenderer bone75_r7;
	private ModelRenderer bone75_r8;
	private ModelRenderer bone75_r9;
	private ModelRenderer bone135;
	private ModelRenderer bone135_r1;
	private ModelRenderer bone135_r2;
	private ModelRenderer _2dao;
	private ModelRenderer _2dao_r1;
	private ModelRenderer _2dao_r2;
	private ModelRenderer _2dao_r3;
	private ModelRenderer _2dao_r4;
	private ModelRenderer _2dao_r5;
	private ModelRenderer _2dao_r6;
	private ModelRenderer _2dao_r7;
	private ModelRenderer _2dao_r8;
	private ModelRenderer _2dao_r9;
	private ModelRenderer _2dao_r10;
	private ModelRenderer _2dao_r11;
	private ModelRenderer _2dao_r12;
	private ModelRenderer bone124;
	private ModelRenderer bone124_r1;
	private ModelRenderer bone124_r2;
	private ModelRenderer bone124_r3;
	private ModelRenderer bone124_r4;
	private ModelRenderer bone125;
	private ModelRenderer bone125_r1;
	private ModelRenderer bone125_r2;
	private ModelRenderer bone125_r3;
	private ModelRenderer bone125_r4;
	private ModelRenderer bone126;
	private ModelRenderer bone126_r1;
	private ModelRenderer bone126_r2;
	private ModelRenderer bone126_r3;
	private ModelRenderer bone127;
	private ModelRenderer bone127_r1;
	private ModelRenderer bone127_r2;
	private ModelRenderer bone127_r3;
	private ModelRenderer bone127_r4;
	private ModelRenderer bone128;
	private ModelRenderer bone128_r1;
	private ModelRenderer bone128_r2;
	private ModelRenderer bone129;
	private ModelRenderer bone129_r1;
	private ModelRenderer bone129_r2;
	private ModelRenderer bone129_r3;
	private ModelRenderer bone130;
	private ModelRenderer bone130_r1;
	private ModelRenderer bone130_r2;
	private ModelRenderer bone130_r3;
	private ModelRenderer bone131;
	private ModelRenderer bone131_r1;
	private ModelRenderer bone131_r2;
	private ModelRenderer bone131_r3;
	private ModelRenderer bone139;
	private ModelRenderer bone139_r1;
	private ModelRenderer bone139_r2;
	private ModelRenderer bone139_r3;
	private ModelRenderer bone139_r4;
	private ModelRenderer bone140;
	private ModelRenderer bone140_r1;
	private ModelRenderer bone141;
	private ModelRenderer bone141_r1;
	private ModelRenderer bone141_r2;
	private ModelRenderer bone142;
	private ModelRenderer bone142_r1;
	private ModelRenderer bone143;
	private ModelRenderer bone143_r1;
	private ModelRenderer bone143_r2;
	private ModelRenderer bone;
	private ModelRenderer bone2;
	private ModelRenderer bone2_r1;
	private ModelRenderer bone2_r2;
	private ModelRenderer bone2_r3;
	private ModelRenderer bone2_r4;
	private ModelRenderer bone2_r5;
	private ModelRenderer bone2_r6;
	private ModelRenderer bone2_r7;
	private ModelRenderer bone2_r8;
	private ModelRenderer bone2_r9;
	private ModelRenderer bone2_r10;
	private ModelRenderer bone2_r11;
	private ModelRenderer bone2_r12;
	private ModelRenderer bone2_r13;
	private ModelRenderer bone2_r14;
	private ModelRenderer bone33;
	private ModelRenderer bone33_r1;
	private ModelRenderer bone34;
	private ModelRenderer bone34_r1;
	private ModelRenderer bone36;
	private ModelRenderer bone36_r1;
	private ModelRenderer bone35;
	private ModelRenderer bone35_r1;
	private ModelRenderer bone79;
	private ModelRenderer bone79_r1;
	private ModelRenderer bone79_r2;
	private ModelRenderer bone79_r3;
	private ModelRenderer bone79_r4;
	private ModelRenderer bone79_r5;
	private ModelRenderer bone79_r6;
	private ModelRenderer bone79_r7;
	private ModelRenderer bone79_r8;
	private ModelRenderer bone79_r9;
	private ModelRenderer bone79_r10;
	private ModelRenderer bone79_r11;
	private ModelRenderer bone79_r12;
	private ModelRenderer bone79_r13;
	private ModelRenderer bone79_r14;
	private ModelRenderer bone80;
	private ModelRenderer bone80_r1;
	private ModelRenderer bone81;
	private ModelRenderer bone81_r1;
	private ModelRenderer bone82;
	private ModelRenderer bone82_r1;
	private ModelRenderer bone83;
	private ModelRenderer bone83_r1;
	private ModelRenderer tou;
	private ModelRenderer tou_r1;
	private ModelRenderer tou_r2;
	private ModelRenderer tou_r3;
	private ModelRenderer tou_r4;
	private ModelRenderer tou_r5;
	private ModelRenderer tou_r6;
	private ModelRenderer tou_r7;
	private ModelRenderer tou_r8;
	private ModelRenderer tou_r9;
	private ModelRenderer tou_r10;
	private ModelRenderer tou_r11;
	private ModelRenderer tou_r12;
	private ModelRenderer tou_r13;
	private ModelRenderer tou_r14;
	private ModelRenderer tou_r15;
	private ModelRenderer tou_r16;
	private ModelRenderer tou_r17;
	private ModelRenderer tou_r18;
	private ModelRenderer tou_r19;
	private ModelRenderer tou_r20;
	private ModelRenderer tou_r21;
	private ModelRenderer tou_r22;
	private ModelRenderer tou_r23;
	private ModelRenderer tou_r24;
	private ModelRenderer tou_r25;
	private ModelRenderer tou_r26;
	private ModelRenderer tou_r27;
	private ModelRenderer tou_r28;
	private ModelRenderer tou_r29;
	private ModelRenderer tou_r30;
	private ModelRenderer tou_r31;
	private ModelRenderer tou_r32;
	private ModelRenderer tou_r33;
	private ModelRenderer tou_r34;
	private ModelRenderer tou_r35;
	private ModelRenderer tou_r36;
	private ModelRenderer tou_r37;
	private ModelRenderer tou_r38;
	private ModelRenderer tou_r39;
	private ModelRenderer tou_r40;
	private ModelRenderer tou_r41;
	private ModelRenderer tou_r42;
	private ModelRenderer tou_r43;
	private ModelRenderer tou_r44;
	private ModelRenderer tou_r45;
	private ModelRenderer tou_r46;
	private ModelRenderer tou_r47;
	private ModelRenderer tou_r48;
	private ModelRenderer youtui;
	private ModelRenderer youtui_r1;
	private ModelRenderer youtui_r2;
	private ModelRenderer youtui_r3;
	private ModelRenderer youtui_r4;
	private ModelRenderer youtui_r5;
	private ModelRenderer youtui_r6;
	private ModelRenderer youtui_r7;
	private ModelRenderer youtui_r8;
	private ModelRenderer youtui_r9;
	private ModelRenderer youtui_r10;
	private ModelRenderer youtui_r11;
	private ModelRenderer youtui_r12;
	private ModelRenderer youtui_r13;
	private ModelRenderer youtui_r14;
	private ModelRenderer youtui_r15;
	private ModelRenderer youtui_r16;
	private ModelRenderer youtui_r17;
	private ModelRenderer youtui_r18;
	private ModelRenderer youtui_r19;
	private ModelRenderer youtui_r20;
	private ModelRenderer youtui_r21;
	private ModelRenderer youtui_r22;
	private ModelRenderer youtui_r23;
	private ModelRenderer youtui_r24;
	private ModelRenderer qiang2;
	private ModelRenderer qiang2_r1;
	private ModelRenderer qiang2_r2;
	private ModelRenderer qiang2_r3;
	private ModelRenderer qiang2_r4;
	private ModelRenderer qiang2_r5;
	private ModelRenderer qiang2_r6;
	private ModelRenderer qiang2_r7;
	private ModelRenderer qiang2_r8;
	private ModelRenderer qiang2_r9;
	private ModelRenderer qiang2_r10;
	private ModelRenderer qiang2_r11;
	private ModelRenderer qiang2_r12;
	private ModelRenderer qiang2_r13;
	private ModelRenderer qiang2_r14;
	private ModelRenderer qiang2_r15;
	private ModelRenderer qiang2_r16;
	private ModelRenderer qiang2_r17;
	private ModelRenderer qiang2_r18;
	private ModelRenderer qiang2_r19;
	private ModelRenderer qiang2_r20;
	private ModelRenderer qiang2_r21;
	private ModelRenderer qiang2_r22;
	private ModelRenderer bone123;
	private ModelRenderer bone123_r1;
	private ModelRenderer bone123_r2;
	private ModelRenderer bone123_r3;
	private ModelRenderer bone123_r4;
	private ModelRenderer bone123_r5;
	private ModelRenderer bone84;
	private ModelRenderer bone84_r1;
	private ModelRenderer bone84_r2;
	private ModelRenderer bone94;
	private ModelRenderer bone94_r1;
	private ModelRenderer bone94_r2;
	private ModelRenderer bone95;
	private ModelRenderer bone95_r1;
	private ModelRenderer bone95_r2;
	private ModelRenderer bone96;
	private ModelRenderer bone96_r1;
	private ModelRenderer bone96_r2;
	private ModelRenderer bone97;
	private ModelRenderer bone97_r1;
	private ModelRenderer bone97_r2;
	private ModelRenderer bone98;
	private ModelRenderer bone98_r1;
	private ModelRenderer bone98_r2;
	private ModelRenderer bone99;
	private ModelRenderer bone99_r1;
	private ModelRenderer bone99_r2;
	private ModelRenderer bone100;
	private ModelRenderer bone100_r1;
	private ModelRenderer bone100_r2;
	private ModelRenderer bone101;
	private ModelRenderer bone101_r1;
	private ModelRenderer bone101_r2;
	private ModelRenderer bone101_r3;
	private ModelRenderer bone101_r4;
	private ModelRenderer bone102;
	private ModelRenderer bone102_r1;
	private ModelRenderer bone102_r2;
	private ModelRenderer bone102_r3;
	private ModelRenderer bone102_r4;
	private ModelRenderer bone103;
	private ModelRenderer bone103_r1;
	private ModelRenderer bone103_r2;
	private ModelRenderer bone103_r3;
	private ModelRenderer bone103_r4;
	private ModelRenderer bone104;
	private ModelRenderer bone104_r1;
	private ModelRenderer bone104_r2;
	private ModelRenderer bone104_r3;
	private ModelRenderer bone104_r4;
	private ModelRenderer bone105;
	private ModelRenderer bone105_r1;
	private ModelRenderer bone105_r2;
	private ModelRenderer bone105_r3;
	private ModelRenderer bone105_r4;
	private ModelRenderer bone106;
	private ModelRenderer bone106_r1;
	private ModelRenderer bone106_r2;
	private ModelRenderer bone106_r3;
	private ModelRenderer bone106_r4;
	private ModelRenderer bone107;
	private ModelRenderer bone107_r1;
	private ModelRenderer bone107_r2;
	private ModelRenderer bone108;
	private ModelRenderer bone108_r1;
	private ModelRenderer bone108_r2;
	private ModelRenderer bone109;
	private ModelRenderer bone109_r1;
	private ModelRenderer bone110;
	private ModelRenderer bone110_r1;
	private ModelRenderer bone111;
	private ModelRenderer bone111_r1;
	private ModelRenderer bone112;
	private ModelRenderer bone112_r1;
	private ModelRenderer bone113;
	private ModelRenderer bone113_r1;
	private ModelRenderer bone113_r2;
	private ModelRenderer bone113_r3;
	private ModelRenderer bone114;
	private ModelRenderer bone114_r1;
	private ModelRenderer bone114_r2;
	private ModelRenderer bone114_r3;
	private ModelRenderer bone115;
	private ModelRenderer bone115_r1;
	private ModelRenderer bone115_r2;
	private ModelRenderer bone115_r3;
	private ModelRenderer bone116;
	private ModelRenderer bone116_r1;
	private ModelRenderer bone116_r2;
	private ModelRenderer bone116_r3;
	private ModelRenderer bone117;
	private ModelRenderer bone117_r1;
	private ModelRenderer bone117_r2;
	private ModelRenderer bone117_r3;
	private ModelRenderer bone118;
	private ModelRenderer bone118_r1;
	private ModelRenderer bone118_r2;
	private ModelRenderer bone118_r3;
	private ModelRenderer bone119;
	private ModelRenderer bone119_r1;
	private ModelRenderer bone119_r2;
	private ModelRenderer bone119_r3;
	private ModelRenderer bone119_r4;
	private ModelRenderer bone119_r5;
	private ModelRenderer bone119_r6;
	private ModelRenderer bone119_r7;
	private ModelRenderer bone119_r8;
	private ModelRenderer bone119_r9;
	private ModelRenderer bone119_r10;
	private ModelRenderer bone119_r11;
	private ModelRenderer bone119_r12;
	private ModelRenderer bone120;
	private ModelRenderer bone120_r1;
	private ModelRenderer bone120_r2;
	private ModelRenderer bone120_r3;
	private ModelRenderer bone120_r4;
	private ModelRenderer bone120_r5;
	private ModelRenderer bone120_r6;
	private ModelRenderer bone120_r7;
	private ModelRenderer bone121;
	private ModelRenderer bone121_r1;
	private ModelRenderer bone121_r2;
	private ModelRenderer bone121_r3;
	private ModelRenderer bone121_r4;
	private ModelRenderer bone121_r5;
	private ModelRenderer bone121_r6;
	private ModelRenderer bone121_r7;
	private ModelRenderer bone121_r8;
	private ModelRenderer bone9;
	private ModelRenderer bone9_r1;
	private ModelRenderer bone9_r2;
	private ModelRenderer bone9_r3;
	private ModelRenderer bone9_r4;
	private ModelRenderer bone9_r5;
	private ModelRenderer bone9_r6;
	private ModelRenderer bone9_r7;
	private ModelRenderer bone9_r8;
	private ModelRenderer bone11;
	private ModelRenderer bone11_r1;
	private ModelRenderer bone11_r2;
	private ModelRenderer bone11_r3;
	private ModelRenderer bone11_r4;
	private ModelRenderer bone11_r5;
	private ModelRenderer bone11_r6;
	private ModelRenderer bone11_r7;
	private ModelRenderer bone11_r8;
	private ModelRenderer bone11_r9;
	private ModelRenderer bone11_r10;
	private ModelRenderer bone11_r11;
	private ModelRenderer bone11_r12;
	private ModelRenderer bone11_r13;
	private ModelRenderer bone11_r14;
	private ModelRenderer bone11_r15;
	private ModelRenderer bone11_r16;
	private ModelRenderer bone11_r17;
	private ModelRenderer bone11_r18;
	private ModelRenderer bone11_r19;
	private ModelRenderer bone11_r20;
	private ModelRenderer bone11_r21;
	private ModelRenderer bone11_r22;
	private ModelRenderer bone20;
	private ModelRenderer bone12;
	private ModelRenderer bone12_r1;
	private ModelRenderer bone12_r2;
	private ModelRenderer bone12_r3;
	private ModelRenderer bone12_r4;
	private ModelRenderer bone12_r5;
	private ModelRenderer bone12_r6;
	private ModelRenderer bone12_r7;
	private ModelRenderer bone12_r8;
	private ModelRenderer bone12_r9;
	private ModelRenderer bone12_r10;
	private ModelRenderer bone12_r11;
	private ModelRenderer bone12_r12;
	private ModelRenderer bone12_r13;
	private ModelRenderer bone12_r14;
	private ModelRenderer bone12_r15;
	private ModelRenderer bone12_r16;
	private ModelRenderer bone12_r17;
	private ModelRenderer bone12_r18;
	private ModelRenderer bone12_r19;
	private ModelRenderer bone12_r20;
	private ModelRenderer bone12_r21;
	private ModelRenderer bone12_r22;
	private ModelRenderer bone12_r23;
	private ModelRenderer bone12_r24;
	private ModelRenderer bone12_r25;
	private ModelRenderer bone12_r26;
	private ModelRenderer bone12_r27;
	private ModelRenderer bone12_r28;
	private ModelRenderer bone12_r29;
	private ModelRenderer bone12_r30;
	private ModelRenderer bone24;
	private ModelRenderer bone24_r1;
	private ModelRenderer bone24_r2;
	private ModelRenderer bone24_r3;
	private ModelRenderer bone24_r4;
	private ModelRenderer bone24_r5;
	private ModelRenderer bone24_r6;
	private ModelRenderer bone24_r7;
	private ModelRenderer bone15;
	private ModelRenderer bone15_r1;
	private ModelRenderer bone15_r2;
	private ModelRenderer bone15_r3;
	private ModelRenderer bone16;
	private ModelRenderer bone16_r1;
	private ModelRenderer bone16_r2;
	private ModelRenderer bone16_r3;
	private ModelRenderer bone13;
	private ModelRenderer bone13_r1;
	private ModelRenderer bone13_r2;
	private ModelRenderer bone13_r3;
	private ModelRenderer bone17;
	private ModelRenderer bone17_r1;
	private ModelRenderer bone17_r2;
	private ModelRenderer bone17_r3;
	private ModelRenderer bone14;
	private ModelRenderer bone14_r1;
	private ModelRenderer bone14_r2;
	private ModelRenderer bone14_r3;
	private ModelRenderer bone18;
	private ModelRenderer bone18_r1;
	private ModelRenderer bone18_r2;
	private ModelRenderer bone18_r3;
	private ModelRenderer bone19;
	private ModelRenderer bone19_r1;
	private ModelRenderer bone19_r2;
	private ModelRenderer bone19_r3;
	private ModelRenderer bone19_r4;
	private ModelRenderer bone19_r5;
	private ModelRenderer bone19_r6;
	private ModelRenderer bone19_r7;
	private ModelRenderer zuotui;
	private ModelRenderer zuotui_r1;
	private ModelRenderer zuotui_r2;
	private ModelRenderer zuotui_r3;
	private ModelRenderer zuotui_r4;
	private ModelRenderer zuotui_r5;
	private ModelRenderer zuotui_r6;
	private ModelRenderer zuotui_r7;
	private ModelRenderer zuotui_r8;
	private ModelRenderer zuotui_r9;
	private ModelRenderer zuotui_r10;
	private ModelRenderer zuotui_r11;
	private ModelRenderer zuotui_r12;
	private ModelRenderer zuotui_r13;
	private ModelRenderer zuotui_r14;
	private ModelRenderer zuotui_r15;
	private ModelRenderer zuotui_r16;
	private ModelRenderer zuotui_r17;
	private ModelRenderer zuotui_r18;
	private ModelRenderer zuotui_r19;
	private ModelRenderer zuotui_r20;
	private ModelRenderer zuotui_r21;
	private ModelRenderer zuotui_r22;
	private ModelRenderer zuotui_r23;
	private ModelRenderer zuotui_r24;
	private ModelRenderer bone47;
	private ModelRenderer bone47_r1;
	private ModelRenderer bone47_r2;
	private ModelRenderer bone47_r3;
	private ModelRenderer bone47_r4;
	private ModelRenderer bone47_r5;
	private ModelRenderer bone47_r6;
	private ModelRenderer bone47_r7;
	private ModelRenderer bone47_r8;
	private ModelRenderer bone59;
	private ModelRenderer bone59_r1;
	private ModelRenderer bone59_r2;
	private ModelRenderer bone59_r3;
	private ModelRenderer bone59_r4;
	private ModelRenderer bone59_r5;
	private ModelRenderer bone59_r6;
	private ModelRenderer bone59_r7;
	private ModelRenderer bone59_r8;
	private ModelRenderer bone59_r9;
	private ModelRenderer bone59_r10;
	private ModelRenderer bone59_r11;
	private ModelRenderer bone59_r12;
	private ModelRenderer bone59_r13;
	private ModelRenderer bone59_r14;
	private ModelRenderer bone59_r15;
	private ModelRenderer bone59_r16;
	private ModelRenderer bone59_r17;
	private ModelRenderer bone59_r18;
	private ModelRenderer bone59_r19;
	private ModelRenderer bone59_r20;
	private ModelRenderer bone59_r21;
	private ModelRenderer bone59_r22;
	private ModelRenderer bone60;
	private ModelRenderer bone61;
	private ModelRenderer bone61_r1;
	private ModelRenderer bone61_r2;
	private ModelRenderer bone61_r3;
	private ModelRenderer bone61_r4;
	private ModelRenderer bone61_r5;
	private ModelRenderer bone61_r6;
	private ModelRenderer bone61_r7;
	private ModelRenderer bone61_r8;
	private ModelRenderer bone61_r9;
	private ModelRenderer bone61_r10;
	private ModelRenderer bone61_r11;
	private ModelRenderer bone61_r12;
	private ModelRenderer bone61_r13;
	private ModelRenderer bone61_r14;
	private ModelRenderer bone61_r15;
	private ModelRenderer bone61_r16;
	private ModelRenderer bone61_r17;
	private ModelRenderer bone61_r18;
	private ModelRenderer bone61_r19;
	private ModelRenderer bone61_r20;
	private ModelRenderer bone61_r21;
	private ModelRenderer bone61_r22;
	private ModelRenderer bone61_r23;
	private ModelRenderer bone61_r24;
	private ModelRenderer bone61_r25;
	private ModelRenderer bone61_r26;
	private ModelRenderer bone61_r27;
	private ModelRenderer bone61_r28;
	private ModelRenderer bone61_r29;
	private ModelRenderer bone61_r30;
	private ModelRenderer bone62;
	private ModelRenderer bone62_r1;
	private ModelRenderer bone62_r2;
	private ModelRenderer bone62_r3;
	private ModelRenderer bone62_r4;
	private ModelRenderer bone62_r5;
	private ModelRenderer bone62_r6;
	private ModelRenderer bone62_r7;
	private ModelRenderer bone63;
	private ModelRenderer bone63_r1;
	private ModelRenderer bone63_r2;
	private ModelRenderer bone63_r3;
	private ModelRenderer bone64;
	private ModelRenderer bone64_r1;
	private ModelRenderer bone64_r2;
	private ModelRenderer bone64_r3;
	private ModelRenderer bone65;
	private ModelRenderer bone65_r1;
	private ModelRenderer bone65_r2;
	private ModelRenderer bone65_r3;
	private ModelRenderer bone69;
	private ModelRenderer bone69_r1;
	private ModelRenderer bone69_r2;
	private ModelRenderer bone69_r3;
	private ModelRenderer bone70;
	private ModelRenderer bone70_r1;
	private ModelRenderer bone70_r2;
	private ModelRenderer bone70_r3;
	private ModelRenderer bone71;
	private ModelRenderer bone71_r1;
	private ModelRenderer bone71_r2;
	private ModelRenderer bone71_r3;
	private ModelRenderer bone72;
	private ModelRenderer bone72_r1;
	private ModelRenderer bone72_r2;
	private ModelRenderer bone72_r3;
	private ModelRenderer bone72_r4;
	private ModelRenderer bone72_r5;
	private ModelRenderer bone72_r6;
	private ModelRenderer bone72_r7;
	private ModelRenderer bone67;
	private ModelRenderer bone67_r1;
	private ModelRenderer bone66;
	private ModelRenderer bone66_r1;
	private ModelRenderer bone68;
	private ModelRenderer bone68_r1;
	private ModelRenderer bone4;
	private ModelRenderer bone4_r1;
	private ModelRenderer bone4_r2;
	private ModelRenderer bone4_r3;
	private ModelRenderer bone4_r4;
	private ModelRenderer bone4_r5;
	private ModelRenderer bone4_r6;
	private ModelRenderer bone4_r7;
	private ModelRenderer bone4_r8;
	private ModelRenderer bone4_r9;
	private ModelRenderer bone4_r10;
	private ModelRenderer bone4_r11;
	private ModelRenderer bone4_r12;
	private ModelRenderer bone4_r13;
	private ModelRenderer bone4_r14;
	private ModelRenderer bone4_r15;
	private ModelRenderer bone6;
	private ModelRenderer bone6_r1;
	private ModelRenderer bone6_r2;
	private ModelRenderer bone6_r3;
	private ModelRenderer bone6_r4;
	private ModelRenderer bone6_r5;
	private ModelRenderer bone6_r6;
	private ModelRenderer bone7;
	private ModelRenderer bone7_r1;
	private ModelRenderer bone7_r2;
	private ModelRenderer bone7_r3;
	private ModelRenderer bone7_r4;
	private ModelRenderer bone7_r5;
	private ModelRenderer bone7_r6;
	private ModelRenderer bone7_r7;
	private ModelRenderer bone7_r8;
	private ModelRenderer bone7_r9;
	private ModelRenderer bone5;
	private ModelRenderer bone5_r1;
	private ModelRenderer bone5_r2;
	private ModelRenderer bone5_r3;
	private ModelRenderer bone5_r4;
	private ModelRenderer bone5_r5;
	private ModelRenderer bone8;
	private ModelRenderer bone8_r1;
	private ModelRenderer bone8_r2;
	private ModelRenderer bone8_r3;
	private ModelRenderer bone8_r4;
	private ModelRenderer bone8_r5;

	public ModelMonarchMecha() {
		step1();
		step2();
	}

	public void step1() {
		textureWidth = 1024;
		textureHeight = 1024;

		xiabanshen = new ModelRenderer(this);
		xiabanshen.setRotationPoint(0.25F, -84.3893F, 0.5115F);
		xiabanshen.setTextureOffset(280, 64).addBox(-7.75F, -20.8507F, -15.4858F, 15.0F, 4.0F, 7.0F, 0.0F, false);

		xiabanshen_r1 = new ModelRenderer(this);
		xiabanshen_r1.setRotationPoint(2.0F, -32.0F, 13.0F);
		xiabanshen.addChild(xiabanshen_r1);
		setRotationAngle(xiabanshen_r1, 0.3054F, 0.0F, 0.0F);
		xiabanshen_r1.setTextureOffset(194, 333).addBox(-5.75F, -15.25F, -15.25F, 7.0F, 16.0F, 14.0F, 0.0F, false);
		xiabanshen_r1.setTextureOffset(267, 183).addBox(-9.75F, -4.25F, -16.0F, 15.0F, 8.0F, 6.0F, 0.0F, false);

		xiabanshen_r2 = new ModelRenderer(this);
		xiabanshen_r2.setRotationPoint(-0.25F, -30.1002F, -3.4967F);
		xiabanshen.addChild(xiabanshen_r2);
		setRotationAngle(xiabanshen_r2, -0.3491F, 0.0F, 0.0F);
		xiabanshen_r2.setTextureOffset(68, 296).addBox(-6.0F, 7.2495F, -6.4891F, 12.0F, 6.0F, 5.0F, 0.0F, false);

		xiabanshen_r3 = new ModelRenderer(this);
		xiabanshen_r3.setRotationPoint(12.75F, -18.3444F, 2.7507F);
		xiabanshen.addChild(xiabanshen_r3);
		setRotationAngle(xiabanshen_r3, 0.3192F, -0.082F, 0.263F);
		xiabanshen_r3.setTextureOffset(189, 261).addBox(-3.5F, -4.6784F, -5.8104F, 7.0F, 5.0F, 14.0F, 0.0F, false);

		xiabanshen_r4 = new ModelRenderer(this);
		xiabanshen_r4.setRotationPoint(-13.25F, -18.3444F, 2.7507F);
		xiabanshen.addChild(xiabanshen_r4);
		setRotationAngle(xiabanshen_r4, 0.3192F, 0.082F, -0.263F);
		xiabanshen_r4.setTextureOffset(377, 196).addBox(-3.52F, -4.6784F, -5.8104F, 7.0F, 5.0F, 14.0F, 0.0F, false);

		xiabanshen_r5 = new ModelRenderer(this);
		xiabanshen_r5.setRotationPoint(-12.25F, -10.4014F, 6.5437F);
		xiabanshen.addChild(xiabanshen_r5);
		setRotationAngle(xiabanshen_r5, 0.1309F, 0.0F, 0.0F);
		xiabanshen_r5.setTextureOffset(328, 55).addBox(-0.52F, -8.5F, -11.0F, 8.0F, 10.0F, 17.0F, 0.0F, true);
		xiabanshen_r5.setTextureOffset(328, 55).addBox(16.49F, -8.5F, -11.0F, 8.0F, 10.0F, 17.0F, 0.0F, false);

		xiabanshen_r6 = new ModelRenderer(this);
		xiabanshen_r6.setRotationPoint(12.75F, -18.3444F, 2.7507F);
		xiabanshen.addChild(xiabanshen_r6);
		setRotationAngle(xiabanshen_r6, -1.0335F, -0.082F, 0.263F);
		xiabanshen_r6.setTextureOffset(370, 430).addBox(-3.5F, -9.0081F, -2.795F, 7.0F, 5.0F, 10.0F, 0.0F, false);

		xiabanshen_r7 = new ModelRenderer(this);
		xiabanshen_r7.setRotationPoint(12.75F, -18.3444F, 2.7507F);
		xiabanshen.addChild(xiabanshen_r7);
		setRotationAngle(xiabanshen_r7, 1.1482F, -0.082F, 0.263F);
		xiabanshen_r7.setTextureOffset(395, 178).addBox(-5.5F, -7.4445F, -11.4762F, 9.0F, 5.0F, 11.0F, 0.0F, false);

		xiabanshen_r8 = new ModelRenderer(this);
		xiabanshen_r8.setRotationPoint(-0.25F, -29.1002F, -3.4967F);
		xiabanshen.addChild(xiabanshen_r8);
		setRotationAngle(xiabanshen_r8, 0.3491F, 0.0F, 0.0F);
		xiabanshen_r8.setTextureOffset(90, 134).addBox(-12.5F, 6.2495F, -5.7391F, 25.0F, 7.0F, 20.0F, 0.0F, false);

		xiabanshen_r9 = new ModelRenderer(this);
		xiabanshen_r9.setRotationPoint(8.75F, -21.1692F, -2.6796F);
		xiabanshen.addChild(xiabanshen_r9);
		setRotationAngle(xiabanshen_r9, -0.0567F, -0.1719F, -0.1772F);
		xiabanshen_r9.setTextureOffset(0, 361).addBox(-7.5F, -4.5034F, -3.728F, 8.0F, 5.0F, 15.0F, 0.0F, false);

		xiabanshen_r10 = new ModelRenderer(this);
		xiabanshen_r10.setRotationPoint(-9.25F, -21.1692F, -2.6796F);
		xiabanshen.addChild(xiabanshen_r10);
		setRotationAngle(xiabanshen_r10, -0.0567F, 0.1719F, 0.1772F);
		xiabanshen_r10.setTextureOffset(361, 46).addBox(-0.5F, -4.5034F, -3.728F, 8.0F, 5.0F, 15.0F, 0.0F, false);

		xiabanshen_r11 = new ModelRenderer(this);
		xiabanshen_r11.setRotationPoint(8.75F, -21.1692F, -2.6796F);
		xiabanshen.addChild(xiabanshen_r11);
		setRotationAngle(xiabanshen_r11, 1.1651F, -0.1719F, -0.1772F);
		xiabanshen_r11.setTextureOffset(405, 194).addBox(-7.5F, -5.0434F, -8.5433F, 8.0F, 5.0F, 11.0F, 0.0F, false);

		xiabanshen_r12 = new ModelRenderer(this);
		xiabanshen_r12.setRotationPoint(-9.25F, -21.1692F, -2.6796F);
		xiabanshen.addChild(xiabanshen_r12);
		setRotationAngle(xiabanshen_r12, 1.1651F, 0.1719F, 0.1772F);
		xiabanshen_r12.setTextureOffset(407, 71).addBox(-0.5F, -5.0434F, -8.5433F, 8.0F, 5.0F, 11.0F, 0.0F, false);

		xiabanshen_r13 = new ModelRenderer(this);
		xiabanshen_r13.setRotationPoint(7.0F, -36.1706F, 3.1368F);
		xiabanshen.addChild(xiabanshen_r13);
		setRotationAngle(xiabanshen_r13, -0.2781F, -0.3077F, -0.0862F);
		xiabanshen_r13.setTextureOffset(491, 85).addBox(-1.7374F, 6.9624F, 0.5477F, 4.0F, 8.0F, 4.0F, 0.0F, false);

		xiabanshen_r14 = new ModelRenderer(this);
		xiabanshen_r14.setRotationPoint(2.0F, -32.0F, 13.0F);
		xiabanshen.addChild(xiabanshen_r14);
		setRotationAngle(xiabanshen_r14, 0.5236F, 0.0F, 0.0F);
		xiabanshen_r14.setTextureOffset(324, 380).addBox(-7.75F, -2.75F, -11.0F, 11.0F, 6.0F, 11.0F, 0.0F, false);

		xiabanshen_r15 = new ModelRenderer(this);
		xiabanshen_r15.setRotationPoint(2.0F, -32.0F, 13.0F);
		xiabanshen.addChild(xiabanshen_r15);
		setRotationAngle(xiabanshen_r15, 0.7418F, 0.0F, 0.0F);
		xiabanshen_r15.setTextureOffset(332, 321).addBox(-8.75F, -0.75F, -12.0F, 13.0F, 4.0F, 13.0F, 0.0F, false);

		xiabanshen_r16 = new ModelRenderer(this);
		xiabanshen_r16.setRotationPoint(2.0F, -30.0F, 13.0F);
		xiabanshen.addChild(xiabanshen_r16);
		setRotationAngle(xiabanshen_r16, 0.4363F, 0.0F, 0.0F);
		xiabanshen_r16.setTextureOffset(226, 207).addBox(-10.75F, 1.25F, -1.5F, 17.0F, 6.0F, 6.0F, 0.0F, false);

		xiabanshen_r17 = new ModelRenderer(this);
		xiabanshen_r17.setRotationPoint(2.0F, -30.0F, 15.0F);
		xiabanshen.addChild(xiabanshen_r17);
		setRotationAngle(xiabanshen_r17, 0.4363F, 0.0F, 0.0F);
		xiabanshen_r17.setTextureOffset(185, 451).addBox(-5.75F, -0.75F, -3.0F, 7.0F, 9.0F, 7.0F, 0.0F, false);

		xiabanshen_r18 = new ModelRenderer(this);
		xiabanshen_r18.setRotationPoint(11.75F, -12.967F, 5.3796F);
		xiabanshen.addChild(xiabanshen_r18);
		setRotationAngle(xiabanshen_r18, 0.5672F, 0.0F, 0.0F);
		xiabanshen_r18.setTextureOffset(282, 391).addBox(-7.5F, -0.5F, -11.0F, 8.0F, 6.0F, 12.0F, 0.0F, false);
		xiabanshen_r18.setTextureOffset(484, 282).addBox(-4.5F, -6.0F, -12.0F, 6.0F, 12.0F, 3.0F, 0.0F, false);
		xiabanshen_r18.setTextureOffset(484, 308).addBox(-25.5F, -6.0F, -12.0F, 6.0F, 12.0F, 3.0F, 0.0F, false);
		xiabanshen_r18.setTextureOffset(392, 34).addBox(-24.5F, -0.5F, -11.0F, 8.0F, 6.0F, 12.0F, 0.0F, false);

		xiabanshen_r19 = new ModelRenderer(this);
		xiabanshen_r19.setRotationPoint(8.75F, -1.551F, -9.2829F);
		xiabanshen.addChild(xiabanshen_r19);
		setRotationAngle(xiabanshen_r19, 0.5968F, 0.3022F, 0.2252F);
		xiabanshen_r19.setTextureOffset(206, 106).addBox(-1.0F, -1.75F, -2.5F, 2.0F, 5.0F, 10.0F, 0.0F, false);

		xiabanshen_r20 = new ModelRenderer(this);
		xiabanshen_r20.setRotationPoint(-0.25F, -29.1002F, -3.4967F);
		xiabanshen.addChild(xiabanshen_r20);
		setRotationAngle(xiabanshen_r20, 0.0873F, 0.0F, 0.0F);
		xiabanshen_r20.setTextureOffset(66, 161).addBox(-7.5F, 6.2495F, -4.7391F, 15.0F, 13.0F, 24.0F, 0.0F, false);

		xiabanshen_r21 = new ModelRenderer(this);
		xiabanshen_r21.setRotationPoint(-0.25F, -29.1002F, -3.7467F);
		xiabanshen.addChild(xiabanshen_r21);
		setRotationAngle(xiabanshen_r21, 0.3491F, 0.0F, 0.0F);
		xiabanshen_r21.setTextureOffset(0, 90).addBox(-9.5F, 5.2495F, 13.2609F, 19.0F, 9.0F, 3.0F, 0.0F, false);

		xiabanshen_r22 = new ModelRenderer(this);
		xiabanshen_r22.setRotationPoint(10.2851F, -2.0524F, -10.9031F);
		xiabanshen.addChild(xiabanshen_r22);
		setRotationAngle(xiabanshen_r22, -1.3178F, 0.423F, 0.2578F);
		xiabanshen_r22.setTextureOffset(94, 426).addBox(-1.0F, -5.3033F, -5.3033F, 2.0F, 4.0F, 4.0F, 0.0F, false);
		xiabanshen_r22.setTextureOffset(431, 87).addBox(-1.0F, 1.0607F, 1.0607F, 2.0F, 4.0F, 4.0F, 0.0F, false);

		xiabanshen_r23 = new ModelRenderer(this);
		xiabanshen_r23.setRotationPoint(9.9451F, 3.9476F, -13.1531F);
		xiabanshen.addChild(xiabanshen_r23);
		setRotationAngle(xiabanshen_r23, -1.3178F, 0.423F, 0.2578F);
		xiabanshen_r23.setTextureOffset(431, 370).addBox(-1.0F, -5.3033F, -5.3033F, 2.0F, 4.0F, 4.0F, 0.0F, false);
		xiabanshen_r23.setTextureOffset(260, 444).addBox(-1.0F, 1.0607F, 1.0607F, 2.0F, 4.0F, 4.0F, 0.0F, false);

		xiabanshen_r24 = new ModelRenderer(this);
		xiabanshen_r24.setRotationPoint(-7.5F, -36.1706F, 3.1368F);
		xiabanshen.addChild(xiabanshen_r24);
		setRotationAngle(xiabanshen_r24, -0.2781F, 0.3077F, 0.0862F);
		xiabanshen_r24.setTextureOffset(492, 143).addBox(-2.7626F, 6.9624F, 0.5477F, 4.0F, 8.0F, 4.0F, 0.0F, false);

		xiabanshen_r25 = new ModelRenderer(this);
		xiabanshen_r25.setRotationPoint(-13.25F, -18.3444F, 2.7507F);
		xiabanshen.addChild(xiabanshen_r25);
		setRotationAngle(xiabanshen_r25, -1.0335F, 0.082F, -0.263F);
		xiabanshen_r25.setTextureOffset(430, 313).addBox(-3.5F, -9.0081F, -2.795F, 7.0F, 5.0F, 10.0F, 0.0F, false);

		xiabanshen_r26 = new ModelRenderer(this);
		xiabanshen_r26.setRotationPoint(-13.25F, -18.3444F, 2.7507F);
		xiabanshen.addChild(xiabanshen_r26);
		setRotationAngle(xiabanshen_r26, 1.1482F, 0.082F, -0.263F);
		xiabanshen_r26.setTextureOffset(322, 397).addBox(-3.5F, -7.4445F, -11.4762F, 9.0F, 5.0F, 11.0F, 0.0F, false);

		xiabanshen_r27 = new ModelRenderer(this);
		xiabanshen_r27.setRotationPoint(-9.25F, -1.551F, -9.2829F);
		xiabanshen.addChild(xiabanshen_r27);
		setRotationAngle(xiabanshen_r27, 0.5968F, -0.3022F, -0.2252F);
		xiabanshen_r27.setTextureOffset(294, 112).addBox(-1.0F, -1.75F, -2.5F, 2.0F, 5.0F, 10.0F, 0.0F, false);

		xiabanshen_r28 = new ModelRenderer(this);
		xiabanshen_r28.setRotationPoint(10.2851F, -2.0524F, -10.9031F);
		xiabanshen.addChild(xiabanshen_r28);
		setRotationAngle(xiabanshen_r28, -0.5324F, 0.423F, 0.2578F);
		xiabanshen_r28.setTextureOffset(110, 486).addBox(-1.01F, -4.5F, -3.0F, 2.0F, 9.0F, 6.0F, 0.0F, true);

		xiabanshen_r29 = new ModelRenderer(this);
		xiabanshen_r29.setRotationPoint(-10.7851F, -2.0524F, -10.9031F);
		xiabanshen.addChild(xiabanshen_r29);
		setRotationAngle(xiabanshen_r29, -0.5324F, -0.423F, -0.2578F);
		xiabanshen_r29.setTextureOffset(110, 486).addBox(-1.04F, -4.5F, -3.0F, 2.0F, 9.0F, 6.0F, 0.0F, false);

		xiabanshen_r30 = new ModelRenderer(this);
		xiabanshen_r30.setRotationPoint(-10.7851F, -2.0524F, -10.9031F);
		xiabanshen.addChild(xiabanshen_r30);
		setRotationAngle(xiabanshen_r30, -1.3178F, -0.423F, -0.2578F);
		xiabanshen_r30.setTextureOffset(278, 444).addBox(-1.0F, -5.3033F, -5.3033F, 2.0F, 4.0F, 4.0F, 0.0F, false);
		xiabanshen_r30.setTextureOffset(453, 229).addBox(-1.0F, 1.0607F, 1.0607F, 2.0F, 4.0F, 4.0F, 0.0F, false);

		xiabanshen_r31 = new ModelRenderer(this);
		xiabanshen_r31.setRotationPoint(9.9451F, 3.9476F, -13.1531F);
		xiabanshen.addChild(xiabanshen_r31);
		setRotationAngle(xiabanshen_r31, -0.5324F, 0.423F, 0.2578F);
		xiabanshen_r31.setTextureOffset(181, 486).addBox(-1.01F, -4.5F, -3.0F, 2.0F, 9.0F, 6.0F, 0.0F, true);

		xiabanshen_r32 = new ModelRenderer(this);
		xiabanshen_r32.setRotationPoint(-10.4451F, 3.9476F, -13.1531F);
		xiabanshen.addChild(xiabanshen_r32);
		setRotationAngle(xiabanshen_r32, -0.5324F, -0.423F, -0.2578F);
		xiabanshen_r32.setTextureOffset(181, 486).addBox(-1.04F, -4.5F, -3.0F, 2.0F, 9.0F, 6.0F, 0.0F, false);

		xiabanshen_r33 = new ModelRenderer(this);
		xiabanshen_r33.setRotationPoint(-10.4451F, 3.9476F, -13.1531F);
		xiabanshen.addChild(xiabanshen_r33);
		setRotationAngle(xiabanshen_r33, -1.3178F, -0.423F, -0.2578F);
		xiabanshen_r33.setTextureOffset(462, 97).addBox(-1.0F, -5.3033F, -5.3033F, 2.0F, 4.0F, 4.0F, 0.0F, false);
		xiabanshen_r33.setTextureOffset(474, 419).addBox(-1.0F, 1.0607F, 1.0607F, 2.0F, 4.0F, 4.0F, 0.0F, false);

		xiabanshen_r34 = new ModelRenderer(this);
		xiabanshen_r34.setRotationPoint(-1.25F, -15.1547F, 11.8486F);
		xiabanshen.addChild(xiabanshen_r34);
		setRotationAngle(xiabanshen_r34, 0.9599F, 0.0F, 0.0F);
		xiabanshen_r34.setTextureOffset(341, 219).addBox(-5.5F, -5.5F, -12.0F, 13.0F, 11.0F, 11.0F, 0.0F, false);

		xiabanshen_r35 = new ModelRenderer(this);
		xiabanshen_r35.setRotationPoint(-0.25F, -29.1002F, -15.4967F);
		xiabanshen.addChild(xiabanshen_r35);
		setRotationAngle(xiabanshen_r35, -0.3054F, 0.0F, 0.0F);
		xiabanshen_r35.setTextureOffset(124, 68).addBox(-5.5F, 6.2495F, 11.2609F, 11.0F, 18.0F, 11.0F, 0.0F, false);

		xiabanshen_r36 = new ModelRenderer(this);
		xiabanshen_r36.setRotationPoint(-1.25F, -13.6452F, 2.9461F);
		xiabanshen.addChild(xiabanshen_r36);
		setRotationAngle(xiabanshen_r36, 1.6581F, 0.0F, 0.0F);
		xiabanshen_r36.setTextureOffset(52, 474).addBox(-3.5F, -5.5F, -12.0F, 9.0F, 11.0F, 3.0F, 0.0F, false);

		shangbanshen = new ModelRenderer(this);
		shangbanshen.setRotationPoint(-0.25F, -34.6107F, 6.4885F);
		xiabanshen.addChild(shangbanshen);

		shangbanshen_r1 = new ModelRenderer(this);
		shangbanshen_r1.setRotationPoint(4.75F, -14.7796F, -21.2723F);
		shangbanshen.addChild(shangbanshen_r1);
		setRotationAngle(shangbanshen_r1, 0.2182F, 0.0F, 0.0F);
		shangbanshen_r1.setTextureOffset(426, 44).addBox(-8.75F, -2.5613F, -0.9727F, 8.0F, 7.0F, 9.0F, 0.0F, false);

		shangbanshen_r2 = new ModelRenderer(this);
		shangbanshen_r2.setRotationPoint(4.75F, -15.5296F, -20.0223F);
		shangbanshen.addChild(shangbanshen_r2);
		setRotationAngle(shangbanshen_r2, 0.48F, 0.0F, 0.0F);
		shangbanshen_r2.setTextureOffset(196, 137).addBox(-6.75F, -9.5613F, -3.9727F, 4.0F, 12.0F, 12.0F, 0.0F, false);

		shangbanshen_r3 = new ModelRenderer(this);
		shangbanshen_r3.setRotationPoint(12.25F, -24.2796F, -12.2723F);
		shangbanshen.addChild(shangbanshen_r3);
		setRotationAngle(shangbanshen_r3, 0.6545F, 0.0F, 0.0F);
		shangbanshen_r3.setTextureOffset(374, 260).addBox(-15.75F, -1.5613F, -11.4727F, 7.0F, 4.0F, 5.0F, 0.0F, false);
		shangbanshen_r3.setTextureOffset(321, 55).addBox(-19.25F, -3.5613F, -12.4727F, 4.0F, 2.0F, 3.0F, 0.0F, false);
		shangbanshen_r3.setTextureOffset(341, 82).addBox(-9.25F, -3.5613F, -12.4727F, 4.0F, 2.0F, 3.0F, 0.0F, false);
		shangbanshen_r3.setTextureOffset(297, 151).addBox(-18.75F, -6.5613F, -11.2227F, 3.0F, 5.0F, 2.0F, 0.0F, false);
		shangbanshen_r3.setTextureOffset(210, 363).addBox(-8.75F, -6.5613F, -11.2227F, 3.0F, 5.0F, 2.0F, 0.0F, false);
		shangbanshen_r3.setTextureOffset(272, 328).addBox(-18.75F, -2.5613F, -10.4727F, 3.0F, 9.0F, 1.0F, 0.0F, false);
		shangbanshen_r3.setTextureOffset(334, 197).addBox(-8.75F, -2.5613F, -10.4727F, 3.0F, 9.0F, 1.0F, 0.0F, false);
		shangbanshen_r3.setTextureOffset(135, 405).addBox(-26.75F, -8.5613F, -0.4727F, 7.0F, 16.0F, 8.0F, 0.0F, false);
		shangbanshen_r3.setTextureOffset(165, 406).addBox(-4.75F, -8.5613F, -0.4727F, 7.0F, 16.0F, 8.0F, 0.0F, false);
		shangbanshen_r3.setTextureOffset(152, 187).addBox(-21.75F, -8.5613F, -9.4727F, 5.0F, 16.0F, 9.0F, 0.0F, false);
		shangbanshen_r3.setTextureOffset(227, 172).addBox(-7.75F, -8.5613F, -9.4727F, 5.0F, 16.0F, 9.0F, 0.0F, false);
		shangbanshen_r3.setTextureOffset(463, 393).addBox(-29.75F, -6.5613F, -8.4727F, 4.0F, 4.0F, 9.0F, 0.0F, true);
		shangbanshen_r3.setTextureOffset(463, 393).addBox(1.25F, -6.5613F, -8.4727F, 4.0F, 4.0F, 9.0F, 0.0F, false);
		shangbanshen_r3.setTextureOffset(212, 68).addBox(-25.75F, -6.5613F, -8.4727F, 27.0F, 12.0F, 14.0F, 0.0F, false);

		shangbanshen_r4 = new ModelRenderer(this);
		shangbanshen_r4.setRotationPoint(0.0F, -21.7351F, -22.2599F);
		shangbanshen.addChild(shangbanshen_r4);
		setRotationAngle(shangbanshen_r4, 1.0472F, 0.0F, 0.0F);
		shangbanshen_r4.setTextureOffset(449, 81).addBox(-3.5F, -8.5F, -2.25F, 7.0F, 9.0F, 7.0F, 0.0F, false);

		shangbanshen_r5 = new ModelRenderer(this);
		shangbanshen_r5.setRotationPoint(4.25F, -24.2796F, -12.2723F);
		shangbanshen.addChild(shangbanshen_r5);
		setRotationAngle(shangbanshen_r5, 1.309F, 0.0F, 0.0F);
		shangbanshen_r5.setTextureOffset(417, 225).addBox(-8.75F, -5.0144F, -18.2406F, 9.0F, 6.0F, 9.0F, 0.0F, false);

		shangbanshen_r6 = new ModelRenderer(this);
		shangbanshen_r6.setRotationPoint(4.25F, -20.2796F, -8.2723F);
		shangbanshen.addChild(shangbanshen_r6);
		setRotationAngle(shangbanshen_r6, 1.309F, 0.0F, 0.0F);
		shangbanshen_r6.setTextureOffset(232, 94).addBox(-15.75F, -3.0144F, -3.2406F, 23.0F, 15.0F, 13.0F, 0.0F, false);

		shangbanshen_r7 = new ModelRenderer(this);
		shangbanshen_r7.setRotationPoint(-4.25F, -27.2796F, -8.2723F);
		shangbanshen.addChild(shangbanshen_r7);
		setRotationAngle(shangbanshen_r7, 0.9599F, 0.0F, 0.0F);
		shangbanshen_r7.setTextureOffset(0, 134).addBox(-11.25F, -0.0144F, -10.2406F, 31.0F, 17.0F, 14.0F, 0.0F, false);
		shangbanshen_r7.setTextureOffset(115, 225).addBox(-12.25F, -0.0144F, -0.2406F, 33.0F, 20.0F, 7.0F, 0.0F, false);

		shangbanshen_r8 = new ModelRenderer(this);
		shangbanshen_r8.setRotationPoint(-4.25F, -40.0219F, 1.4897F);
		shangbanshen.addChild(shangbanshen_r8);
		setRotationAngle(shangbanshen_r8, 1.5272F, 0.0F, 0.0F);
		shangbanshen_r8.setTextureOffset(343, 189).addBox(-2.25F, 3.9856F, -16.2405F, 13.0F, 10.0F, 11.0F, 0.0F, false);

		shangbanshen_r9 = new ModelRenderer(this);
		shangbanshen_r9.setRotationPoint(0.25F, -36.2181F, 6.128F);
		shangbanshen.addChild(shangbanshen_r9);
		setRotationAngle(shangbanshen_r9, 1.3526F, 0.0F, 0.0F);
		shangbanshen_r9.setTextureOffset(88, 58).addBox(-11.75F, -2.0144F, -20.2405F, 6.0F, 16.0F, 11.0F, 0.0F, false);
		shangbanshen_r9.setTextureOffset(0, 202).addBox(5.25F, -2.0144F, -20.2405F, 6.0F, 16.0F, 11.0F, 0.0F, false);

		shangbanshen_r10 = new ModelRenderer(this);
		shangbanshen_r10.setRotationPoint(-0.25F, -36.2181F, 6.128F);
		shangbanshen.addChild(shangbanshen_r10);
		setRotationAngle(shangbanshen_r10, 1.0472F, 0.0F, 0.0F);
		shangbanshen_r10.setTextureOffset(240, 0).addBox(-12.25F, -2.0144F, -11.2405F, 25.0F, 18.0F, 9.0F, 0.0F, false);

		shangbanshen_r11 = new ModelRenderer(this);
		shangbanshen_r11.setRotationPoint(4.25F, -34.2181F, 6.128F);
		shangbanshen.addChild(shangbanshen_r11);
		setRotationAngle(shangbanshen_r11, 1.8762F, 0.0F, 0.0F);
		shangbanshen_r11.setTextureOffset(404, 332).addBox(-8.75F, -2.0144F, -12.7405F, 9.0F, 12.0F, 8.0F, 0.0F, false);

		shangbanshen_r12 = new ModelRenderer(this);
		shangbanshen_r12.setRotationPoint(4.25F, -34.2181F, 6.128F);
		shangbanshen.addChild(shangbanshen_r12);
		setRotationAngle(shangbanshen_r12, 1.0472F, 0.0F, 0.0F);
		shangbanshen_r12.setTextureOffset(237, 122).addBox(-14.75F, -2.0144F, -19.2405F, 21.0F, 15.0F, 14.0F, 0.0F,
				false);

		shangbanshen_r13 = new ModelRenderer(this);
		shangbanshen_r13.setRotationPoint(1.0F, -15.0682F, 7.5096F);
		shangbanshen.addChild(shangbanshen_r13);
		setRotationAngle(shangbanshen_r13, 1.309F, 0.0F, 0.0F);
		shangbanshen_r13.setTextureOffset(174, 294).addBox(3.5F, -11.0987F, -2.2116F, 5.0F, 18.0F, 19.0F, 0.0F, false);
		shangbanshen_r13.setTextureOffset(39, 296).addBox(-10.5F, -11.0987F, -2.2116F, 5.0F, 18.0F, 19.0F, 0.0F, false);

		shangbanshen_r14 = new ModelRenderer(this);
		shangbanshen_r14.setRotationPoint(4.25F, -24.2796F, 1.7277F);
		shangbanshen.addChild(shangbanshen_r14);
		setRotationAngle(shangbanshen_r14, 0.4363F, 0.0F, 0.0F);
		shangbanshen_r14.setTextureOffset(203, 285).addBox(-12.75F, -2.0144F, -12.2406F, 17.0F, 14.0F, 14.0F, 0.0F,
				false);

		shangbanshen_r15 = new ModelRenderer(this);
		shangbanshen_r15.setRotationPoint(-9.0F, -13.6846F, -16.1614F);
		shangbanshen.addChild(shangbanshen_r15);
		setRotationAngle(shangbanshen_r15, 1.309F, 0.2182F, 0.0F);
		shangbanshen_r15.setTextureOffset(484, 160).addBox(-3.25F, -3.0F, 0.0F, 6.0F, 6.0F, 4.0F, 0.0F, true);

		shangbanshen_r16 = new ModelRenderer(this);
		shangbanshen_r16.setRotationPoint(9.0F, -13.6846F, -16.1614F);
		shangbanshen.addChild(shangbanshen_r16);
		setRotationAngle(shangbanshen_r16, 1.309F, -0.2182F, 0.0F);
		shangbanshen_r16.setTextureOffset(484, 160).addBox(-3.0F, -3.0F, 0.0F, 6.0F, 6.0F, 4.0F, 0.0F, false);

		shangbanshen_r17 = new ModelRenderer(this);
		shangbanshen_r17.setRotationPoint(-4.25F, -24.2796F, -12.2723F);
		shangbanshen.addChild(shangbanshen_r17);
		setRotationAngle(shangbanshen_r17, 1.309F, 0.2618F, 0.0F);
		shangbanshen_r17.setTextureOffset(0, 419).addBox(-9.8F, 1.6756F, -19.7406F, 8.0F, 11.0F, 8.0F, 0.0F, false);
		shangbanshen_r17.setTextureOffset(305, 260).addBox(-13.8F, 4.4256F, -11.2406F, 15.0F, 4.0F, 4.0F, 0.0F, false);
		shangbanshen_r17.setTextureOffset(204, 43).addBox(-7.8F, 4.4256F, -21.2406F, 9.0F, 2.0F, 17.0F, 0.0F, false);
		shangbanshen_r17.setTextureOffset(470, 446).addBox(-6.49F, -3.5744F, -20.2406F, 8.0F, 10.0F, 4.0F, 0.0F, false);
		shangbanshen_r17.setTextureOffset(142, 331).addBox(-12.8F, -3.5744F, -16.2406F, 14.0F, 10.0F, 12.0F, 0.0F,
				false);

		shangbanshen_r18 = new ModelRenderer(this);
		shangbanshen_r18.setRotationPoint(4.25F, -24.2796F, -12.2723F);
		shangbanshen.addChild(shangbanshen_r18);
		setRotationAngle(shangbanshen_r18, 1.309F, -0.2618F, 0.0F);
		shangbanshen_r18.setTextureOffset(396, 420).addBox(1.1F, 1.6756F, -19.7406F, 8.0F, 11.0F, 8.0F, 0.0F, false);
		shangbanshen_r18.setTextureOffset(309, 189).addBox(-1.9F, 4.4256F, -11.2406F, 15.0F, 4.0F, 4.0F, 0.0F, false);
		shangbanshen_r18.setTextureOffset(330, 87).addBox(-1.9F, 4.4256F, -21.2406F, 9.0F, 2.0F, 17.0F, 0.0F, false);
		shangbanshen_r18.setTextureOffset(8, 471).addBox(-1.9F, -3.5744F, -20.2406F, 8.0F, 10.0F, 4.0F, 0.0F, false);
		shangbanshen_r18.setTextureOffset(332, 299).addBox(-1.9F, -3.5744F, -16.2406F, 14.0F, 10.0F, 12.0F, 0.0F,
				false);

		shangbanshen_r19 = new ModelRenderer(this);
		shangbanshen_r19.setRotationPoint(3.25F, -27.5291F, -17.5658F);
		shangbanshen.addChild(shangbanshen_r19);
		setRotationAngle(shangbanshen_r19, 1.8326F, 0.0F, 0.0F);
		shangbanshen_r19.setTextureOffset(184, 368).addBox(-18.76F, 3.9856F, -21.9906F, 6.0F, 8.0F, 13.0F, 0.0F, false);
		shangbanshen_r19.setTextureOffset(295, 369).addBox(6.25F, 3.9856F, -21.9906F, 6.0F, 8.0F, 13.0F, 0.0F, false);

		shangbanshen_r20 = new ModelRenderer(this);
		shangbanshen_r20.setRotationPoint(14.25F, -12.5803F, -1.3186F);
		shangbanshen.addChild(shangbanshen_r20);
		setRotationAngle(shangbanshen_r20, 0.3054F, 0.0F, 0.0F);
		shangbanshen_r20.setTextureOffset(260, 444).addBox(-10.75F, 4.9856F, -18.2406F, 3.0F, 4.0F, 12.0F, 0.0F, false);

		shangbanshen_r21 = new ModelRenderer(this);
		shangbanshen_r21.setRotationPoint(-14.25F, -12.2796F, -2.2723F);
		shangbanshen.addChild(shangbanshen_r21);
		setRotationAngle(shangbanshen_r21, 0.3054F, 0.0F, 0.0F);
		shangbanshen_r21.setTextureOffset(297, 164).addBox(7.73F, 4.9856F, -17.2406F, 3.0F, 4.0F, 11.0F, 0.0F, false);
		shangbanshen_r21.setTextureOffset(300, 350).addBox(7.73F, -2.0144F, -17.2406F, 13.0F, 7.0F, 12.0F, 0.0F, false);

		shangbanshen_r22 = new ModelRenderer(this);
		shangbanshen_r22.setRotationPoint(0.0F, -15.5682F, 7.5096F);
		shangbanshen.addChild(shangbanshen_r22);
		setRotationAngle(shangbanshen_r22, -0.7418F, 0.0F, 0.0F);
		shangbanshen_r22.setTextureOffset(36, 202).addBox(-5.0F, 3.2581F, -3.2917F, 10.0F, 18.0F, 9.0F, 0.0F, false);

		shangbanshen_r23 = new ModelRenderer(this);
		shangbanshen_r23.setRotationPoint(1.0F, -15.0682F, 7.5096F);
		shangbanshen.addChild(shangbanshen_r23);
		setRotationAngle(shangbanshen_r23, -0.9599F, 0.0F, 0.0F);
		shangbanshen_r23.setTextureOffset(456, 51).addBox(3.49F, -2.7419F, -2.2917F, 5.0F, 6.0F, 9.0F, 0.0F, false);
		shangbanshen_r23.setTextureOffset(456, 126).addBox(-10.51F, -2.7419F, -2.2917F, 5.0F, 6.0F, 9.0F, 0.0F, false);

		shangbanshen_r24 = new ModelRenderer(this);
		shangbanshen_r24.setRotationPoint(2.25F, -9.1393F, -1.9885F);
		shangbanshen.addChild(shangbanshen_r24);
		setRotationAngle(shangbanshen_r24, -0.9599F, 0.0F, 0.0F);
		shangbanshen_r24.setTextureOffset(287, 198).addBox(-11.75F, -9.25F, -5.5F, 19.0F, 23.0F, 9.0F, 0.0F, false);

		shangbanshen_r25 = new ModelRenderer(this);
		shangbanshen_r25.setRotationPoint(2.25F, 2.6107F, 6.5115F);
		shangbanshen.addChild(shangbanshen_r25);
		setRotationAngle(shangbanshen_r25, 0.3054F, 0.0F, 0.0F);
		shangbanshen_r25.setTextureOffset(320, 106).addBox(-9.75F, -9.25F, -16.0F, 15.0F, 5.0F, 6.0F, 0.0F, false);

		shangbanshen_r26 = new ModelRenderer(this);
		shangbanshen_r26.setRotationPoint(-7.25F, -1.5599F, -3.3517F);
		shangbanshen.addChild(shangbanshen_r26);
		setRotationAngle(shangbanshen_r26, -0.2781F, 0.3077F, 0.0862F);
		shangbanshen_r26.setTextureOffset(336, 0).addBox(-2.7626F, -15.0376F, -0.4523F, 3.0F, 11.0F, 5.0F, 0.0F, false);

		shangbanshen_r27 = new ModelRenderer(this);
		shangbanshen_r27.setRotationPoint(7.25F, -1.5599F, -3.3517F);
		shangbanshen.addChild(shangbanshen_r27);
		setRotationAngle(shangbanshen_r27, -0.2781F, -0.3077F, -0.0862F);
		shangbanshen_r27.setTextureOffset(0, 338).addBox(-0.2374F, -15.0376F, -0.4523F, 3.0F, 11.0F, 5.0F, 0.0F, false);

		shangbanshen_r28 = new ModelRenderer(this);
		shangbanshen_r28.setRotationPoint(2.25F, 2.6107F, -4.4885F);
		shangbanshen.addChild(shangbanshen_r28);
		setRotationAngle(shangbanshen_r28, -0.0873F, 0.0F, 0.0F);
		shangbanshen_r28.setTextureOffset(431, 299).addBox(-8.75F, -5.25F, -11.5F, 13.0F, 5.0F, 5.0F, 0.0F, false);

		shangbanshen_r29 = new ModelRenderer(this);
		shangbanshen_r29.setRotationPoint(-9.75F, -29.346F, -0.4112F);
		shangbanshen.addChild(shangbanshen_r29);
		setRotationAngle(shangbanshen_r29, 0.2182F, 0.0F, 0.0F);
		shangbanshen_r29.setTextureOffset(324, 144).addBox(-4.75F, -8.5613F, -9.4727F, 7.0F, 6.0F, 9.0F, 0.0F, false);
		shangbanshen_r29.setTextureOffset(435, 181).addBox(17.25F, -8.5613F, -9.4727F, 7.0F, 6.0F, 9.0F, 0.0F, false);
		shangbanshen_r29.setTextureOffset(406, 215).addBox(2.25F, -8.5613F, -2.4727F, 15.0F, 4.0F, 6.0F, 0.0F, false);

		shangbanshen_r30 = new ModelRenderer(this);
		shangbanshen_r30.setRotationPoint(-4.25F, -20.0296F, -7.2723F);
		shangbanshen.addChild(shangbanshen_r30);
		setRotationAngle(shangbanshen_r30, 0.6545F, 0.0F, 0.0F);
		shangbanshen_r30.setTextureOffset(392, 156).addBox(-13.25F, -9.5613F, 5.5273F, 8.0F, 8.0F, 11.0F, 0.0F, false);
		shangbanshen_r30.setTextureOffset(393, 124).addBox(13.75F, -9.5613F, 5.5273F, 8.0F, 8.0F, 11.0F, 0.0F, false);
		shangbanshen_r30.setTextureOffset(458, 163).addBox(-0.25F, -8.5613F, 21.5273F, 9.0F, 12.0F, 4.0F, 0.0F, false);
		shangbanshen_r30.setTextureOffset(197, 225).addBox(-5.25F, -9.5613F, 2.5273F, 19.0F, 8.0F, 19.0F, 0.0F, false);

		shangbanshen_r31 = new ModelRenderer(this);
		shangbanshen_r31.setRotationPoint(0.0F, -45.4283F, -3.5004F);
		shangbanshen.addChild(shangbanshen_r31);
		setRotationAngle(shangbanshen_r31, 0.6545F, 0.0F, 0.0F);
		shangbanshen_r31.setTextureOffset(447, 349).addBox(-11.5F, 6.7385F, -4.7755F, 5.0F, 4.0F, 10.0F, 0.0F, true);
		shangbanshen_r31.setTextureOffset(447, 349).addBox(6.5F, 6.7385F, -4.7755F, 5.0F, 4.0F, 10.0F, 0.0F, false);

		shangbanshen_r32 = new ModelRenderer(this);
		shangbanshen_r32.setRotationPoint(0.0F, -43.7792F, 5.5056F);
		shangbanshen.addChild(shangbanshen_r32);
		setRotationAngle(shangbanshen_r32, 0.6981F, 0.0F, 0.0F);
		shangbanshen_r32.setTextureOffset(438, 389).addBox(-5.5F, -4.52F, -1.7646F, 11.0F, 7.0F, 6.0F, 0.0F, false);

		shangbanshen_r33 = new ModelRenderer(this);
		shangbanshen_r33.setRotationPoint(5.0F, -43.7792F, 1.5056F);
		shangbanshen.addChild(shangbanshen_r33);
		setRotationAngle(shangbanshen_r33, 0.8134F, 0.4851F, 0.4582F);
		shangbanshen_r33.setTextureOffset(420, 25).addBox(3.7851F, 1.5F, -6.2917F, 3.0F, 6.0F, 13.0F, 0.0F, false);

		shangbanshen_r34 = new ModelRenderer(this);
		shangbanshen_r34.setRotationPoint(-5.0F, -43.7792F, 1.5056F);
		shangbanshen.addChild(shangbanshen_r34);
		setRotationAngle(shangbanshen_r34, 0.8134F, -0.4851F, -0.4582F);
		shangbanshen_r34.setTextureOffset(420, 106).addBox(-6.7851F, 1.5F, -6.2917F, 3.0F, 6.0F, 13.0F, 0.0F, false);

		shangbanshen_r35 = new ModelRenderer(this);
		shangbanshen_r35.setRotationPoint(0.0F, -43.7792F, 5.5056F);
		shangbanshen.addChild(shangbanshen_r35);
		setRotationAngle(shangbanshen_r35, 0.8134F, -0.4851F, -0.4582F);
		shangbanshen_r35.setTextureOffset(474, 256).addBox(-7.7851F, -4.5F, 0.7083F, 6.0F, 7.0F, 6.0F, 0.0F, false);

		shangbanshen_r36 = new ModelRenderer(this);
		shangbanshen_r36.setRotationPoint(0.0F, -43.7792F, 5.5056F);
		shangbanshen.addChild(shangbanshen_r36);
		setRotationAngle(shangbanshen_r36, 0.8134F, 0.4851F, 0.4582F);
		shangbanshen_r36.setTextureOffset(474, 406).addBox(1.7851F, -4.5F, 0.7083F, 6.0F, 7.0F, 6.0F, 0.0F, false);

		shangbanshen_r37 = new ModelRenderer(this);
		shangbanshen_r37.setRotationPoint(-17.1667F, -31.3555F, -7.915F);
		shangbanshen.addChild(shangbanshen_r37);
		setRotationAngle(shangbanshen_r37, 1.789F, 0.0F, 0.0F);
		shangbanshen_r37.setTextureOffset(423, 270).addBox(-5.2833F, -8.916F, -12.0863F, 8.0F, 5.0F, 10.0F, 0.0F, true);
		shangbanshen_r37.setTextureOffset(423, 270).addBox(30.6667F, -8.916F, -12.0863F, 8.0F, 5.0F, 10.0F, 0.0F,
				false);

		shangbanshen_r38 = new ModelRenderer(this);
		shangbanshen_r38.setRotationPoint(-17.1667F, -29.1017F, -18.9401F);
		shangbanshen.addChild(shangbanshen_r38);
		setRotationAngle(shangbanshen_r38, 2.4435F, 0.0F, 0.0F);
		shangbanshen_r38.setTextureOffset(78, 265).addBox(-5.3333F, -9.916F, -13.0863F, 11.0F, 7.0F, 9.0F, 0.0F, false);
		shangbanshen_r38.setTextureOffset(378, 66).addBox(28.6667F, -9.916F, -13.0863F, 11.0F, 7.0F, 9.0F, 0.0F, false);

		shangbanshen_r39 = new ModelRenderer(this);
		shangbanshen_r39.setRotationPoint(-17.1667F, -28.3635F, -7.8339F);
		shangbanshen.addChild(shangbanshen_r39);
		setRotationAngle(shangbanshen_r39, 1.0908F, 0.0F, 0.0F);
		shangbanshen_r39.setTextureOffset(392, 280).addBox(-5.3533F, -7.9161F, -13.0863F, 11.0F, 5.0F, 9.0F, 0.0F,
				false);
		shangbanshen_r39.setTextureOffset(404, 381).addBox(28.6667F, -7.9161F, -13.0863F, 11.0F, 5.0F, 9.0F, 0.0F,
				false);

		shangbanshen_r40 = new ModelRenderer(this);
		shangbanshen_r40.setRotationPoint(-17.1467F, -27.44F, -9.6079F);
		shangbanshen.addChild(shangbanshen_r40);
		setRotationAngle(shangbanshen_r40, -0.2618F, 0.0F, 0.0F);
		shangbanshen_r40.setTextureOffset(391, 365).addBox(-5.3733F, -8.5333F, 3.1836F, 10.0F, 6.0F, 10.0F, 0.0F,
				false);
		shangbanshen_r40.setTextureOffset(392, 103).addBox(29.6267F, -8.5333F, 3.1836F, 10.0F, 6.0F, 10.0F, 0.0F,
				false);

		shangbanshen_r41 = new ModelRenderer(this);
		shangbanshen_r41.setRotationPoint(-18.1667F, -29.1135F, -5.3339F);
		shangbanshen.addChild(shangbanshen_r41);
		setRotationAngle(shangbanshen_r41, -0.0873F, 0.0F, 0.0F);
		shangbanshen_r41.setTextureOffset(477, 46).addBox(-3.3333F, -0.3906F, 4.6122F, 7.0F, 10.0F, 4.0F, 0.0F, false);
		shangbanshen_r41.setTextureOffset(484, 60).addBox(32.6667F, -0.3906F, 5.1122F, 7.0F, 10.0F, 3.0F, 0.0F, false);

		shangbanshen_r42 = new ModelRenderer(this);
		shangbanshen_r42.setRotationPoint(-17.0F, -21.8808F, -7.1351F);
		shangbanshen.addChild(shangbanshen_r42);
		setRotationAngle(shangbanshen_r42, 0.2618F, 0.0F, 0.0F);
		shangbanshen_r42.setTextureOffset(361, 106).addBox(-3.5F, 0.75F, -7.75F, 8.0F, 3.0F, 15.0F, 0.0F, false);
		shangbanshen_r42.setTextureOffset(402, 317).addBox(-3.5F, 3.75F, -6.75F, 8.0F, 3.0F, 12.0F, 0.0F, false);
		shangbanshen_r42.setTextureOffset(403, 245).addBox(29.5F, 3.75F, -6.75F, 8.0F, 3.0F, 12.0F, 0.0F, false);
		shangbanshen_r42.setTextureOffset(335, 362).addBox(29.5F, 0.75F, -7.75F, 8.0F, 3.0F, 15.0F, 0.0F, false);
		shangbanshen_r42.setTextureOffset(336, 0).addBox(-3.5F, -6.25F, -7.75F, 8.0F, 7.0F, 16.0F, 0.0F, false);
		shangbanshen_r42.setTextureOffset(0, 338).addBox(29.5F, -6.25F, -7.75F, 8.0F, 7.0F, 16.0F, 0.0F, false);

		shangbanshen_r43 = new ModelRenderer(this);
		shangbanshen_r43.setRotationPoint(-17.1667F, -28.3635F, -7.8339F);
		shangbanshen.addChild(shangbanshen_r43);
		setRotationAngle(shangbanshen_r43, 0.48F, 0.0F, 0.0F);
		shangbanshen_r43.setTextureOffset(360, 170).addBox(-5.3333F, -4.1406F, -7.8878F, 9.0F, 5.0F, 14.0F, 0.0F,
				false);
		shangbanshen_r43.setTextureOffset(360, 280).addBox(30.6667F, -4.1406F, -7.8878F, 9.0F, 5.0F, 14.0F, 0.0F,
				false);

		shangbanshen_r44 = new ModelRenderer(this);
		shangbanshen_r44.setRotationPoint(0.0F, -26.6206F, -22.495F);
		shangbanshen.addChild(shangbanshen_r44);
		setRotationAngle(shangbanshen_r44, 1.0494F, 0.3843F, -0.2121F);
		shangbanshen_r44.setTextureOffset(434, 63).addBox(-9.0835F, -6.1798F, -3.5F, 7.0F, 10.0F, 8.0F, 0.0F, false);

		shangbanshen_r45 = new ModelRenderer(this);
		shangbanshen_r45.setRotationPoint(0.0F, -26.6206F, -22.495F);
		shangbanshen.addChild(shangbanshen_r45);
		setRotationAngle(shangbanshen_r45, 1.0494F, -0.3843F, 0.2121F);
		shangbanshen_r45.setTextureOffset(434, 135).addBox(2.0835F, -6.1798F, -3.5F, 7.0F, 10.0F, 8.0F, 0.0F, false);

		shangbanshen_r46 = new ModelRenderer(this);
		shangbanshen_r46.setRotationPoint(0.0F, -26.6206F, -22.495F);
		shangbanshen.addChild(shangbanshen_r46);
		setRotationAngle(shangbanshen_r46, 1.0908F, 0.0F, 0.0F);
		shangbanshen_r46.setTextureOffset(188, 390).addBox(-4.5F, -4.7203F, -3.52F, 9.0F, 16.0F, 8.0F, 0.0F, false);

		zuoshou = new ModelRenderer(this);
		zuoshou.setRotationPoint(-13.6156F, -22.0038F, -3.4792F);
		shangbanshen.addChild(zuoshou);
		setRotationAngle(zuoshou, 0.0873F, 0.1309F, 0.0F);
		zuoshou.setTextureOffset(390, 260).addBox(-23.1972F, -5.2504F, -5.9246F, 10.0F, 11.0F, 9.0F, 0.0F, true);
		zuoshou.setTextureOffset(280, 308).addBox(-34.4283F, -15.0457F, -12.9246F, 12.0F, 17.0F, 13.0F, 0.0F, true);
		zuoshou.setTextureOffset(41, 165).addBox(-31.1783F, -7.5457F, -13.9246F, 9.0F, 5.0F, 15.0F, 0.0F, true);

		zuoshou_r1 = new ModelRenderer(this);
		zuoshou_r1.setRotationPoint(-34.7472F, -7.5231F, -6.3399F);
		zuoshou.addChild(zuoshou_r1);
		setRotationAngle(zuoshou_r1, 0.0F, 0.0F, 0.6981F);
		zuoshou_r1.setTextureOffset(90, 148).addBox(-3.2569F, 9.9958F, 4.4053F, 7.0F, 3.0F, 3.0F, 0.0F, true);
		zuoshou_r1.setTextureOffset(356, 106).addBox(-3.2569F, 9.9958F, -7.5947F, 7.0F, 3.0F, 3.0F, 0.0F, true);
		zuoshou_r1.setTextureOffset(222, 400).addBox(3.4031F, -5.0042F, 4.4053F, 14.0F, 12.0F, 5.0F, 0.0F, true);
		zuoshou_r1.setTextureOffset(222, 318).addBox(-2.5969F, -14.0042F, 4.4053F, 15.0F, 19.0F, 10.0F, 0.0F, true);
		zuoshou_r1.setTextureOffset(166, 430).addBox(-6.5969F, -4.0042F, 4.4053F, 13.0F, 14.0F, 3.0F, 0.0F, true);
		zuoshou_r1.setTextureOffset(412, 52).addBox(-7.5969F, 3.9958F, -8.0947F, 2.0F, 4.0F, 4.0F, 0.0F, true);
		zuoshou_r1.setTextureOffset(420, 420).addBox(-7.5969F, -6.0042F, -8.0947F, 2.0F, 4.0F, 4.0F, 0.0F, true);
		zuoshou_r1.setTextureOffset(431, 240).addBox(-6.5969F, -4.0042F, -7.6147F, 13.0F, 14.0F, 3.0F, 0.0F, true);
		zuoshou_r1.setTextureOffset(365, 82).addBox(-10.5969F, -11.0042F, -3.5847F, 13.0F, 13.0F, 8.0F, 0.0F, true);
		zuoshou_r1.setTextureOffset(124, 38).addBox(-6.5969F, -20.0042F, -7.5847F, 16.0F, 3.0F, 15.0F, 0.0F, true);
		zuoshou_r1.setTextureOffset(389, 215).addBox(-8.5969F, -7.0042F, -5.5847F, 3.0F, 19.0F, 11.0F, 0.0F, true);
		zuoshou_r1.setTextureOffset(451, 432).addBox(-4.5969F, -20.6363F, -8.3447F, 3.0F, 3.0F, 11.0F, 0.0F, true);
		zuoshou_r1.setTextureOffset(452, 246).addBox(4.4031F, -20.6363F, -8.3447F, 3.0F, 3.0F, 11.0F, 0.0F, true);
		zuoshou_r1.setTextureOffset(55, 237).addBox(-6.5969F, -17.1363F, -7.6147F, 20.0F, 13.0F, 15.0F, 0.0F, true);

		zuoshou_r2 = new ModelRenderer(this);
		zuoshou_r2.setRotationPoint(-34.7472F, -7.5231F, -6.3399F);
		zuoshou.addChild(zuoshou_r2);
		setRotationAngle(zuoshou_r2, 0.0F, 0.0F, -0.0873F);
		zuoshou_r2.setTextureOffset(483, 208).addBox(-8.9043F, -6.0819F, -3.5847F, 2.0F, 2.0F, 8.0F, 0.0F, true);
		zuoshou_r2.setTextureOffset(470, 115).addBox(0.288F, -15.2743F, -3.5847F, 5.0F, 3.0F, 8.0F, 0.0F, true);
		zuoshou_r2.setTextureOffset(454, 376).addBox(-1.1262F, -11.0316F, -5.5847F, 3.0F, 1.0F, 11.0F, 0.0F, true);

		zuoshou_r3 = new ModelRenderer(this);
		zuoshou_r3.setRotationPoint(-34.7472F, -7.5231F, -6.3399F);
		zuoshou.addChild(zuoshou_r3);
		setRotationAngle(zuoshou_r3, 0.0F, 0.0F, -0.1309F);
		zuoshou_r3.setTextureOffset(245, 470).addBox(-15.6522F, 0.766F, -3.5847F, 2.0F, 13.0F, 7.0F, 0.0F, true);
		zuoshou_r3.setTextureOffset(158, 261).addBox(-14.6522F, 1.766F, -5.5847F, 3.0F, 11.0F, 11.0F, 0.0F, true);
		zuoshou_r3.setTextureOffset(120, 161).addBox(-11.8264F, 1.8893F, -7.5847F, 11.0F, 4.0F, 15.0F, 0.0F, true);

		zuoshou_r4 = new ModelRenderer(this);
		zuoshou_r4.setRotationPoint(-34.7472F, -7.5231F, -6.3399F);
		zuoshou.addChild(zuoshou_r4);
		setRotationAngle(zuoshou_r4, 0.0F, 0.0F, -0.3054F);
		zuoshou_r4.setTextureOffset(149, 448).addBox(-8.5947F, 7.6962F, 4.4153F, 3.0F, 3.0F, 3.0F, 0.0F, true);
		zuoshou_r4.setTextureOffset(449, 97).addBox(-8.5947F, 7.4462F, -7.5847F, 3.0F, 3.0F, 3.0F, 0.0F, true);

		zuoshou_r5 = new ModelRenderer(this);
		zuoshou_r5.setRotationPoint(-35.0036F, -9.7019F, 3.5804F);
		zuoshou.addChild(zuoshou_r5);
		setRotationAngle(zuoshou_r5, 0.3927F, 0.0F, 2.2689F);
		zuoshou_r5.setTextureOffset(75, 442).addBox(-3.25F, -1.0F, -5.015F, 6.0F, 4.0F, 10.0F, 0.0F, true);

		zuoshou_r6 = new ModelRenderer(this);
		zuoshou_r6.setRotationPoint(-34.2024F, -0.5445F, 3.5804F);
		zuoshou.addChild(zuoshou_r6);
		setRotationAngle(zuoshou_r6, 0.3927F, 0.0F, 0.6981F);
		zuoshou_r6.setTextureOffset(339, 170).addBox(-3.5F, -2.0F, -5.015F, 7.0F, 4.0F, 10.0F, 0.0F, true);

		zuoshou_r7 = new ModelRenderer(this);
		zuoshou_r7.setRotationPoint(-25.045F, -1.3456F, 3.5804F);
		zuoshou.addChild(zuoshou_r7);
		setRotationAngle(zuoshou_r7, -0.3927F, 0.0F, 2.2689F);
		zuoshou_r7.setTextureOffset(12, 443).addBox(-3.25F, -3.0F, -5.015F, 6.0F, 4.0F, 10.0F, 0.0F, true);

		zuoshou_r8 = new ModelRenderer(this);
		zuoshou_r8.setRotationPoint(-25.8462F, -10.503F, 3.5804F);
		zuoshou.addChild(zuoshou_r8);
		setRotationAngle(zuoshou_r8, -0.3927F, 0.0F, 0.6981F);
		zuoshou_r8.setTextureOffset(431, 285).addBox(-3.5F, -8.0F, -7.265F, 7.0F, 4.0F, 10.0F, 0.0F, true);

		zuoshou_r9 = new ModelRenderer(this);
		zuoshou_r9.setRotationPoint(-34.7472F, -7.5231F, -6.3399F);
		zuoshou.addChild(zuoshou_r9);
		setRotationAngle(zuoshou_r9, 0.0F, 0.0F, 1.309F);
		zuoshou_r9.setTextureOffset(233, 252).addBox(-3.7713F, -21.7799F, -7.5847F, 5.0F, 3.0F, 15.0F, 0.0F, true);

		zuoshou_r10 = new ModelRenderer(this);
		zuoshou_r10.setRotationPoint(-34.6264F, 16.7954F, -6.071F);
		zuoshou.addChild(zuoshou_r10);
		setRotationAngle(zuoshou_r10, 0.3927F, 0.0F, 0.1745F);
		zuoshou_r10.setTextureOffset(18, 268).addBox(-4.0519F, 5.3118F, -6.0127F, 1.0F, 3.0F, 4.0F, 0.0F, true);
		zuoshou_r10.setTextureOffset(284, 341).addBox(-3.0519F, 5.4618F, -9.0127F, 11.0F, 2.0F, 7.0F, 0.0F, true);
		zuoshou_r10.setTextureOffset(454, 309).addBox(-2.0519F, -0.6882F, -8.0127F, 9.0F, 7.0F, 6.0F, 0.0F, true);

		zuoshou_r11 = new ModelRenderer(this);
		zuoshou_r11.setRotationPoint(-34.6264F, 16.7954F, -6.071F);
		zuoshou.addChild(zuoshou_r11);
		setRotationAngle(zuoshou_r11, 0.0F, 0.0F, 0.7418F);
		zuoshou_r11.setTextureOffset(237, 151).addBox(-4.4588F, -18.9577F, -4.431F, 12.0F, 5.0F, 9.0F, 0.0F, true);

		zuoshou_r12 = new ModelRenderer(this);
		zuoshou_r12.setRotationPoint(-34.6264F, 16.7954F, -6.071F);
		zuoshou.addChild(zuoshou_r12);
		setRotationAngle(zuoshou_r12, 0.0F, 0.829F, -0.0873F);
		zuoshou_r12.setTextureOffset(495, 40).addBox(-11.0291F, -1.0605F, -6.7532F, 2.0F, 3.0F, 6.0F, 0.0F, true);

		zuoshou_r13 = new ModelRenderer(this);
		zuoshou_r13.setRotationPoint(-34.6264F, 16.7954F, -6.071F);
		zuoshou.addChild(zuoshou_r13);
		setRotationAngle(zuoshou_r13, 0.0F, -0.829F, -0.0873F);
		zuoshou_r13.setTextureOffset(495, 204).addBox(-11.2959F, -1.0605F, 0.0087F, 2.0F, 3.0F, 6.0F, 0.0F, true);

		zuoshou_r14 = new ModelRenderer(this);
		zuoshou_r14.setRotationPoint(-34.6264F, 16.7954F, -6.071F);
		zuoshou.addChild(zuoshou_r14);
		setRotationAngle(zuoshou_r14, 0.0F, -0.9163F, 0.48F);
		zuoshou_r14.setTextureOffset(150, 474).addBox(-8.3192F, -15.3749F, 1.5272F, 2.0F, 21.0F, 4.0F, 0.0F, true);

		zuoshou_r15 = new ModelRenderer(this);
		zuoshou_r15.setRotationPoint(-34.6264F, 16.7954F, -6.071F);
		zuoshou.addChild(zuoshou_r15);
		setRotationAngle(zuoshou_r15, 0.0F, 0.9163F, 0.48F);
		zuoshou_r15.setTextureOffset(162, 474).addBox(-8.0321F, -15.3749F, -6.2475F, 2.0F, 21.0F, 4.0F, 0.0F, true);

		zuoshou_r16 = new ModelRenderer(this);
		zuoshou_r16.setRotationPoint(-34.6264F, 16.7954F, -6.071F);
		zuoshou.addChild(zuoshou_r16);
		setRotationAngle(zuoshou_r16, 0.0F, 0.0F, 0.3927F);
		zuoshou_r16.setTextureOffset(178, 353).addBox(-10.2433F, -16.5872F, -2.931F, 3.0F, 21.0F, 5.0F, 0.0F, true);

		zuoshou_r17 = new ModelRenderer(this);
		zuoshou_r17.setRotationPoint(-34.6264F, 16.7954F, -6.071F);
		zuoshou.addChild(zuoshou_r17);
		setRotationAngle(zuoshou_r17, 0.0F, 0.0F, -0.0873F);
		zuoshou_r17.setTextureOffset(174, 447).addBox(-12.4301F, -1.0805F, -3.931F, 2.0F, 3.0F, 7.0F, 0.0F, true);

		zuoshou_r18 = new ModelRenderer(this);
		zuoshou_r18.setRotationPoint(-34.6264F, 16.7954F, -6.071F);
		zuoshou.addChild(zuoshou_r18);
		setRotationAngle(zuoshou_r18, 0.1379F, -0.0024F, -0.1282F);
		zuoshou_r18.setTextureOffset(469, 242).addBox(-4.8055F, -0.7808F, -3.599F, 5.0F, 7.0F, 7.0F, 0.0F, true);

		zuoshou_r19 = new ModelRenderer(this);
		zuoshou_r19.setRotationPoint(-34.6264F, 16.7954F, -6.071F);
		zuoshou.addChild(zuoshou_r19);
		setRotationAngle(zuoshou_r19, 0.1214F, -0.0656F, 0.3479F);
		zuoshou_r19.setTextureOffset(310, 0).addBox(-4.6231F, -13.6058F, -3.599F, 5.0F, 15.0F, 7.0F, 0.0F, true);

		zuoshou_r20 = new ModelRenderer(this);
		zuoshou_r20.setRotationPoint(-34.6264F, 16.7954F, -6.071F);
		zuoshou.addChild(zuoshou_r20);
		setRotationAngle(zuoshou_r20, 0.1309F, 0.0F, 0.48F);
		zuoshou_r20.setTextureOffset(470, 90).addBox(5.0533F, 3.5917F, -3.311F, 7.0F, 3.0F, 7.0F, 0.0F, true);

		zuoshou_r21 = new ModelRenderer(this);
		zuoshou_r21.setRotationPoint(-34.6264F, 16.7954F, -6.071F);
		zuoshou.addChild(zuoshou_r21);
		setRotationAngle(zuoshou_r21, 0.0F, 0.0F, 0.48F);
		zuoshou_r21.setTextureOffset(404, 395).addBox(3.4292F, -0.3124F, -1.8009F, 8.0F, 4.0F, 5.0F, 0.0F, true);
		zuoshou_r21.setTextureOffset(124, 0).addBox(3.4292F, -13.3123F, -3.431F, 5.0F, 17.0F, 7.0F, 0.0F, true);

		zuoshou_r22 = new ModelRenderer(this);
		zuoshou_r22.setRotationPoint(-34.6264F, 16.7954F, -6.071F);
		zuoshou.addChild(zuoshou_r22);
		setRotationAngle(zuoshou_r22, 0.7854F, 0.0F, 0.48F);
		zuoshou_r22.setTextureOffset(361, 66).addBox(3.4292F, -1.4943F, -1.0526F, 8.0F, 3.0F, 3.0F, 0.0F, true);

		zuoshou_r23 = new ModelRenderer(this);
		zuoshou_r23.setRotationPoint(-34.6264F, 16.7954F, -6.071F);
		zuoshou.addChild(zuoshou_r23);
		setRotationAngle(zuoshou_r23, -0.0873F, 0.0F, 0.1745F);
		zuoshou_r23.setTextureOffset(399, 82).addBox(-4.0519F, 5.641F, 0.6674F, 1.0F, 3.0F, 5.0F, 0.0F, true);
		zuoshou_r23.setTextureOffset(320, 341).addBox(-3.3019F, 5.641F, 0.6674F, 11.0F, 3.0F, 6.0F, 0.0F, true);

		zuoshou_r24 = new ModelRenderer(this);
		zuoshou_r24.setRotationPoint(-31.8805F, 11.2225F, -3.2562F);
		zuoshou.addChild(zuoshou_r24);
		setRotationAngle(zuoshou_r24, -0.1745F, 0.0F, 0.1745F);
		zuoshou_r24.setTextureOffset(316, 413).addBox(-4.7979F, -1.9186F, -2.2503F, 9.0F, 14.0F, 7.0F, 0.0F, true);

		zuoshou_r25 = new ModelRenderer(this);
		zuoshou_r25.setRotationPoint(-31.8805F, 11.2225F, -3.2562F);
		zuoshou.addChild(zuoshou_r25);
		setRotationAngle(zuoshou_r25, 0.2182F, 0.0F, 0.1745F);
		zuoshou_r25.setTextureOffset(224, 377).addBox(-4.8179F, -12.8957F, -4.4157F, 9.0F, 13.0F, 10.0F, 0.0F, true);

		zuoshou_r26 = new ModelRenderer(this);
		zuoshou_r26.setRotationPoint(-34.6849F, 17.127F, -5.9722F);
		zuoshou.addChild(zuoshou_r26);
		setRotationAngle(zuoshou_r26, -0.1309F, 0.0F, 0.1745F);
		zuoshou_r26.setTextureOffset(188, 188).addBox(-2.0519F, -17.0427F, -7.4251F, 9.0F, 20.0F, 6.0F, 0.0F, true);

		zuoshou_r27 = new ModelRenderer(this);
		zuoshou_r27.setRotationPoint(-18.9472F, -0.2504F, -6.4246F);
		zuoshou.addChild(zuoshou_r27);
		setRotationAngle(zuoshou_r27, 0.6109F, 0.0F, 0.0F);
		zuoshou_r27.setTextureOffset(122, 289).addBox(-4.0F, -7.0F, -7.5F, 5.0F, 13.0F, 21.0F, 0.0F, true);

		zuoshou_r28 = new ModelRenderer(this);
		zuoshou_r28.setRotationPoint(-15.9472F, -0.2504F, -6.4246F);
		zuoshou.addChild(zuoshou_r28);
		setRotationAngle(zuoshou_r28, -0.1309F, 0.0F, 0.1745F);
		zuoshou_r28.setTextureOffset(60, 35).addBox(-4.0F, -2.0F, -2.5F, 21.0F, 5.0F, 6.0F, 0.0F, true);
		zuoshou_r28.setTextureOffset(198, 433).addBox(3.0F, -7.0F, -0.5F, 5.0F, 8.0F, 10.0F, 0.0F, true);
		zuoshou_r28.setTextureOffset(0, 105).addBox(-4.0F, -6.0F, 0.5F, 21.0F, 7.0F, 8.0F, 0.0F, true);

		zuoshou_r29 = new ModelRenderer(this);
		zuoshou_r29.setRotationPoint(-15.9472F, -0.2504F, -6.4246F);
		zuoshou.addChild(zuoshou_r29);
		setRotationAngle(zuoshou_r29, 0.6109F, 0.0F, 0.1745F);
		zuoshou_r29.setTextureOffset(323, 434).addBox(0.0F, -6.0F, -1.5F, 6.0F, 12.0F, 8.0F, 0.0F, true);
		zuoshou_r29.setTextureOffset(291, 75).addBox(-4.0F, -5.0F, -6.5F, 9.0F, 10.0F, 19.0F, 0.0F, true);

		dao3 = new ModelRenderer(this);
		dao3.setRotationPoint(-38.9778F, -1.6673F, -5.3496F);
		zuoshou.addChild(dao3);
		setRotationAngle(dao3, 1.2615F, -3.0918F, 0.4912F);
		dao3.setTextureOffset(0, 165).addBox(-2.02F, -2.6667F, -17.0F, 3.0F, 2.0F, 35.0F, 0.0F, true);
		dao3.setTextureOffset(430, 90).addBox(-2.02F, -0.9167F, 5.0F, 3.0F, 3.0F, 13.0F, 0.0F, true);
		dao3.setTextureOffset(161, 225).addBox(-1.0F, -0.1667F, -16.0F, 1.0F, 2.0F, 34.0F, 0.0F, true);

		dao3_r1 = new ModelRenderer(this);
		dao3_r1.setRotationPoint(0.5F, 9.5788F, 13.988F);
		dao3.addChild(dao3_r1);
		setRotationAngle(dao3_r1, 0.829F, 0.0F, 0.0F);
		dao3_r1.setTextureOffset(80, 198).addBox(-3.25F, -9.9237F, 9.1965F, 4.0F, 12.0F, 3.0F, 0.0F, true);

		dao3_r2 = new ModelRenderer(this);
		dao3_r2.setRotationPoint(0.5F, 9.8288F, 14.488F);
		dao3.addChild(dao3_r2);
		setRotationAngle(dao3_r2, 0.9163F, 0.0F, 0.0F);
		dao3_r2.setTextureOffset(343, 219).addBox(-2.0F, -6.9237F, 7.9465F, 2.0F, 8.0F, 2.0F, 0.0F, true);

		dao3_r3 = new ModelRenderer(this);
		dao3_r3.setRotationPoint(0.5F, 10.3288F, -16.512F);
		dao3.addChild(dao3_r3);
		setRotationAngle(dao3_r3, 1.0036F, 0.0F, 0.0F);
		dao3_r3.setTextureOffset(26, 403).addBox(-2.0F, -1.75F, 11.0F, 2.0F, 8.0F, 3.0F, 0.0F, true);

		dao3_r4 = new ModelRenderer(this);
		dao3_r4.setRotationPoint(-0.5F, 3.5109F, -16.4247F);
		dao3.addChild(dao3_r4);
		setRotationAngle(dao3_r4, -1.0036F, 0.0F, 0.0F);
		dao3_r4.setTextureOffset(234, 370).addBox(-3.0F, 0.25F, -2.0F, 6.0F, 2.0F, 4.0F, 0.0F, true);
		dao3_r4.setTextureOffset(458, 179).addBox(-3.0F, -2.75F, -6.0F, 6.0F, 3.0F, 8.0F, 0.0F, true);

		dao3_r5 = new ModelRenderer(this);
		dao3_r5.setRotationPoint(1.0F, -8.6622F, -23.012F);
		dao3.addChild(dao3_r5);
		setRotationAngle(dao3_r5, -1.0036F, 0.0F, 0.0F);
		dao3_r5.setTextureOffset(12, 457).addBox(-4.0F, -0.5F, 9.0F, 5.0F, 5.0F, 9.0F, 0.0F, true);
		dao3_r5.setTextureOffset(0, 381).addBox(-3.0F, 0.5F, 10.0F, 3.0F, 10.0F, 6.0F, 0.0F, true);

		dao3_r6 = new ModelRenderer(this);
		dao3_r6.setRotationPoint(0.5F, -8.6622F, -23.512F);
		dao3.addChild(dao3_r6);
		setRotationAngle(dao3_r6, -1.0036F, 0.0F, 0.0F);
		dao3_r6.setTextureOffset(309, 434).addBox(-3.25F, -4.5F, 7.0F, 4.0F, 3.0F, 5.0F, 0.0F, true);

		dao3_r7 = new ModelRenderer(this);
		dao3_r7.setRotationPoint(0.5F, 10.3288F, -23.012F);
		dao3.addChild(dao3_r7);
		setRotationAngle(dao3_r7, 1.0036F, 0.0F, 0.0F);
		dao3_r7.setTextureOffset(198, 433).addBox(-2.0F, 0.5F, 11.0F, 2.0F, 6.0F, 3.0F, 0.0F, true);

		dao3_r8 = new ModelRenderer(this);
		dao3_r8.setRotationPoint(0.5F, 10.3288F, -10.012F);
		dao3.addChild(dao3_r8);
		setRotationAngle(dao3_r8, 1.0036F, 0.0F, 0.0F);
		dao3_r8.setTextureOffset(405, 143).addBox(-2.0F, -1.75F, 11.0F, 2.0F, 8.0F, 3.0F, 0.0F, true);

		dao3_r9 = new ModelRenderer(this);
		dao3_r9.setRotationPoint(1.0F, 10.2301F, -3.8622F);
		dao3.addChild(dao3_r9);
		setRotationAngle(dao3_r9, 1.0036F, 0.0F, 0.0F);
		dao3_r9.setTextureOffset(233, 270).addBox(-3.0F, -1.75F, 12.5F, 3.0F, 5.0F, 1.0F, 0.0F, true);
		dao3_r9.setTextureOffset(184, 293).addBox(-3.01F, -1.75F, 11.0F, 3.0F, 5.0F, 1.0F, 0.0F, true);

		dao3_r10 = new ModelRenderer(this);
		dao3_r10.setRotationPoint(-0.5F, -6.6691F, -33.1333F);
		dao3.addChild(dao3_r10);
		setRotationAngle(dao3_r10, -0.5236F, 0.0F, 0.0F);
		dao3_r10.setTextureOffset(446, 472).addBox(-2.0F, -7.75F, 10.0F, 4.0F, 15.0F, 5.0F, 0.0F, true);

		dao3_r11 = new ModelRenderer(this);
		dao3_r11.setRotationPoint(0.5F, -9.4711F, -30.2194F);
		dao3.addChild(dao3_r11);
		setRotationAngle(dao3_r11, -0.5236F, 0.0F, 0.0F);
		dao3_r11.setTextureOffset(416, 25).addBox(-4.02F, -5.0F, 12.0F, 6.0F, 6.0F, 2.0F, 0.0F, true);

		dao3_r12 = new ModelRenderer(this);
		dao3_r12.setRotationPoint(-0.1716F, -2.8738F, 1.0F);
		dao3.addChild(dao3_r12);
		setRotationAngle(dao3_r12, 0.0F, 0.0F, -0.7854F);
		dao3_r12.setTextureOffset(41, 198).addBox(-1.7929F, -0.7929F, -18.0F, 2.0F, 2.0F, 35.0F, 0.0F, true);

		bone144 = new ModelRenderer(this);
		bone144.setRotationPoint(1.0F, 7.8288F, 12.738F);
		dao3.addChild(bone144);

		bone144_r1 = new ModelRenderer(this);
		bone144_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone144.addChild(bone144_r1);
		setRotationAngle(bone144_r1, 0.829F, 0.0F, 0.0F);
		bone144_r1.setTextureOffset(317, 65).addBox(-3.02F, 5.5763F, 11.4465F, 3.0F, 2.0F, 4.0F, 0.0F, true);
		bone144_r1.setTextureOffset(432, 196).addBox(-3.0F, -1.9237F, 13.4465F, 3.0F, 7.0F, 2.0F, 0.0F, true);

		bone144_r2 = new ModelRenderer(this);
		bone144_r2.setRotationPoint(-2.0F, -5.6552F, 14.1018F);
		bone144.addChild(bone144_r2);
		setRotationAngle(bone144_r2, 0.4363F, 0.0F, 0.0F);
		bone144_r2.setTextureOffset(89, 314).addBox(-1.0F, -2.5F, 1.25F, 3.0F, 3.0F, 1.0F, 0.0F, true);

		bone144_r3 = new ModelRenderer(this);
		bone144_r3.setRotationPoint(-2.0F, -7.1196F, 13.5477F);
		bone144.addChild(bone144_r3);
		setRotationAngle(bone144_r3, 0.9861F, 0.0F, 0.0F);
		bone144_r3.setTextureOffset(0, 241).addBox(-1.02F, -7.0F, 1.25F, 3.0F, 7.0F, 1.0F, 0.0F, true);

		bone144_r4 = new ModelRenderer(this);
		bone144_r4.setRotationPoint(-0.5F, 1.25F, 1.25F);
		bone144.addChild(bone144_r4);
		setRotationAngle(bone144_r4, 0.829F, 0.0F, 0.0F);
		bone144_r4.setTextureOffset(237, 151).addBox(-2.0F, -3.4237F, 11.6965F, 2.0F, 7.0F, 2.0F, 0.0F, true);

		bone145 = new ModelRenderer(this);
		bone145.setRotationPoint(-0.5F, 6.4586F, -21.9474F);
		dao3.addChild(bone145);

		bone145_r1 = new ModelRenderer(this);
		bone145_r1.setRotationPoint(0.0F, 16.5F, 9.5F);
		bone145.addChild(bone145_r1);
		setRotationAngle(bone145_r1, -2.1817F, 0.0F, 0.0F);
		bone145_r1.setTextureOffset(275, 240).addBox(-1.0F, -6.5242F, 0.434F, 2.0F, 6.0F, 4.0F, 0.0F, true);

		bone145_r2 = new ModelRenderer(this);
		bone145_r2.setRotationPoint(-0.5F, 16.0F, 10.0F);
		bone145.addChild(bone145_r2);
		setRotationAngle(bone145_r2, 0.7854F, 0.0F, 0.0F);
		bone145_r2.setTextureOffset(225, 464).addBox(-2.5F, -12.3808F, -3.6589F, 6.0F, 17.0F, 4.0F, 0.0F, true);

		bone145_r3 = new ModelRenderer(this);
		bone145_r3.setRotationPoint(-0.5F, 16.0F, 10.0F);
		bone145.addChild(bone145_r3);
		setRotationAngle(bone145_r3, 0.2618F, 0.0F, 0.0F);
		bone145_r3.setTextureOffset(221, 485).addBox(-2.5F, -18.4635F, -9.3591F, 6.0F, 9.0F, 4.0F, 0.0F, true);

		bone145_r4 = new ModelRenderer(this);
		bone145_r4.setRotationPoint(-0.5F, 16.0F, 10.0F);
		bone145.addChild(bone145_r4);
		setRotationAngle(bone145_r4, 0.6109F, 0.0F, 0.0F);
		bone145_r4.setTextureOffset(228, 436).addBox(-2.52F, -19.1534F, -2.6398F, 6.0F, 24.0F, 4.0F, 0.0F, true);

		bone146 = new ModelRenderer(this);
		bone146.setRotationPoint(0.0F, 24.1179F, 12.5549F);
		bone145.addChild(bone146);

		bone146_r1 = new ModelRenderer(this);
		bone146_r1.setRotationPoint(-0.5F, -3.9238F, -0.656F);
		bone146.addChild(bone146_r1);
		setRotationAngle(bone146_r1, -2.8798F, 0.0F, 0.0F);
		bone146_r1.setTextureOffset(372, 299).addBox(-1.5F, -4.885F, -3.5872F, 4.0F, 8.0F, 3.0F, 0.0F, true);

		bone146_r2 = new ModelRenderer(this);
		bone146_r2.setRotationPoint(-0.5F, -3.9238F, -0.656F);
		bone146.addChild(bone146_r2);
		setRotationAngle(bone146_r2, -2.3562F, 0.0F, 0.0F);
		bone146_r2.setTextureOffset(12, 485).addBox(-1.5F, -20.5242F, -1.0661F, 4.0F, 16.0F, 3.0F, 0.0F, true);

		bone146_r3 = new ModelRenderer(this);
		bone146_r3.setRotationPoint(-0.5F, -3.9238F, -0.656F);
		bone146.addChild(bone146_r3);
		setRotationAngle(bone146_r3, -2.5307F, 0.0F, 0.0F);
		bone146_r3.setTextureOffset(284, 466).addBox(-1.52F, -20.2737F, -4.6172F, 4.0F, 23.0F, 3.0F, 0.0F, true);

		bone147 = new ModelRenderer(this);
		bone147.setRotationPoint(-0.5F, -9.6691F, -39.1333F);
		dao3.addChild(bone147);
		bone147.setTextureOffset(456, 260).addBox(-2.02F, 3.2524F, -18.1167F, 4.0F, 5.0F, 10.0F, 0.0F, true);
		bone147.setTextureOffset(365, 365).addBox(-2.52F, 3.2524F, -2.8667F, 5.0F, 5.0F, 16.0F, 0.0F, true);

		bone147_r1 = new ModelRenderer(this);
		bone147_r1.setRotationPoint(0.5F, 0.0F, -21.0F);
		bone147.addChild(bone147_r1);
		setRotationAngle(bone147_r1, -0.5236F, 0.0F, 0.0F);
		bone147_r1.setTextureOffset(481, 507).addBox(-2.5F, -3.75F, 13.0F, 4.0F, 4.0F, 2.0F, 0.0F, true);

		bone147_r2 = new ModelRenderer(this);
		bone147_r2.setRotationPoint(0.5F, 0.0F, 0.0F);
		bone147.addChild(bone147_r2);
		setRotationAngle(bone147_r2, -0.5236F, 0.0F, 0.0F);
		bone147_r2.setTextureOffset(409, 61).addBox(-3.0F, -3.75F, 13.0F, 5.0F, 4.0F, 2.0F, 0.0F, true);

		bone147_r3 = new ModelRenderer(this);
		bone147_r3.setRotationPoint(0.5F, 0.0F, -31.25F);
		bone147.addChild(bone147_r3);
		setRotationAngle(bone147_r3, -0.5236F, 0.0F, 0.0F);
		bone147_r3.setTextureOffset(481, 500).addBox(-2.5F, -3.75F, 13.0F, 4.0F, 4.0F, 2.0F, 0.0F, true);

		bone147_r4 = new ModelRenderer(this);
		bone147_r4.setRotationPoint(0.5F, 0.0F, -16.0F);
		bone147.addChild(bone147_r4);
		setRotationAngle(bone147_r4, -0.5236F, 0.0F, 0.0F);
		bone147_r4.setTextureOffset(419, 260).addBox(-3.0F, -3.75F, 13.0F, 5.0F, 4.0F, 2.0F, 0.0F, true);

		bone3 = new ModelRenderer(this);
		bone3.setRotationPoint(-32.8248F, 24.6126F, -5.5841F);
		zuoshou.addChild(bone3);
		setRotationAngle(bone3, 0.0F, -0.0436F, 0.1745F);
		bone3.setTextureOffset(328, 82).addBox(0.0F, -2.0F, -2.0F, 4.0F, 7.0F, 5.0F, 0.0F, true);
		bone3.setTextureOffset(371, 321).addBox(-3.5F, -2.0F, -1.0F, 2.0F, 9.0F, 4.0F, 0.0F, true);

		bone3_r1 = new ModelRenderer(this);
		bone3_r1.setRotationPoint(-3.0F, 7.0F, 0.0F);
		bone3.addChild(bone3_r1);
		setRotationAngle(bone3_r1, 0.7854F, 0.0F, 0.0F);
		bone3_r1.setTextureOffset(491, 31).addBox(-2.5F, -2.0F, -1.0F, 5.0F, 5.0F, 4.0F, 0.0F, true);
		bone3_r1.setTextureOffset(464, 66).addBox(1.5F, -3.0F, -3.0F, 6.0F, 7.0F, 7.0F, 0.0F, true);

		bone3_r2 = new ModelRenderer(this);
		bone3_r2.setRotationPoint(-0.1868F, 8.8676F, 7.5047F);
		bone3.addChild(bone3_r2);
		setRotationAngle(bone3_r2, -0.3057F, 0.0197F, 0.0193F);
		bone3_r2.setTextureOffset(34, 430).addBox(-4.4695F, 3.7918F, -1.655F, 3.0F, 3.0F, 4.0F, 0.0F, true);
		bone3_r2.setTextureOffset(430, 332).addBox(1.5305F, 3.7918F, -1.655F, 3.0F, 3.0F, 4.0F, 0.0F, true);
		bone3_r2.setTextureOffset(258, 252).addBox(-2.0763F, -3.5058F, 0.7937F, 4.0F, 13.0F, 2.0F, 0.0F, true);
		bone3_r2.setTextureOffset(480, 222).addBox(-3.9695F, -3.2082F, -1.155F, 8.0F, 9.0F, 3.0F, 0.0F, true);

		bone3_r3 = new ModelRenderer(this);
		bone3_r3.setRotationPoint(-0.3583F, 6.5053F, 14.4299F);
		bone3.addChild(bone3_r3);
		setRotationAngle(bone3_r3, -0.3049F, 0.0213F, -0.0043F);
		bone3_r3.setTextureOffset(351, 397).addBox(-4.1826F, 2.1096F, -13.214F, 1.0F, 4.0F, 7.0F, 0.0F, true);
		bone3_r3.setTextureOffset(104, 406).addBox(2.0674F, 2.1096F, -10.214F, 2.0F, 4.0F, 4.0F, 0.0F, true);

		bone3_r4 = new ModelRenderer(this);
		bone3_r4.setRotationPoint(-0.1868F, 8.8676F, 7.5047F);
		bone3.addChild(bone3_r4);
		setRotationAngle(bone3_r4, 0.4361F, 0.0197F, 0.0193F);
		bone3_r4.setTextureOffset(156, 115).addBox(-5.4695F, -7.1188F, 0.0277F, 11.0F, 2.0F, 5.0F, 0.0F, true);
		bone3_r4.setTextureOffset(496, 357).addBox(-3.0763F, -5.6973F, 2.4283F, 6.0F, 5.0F, 2.0F, 0.0F, true);
		bone3_r4.setTextureOffset(367, 156).addBox(-4.9695F, -6.1188F, 0.5277F, 10.0F, 5.0F, 3.0F, 0.0F, true);

		bone3_r5 = new ModelRenderer(this);
		bone3_r5.setRotationPoint(3.0F, 7.0F, -1.0F);
		bone3.addChild(bone3_r5);
		setRotationAngle(bone3_r5, 0.7854F, 0.0F, 0.0F);
		bone3_r5.setTextureOffset(50, 434).addBox(0.25F, 0.0F, 0.0F, 2.0F, 5.0F, 5.0F, 0.0F, true);

		bone42 = new ModelRenderer(this);
		bone42.setRotationPoint(-0.3465F, 4.8976F, 0.9233F);
		bone3.addChild(bone42);
		setRotationAngle(bone42, -0.3927F, 0.0F, 0.0F);
		bone42.setTextureOffset(489, 170).addBox(-4.7487F, 6.0322F, -0.2884F, 6.0F, 6.0F, 3.0F, 0.0F, true);
		bone42.setTextureOffset(390, 343).addBox(-0.2487F, 2.0322F, -1.7884F, 3.0F, 6.0F, 3.0F, 0.0F, true);
		bone42.setTextureOffset(157, 405).addBox(-0.7487F, 8.0322F, -2.2884F, 4.0F, 4.0F, 4.0F, 0.0F, true);
		bone42.setTextureOffset(153, 291).addBox(-3.7487F, 3.0322F, 0.2116F, 2.0F, 9.0F, 2.0F, 0.0F, true);

		bone42_r1 = new ModelRenderer(this);
		bone42_r1.setRotationPoint(-1.0F, 14.9532F, 0.6832F);
		bone42.addChild(bone42_r1);
		setRotationAngle(bone42_r1, 0.0F, -0.3927F, -0.2182F);
		bone42_r1.setTextureOffset(117, 0).addBox(-6.4417F, 7.1356F, -0.4434F, 1.0F, 3.0F, 1.0F, 0.0F, true);
		bone42_r1.setTextureOffset(118, 41).addBox(-6.4417F, -1.8644F, -0.4434F, 1.0F, 3.0F, 1.0F, 0.0F, true);

		bone42_r2 = new ModelRenderer(this);
		bone42_r2.setRotationPoint(-1.0F, 14.9532F, 0.6832F);
		bone42.addChild(bone42_r2);
		setRotationAngle(bone42_r2, 0.0F, 0.3927F, -0.2182F);
		bone42_r2.setTextureOffset(124, 115).addBox(-6.4635F, 7.1356F, -0.504F, 1.0F, 3.0F, 1.0F, 0.0F, true);
		bone42_r2.setTextureOffset(76, 134).addBox(-6.4635F, -1.8644F, -0.504F, 1.0F, 3.0F, 1.0F, 0.0F, true);

		bone42_r3 = new ModelRenderer(this);
		bone42_r3.setRotationPoint(-1.0F, 14.9532F, 0.6832F);
		bone42.addChild(bone42_r3);
		setRotationAngle(bone42_r3, 0.0F, 0.0F, 0.1309F);
		bone42_r3.setTextureOffset(276, 28).addBox(4.886F, 2.0115F, -1.9715F, 1.0F, 10.0F, 4.0F, 0.0F, true);

		bone42_r4 = new ModelRenderer(this);
		bone42_r4.setRotationPoint(-1.0F, 14.9532F, 0.6832F);
		bone42.addChild(bone42_r4);
		setRotationAngle(bone42_r4, 0.0F, 0.0F, -0.1309F);
		bone42_r4.setTextureOffset(430, 313).addBox(4.1648F, -1.5336F, -1.9715F, 1.0F, 5.0F, 4.0F, 0.0F, true);

		bone42_r5 = new ModelRenderer(this);
		bone42_r5.setRotationPoint(-1.0F, 14.9532F, 0.6832F);
		bone42.addChild(bone42_r5);
		setRotationAngle(bone42_r5, 0.0F, 0.0F, 0.5672F);
		bone42_r5.setTextureOffset(214, 39).addBox(-9.5328F, -4.2423F, -5.0017F, 12.0F, 2.0F, 2.0F, 0.0F, true);
		bone42_r5.setTextureOffset(226, 197).addBox(-9.5328F, -4.2423F, 3.0586F, 12.0F, 2.0F, 2.0F, 0.0F, true);
		bone42_r5.setTextureOffset(495, 383).addBox(-11.1447F, -4.2423F, -2.4715F, 3.0F, 2.0F, 5.0F, 0.0F, true);

		bone42_r6 = new ModelRenderer(this);
		bone42_r6.setRotationPoint(-1.0F, 14.9532F, 0.6832F);
		bone42.addChild(bone42_r6);
		setRotationAngle(bone42_r6, 0.0F, 0.0F, 1.1345F);
		bone42_r6.setTextureOffset(194, 343).addBox(-3.2343F, -5.4975F, -5.0117F, 4.0F, 2.0F, 2.0F, 0.0F, true);
		bone42_r6.setTextureOffset(343, 46).addBox(-3.2343F, -5.4975F, 3.0586F, 4.0F, 2.0F, 2.0F, 0.0F, true);

		bone42_r7 = new ModelRenderer(this);
		bone42_r7.setRotationPoint(-1.0F, 14.9532F, 0.6832F);
		bone42.addChild(bone42_r7);
		setRotationAngle(bone42_r7, 0.0F, 0.0F, 0.0873F);
		bone42_r7.setTextureOffset(216, 253).addBox(6.2683F, -6.3403F, -2.4715F, 1.0F, 1.0F, 5.0F, 0.0F, true);
		bone42_r7.setTextureOffset(326, 300).addBox(5.3628F, -4.6238F, -3.9715F, 1.0F, 1.0F, 8.0F, 0.0F, true);
		bone42_r7.setTextureOffset(385, 156).addBox(4.9788F, -7.2889F, -3.9715F, 1.0F, 1.0F, 8.0F, 0.0F, true);

		bone42_r8 = new ModelRenderer(this);
		bone42_r8.setRotationPoint(-1.0F, 14.9532F, 0.6832F);
		bone42.addChild(bone42_r8);
		setRotationAngle(bone42_r8, 0.0F, 0.0F, -0.4363F);
		bone42_r8.setTextureOffset(250, 347).addBox(2.0986F, -2.3567F, -2.4715F, 6.0F, 2.0F, 5.0F, 0.0F, true);
		bone42_r8.setTextureOffset(284, 364).addBox(3.4562F, -1.3229F, -3.9715F, 3.0F, 2.0F, 8.0F, 0.0F, true);
		bone42_r8.setTextureOffset(468, 431).addBox(1.4562F, -3.8229F, -3.9715F, 6.0F, 2.0F, 8.0F, 0.0F, true);

		bone42_r9 = new ModelRenderer(this);
		bone42_r9.setRotationPoint(-1.0F, 14.9532F, 0.6832F);
		bone42.addChild(bone42_r9);
		setRotationAngle(bone42_r9, 0.0F, 0.0F, 0.48F);
		bone42_r9.setTextureOffset(157, 68).addBox(0.0162F, -3.9871F, -2.4715F, 1.0F, 6.0F, 5.0F, 0.0F, true);
		bone42_r9.setTextureOffset(490, 435).addBox(1.0162F, -3.9871F, -2.9815F, 2.0F, 6.0F, 6.0F, 0.0F, true);
		bone42_r9.setTextureOffset(482, 326).addBox(-1.9838F, -1.9871F, -3.9715F, 2.0F, 4.0F, 8.0F, 0.0F, true);

		bone42_r10 = new ModelRenderer(this);
		bone42_r10.setRotationPoint(-1.0F, 14.9532F, 0.6832F);
		bone42.addChild(bone42_r10);
		setRotationAngle(bone42_r10, 0.0F, 0.0F, 0.2182F);
		bone42_r10.setTextureOffset(189, 280).addBox(3.9662F, 11.2335F, -3.5215F, 3.0F, 2.0F, 7.0F, 0.0F, true);

		bone42_r11 = new ModelRenderer(this);
		bone42_r11.setRotationPoint(-1.0F, 14.9532F, 0.6832F);
		bone42.addChild(bone42_r11);
		setRotationAngle(bone42_r11, 0.0F, 0.0F, 0.3054F);
		bone42_r11.setTextureOffset(478, 170).addBox(4.3252F, 7.9362F, -4.4715F, 1.0F, 5.0F, 9.0F, 0.0F, true);

		bone42_r12 = new ModelRenderer(this);
		bone42_r12.setRotationPoint(-1.0F, 14.9532F, 0.6832F);
		bone42.addChild(bone42_r12);
		setRotationAngle(bone42_r12, 0.0F, 0.0F, -0.2182F);
		bone42_r12.setTextureOffset(132, 213).addBox(-7.9234F, 12.1157F, -2.4715F, 1.0F, 2.0F, 5.0F, 0.0F, true);
		bone42_r12.setTextureOffset(279, 428).addBox(-6.4234F, 12.1157F, -4.4815F, 5.0F, 2.0F, 9.0F, 0.0F, true);
		bone42_r12.setTextureOffset(0, 268).addBox(-5.4234F, -4.8843F, -3.9815F, 5.0F, 17.0F, 8.0F, 0.0F, true);
		bone42_r12.setTextureOffset(0, 481).addBox(-7.4215F, -4.9716F, -1.9815F, 2.0F, 17.0F, 4.0F, 0.0F, true);

		bone42_r13 = new ModelRenderer(this);
		bone42_r13.setRotationPoint(-1.0F, 14.9532F, 0.6832F);
		bone42.addChild(bone42_r13);
		setRotationAngle(bone42_r13, 0.0F, 0.0F, 0.0436F);
		bone42_r13.setTextureOffset(204, 39).addBox(2.3718F, -2.1275F, -2.9715F, 2.0F, 15.0F, 6.0F, 0.0F, true);
		bone42_r13.setTextureOffset(197, 225).addBox(-1.1282F, 1.8725F, -2.9715F, 3.0F, 11.0F, 6.0F, 0.0F, true);

		bone42_r14 = new ModelRenderer(this);
		bone42_r14.setRotationPoint(-1.0F, 14.9532F, 0.6832F);
		bone42.addChild(bone42_r14);
		setRotationAngle(bone42_r14, 0.0F, -0.5672F, 0.5672F);
		bone42_r14.setTextureOffset(341, 241).addBox(-10.7273F, -4.2323F, 0.9036F, 3.0F, 2.0F, 3.0F, 0.0F, true);

		bone42_r15 = new ModelRenderer(this);
		bone42_r15.setRotationPoint(-1.0F, 14.9532F, 0.6832F);
		bone42.addChild(bone42_r15);
		setRotationAngle(bone42_r15, 0.0F, 0.5672F, 0.5672F);
		bone42_r15.setTextureOffset(32, 349).addBox(-10.7579F, -4.2323F, -3.8555F, 3.0F, 2.0F, 3.0F, 0.0F, true);

		bone42_r16 = new ModelRenderer(this);
		bone42_r16.setRotationPoint(-1.09F, 17.8246F, 4.3496F);
		bone42.addChild(bone42_r16);
		setRotationAngle(bone42_r16, -0.1742F, 0.0869F, 0.0076F);
		bone42_r16.setTextureOffset(484, 0).addBox(-3.3092F, -4.9392F, -2.8604F, 5.0F, 11.0F, 4.0F, 0.0F, true);

		bone42_r17 = new ModelRenderer(this);
		bone42_r17.setRotationPoint(-1.09F, 17.8246F, 4.3496F);
		bone42.addChild(bone42_r17);
		setRotationAngle(bone42_r17, -0.3051F, 0.0869F, 0.0076F);
		bone42_r17.setTextureOffset(338, 350).addBox(-2.8092F, -3.5076F, -2.1118F, 4.0F, 1.0F, 5.0F, 0.0F, true);
		bone42_r17.setTextureOffset(307, 32).addBox(-2.3092F, -3.0076F, -2.1118F, 3.0F, 13.0F, 5.0F, 0.0F, true);
		bone42_r17.setTextureOffset(285, 230).addBox(-3.8192F, -5.2576F, -3.1118F, 7.0F, 2.0F, 4.0F, 0.0F, true);

		bone42_r18 = new ModelRenderer(this);
		bone42_r18.setRotationPoint(-1.0F, 14.9532F, 0.6832F);
		bone42.addChild(bone42_r18);
		setRotationAngle(bone42_r18, 0.0F, 0.0F, 0.2618F);
		bone42_r18.setTextureOffset(41, 190).addBox(-7.0659F, -4.5782F, -3.9715F, 8.0F, 2.0F, 8.0F, 0.0F, true);
		bone42_r18.setTextureOffset(0, 403).addBox(-8.8785F, -5.983F, -1.9715F, 2.0F, 5.0F, 4.0F, 0.0F, true);

		bone43 = new ModelRenderer(this);
		bone43.setRotationPoint(-2.2458F, 28.3845F, 1.1312F);
		bone42.addChild(bone43);
		setRotationAngle(bone43, -0.0436F, 0.0436F, -0.2182F);

		bone43_r1 = new ModelRenderer(this);
		bone43_r1.setRotationPoint(3.25F, 8.75F, -1.75F);
		bone43.addChild(bone43_r1);
		setRotationAngle(bone43_r1, 0.0F, -0.3491F, -1.5708F);
		bone43_r1.setTextureOffset(392, 175).addBox(-5.5791F, -4.5172F, -2.9016F, 2.0F, 3.0F, 5.0F, 0.0F, true);

		bone43_r2 = new ModelRenderer(this);
		bone43_r2.setRotationPoint(3.25F, 8.75F, -1.75F);
		bone43.addChild(bone43_r2);
		setRotationAngle(bone43_r2, 0.0F, 0.2182F, -1.5708F);
		bone43_r2.setTextureOffset(168, 495).addBox(-6.2466F, -4.5372F, -0.5785F, 2.0F, 3.0F, 6.0F, 0.0F, true);

		bone43_r3 = new ModelRenderer(this);
		bone43_r3.setRotationPoint(3.25F, 8.75F, -1.75F);
		bone43.addChild(bone43_r3);
		setRotationAngle(bone43_r3, 0.0F, 0.0F, -1.3963F);
		bone43_r3.setTextureOffset(404, 352).addBox(-5.0117F, -1.3336F, -1.4296F, 7.0F, 3.0F, 6.0F, 0.0F, true);

		bone43_r4 = new ModelRenderer(this);
		bone43_r4.setRotationPoint(3.25F, 8.75F, -1.75F);
		bone43.addChild(bone43_r4);
		setRotationAngle(bone43_r4, 0.0F, 0.0F, -1.8762F);
		bone43_r4.setTextureOffset(488, 112).addBox(1.5118F, -0.3083F, -1.4296F, 3.0F, 3.0F, 6.0F, 0.0F, true);

		bone43_r5 = new ModelRenderer(this);
		bone43_r5.setRotationPoint(3.25F, 8.75F, -1.75F);
		bone43.addChild(bone43_r5);
		setRotationAngle(bone43_r5, 0.0F, 0.3491F, -1.5708F);
		bone43_r5.setTextureOffset(50, 333).addBox(-0.3808F, -2.2672F, 5.1295F, 4.0F, 3.0F, 2.0F, 0.0F, true);

		bone43_r6 = new ModelRenderer(this);
		bone43_r6.setRotationPoint(3.25F, 8.75F, -1.75F);
		bone43.addChild(bone43_r6);
		setRotationAngle(bone43_r6, 0.0F, -0.1309F, -1.5708F);
		bone43_r6.setTextureOffset(126, 468).addBox(-4.1565F, -2.2672F, -0.5025F, 7.0F, 3.0F, 7.0F, 0.0F, true);
		bone43_r6.setTextureOffset(156, 56).addBox(-4.3891F, -2.5172F, -3.6975F, 10.0F, 1.0F, 5.0F, 0.0F, true);
		bone43_r6.setTextureOffset(343, 210).addBox(-4.6391F, -3.2672F, -3.1975F, 10.0F, 4.0F, 5.0F, 0.0F, true);

		bone43_r7 = new ModelRenderer(this);
		bone43_r7.setRotationPoint(3.25F, 8.75F, -1.75F);
		bone43.addChild(bone43_r7);
		setRotationAngle(bone43_r7, 0.0F, 0.0F, -1.6581F);
		bone43_r7.setTextureOffset(40, 241).addBox(-4.3346F, -4.5172F, -1.6796F, 9.0F, 4.0F, 6.0F, 0.0F, true);

		bone43_r8 = new ModelRenderer(this);
		bone43_r8.setRotationPoint(1.75F, 8.75F, -0.5F);
		bone43.addChild(bone43_r8);
		setRotationAngle(bone43_r8, 0.0F, 0.0F, -1.5708F);
		bone43_r8.setTextureOffset(439, 443).addBox(5.6654F, -2.7672F, -0.1796F, 3.0F, 3.0F, 3.0F, 0.0F, true);

		bone43_r9 = new ModelRenderer(this);
		bone43_r9.setRotationPoint(3.25F, 8.75F, -1.75F);
		bone43.addChild(bone43_r9);
		setRotationAngle(bone43_r9, 0.0F, 0.0F, -1.5708F);
		bone43_r9.setTextureOffset(124, 446).addBox(5.6654F, -3.2672F, -1.1796F, 3.0F, 3.0F, 3.0F, 0.0F, true);
		bone43_r9.setTextureOffset(473, 379).addBox(4.1654F, -5.2672F, -3.1796F, 2.0F, 4.0F, 9.0F, 0.0F, true);

		qiang = new ModelRenderer(this);
		qiang.setRotationPoint(5.3891F, 39.0107F, -0.4845F);
		bone43.addChild(qiang);
		setRotationAngle(qiang, 1.4835F, 0.0F, 0.0F);
		qiang.setTextureOffset(124, 0).addBox(-5.6512F, -22.6042F, -110.0896F, 9.0F, 6.0F, 62.0F, 0.0F, false);
		qiang.setTextureOffset(41, 189).addBox(1.8488F, -22.6042F, -113.0896F, 1.0F, 6.0F, 3.0F, 0.0F, false);
		qiang.setTextureOffset(171, 187).addBox(-5.6512F, -22.6042F, -113.0896F, 1.0F, 6.0F, 3.0F, 0.0F, false);
		qiang.setTextureOffset(248, 277).addBox(-4.1512F, -22.6042F, -113.0896F, 6.0F, 1.0F, 3.0F, 0.0F, false);
		qiang.setTextureOffset(76, 134).addBox(-3.6512F, -17.6042F, -126.0896F, 5.0F, 2.0F, 12.0F, 0.0F, false);
		qiang.setTextureOffset(445, 196).addBox(-3.6512F, -21.6042F, -126.0896F, 5.0F, 4.0F, 10.0F, 0.0F, false);
		qiang.setTextureOffset(483, 73).addBox(-2.6512F, -20.8542F, -117.0896F, 3.0F, 5.0F, 7.0F, 0.0F, false);
		qiang.setTextureOffset(32, 338).addBox(-4.6512F, -21.6042F, -123.3396F, 7.0F, 5.0F, 6.0F, 0.0F, false);
		qiang.setTextureOffset(58, 229).addBox(-4.6512F, -18.6042F, -117.0496F, 7.0F, 2.0F, 2.0F, 0.0F, false);
		qiang.setTextureOffset(158, 252).addBox(-4.6512F, -23.6042F, -120.3396F, 7.0F, 2.0F, 5.0F, 0.0F, false);
		qiang.setTextureOffset(0, 0).addBox(-4.1512F, -20.6042F, -96.8396F, 6.0F, 10.0F, 48.0F, 0.0F, false);
		qiang.setTextureOffset(424, 0).addBox(-4.1712F, -16.3542F, -48.5896F, 6.0F, 5.0F, 11.0F, 0.0F, false);
		qiang.setTextureOffset(34, 430).addBox(2.3288F, -34.9822F, 0.7342F, 1.0F, 4.0F, 14.0F, 0.0F, false);
		qiang.setTextureOffset(429, 196).addBox(-6.1912F, -34.9822F, 0.7342F, 1.0F, 4.0F, 14.0F, 0.0F, false);
		qiang.setTextureOffset(124, 97).addBox(-4.6512F, -34.9822F, 0.7342F, 7.0F, 1.0F, 14.0F, 0.0F, false);
		qiang.setTextureOffset(262, 318).addBox(0.3488F, -10.6129F, -107.2109F, 1.0F, 2.0F, 8.0F, 0.0F, false);
		qiang.setTextureOffset(233, 270).addBox(-4.1512F, -10.6129F, -107.2109F, 1.0F, 2.0F, 8.0F, 0.0F, false);
		qiang.setTextureOffset(276, 32).addBox(0.3488F, -20.6042F, -109.0896F, 1.0F, 10.0F, 12.0F, 0.0F, false);
		qiang.setTextureOffset(275, 240).addBox(-4.1512F, -20.6042F, -109.0896F, 1.0F, 10.0F, 12.0F, 0.0F, false);
		qiang.setTextureOffset(240, 27).addBox(-5.6512F, -16.6042F, -110.0896F, 9.0F, 2.0F, 4.0F, 0.0F, false);
		qiang.setTextureOffset(46, 251).addBox(1.8488F, -16.6042F, -113.0896F, 1.0F, 2.0F, 3.0F, 0.0F, false);
		qiang.setTextureOffset(243, 131).addBox(-5.6512F, -16.6042F, -113.0896F, 1.0F, 2.0F, 3.0F, 0.0F, false);
		qiang.setTextureOffset(405, 143).addBox(-5.6512F, -16.6042F, -94.0987F, 9.0F, 2.0F, 11.0F, 0.0F, false);
		qiang.setTextureOffset(79, 285).addBox(-5.6512F, -16.6042F, -70.0678F, 9.0F, 2.0F, 23.0F, 0.0F, false);
		qiang.setTextureOffset(256, 338).addBox(-4.1512F, -26.6042F, -50.0678F, 6.0F, 10.0F, 16.0F, 0.0F, false);
		qiang.setTextureOffset(456, 417).addBox(-3.1512F, -31.6042F, -3.3178F, 4.0F, 4.0F, 10.0F, 0.0F, false);
		qiang.setTextureOffset(47, 58).addBox(-4.1512F, -27.3542F, -33.3178F, 6.0F, 14.0F, 29.0F, 0.0F, false);
		qiang.setTextureOffset(152, 187).addBox(-3.1512F, -31.6042F, -36.3178F, 4.0F, 4.0F, 28.0F, 0.0F, false);
		qiang.setTextureOffset(68, 307).addBox(-2.6512F, -30.6042F, -8.0678F, 3.0F, 3.0F, 5.0F, 0.0F, false);

		qiang_r1 = new ModelRenderer(this);
		qiang_r1.setRotationPoint(-1.5212F, -8.6435F, 4.9922F);
		qiang.addChild(qiang_r1);
		setRotationAngle(qiang_r1, -0.7418F, 0.0F, 0.0F);
		qiang_r1.setTextureOffset(465, 190).addBox(-2.0F, -8.5F, -4.0F, 4.0F, 7.0F, 7.0F, 0.0F, false);

		qiang_r2 = new ModelRenderer(this);
		qiang_r2.setRotationPoint(-1.6512F, -8.6435F, 3.9922F);
		qiang.addChild(qiang_r2);
		setRotationAngle(qiang_r2, -0.7418F, 0.0F, 0.0F);
		qiang_r2.setTextureOffset(0, 58).addBox(-1.75F, -8.5F, -4.5F, 4.0F, 14.0F, 6.0F, 0.0F, false);

		qiang_r3 = new ModelRenderer(this);
		qiang_r3.setRotationPoint(-1.1512F, -16.8542F, -5.6928F);
		qiang.addChild(qiang_r3);
		setRotationAngle(qiang_r3, 0.5672F, 0.0F, 0.0F);
		qiang_r3.setTextureOffset(189, 261).addBox(-2.0F, -3.6522F, -2.6404F, 4.0F, 12.0F, 2.0F, 0.0F, false);
		qiang_r3.setTextureOffset(126, 478).addBox(-4.0F, -3.6522F, -0.6404F, 8.0F, 13.0F, 2.0F, 0.0F, false);

		qiang_r4 = new ModelRenderer(this);
		qiang_r4.setRotationPoint(-1.1512F, -25.8868F, 6.585F);
		qiang.addChild(qiang_r4);
		setRotationAngle(qiang_r4, 1.0472F, 0.0F, 0.0F);
		qiang_r4.setTextureOffset(217, 261).addBox(-2.0F, -2.125F, 1.625F, 4.0F, 9.0F, 3.0F, 0.0F, false);

		qiang_r5 = new ModelRenderer(this);
		qiang_r5.setRotationPoint(-0.1512F, -16.0618F, -76.6583F);
		qiang.addChild(qiang_r5);
		setRotationAngle(qiang_r5, 2.3562F, 0.0F, 0.0F);
		qiang_r5.setTextureOffset(41, 185).addBox(-5.47F, 3.4526F, -5.8676F, 8.0F, 1.0F, 3.0F, 0.0F, false);

		qiang_r6 = new ModelRenderer(this);
		qiang_r6.setRotationPoint(-0.1512F, -16.0618F, -100.6891F);
		qiang.addChild(qiang_r6);
		setRotationAngle(qiang_r6, 2.3562F, 0.0F, 0.0F);
		qiang_r6.setTextureOffset(36, 229).addBox(-5.47F, 3.4526F, -5.8676F, 8.0F, 1.0F, 3.0F, 0.0F, false);

		qiang_r7 = new ModelRenderer(this);
		qiang_r7.setRotationPoint(-0.1512F, -15.0613F, -82.5987F);
		qiang.addChild(qiang_r7);
		setRotationAngle(qiang_r7, 0.7854F, 0.0F, 0.0F);
		qiang_r7.setTextureOffset(254, 240).addBox(-5.47F, -1.08F, -0.5F, 8.0F, 1.0F, 3.0F, 0.0F, false);

		qiang_r8 = new ModelRenderer(this);
		qiang_r8.setRotationPoint(-0.1512F, -15.0613F, -106.0896F);
		qiang.addChild(qiang_r8);
		setRotationAngle(qiang_r8, 0.7854F, 0.0F, 0.0F);
		qiang_r8.setTextureOffset(267, 197).addBox(-5.47F, -1.08F, -0.5F, 8.0F, 1.0F, 3.0F, 0.0F, false);

		qiang_r9 = new ModelRenderer(this);
		qiang_r9.setRotationPoint(-0.6512F, -21.4629F, -48.6983F);
		qiang.addChild(qiang_r9);
		setRotationAngle(qiang_r9, 0.5672F, 0.0F, 0.0F);
		qiang_r9.setTextureOffset(452, 106).addBox(-5.52F, -6.75F, -1.75F, 10.0F, 14.0F, 3.0F, 0.0F, false);

		qiang_r10 = new ModelRenderer(this);
		qiang_r10.setRotationPoint(-0.1512F, -10.0357F, -98.6766F);
		qiang.addChild(qiang_r10);
		setRotationAngle(qiang_r10, 0.2182F, 0.0F, 0.0F);
		qiang_r10.setTextureOffset(307, 32).addBox(-5.52F, -5.8333F, 31.75F, 9.0F, 5.0F, 18.0F, 0.0F, false);

		qiang_r11 = new ModelRenderer(this);
		qiang_r11.setRotationPoint(-1.6512F, -20.268F, -98.7326F);
		qiang.addChild(qiang_r11);
		setRotationAngle(qiang_r11, 0.7854F, 0.0F, 0.0F);
		qiang_r11.setTextureOffset(334, 260).addBox(-2.52F, 5.1667F, -8.5F, 1.0F, 3.0F, 9.0F, 0.0F, false);
		qiang_r11.setTextureOffset(310, 391).addBox(1.97F, 5.1667F, -8.5F, 1.0F, 3.0F, 9.0F, 0.0F, false);

		qiang_r12 = new ModelRenderer(this);
		qiang_r12.setRotationPoint(-1.6512F, -20.268F, -107.4466F);
		qiang.addChild(qiang_r12);
		setRotationAngle(qiang_r12, -0.7854F, 0.0F, 0.0F);
		qiang_r12.setTextureOffset(361, 112).addBox(-2.52F, 5.1667F, 2.3F, 1.0F, 3.0F, 6.0F, 0.0F, false);
		qiang_r12.setTextureOffset(295, 374).addBox(1.97F, 5.1667F, 2.3F, 1.0F, 3.0F, 6.0F, 0.0F, false);

		qiang_r13 = new ModelRenderer(this);
		qiang_r13.setRotationPoint(-0.6512F, -16.6042F, -54.7146F);
		qiang.addChild(qiang_r13);
		setRotationAngle(qiang_r13, 0.5672F, 0.0F, 0.0F);
		qiang_r13.setTextureOffset(76, 474).addBox(-4.0F, 1.277F, -1.7437F, 7.0F, 14.0F, 3.0F, 0.0F, false);

		qiang_r14 = new ModelRenderer(this);
		qiang_r14.setRotationPoint(-0.6512F, -7.6042F, -47.7146F);
		qiang.addChild(qiang_r14);
		setRotationAngle(qiang_r14, 0.5672F, 0.0F, 0.0F);
		qiang_r14.setTextureOffset(306, 272).addBox(-3.5F, -1.5F, -13.125F, 6.0F, 15.0F, 4.0F, 0.0F, false);
		qiang_r14.setTextureOffset(255, 364).addBox(-5.0F, -9.0F, 7.875F, 9.0F, 12.0F, 11.0F, 0.0F, false);
		qiang_r14.setTextureOffset(48, 339).addBox(-4.0F, 1.0F, 12.875F, 7.0F, 26.0F, 10.0F, 0.0F, false);
		qiang_r14.setTextureOffset(444, 328).addBox(-3.5F, -2.37F, 1.875F, 6.0F, 15.0F, 6.0F, 0.0F, false);

		qiang_r15 = new ModelRenderer(this);
		qiang_r15.setRotationPoint(-1.6512F, -8.1042F, -48.2146F);
		qiang.addChild(qiang_r15);
		setRotationAngle(qiang_r15, 0.5672F, 0.0F, 0.0F);
		qiang_r15.setTextureOffset(106, 359).addBox(-4.52F, 12.0F, 16.875F, 1.0F, 3.0F, 20.0F, 0.0F, false);
		qiang_r15.setTextureOffset(156, 359).addBox(3.98F, 12.0F, 16.875F, 1.0F, 3.0F, 20.0F, 0.0F, false);
		qiang_r15.setTextureOffset(30, 268).addBox(-4.52F, 12.0F, 48.875F, 1.0F, 3.0F, 17.0F, 0.0F, false);
		qiang_r15.setTextureOffset(107, 386).addBox(3.98F, 12.0F, 48.875F, 1.0F, 3.0F, 17.0F, 0.0F, false);
		qiang_r15.setTextureOffset(97, 441).addBox(-4.52F, 7.0F, 16.875F, 1.0F, 3.0F, 7.0F, 0.0F, false);
		qiang_r15.setTextureOffset(491, 297).addBox(3.98F, 7.0F, 16.875F, 1.0F, 3.0F, 7.0F, 0.0F, false);
		qiang_r15.setTextureOffset(0, 58).addBox(-4.52F, 10.0F, 16.875F, 1.0F, 2.0F, 45.0F, 0.0F, false);
		qiang_r15.setTextureOffset(124, 68).addBox(3.98F, 10.0F, 16.875F, 1.0F, 2.0F, 45.0F, 0.0F, false);
		qiang_r15.setTextureOffset(310, 0).addBox(-4.52F, 7.0F, 35.875F, 1.0F, 3.0F, 24.0F, 0.0F, false);
		qiang_r15.setTextureOffset(306, 314).addBox(3.98F, 7.0F, 35.875F, 1.0F, 3.0F, 24.0F, 0.0F, false);

		qiang_r16 = new ModelRenderer(this);
		qiang_r16.setRotationPoint(-5.1512F, -19.2253F, -14.4397F);
		qiang.addChild(qiang_r16);
		setRotationAngle(qiang_r16, 1.3526F, 0.0F, 0.0F);
		qiang_r16.setTextureOffset(262, 277).addBox(-1.0F, -0.25F, -2.0F, 1.0F, 2.0F, 4.0F, 0.0F, false);
		qiang_r16.setTextureOffset(214, 390).addBox(7.5F, -0.25F, -2.0F, 1.0F, 2.0F, 4.0F, 0.0F, false);

		qiang_r17 = new ModelRenderer(this);
		qiang_r17.setRotationPoint(-5.1512F, -17.786F, -10.3639F);
		qiang.addChild(qiang_r17);
		setRotationAngle(qiang_r17, 1.3526F, 0.0F, 0.0F);
		qiang_r17.setTextureOffset(394, 127).addBox(-1.0F, -0.25F, -2.0F, 1.0F, 2.0F, 4.0F, 0.0F, false);
		qiang_r17.setTextureOffset(84, 403).addBox(7.5F, -0.75F, -2.0F, 1.0F, 2.0F, 4.0F, 0.0F, false);

		qiang_r18 = new ModelRenderer(this);
		qiang_r18.setRotationPoint(-5.1512F, -14.4317F, -21.9641F);
		qiang.addChild(qiang_r18);
		setRotationAngle(qiang_r18, 1.3526F, 0.0F, 0.0F);
		qiang_r18.setTextureOffset(124, 0).addBox(-1.0F, -2.25F, -2.5F, 1.0F, 4.0F, 2.0F, 0.0F, false);
		qiang_r18.setTextureOffset(124, 38).addBox(7.5F, -2.25F, -2.5F, 1.0F, 4.0F, 2.0F, 0.0F, false);

		qiang_r19 = new ModelRenderer(this);
		qiang_r19.setRotationPoint(-5.1512F, -24.0993F, -0.454F);
		qiang.addChild(qiang_r19);
		setRotationAngle(qiang_r19, 1.3526F, 0.0F, 0.0F);
		qiang_r19.setTextureOffset(132, 38).addBox(-1.0F, -2.25F, -2.0F, 1.0F, 4.0F, 2.0F, 0.0F, false);
		qiang_r19.setTextureOffset(141, 0).addBox(7.5F, -2.25F, -2.0F, 1.0F, 4.0F, 2.0F, 0.0F, false);

		qiang_r20 = new ModelRenderer(this);
		qiang_r20.setRotationPoint(-0.6512F, -8.3542F, -47.7146F);
		qiang.addChild(qiang_r20);
		setRotationAngle(qiang_r20, 0.5672F, 0.0F, 0.0F);
		qiang_r20.setTextureOffset(267, 277).addBox(-6.0F, 1.0F, 9.875F, 11.0F, 15.0F, 7.0F, 0.0F, false);

		qiang_r21 = new ModelRenderer(this);
		qiang_r21.setRotationPoint(-1.1512F, -21.8044F, -121.2469F);
		qiang.addChild(qiang_r21);
		setRotationAngle(qiang_r21, 0.5847F, 0.0F, 0.0F);
		qiang_r21.setTextureOffset(177, 252).addBox(-3.48F, -1.0F, -1.86F, 6.0F, 2.0F, 3.0F, 0.0F, false);

		qiang_r22 = new ModelRenderer(this);
		qiang_r22.setRotationPoint(25.2863F, 7.5047F, -35.3665F);
		qiang.addChild(qiang_r22);
		setRotationAngle(qiang_r22, 0.5672F, 0.0F, 0.0F);
		qiang_r22.setTextureOffset(124, 0).addBox(-28.9375F, -20.3773F, -11.4212F, 5.0F, 14.0F, 24.0F, 0.0F, false);

		bone122 = new ModelRenderer(this);
		bone122.setRotationPoint(-1.995F, -13.972F, -59.0678F);
		qiang.addChild(bone122);
		bone122.setTextureOffset(149, 149).addBox(-3.1562F, -13.3822F, 54.75F, 8.0F, 7.0F, 31.0F, 0.0F, false);

		bone122_r1 = new ModelRenderer(this);
		bone122_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone122.addChild(bone122_r1);
		setRotationAngle(bone122_r1, 0.0F, 0.0F, -0.1745F);
		bone122_r1.setTextureOffset(196, 134).addBox(-2.0F, -6.8333F, 54.75F, 4.0F, 5.0F, 33.0F, 0.0F, true);

		bone122_r2 = new ModelRenderer(this);
		bone122_r2.setRotationPoint(1.3438F, -13.8822F, 86.625F);
		bone122.addChild(bone122_r2);
		setRotationAngle(bone122_r2, 0.3927F, 0.0F, 0.0F);
		bone122_r2.setTextureOffset(76, 134).addBox(2.0F, -0.6522F, -7.6404F, 2.0F, 7.0F, 4.0F, 0.0F, true);
		bone122_r2.setTextureOffset(76, 134).addBox(-5.0F, -0.6522F, -7.6404F, 2.0F, 7.0F, 4.0F, 0.0F, false);
		bone122_r2.setTextureOffset(54, 414).addBox(-3.0F, 16.3478F, -7.6404F, 5.0F, 9.0F, 11.0F, 0.0F, false);
		bone122_r2.setTextureOffset(0, 0).addBox(-3.0F, -2.6522F, -15.6404F, 5.0F, 19.0F, 19.0F, 0.0F, false);
		bone122_r2.setTextureOffset(171, 68).addBox(-5.0F, -1.6522F, -3.6404F, 9.0F, 25.0F, 5.0F, 0.0F, false);

		bone122_r3 = new ModelRenderer(this);
		bone122_r3.setRotationPoint(-0.9848F, 0.1736F, 0.0F);
		bone122.addChild(bone122_r3);
		setRotationAngle(bone122_r3, 0.0F, 0.0F, -0.1745F);
		bone122_r3.setTextureOffset(171, 68).addBox(-1.5F, -1.8333F, 56.75F, 4.0F, 5.0F, 33.0F, 0.0F, false);

		bone122_r4 = new ModelRenderer(this);
		bone122_r4.setRotationPoint(1.6876F, 0.0F, 0.0F);
		bone122.addChild(bone122_r4);
		setRotationAngle(bone122_r4, 0.0F, 0.0F, 0.1745F);
		bone122_r4.setTextureOffset(185, 187).addBox(-2.0F, -1.8333F, 56.75F, 4.0F, 5.0F, 33.0F, 0.0F, false);
		bone122_r4.setTextureOffset(196, 134).addBox(-2.0F, -6.8333F, 54.75F, 4.0F, 5.0F, 33.0F, 0.0F, false);

		bone122_r5 = new ModelRenderer(this);
		bone122_r5.setRotationPoint(0.8438F, 2.098F, 91.9097F);
		bone122.addChild(bone122_r5);
		setRotationAngle(bone122_r5, -0.4538F, 0.0F, 0.0F);
		bone122_r5.setTextureOffset(74, 423).addBox(-2.48F, 4.5F, -9.875F, 4.0F, 6.0F, 12.0F, 0.0F, false);

		bone31 = new ModelRenderer(this);
		bone31.setRotationPoint(1.0988F, -1.3466F, -23.8184F);
		qiang.addChild(bone31);
		setRotationAngle(bone31, 0.6545F, 0.1745F, -0.3927F);
		bone31.setTextureOffset(404, 439).addBox(2.2457F, 0.0029F, -2.5987F, 1.0F, 29.0F, 5.0F, 0.0F, false);
		bone31.setTextureOffset(48, 375).addBox(-0.7743F, -0.9971F, -1.5987F, 5.0F, 3.0F, 3.0F, 0.0F, false);

		bone31_r1 = new ModelRenderer(this);
		bone31_r1.setRotationPoint(-5.7968F, 7.2256F, -2.8405F);
		bone31.addChild(bone31_r1);
		setRotationAngle(bone31_r1, 0.1745F, 0.0F, 0.0F);
		bone31_r1.setTextureOffset(358, 464).addBox(8.0625F, -0.4355F, -4.5881F, 1.0F, 23.0F, 5.0F, 0.0F, false);

		bone31_r2 = new ModelRenderer(this);
		bone31_r2.setRotationPoint(-5.7968F, 9.9566F, -4.4407F);
		bone31.addChild(bone31_r2);
		setRotationAngle(bone31_r2, -0.5672F, 0.0F, 0.0F);
		bone31_r2.setTextureOffset(171, 38).addBox(8.0625F, -9.3845F, -3.7946F, 1.0F, 9.0F, 6.0F, 0.0F, false);

		bone37 = new ModelRenderer(this);
		bone37.setRotationPoint(-3.4012F, -1.3466F, -23.8184F);
		qiang.addChild(bone37);
		setRotationAngle(bone37, 0.6545F, -0.1745F, 0.3927F);
		bone37.setTextureOffset(0, 438).addBox(-3.7857F, 0.0029F, -2.5987F, 1.0F, 29.0F, 5.0F, 0.0F, false);
		bone37.setTextureOffset(305, 240).addBox(-4.7657F, -0.9971F, -1.5987F, 5.0F, 3.0F, 3.0F, 0.0F, false);

		bone37_r1 = new ModelRenderer(this);
		bone37_r1.setRotationPoint(5.7968F, 7.2256F, -2.8405F);
		bone37.addChild(bone37_r1);
		setRotationAngle(bone37_r1, 0.1745F, 0.0F, 0.0F);
		bone37_r1.setTextureOffset(175, 462).addBox(-9.5625F, -0.4355F, -4.5881F, 1.0F, 23.0F, 5.0F, 0.0F, false);

		bone37_r2 = new ModelRenderer(this);
		bone37_r2.setRotationPoint(5.7968F, 9.9566F, -4.4407F);
		bone37.addChild(bone37_r2);
		setRotationAngle(bone37_r2, -0.5672F, 0.0F, 0.0F);
		bone37_r2.setTextureOffset(41, 165).addBox(-9.5425F, -9.3845F, -3.7946F, 1.0F, 9.0F, 6.0F, 0.0F, false);

		bone32 = new ModelRenderer(this);
		bone32.setRotationPoint(0.0988F, 4.6534F, -18.8184F);
		qiang.addChild(bone32);
		setRotationAngle(bone32, 0.6545F, 0.1745F, -0.3927F);
		bone32.setTextureOffset(248, 436).addBox(2.2457F, 0.0029F, -2.5987F, 1.0F, 29.0F, 5.0F, 0.0F, false);
		bone32.setTextureOffset(203, 293).addBox(0.2257F, -0.9971F, -1.5987F, 4.0F, 3.0F, 3.0F, 0.0F, false);

		bone32_r1 = new ModelRenderer(this);
		bone32_r1.setRotationPoint(-5.7968F, 7.2256F, -2.8405F);
		bone32.addChild(bone32_r1);
		setRotationAngle(bone32_r1, 0.1745F, 0.0F, 0.0F);
		bone32_r1.setTextureOffset(434, 459).addBox(8.0625F, -0.4355F, -4.5881F, 1.0F, 23.0F, 5.0F, 0.0F, false);

		bone32_r2 = new ModelRenderer(this);
		bone32_r2.setRotationPoint(-5.7968F, 9.9566F, -4.4407F);
		bone32.addChild(bone32_r2);
		setRotationAngle(bone32_r2, -0.5672F, 0.0F, 0.0F);
		bone32_r2.setTextureOffset(120, 161).addBox(8.0625F, -9.3845F, -3.7946F, 1.0F, 9.0F, 6.0F, 0.0F, false);

		bone38 = new ModelRenderer(this);
		bone38.setRotationPoint(-2.4012F, 4.6534F, -18.8184F);
		qiang.addChild(bone38);
		setRotationAngle(bone38, 0.6545F, -0.1745F, 0.3927F);
		bone38.setTextureOffset(0, 438).addBox(-3.7857F, 0.0029F, -2.5987F, 1.0F, 29.0F, 5.0F, 0.0F, false);
		bone38.setTextureOffset(108, 35).addBox(-4.7657F, -0.9971F, -1.5987F, 4.0F, 3.0F, 3.0F, 0.0F, false);

		bone38_r1 = new ModelRenderer(this);
		bone38_r1.setRotationPoint(5.7968F, 7.2256F, -2.8405F);
		bone38.addChild(bone38_r1);
		setRotationAngle(bone38_r1, 0.1745F, 0.0F, 0.0F);
		bone38_r1.setTextureOffset(175, 462).addBox(-9.5625F, -0.4355F, -4.5881F, 1.0F, 23.0F, 5.0F, 0.0F, false);

		bone38_r2 = new ModelRenderer(this);
		bone38_r2.setRotationPoint(5.7968F, 9.9566F, -4.4407F);
		bone38.addChild(bone38_r2);
		setRotationAngle(bone38_r2, -0.5672F, 0.0F, 0.0F);
		bone38_r2.setTextureOffset(41, 165).addBox(-9.5425F, -9.3845F, -3.7946F, 1.0F, 9.0F, 6.0F, 0.0F, false);

		bone56 = new ModelRenderer(this);
		bone56.setRotationPoint(-8.6512F, -16.094F, -107.9511F);
		qiang.addChild(bone56);
		setRotationAngle(bone56, 0.2618F, -0.0436F, -0.7418F);
		bone56.setTextureOffset(63, 310).addBox(-1.6064F, -3.146F, -13.0011F, 1.0F, 5.0F, 24.0F, 0.0F, false);

		bone56_r1 = new ModelRenderer(this);
		bone56_r1.setRotationPoint(-1.0864F, -0.6358F, 13.1374F);
		bone56.addChild(bone56_r1);
		setRotationAngle(bone56_r1, -0.5236F, 0.0F, 0.0F);
		bone56_r1.setTextureOffset(14, 58).addBox(-0.5F, -1.1047F, -3.1071F, 1.0F, 4.0F, 2.0F, 0.0F, false);

		bone56_r2 = new ModelRenderer(this);
		bone56_r2.setRotationPoint(-1.0864F, -0.6358F, -12.8626F);
		bone56.addChild(bone56_r2);
		setRotationAngle(bone56_r2, -0.5236F, 0.0F, 0.0F);
		bone56_r2.setTextureOffset(60, 35).addBox(-0.5F, -2.1047F, -1.375F, 1.0F, 4.0F, 2.0F, 0.0F, false);

		bone57 = new ModelRenderer(this);
		bone57.setRotationPoint(-4.2047F, 0.747F, -18.4595F);
		bone56.addChild(bone57);
		bone57.setTextureOffset(263, 425).addBox(-0.52F, -2.5102F, -0.1385F, 1.0F, 5.0F, 14.0F, 0.0F, false);

		bone57_r1 = new ModelRenderer(this);
		bone57_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone57.addChild(bone57_r1);
		setRotationAngle(bone57_r1, -0.5236F, 0.0F, 0.0F);
		bone57_r1.setTextureOffset(41, 0).addBox(-0.5F, -2.1047F, -1.375F, 1.0F, 4.0F, 2.0F, 0.0F, false);

		bone57_r2 = new ModelRenderer(this);
		bone57_r2.setRotationPoint(0.0F, 0.0F, 14.0F);
		bone57.addChild(bone57_r2);
		setRotationAngle(bone57_r2, -0.5236F, 0.0F, 0.0F);
		bone57_r2.setTextureOffset(0, 58).addBox(-0.5F, -2.1047F, -1.375F, 1.0F, 4.0F, 2.0F, 0.0F, false);

		bone29 = new ModelRenderer(this);
		bone29.setRotationPoint(6.3488F, -16.094F, -107.9511F);
		qiang.addChild(bone29);
		setRotationAngle(bone29, 0.2618F, 0.0436F, 0.7418F);
		bone29.setTextureOffset(0, 309).addBox(0.5664F, -3.146F, -13.0011F, 1.0F, 5.0F, 24.0F, 0.0F, false);

		bone29_r1 = new ModelRenderer(this);
		bone29_r1.setRotationPoint(1.0864F, -0.6358F, 13.1374F);
		bone29.addChild(bone29_r1);
		setRotationAngle(bone29_r1, -0.5236F, 0.0F, 0.0F);
		bone29_r1.setTextureOffset(29, 0).addBox(-0.5F, -1.1047F, -3.1071F, 1.0F, 4.0F, 2.0F, 0.0F, false);

		bone29_r2 = new ModelRenderer(this);
		bone29_r2.setRotationPoint(1.0864F, -0.6358F, -12.8626F);
		bone29.addChild(bone29_r2);
		setRotationAngle(bone29_r2, -0.5236F, 0.0F, 0.0F);
		bone29_r2.setTextureOffset(0, 38).addBox(-0.5F, -2.1047F, -1.375F, 1.0F, 4.0F, 2.0F, 0.0F, false);

		bone30 = new ModelRenderer(this);
		bone30.setRotationPoint(4.2047F, 0.747F, -18.4595F);
		bone29.addChild(bone30);
		bone30.setTextureOffset(18, 424).addBox(-0.52F, -2.5102F, -0.1385F, 1.0F, 5.0F, 14.0F, 0.0F, false);

		bone30_r1 = new ModelRenderer(this);
		bone30_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone30.addChild(bone30_r1);
		setRotationAngle(bone30_r1, -0.5236F, 0.0F, 0.0F);
		bone30_r1.setTextureOffset(0, 0).addBox(-0.5F, -2.1047F, -1.375F, 1.0F, 4.0F, 2.0F, 0.0F, false);

		bone30_r2 = new ModelRenderer(this);
		bone30_r2.setRotationPoint(0.0F, 0.0F, 14.0F);
		bone30.addChild(bone30_r2);
		setRotationAngle(bone30_r2, -0.5236F, 0.0F, 0.0F);
		bone30_r2.setTextureOffset(12, 0).addBox(-0.5F, -2.1047F, -1.375F, 1.0F, 4.0F, 2.0F, 0.0F, false);

		bone26 = new ModelRenderer(this);
		bone26.setRotationPoint(0.3488F, -12.2708F, -104.8396F);
		qiang.addChild(bone26);
		setRotationAngle(bone26, -0.0436F, 0.2182F, 0.3054F);

		bone26_r1 = new ModelRenderer(this);
		bone26_r1.setRotationPoint(-0.6912F, 5.4107F, 14.3115F);
		bone26.addChild(bone26_r1);
		setRotationAngle(bone26_r1, 0.0F, -0.0436F, 0.0F);
		bone26_r1.setTextureOffset(138, 198).addBox(1.3551F, -6.375F, -15.101F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		bone26_r1.setTextureOffset(117, 91).addBox(1.2898F, -6.8965F, -15.3557F, 1.0F, 5.0F, 1.0F, 0.0F, false);

		bone26_r2 = new ModelRenderer(this);
		bone26_r2.setRotationPoint(1.672F, 0.3103F, 28.6199F);
		bone26.addChild(bone26_r2);
		setRotationAngle(bone26_r2, -0.7854F, -0.0436F, 0.0F);
		bone26_r2.setTextureOffset(407, 87).addBox(-0.5F, -3.0012F, -2.2488F, 1.0F, 6.0F, 4.0F, 0.0F, false);

		bone26_r3 = new ModelRenderer(this);
		bone26_r3.setRotationPoint(0.0588F, 6.2715F, 13.5265F);
		bone26.addChild(bone26_r3);
		setRotationAngle(bone26_r3, -0.0436F, -0.0436F, 0.0F);
		bone26_r3.setTextureOffset(277, 32).addBox(1.7576F, -7.7316F, -14.2366F, 1.0F, 4.0F, 28.0F, 0.0F, false);

		bone26_r4 = new ModelRenderer(this);
		bone26_r4.setRotationPoint(0.0588F, 5.4107F, 13.8115F);
		bone26.addChild(bone26_r4);
		setRotationAngle(bone26_r4, 0.0F, -0.0436F, 0.0F);
		bone26_r4.setTextureOffset(127, 256).addBox(1.7376F, -8.8128F, -14.1925F, 1.0F, 4.0F, 29.0F, 0.0F, false);

		bone39 = new ModelRenderer(this);
		bone39.setRotationPoint(-2.6512F, -12.2708F, -104.8396F);
		qiang.addChild(bone39);
		setRotationAngle(bone39, -0.0436F, -0.2182F, -0.3054F);

		bone39_r1 = new ModelRenderer(this);
		bone39_r1.setRotationPoint(0.6912F, 5.4107F, 14.3115F);
		bone39.addChild(bone39_r1);
		setRotationAngle(bone39_r1, 0.0F, 0.0436F, 0.0F);
		bone39_r1.setTextureOffset(194, 119).addBox(-4.1451F, -6.375F, -15.101F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		bone39_r1.setTextureOffset(117, 85).addBox(-3.0798F, -6.8965F, -15.3557F, 1.0F, 5.0F, 1.0F, 0.0F, false);

		bone39_r2 = new ModelRenderer(this);
		bone39_r2.setRotationPoint(-1.672F, 0.3103F, 28.6199F);
		bone39.addChild(bone39_r2);
		setRotationAngle(bone39_r2, -0.7854F, 0.0436F, 0.0F);
		bone39_r2.setTextureOffset(405, 194).addBox(-0.5F, -3.0012F, -2.2488F, 1.0F, 6.0F, 4.0F, 0.0F, false);

		bone39_r3 = new ModelRenderer(this);
		bone39_r3.setRotationPoint(-0.0588F, 6.2715F, 13.5265F);
		bone39.addChild(bone39_r3);
		setRotationAngle(bone39_r3, -0.0436F, 0.0436F, 0.0F);
		bone39_r3.setTextureOffset(276, 276).addBox(-2.7576F, -7.7316F, -14.2366F, 1.0F, 4.0F, 28.0F, 0.0F, false);

		bone39_r4 = new ModelRenderer(this);
		bone39_r4.setRotationPoint(-0.0588F, 5.4107F, 13.8115F);
		bone39.addChild(bone39_r4);
		setRotationAngle(bone39_r4, 0.0F, 0.0436F, 0.0F);
		bone39_r4.setTextureOffset(254, 207).addBox(-2.7776F, -8.8128F, -14.1925F, 1.0F, 4.0F, 29.0F, 0.0F, false);

		bone27 = new ModelRenderer(this);
		bone27.setRotationPoint(1.3488F, -12.2708F, -92.8396F);
		qiang.addChild(bone27);
		setRotationAngle(bone27, -0.0436F, 0.2182F, 0.3054F);

		bone27_r1 = new ModelRenderer(this);
		bone27_r1.setRotationPoint(-0.6912F, 5.4107F, 14.3115F);
		bone27.addChild(bone27_r1);
		setRotationAngle(bone27_r1, 0.0F, -0.0436F, 0.0F);
		bone27_r1.setTextureOffset(188, 119).addBox(0.4164F, -6.0656F, -15.2533F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		bone27_r1.setTextureOffset(110, 0).addBox(0.3511F, -6.5871F, -15.508F, 1.0F, 3.0F, 1.0F, 0.0F, false);

		bone27_r2 = new ModelRenderer(this);
		bone27_r2.setRotationPoint(1.672F, 0.3103F, 28.6199F);
		bone27.addChild(bone27_r2);
		setRotationAngle(bone27_r2, -0.7854F, -0.0436F, 0.0F);
		bone27_r2.setTextureOffset(392, 103).addBox(-1.4386F, -2.6747F, -2.1377F, 1.0F, 6.0F, 4.0F, 0.0F, false);

		bone27_r3 = new ModelRenderer(this);
		bone27_r3.setRotationPoint(0.0588F, 6.2715F, 13.5265F);
		bone27.addChild(bone27_r3);
		setRotationAngle(bone27_r3, -0.0436F, -0.0436F, 0.0F);
		bone27_r3.setTextureOffset(275, 240).addBox(0.819F, -7.4159F, -14.3753F, 1.0F, 4.0F, 28.0F, 0.0F, false);

		bone27_r4 = new ModelRenderer(this);
		bone27_r4.setRotationPoint(0.0588F, 5.4107F, 13.8115F);
		bone27.addChild(bone27_r4);
		setRotationAngle(bone27_r4, 0.0F, -0.0436F, 0.0F);
		bone27_r4.setTextureOffset(202, 252).addBox(0.799F, -8.5033F, -14.3448F, 1.0F, 4.0F, 29.0F, 0.0F, false);

		bone40 = new ModelRenderer(this);
		bone40.setRotationPoint(-3.6512F, -12.2708F, -92.8396F);
		qiang.addChild(bone40);
		setRotationAngle(bone40, -0.0436F, -0.2182F, -0.3054F);

		bone40_r1 = new ModelRenderer(this);
		bone40_r1.setRotationPoint(0.6912F, 5.4107F, 14.3115F);
		bone40.addChild(bone40_r1);
		setRotationAngle(bone40_r1, 0.0F, 0.0436F, 0.0F);
		bone40_r1.setTextureOffset(185, 98).addBox(-3.2064F, -6.0656F, -15.2533F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		bone40_r1.setTextureOffset(41, 89).addBox(-2.1411F, -6.5871F, -15.508F, 1.0F, 3.0F, 1.0F, 0.0F, false);

		bone40_r2 = new ModelRenderer(this);
		bone40_r2.setRotationPoint(-1.672F, 0.3103F, 28.6199F);
		bone40.addChild(bone40_r2);
		setRotationAngle(bone40_r2, -0.7854F, 0.0436F, 0.0F);
		bone40_r2.setTextureOffset(391, 365).addBox(0.4386F, -2.6747F, -2.1377F, 1.0F, 6.0F, 4.0F, 0.0F, false);

		bone40_r3 = new ModelRenderer(this);
		bone40_r3.setRotationPoint(-0.0588F, 6.2715F, 13.5265F);
		bone40.addChild(bone40_r3);
		setRotationAngle(bone40_r3, -0.0436F, 0.0436F, 0.0F);
		bone40_r3.setTextureOffset(0, 268).addBox(-1.819F, -7.4159F, -14.3753F, 1.0F, 4.0F, 28.0F, 0.0F, false);

		bone40_r4 = new ModelRenderer(this);
		bone40_r4.setRotationPoint(-0.0588F, 5.4107F, 13.8115F);
		bone40.addChild(bone40_r4);
		setRotationAngle(bone40_r4, 0.0F, 0.0436F, 0.0F);
		bone40_r4.setTextureOffset(96, 252).addBox(-1.839F, -8.5033F, -14.3448F, 1.0F, 4.0F, 29.0F, 0.0F, false);

		bone28 = new ModelRenderer(this);
		bone28.setRotationPoint(0.3488F, -12.2708F, -80.8396F);
		qiang.addChild(bone28);
		setRotationAngle(bone28, -0.0436F, 0.2182F, 0.3054F);

		bone28_r1 = new ModelRenderer(this);
		bone28_r1.setRotationPoint(-0.6912F, 5.4107F, 14.3115F);
		bone28.addChild(bone28_r1);
		setRotationAngle(bone28_r1, 0.0F, -0.0436F, 0.0F);
		bone28_r1.setTextureOffset(60, 185).addBox(1.3551F, -6.375F, -15.101F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		bone28_r1.setTextureOffset(84, 0).addBox(1.2898F, -6.8965F, -15.3557F, 1.0F, 3.0F, 1.0F, 0.0F, false);

		bone28_r2 = new ModelRenderer(this);
		bone28_r2.setRotationPoint(1.672F, 0.3103F, 28.6199F);
		bone28.addChild(bone28_r2);
		setRotationAngle(bone28_r2, -0.7854F, -0.0436F, 0.0F);
		bone28_r2.setTextureOffset(392, 103).addBox(-0.5F, -3.0012F, -2.2488F, 1.0F, 6.0F, 4.0F, 0.0F, false);

		bone28_r3 = new ModelRenderer(this);
		bone28_r3.setRotationPoint(0.0588F, 6.2715F, 13.5265F);
		bone28.addChild(bone28_r3);
		setRotationAngle(bone28_r3, -0.0436F, -0.0436F, 0.0F);
		bone28_r3.setTextureOffset(275, 240).addBox(1.7576F, -7.7316F, -14.2366F, 1.0F, 4.0F, 28.0F, 0.0F, false);

		bone28_r4 = new ModelRenderer(this);
		bone28_r4.setRotationPoint(0.0588F, 5.4107F, 13.8115F);
		bone28.addChild(bone28_r4);
		setRotationAngle(bone28_r4, 0.0F, -0.0436F, 0.0F);
		bone28_r4.setTextureOffset(202, 252).addBox(1.7376F, -8.8128F, -14.1925F, 1.0F, 4.0F, 29.0F, 0.0F, false);

		bone41 = new ModelRenderer(this);
		bone41.setRotationPoint(-2.6512F, -12.2708F, -80.8396F);
		qiang.addChild(bone41);
		setRotationAngle(bone41, -0.0436F, -0.2182F, -0.3054F);

		bone41_r1 = new ModelRenderer(this);
		bone41_r1.setRotationPoint(0.6912F, 5.4107F, 14.3115F);
		bone41.addChild(bone41_r1);
		setRotationAngle(bone41_r1, 0.0F, 0.0436F, 0.0F);
		bone41_r1.setTextureOffset(179, 98).addBox(-4.1451F, -6.375F, -15.101F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		bone41_r1.setTextureOffset(77, 0).addBox(-3.0798F, -6.8965F, -15.3557F, 1.0F, 3.0F, 1.0F, 0.0F, false);

		bone41_r2 = new ModelRenderer(this);
		bone41_r2.setRotationPoint(-1.672F, 0.3103F, 28.6199F);
		bone41.addChild(bone41_r2);
		setRotationAngle(bone41_r2, -0.7854F, 0.0436F, 0.0F);
		bone41_r2.setTextureOffset(391, 365).addBox(-0.5F, -3.0012F, -2.2488F, 1.0F, 6.0F, 4.0F, 0.0F, false);

		bone41_r3 = new ModelRenderer(this);
		bone41_r3.setRotationPoint(-0.0588F, 6.2715F, 13.5265F);
		bone41.addChild(bone41_r3);
		setRotationAngle(bone41_r3, -0.0436F, 0.0436F, 0.0F);
		bone41_r3.setTextureOffset(0, 268).addBox(-2.7576F, -7.7316F, -14.2366F, 1.0F, 4.0F, 28.0F, 0.0F, false);

		bone41_r4 = new ModelRenderer(this);
		bone41_r4.setRotationPoint(-0.0588F, 5.4107F, 13.8115F);
		bone41.addChild(bone41_r4);
		setRotationAngle(bone41_r4, 0.0F, 0.0436F, 0.0F);
		bone41_r4.setTextureOffset(96, 252).addBox(-2.7776F, -8.8128F, -14.1925F, 1.0F, 4.0F, 29.0F, 0.0F, false);

		bone25 = new ModelRenderer(this);
		bone25.setRotationPoint(1.3867F, -22.3617F, -32.1676F);
		qiang.addChild(bone25);
		setRotationAngle(bone25, 0.0436F, 0.3054F, 0.0873F);
		bone25.setTextureOffset(366, 320).addBox(2.164F, -7.3048F, 6.5688F, 1.0F, 5.0F, 18.0F, 0.0F, false);

		bone25_r1 = new ModelRenderer(this);
		bone25_r1.setRotationPoint(-6.816F, -4.2725F, 4.5667F);
		bone25.addChild(bone25_r1);
		setRotationAngle(bone25_r1, 0.5236F, 0.0F, 0.0F);
		bone25_r1.setTextureOffset(20, 386).addBox(8.98F, -1.625F, -5.5F, 1.0F, 5.0F, 8.0F, 0.0F, false);

		bone25_r2 = new ModelRenderer(this);
		bone25_r2.setRotationPoint(2.684F, -2.6796F, 13.5446F);
		bone25.addChild(bone25_r2);
		setRotationAngle(bone25_r2, 0.2182F, 0.0F, 0.0F);
		bone25_r2.setTextureOffset(151, 115).addBox(-2.54F, -2.09F, -14.625F, 3.0F, 3.0F, 2.0F, 0.0F, false);
		bone25_r2.setTextureOffset(297, 134).addBox(-0.54F, -2.09F, -13.625F, 1.0F, 5.0F, 25.0F, 0.0F, false);

		bone58 = new ModelRenderer(this);
		bone58.setRotationPoint(-3.6892F, -22.3617F, -32.1676F);
		qiang.addChild(bone58);
		setRotationAngle(bone58, 0.0436F, -0.3054F, -0.0873F);
		bone58.setTextureOffset(28, 363).addBox(-3.204F, -7.3048F, 6.5688F, 1.0F, 5.0F, 18.0F, 0.0F, false);

		bone58_r1 = new ModelRenderer(this);
		bone58_r1.setRotationPoint(6.816F, -4.2725F, 4.5667F);
		bone58.addChild(bone58_r1);
		setRotationAngle(bone58_r1, 0.5236F, 0.0F, 0.0F);
		bone58_r1.setTextureOffset(327, 56).addBox(-10.02F, -1.625F, -5.5F, 1.0F, 5.0F, 8.0F, 0.0F, false);

		bone58_r2 = new ModelRenderer(this);
		bone58_r2.setRotationPoint(-2.684F, -2.6796F, 13.5446F);
		bone58.addChild(bone58_r2);
		setRotationAngle(bone58_r2, 0.2182F, 0.0F, 0.0F);
		bone58_r2.setTextureOffset(112, 117).addBox(-1.04F, -2.09F, -14.625F, 3.0F, 3.0F, 2.0F, 0.0F, false);
		bone58_r2.setTextureOffset(293, 104).addBox(-0.54F, -2.09F, -13.625F, 1.0F, 5.0F, 25.0F, 0.0F, false);

		bone21 = new ModelRenderer(this);
		bone21.setRotationPoint(-0.6512F, -15.3542F, -124.7967F);
		qiang.addChild(bone21);
		bone21.setTextureOffset(502, 0).addBox(-2.5F, 1.5F, 0.7071F, 1.0F, 5.0F, 1.0F, 0.0F, false);
		bone21.setTextureOffset(506, 0).addBox(-1.5F, 6.13F, 0.7071F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		bone21.setTextureOffset(502, 0).addBox(0.5F, 1.5F, 0.7071F, 1.0F, 5.0F, 1.0F, 0.0F, false);

		bone21_r1 = new ModelRenderer(this);
		bone21_r1.setRotationPoint(3.0F, 1.5F, 1.0F);
		bone21.addChild(bone21_r1);
		setRotationAngle(bone21_r1, 0.7854F, 0.0F, 0.0F);
		bone21_r1.setTextureOffset(504, 11).addBox(-2.5F, -1.5F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		bone21_r1.setTextureOffset(504, 11).addBox(-5.5F, -1.5F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, false);

		bone10 = new ModelRenderer(this);
		bone10.setRotationPoint(-0.6512F, -15.3542F, -121.7967F);
		qiang.addChild(bone10);
		bone10.setTextureOffset(502, 0).addBox(-2.5F, 1.5F, 0.7071F, 1.0F, 5.0F, 1.0F, 0.0F, false);
		bone10.setTextureOffset(506, 0).addBox(-1.5F, 6.13F, 0.7071F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		bone10.setTextureOffset(502, 0).addBox(0.5F, 1.5F, 0.7071F, 1.0F, 5.0F, 1.0F, 0.0F, false);

		bone10_r1 = new ModelRenderer(this);
		bone10_r1.setRotationPoint(3.0F, 1.5F, 1.0F);
		bone10.addChild(bone10_r1);
		setRotationAngle(bone10_r1, 0.7854F, 0.0F, 0.0F);
		bone10_r1.setTextureOffset(504, 11).addBox(-2.5F, -1.5F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		bone10_r1.setTextureOffset(504, 11).addBox(-5.5F, -1.5F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, false);

		bone22 = new ModelRenderer(this);
		bone22.setRotationPoint(-0.6512F, -15.3542F, -118.7967F);
		qiang.addChild(bone22);
		bone22.setTextureOffset(502, 0).addBox(-2.5F, 1.5F, 0.7071F, 1.0F, 5.0F, 1.0F, 0.0F, false);
		bone22.setTextureOffset(506, 0).addBox(-1.5F, 6.13F, 0.7071F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		bone22.setTextureOffset(502, 0).addBox(0.5F, 1.5F, 0.7071F, 1.0F, 5.0F, 1.0F, 0.0F, false);

		bone22_r1 = new ModelRenderer(this);
		bone22_r1.setRotationPoint(3.0F, 1.5F, 1.0F);
		bone22.addChild(bone22_r1);
		setRotationAngle(bone22_r1, 0.7854F, 0.0F, 0.0F);
		bone22_r1.setTextureOffset(504, 11).addBox(-2.5F, -1.5F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		bone22_r1.setTextureOffset(504, 11).addBox(-5.5F, -1.5F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, false);

		bone23 = new ModelRenderer(this);
		bone23.setRotationPoint(-0.6512F, -15.3542F, -115.7967F);
		qiang.addChild(bone23);
		bone23.setTextureOffset(502, 0).addBox(-2.5F, 1.5F, 0.7071F, 1.0F, 5.0F, 1.0F, 0.0F, false);
		bone23.setTextureOffset(506, 0).addBox(-1.5F, 6.13F, 0.7071F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		bone23.setTextureOffset(502, 0).addBox(0.5F, 1.5F, 0.7071F, 1.0F, 5.0F, 1.0F, 0.0F, false);

		bone23_r1 = new ModelRenderer(this);
		bone23_r1.setRotationPoint(3.0F, 1.5F, 1.0F);
		bone23.addChild(bone23_r1);
		setRotationAngle(bone23_r1, 0.7854F, 0.0F, 0.0F);
		bone23_r1.setTextureOffset(504, 11).addBox(-2.5F, -1.5F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		bone23_r1.setTextureOffset(504, 11).addBox(-5.5F, -1.5F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, false);

		bone88 = new ModelRenderer(this);
		bone88.setRotationPoint(4.0988F, -16.5122F, -45.5057F);
		qiang.addChild(bone88);
		setRotationAngle(bone88, -0.1745F, 0.5236F, -0.2618F);

		bone88_r1 = new ModelRenderer(this);
		bone88_r1.setRotationPoint(0.7191F, 4.4094F, 3.292F);
		bone88.addChild(bone88_r1);
		setRotationAngle(bone88_r1, 0.9599F, 0.0F, 0.0F);
		bone88_r1.setTextureOffset(227, 417).addBox(-0.76F, -2.5F, -9.525F, 1.0F, 4.0F, 15.0F, 0.0F, false);

		bone88_r2 = new ModelRenderer(this);
		bone88_r2.setRotationPoint(0.7191F, 0.7584F, 2.8721F);
		bone88.addChild(bone88_r2);
		setRotationAngle(bone88_r2, 1.1781F, 0.0F, 0.0F);
		bone88_r2.setTextureOffset(384, 343).addBox(-0.77F, -3.0F, -12.875F, 1.0F, 4.0F, 18.0F, 0.0F, false);

		bone88_r3 = new ModelRenderer(this);
		bone88_r3.setRotationPoint(0.7191F, -0.4012F, 5.9616F);
		bone88.addChild(bone88_r3);
		setRotationAngle(bone88_r3, 1.7017F, 0.0F, 0.0F);
		bone88_r3.setTextureOffset(340, 490).addBox(-0.75F, -3.0F, -1.625F, 1.0F, 5.0F, 7.0F, 0.0F, false);

		bone91 = new ModelRenderer(this);
		bone91.setRotationPoint(-6.4012F, -16.5122F, -45.5057F);
		qiang.addChild(bone91);
		setRotationAngle(bone91, -0.1745F, -0.5236F, 0.2618F);

		bone91_r1 = new ModelRenderer(this);
		bone91_r1.setRotationPoint(-0.7191F, 4.4094F, 3.292F);
		bone91.addChild(bone91_r1);
		setRotationAngle(bone91_r1, 0.9599F, 0.0F, 0.0F);
		bone91_r1.setTextureOffset(348, 415).addBox(-0.44F, -2.5F, -9.525F, 1.0F, 4.0F, 15.0F, 0.0F, false);

		bone91_r2 = new ModelRenderer(this);
		bone91_r2.setRotationPoint(-0.7191F, 0.7584F, 2.8721F);
		bone91.addChild(bone91_r2);
		setRotationAngle(bone91_r2, 1.1781F, 0.0F, 0.0F);
		bone91_r2.setTextureOffset(150, 383).addBox(-0.45F, -3.0F, -12.875F, 1.0F, 4.0F, 18.0F, 0.0F, false);

		bone91_r3 = new ModelRenderer(this);
		bone91_r3.setRotationPoint(-0.7191F, -0.4012F, 5.9616F);
		bone91.addChild(bone91_r3);
		setRotationAngle(bone91_r3, 1.7017F, 0.0F, 0.0F);
		bone91_r3.setTextureOffset(291, 490).addBox(-0.43F, -3.0F, -1.625F, 1.0F, 5.0F, 7.0F, 0.0F, false);

		bone89 = new ModelRenderer(this);
		bone89.setRotationPoint(4.0988F, -17.5122F, -39.5057F);
		qiang.addChild(bone89);
		setRotationAngle(bone89, -0.1745F, 0.5236F, -0.2618F);

		bone89_r1 = new ModelRenderer(this);
		bone89_r1.setRotationPoint(0.7191F, 4.4094F, 3.292F);
		bone89.addChild(bone89_r1);
		setRotationAngle(bone89_r1, 0.9599F, 0.0F, 0.0F);
		bone89_r1.setTextureOffset(409, 52).addBox(-0.76F, -2.5F, -9.525F, 1.0F, 4.0F, 15.0F, 0.0F, true);

		bone89_r2 = new ModelRenderer(this);
		bone89_r2.setRotationPoint(0.7191F, 0.7584F, 2.8721F);
		bone89.addChild(bone89_r2);
		setRotationAngle(bone89_r2, 1.1781F, 0.0F, 0.0F);
		bone89_r2.setTextureOffset(366, 5).addBox(-0.77F, -3.0F, -12.875F, 1.0F, 4.0F, 18.0F, 0.0F, true);

		bone89_r3 = new ModelRenderer(this);
		bone89_r3.setRotationPoint(0.7191F, -0.4012F, 5.9616F);
		bone89.addChild(bone89_r3);
		setRotationAngle(bone89_r3, 1.7017F, 0.0F, 0.0F);
		bone89_r3.setTextureOffset(267, 301).addBox(-0.75F, -3.0F, -1.625F, 1.0F, 5.0F, 7.0F, 0.0F, true);

		bone92 = new ModelRenderer(this);
		bone92.setRotationPoint(-6.4012F, -17.5122F, -39.5057F);
		qiang.addChild(bone92);
		setRotationAngle(bone92, -0.1745F, -0.5236F, 0.2618F);

		bone92_r1 = new ModelRenderer(this);
		bone92_r1.setRotationPoint(-0.7191F, 4.4094F, 3.292F);
		bone92.addChild(bone92_r1);
		setRotationAngle(bone92_r1, 0.9599F, 0.0F, 0.0F);
		bone92_r1.setTextureOffset(409, 52).addBox(-0.44F, -2.5F, -9.525F, 1.0F, 4.0F, 15.0F, 0.0F, false);

		bone92_r2 = new ModelRenderer(this);
		bone92_r2.setRotationPoint(-0.7191F, 0.7584F, 2.8721F);
		bone92.addChild(bone92_r2);
		setRotationAngle(bone92_r2, 1.1781F, 0.0F, 0.0F);
		bone92_r2.setTextureOffset(366, 5).addBox(-0.45F, -3.0F, -12.875F, 1.0F, 4.0F, 18.0F, 0.0F, false);

		bone92_r3 = new ModelRenderer(this);
		bone92_r3.setRotationPoint(-0.7191F, -0.4012F, 5.9616F);
		bone92.addChild(bone92_r3);
		setRotationAngle(bone92_r3, 1.7017F, 0.0F, 0.0F);
		bone92_r3.setTextureOffset(267, 301).addBox(-0.43F, -3.0F, -1.625F, 1.0F, 5.0F, 7.0F, 0.0F, false);

		bone90 = new ModelRenderer(this);
		bone90.setRotationPoint(4.0988F, -18.5122F, -33.5057F);
		qiang.addChild(bone90);
		setRotationAngle(bone90, -0.1745F, 0.5236F, -0.2618F);

		bone90_r1 = new ModelRenderer(this);
		bone90_r1.setRotationPoint(0.7191F, 4.4094F, 3.292F);
		bone90.addChild(bone90_r1);
		setRotationAngle(bone90_r1, 0.9599F, 0.0F, 0.0F);
		bone90_r1.setTextureOffset(409, 52).addBox(-0.76F, -2.5F, -9.525F, 1.0F, 4.0F, 15.0F, 0.0F, true);

		bone90_r2 = new ModelRenderer(this);
		bone90_r2.setRotationPoint(0.7191F, 0.7584F, 2.8721F);
		bone90.addChild(bone90_r2);
		setRotationAngle(bone90_r2, 1.1781F, 0.0F, 0.0F);
		bone90_r2.setTextureOffset(366, 5).addBox(-0.77F, -3.0F, -12.875F, 1.0F, 4.0F, 18.0F, 0.0F, true);

		bone90_r3 = new ModelRenderer(this);
		bone90_r3.setRotationPoint(0.7191F, -0.4012F, 5.9616F);
		bone90.addChild(bone90_r3);
		setRotationAngle(bone90_r3, 1.7017F, 0.0F, 0.0F);
		bone90_r3.setTextureOffset(267, 301).addBox(-0.75F, -3.0F, -1.625F, 1.0F, 5.0F, 7.0F, 0.0F, true);

		bone93 = new ModelRenderer(this);
		bone93.setRotationPoint(-6.4012F, -18.5122F, -33.5057F);
		qiang.addChild(bone93);
		setRotationAngle(bone93, -0.1745F, -0.5236F, 0.2618F);

		bone93_r1 = new ModelRenderer(this);
		bone93_r1.setRotationPoint(-0.7191F, 4.4094F, 3.292F);
		bone93.addChild(bone93_r1);
		setRotationAngle(bone93_r1, 0.9599F, 0.0F, 0.0F);
		bone93_r1.setTextureOffset(409, 52).addBox(-0.44F, -2.5F, -9.525F, 1.0F, 4.0F, 15.0F, 0.0F, false);

		bone93_r2 = new ModelRenderer(this);
		bone93_r2.setRotationPoint(-0.7191F, 0.7584F, 2.8721F);
		bone93.addChild(bone93_r2);
		setRotationAngle(bone93_r2, 1.1781F, 0.0F, 0.0F);
		bone93_r2.setTextureOffset(366, 5).addBox(-0.45F, -3.0F, -12.875F, 1.0F, 4.0F, 18.0F, 0.0F, false);
		bone93_r2.setTextureOffset(366, 5).addBox(-0.45F, -3.0F, -12.875F, 1.0F, 4.0F, 18.0F, 0.0F, false);

		bone93_r3 = new ModelRenderer(this);
		bone93_r3.setRotationPoint(-0.7191F, -0.4012F, 5.9616F);
		bone93.addChild(bone93_r3);
		setRotationAngle(bone93_r3, 1.7017F, 0.0F, 0.0F);
		bone93_r3.setTextureOffset(267, 301).addBox(-0.43F, -3.0F, -1.625F, 1.0F, 5.0F, 7.0F, 0.0F, false);

		bone85 = new ModelRenderer(this);
		bone85.setRotationPoint(-1.1512F, -2.7184F, -46.3623F);
		qiang.addChild(bone85);

		bone85_r1 = new ModelRenderer(this);
		bone85_r1.setRotationPoint(-5.0F, -0.8092F, -0.2553F);
		bone85.addChild(bone85_r1);
		setRotationAngle(bone85_r1, 0.0F, 0.1309F, 0.0F);
		bone85_r1.setTextureOffset(180, 36).addBox(0.75F, 8.7824F, -34.592F, 1.0F, 6.0F, 2.0F, 0.0F, false);

		bone85_r2 = new ModelRenderer(this);
		bone85_r2.setRotationPoint(5.0F, -0.8092F, -0.2553F);
		bone85.addChild(bone85_r2);
		setRotationAngle(bone85_r2, 0.0F, -0.1309F, 0.0F);
		bone85_r2.setTextureOffset(78, 265).addBox(-2.25F, 8.7824F, -34.592F, 1.0F, 6.0F, 2.0F, 0.0F, false);

		bone85_r3 = new ModelRenderer(this);
		bone85_r3.setRotationPoint(-5.0F, -0.8092F, -0.2553F);
		bone85.addChild(bone85_r3);
		setRotationAngle(bone85_r3, 0.7418F, 0.1309F, 0.0F);
		bone85_r3.setTextureOffset(66, 58).addBox(0.5F, -11.358F, -18.639F, 1.0F, 3.0F, 1.0F, 0.0F, false);

		bone85_r4 = new ModelRenderer(this);
		bone85_r4.setRotationPoint(5.0F, -0.8092F, -0.2553F);
		bone85.addChild(bone85_r4);
		setRotationAngle(bone85_r4, 0.7418F, -0.1309F, 0.0F);
		bone85_r4.setTextureOffset(72, 58).addBox(-2.25F, -11.358F, -18.639F, 1.0F, 3.0F, 1.0F, 0.0F, false);

		bone85_r5 = new ModelRenderer(this);
		bone85_r5.setRotationPoint(-5.0F, -0.8092F, -0.2553F);
		bone85.addChild(bone85_r5);
		setRotationAngle(bone85_r5, 1.2217F, 0.1309F, 0.0F);
		bone85_r5.setTextureOffset(99, 105).addBox(1.0F, -17.684F, -10.3082F, 1.0F, 2.0F, 3.0F, 0.0F, false);

		bone85_r6 = new ModelRenderer(this);
		bone85_r6.setRotationPoint(5.0F, -0.8092F, -0.2553F);
		bone85.addChild(bone85_r6);
		setRotationAngle(bone85_r6, 1.2217F, -0.1309F, 0.0F);
		bone85_r6.setTextureOffset(237, 94).addBox(-2.0F, -17.684F, -10.3082F, 1.0F, 2.0F, 3.0F, 0.0F, false);

		bone85_r7 = new ModelRenderer(this);
		bone85_r7.setRotationPoint(-5.0F, -0.8092F, -0.2553F);
		bone85.addChild(bone85_r7);
		setRotationAngle(bone85_r7, 0.5672F, 0.1309F, 0.0F);
		bone85_r7.setTextureOffset(17, 241).addBox(1.0F, -7.2155F, -2.2152F, 1.0F, 7.0F, 2.0F, 0.0F, false);

		bone85_r8 = new ModelRenderer(this);
		bone85_r8.setRotationPoint(5.0F, -0.8092F, -0.2553F);
		bone85.addChild(bone85_r8);
		setRotationAngle(bone85_r8, 0.5672F, -0.1309F, 0.0F);
		bone85_r8.setTextureOffset(246, 172).addBox(-2.0F, -7.2155F, -2.2152F, 1.0F, 7.0F, 2.0F, 0.0F, false);

		bone85_r9 = new ModelRenderer(this);
		bone85_r9.setRotationPoint(-5.0F, -0.8092F, -0.2553F);
		bone85.addChild(bone85_r9);
		setRotationAngle(bone85_r9, -0.2182F, 0.1309F, 0.0F);
		bone85_r9.setTextureOffset(337, 473).addBox(1.0F, -0.177F, -9.8778F, 1.0F, 8.0F, 9.0F, 0.0F, false);

		bone85_r10 = new ModelRenderer(this);
		bone85_r10.setRotationPoint(5.0F, -0.8092F, -0.2553F);
		bone85.addChild(bone85_r10);
		setRotationAngle(bone85_r10, -0.2182F, -0.1309F, 0.0F);
		bone85_r10.setTextureOffset(404, 473).addBox(-2.0F, -0.177F, -9.8778F, 1.0F, 8.0F, 9.0F, 0.0F, false);

		bone85_r11 = new ModelRenderer(this);
		bone85_r11.setRotationPoint(-5.0F, -0.8092F, -0.2553F);
		bone85.addChild(bone85_r11);
		setRotationAngle(bone85_r11, 0.3927F, 0.1309F, 0.0F);
		bone85_r11.setTextureOffset(0, 202).addBox(0.98F, -4.1119F, -35.4687F, 1.0F, 5.0F, 34.0F, 0.0F, false);
		bone85_r11.setTextureOffset(406, 6).addBox(0.98F, -7.1119F, -17.4687F, 1.0F, 3.0F, 16.0F, 0.0F, false);

		bone85_r12 = new ModelRenderer(this);
		bone85_r12.setRotationPoint(5.0F, -0.8092F, -0.2553F);
		bone85.addChild(bone85_r12);
		setRotationAngle(bone85_r12, 0.3927F, -0.1309F, 0.0F);
		bone85_r12.setTextureOffset(204, 0).addBox(-2.02F, -4.1119F, -35.4687F, 1.0F, 5.0F, 34.0F, 0.0F, false);
		bone85_r12.setTextureOffset(100, 407).addBox(-2.02F, -7.1119F, -17.4687F, 1.0F, 3.0F, 16.0F, 0.0F, false);

		bone87 = new ModelRenderer(this);
		bone87.setRotationPoint(-1.6512F, -34.4573F, -32.1232F);
		qiang.addChild(bone87);

		bone87_r1 = new ModelRenderer(this);
		bone87_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone87.addChild(bone87_r1);
		setRotationAngle(bone87_r1, 0.1745F, 0.0F, 0.0F);
		bone87_r1.setTextureOffset(212, 417).addBox(-3.04F, 3.125F, -11.25F, 7.0F, 4.0F, 8.0F, 0.0F, false);

		bone87_r2 = new ModelRenderer(this);
		bone87_r2.setRotationPoint(0.0F, 5.3084F, -10.0202F);
		bone87.addChild(bone87_r2);
		setRotationAngle(bone87_r2, 0.7854F, 0.0F, 0.0F);
		bone87_r2.setTextureOffset(50, 105).addBox(-3.02F, -1.375F, -2.75F, 7.0F, 4.0F, 3.0F, 0.0F, false);
		bone87_r2.setTextureOffset(266, 64).addBox(-3.02F, -1.375F, -5.75F, 7.0F, 1.0F, 3.0F, 0.0F, false);

		bone87_r3 = new ModelRenderer(this);
		bone87_r3.setRotationPoint(0.0F, 3.024F, 2.1015F);
		bone87.addChild(bone87_r3);
		setRotationAngle(bone87_r3, 0.5236F, 0.0F, 0.0F);
		bone87_r3.setTextureOffset(0, 403).addBox(-3.02F, -1.625F, -5.5F, 7.0F, 4.0F, 12.0F, 0.0F, false);

		bone87_r4 = new ModelRenderer(this);
		bone87_r4.setRotationPoint(0.0F, 2.3567F, -2.0708F);
		bone87.addChild(bone87_r4);
		setRotationAngle(bone87_r4, 0.1745F, 0.0F, 0.0F);
		bone87_r4.setTextureOffset(304, 164).addBox(-3.04F, -2.625F, -10.75F, 7.0F, 4.0F, 21.0F, 0.0F, false);

		bone87_r5 = new ModelRenderer(this);
		bone87_r5.setRotationPoint(1.0F, 12.9945F, -18.5751F);
		bone87.addChild(bone87_r5);
		setRotationAngle(bone87_r5, 0.5672F, 0.0F, 0.0F);
		bone87_r5.setTextureOffset(30, 288).addBox(-4.55F, -3.75F, 3.25F, 1.0F, 3.0F, 5.0F, 0.0F, false);
		bone87_r5.setTextureOffset(342, 192).addBox(2.45F, -3.75F, 3.25F, 1.0F, 3.0F, 5.0F, 0.0F, false);

		bone87_r6 = new ModelRenderer(this);
		bone87_r6.setRotationPoint(0.5F, 3.5052F, -12.4712F);
		bone87.addChild(bone87_r6);
		setRotationAngle(bone87_r6, -0.1745F, 0.0F, 0.0F);
		bone87_r6.setTextureOffset(47, 58).addBox(-4.02F, -2.125F, -1.75F, 1.0F, 6.0F, 3.0F, 0.0F, false);
		bone87_r6.setTextureOffset(152, 187).addBox(2.98F, -2.125F, -1.75F, 1.0F, 6.0F, 3.0F, 0.0F, false);

		bone87_r7 = new ModelRenderer(this);
		bone87_r7.setRotationPoint(0.5F, -2.3284F, -12.307F);
		bone87.addChild(bone87_r7);
		setRotationAngle(bone87_r7, 0.0436F, 0.0F, 0.0F);
		bone87_r7.setTextureOffset(183, 115).addBox(-4.05F, 2.875F, -1.75F, 8.0F, 1.0F, 3.0F, 0.0F, false);

		bone86 = new ModelRenderer(this);
		bone86.setRotationPoint(-1.1512F, -8.6435F, -0.0078F);
		qiang.addChild(bone86);
		bone86.setTextureOffset(110, 0).addBox(3.46F, 30.4395F, -15.5441F, 1.0F, 6.0F, 5.0F, 0.0F, false);
		bone86.setTextureOffset(0, 17).addBox(-3.54F, 35.4395F, -12.0441F, 7.0F, 1.0F, 1.0F, 0.0F, false);
		bone86.setTextureOffset(77, 0).addBox(-4.75F, 30.4395F, -15.5441F, 1.0F, 6.0F, 5.0F, 0.0F, false);

		bone86_r1 = new ModelRenderer(this);
		bone86_r1.setRotationPoint(0.0F, 2.0F, -3.0F);
		bone86.addChild(bone86_r1);
		setRotationAngle(bone86_r1, -0.3491F, 0.0F, 0.0F);
		bone86_r1.setTextureOffset(476, 357).addBox(-2.02F, -5.5F, -1.0F, 4.0F, 9.0F, 6.0F, 0.0F, false);

		bone86_r2 = new ModelRenderer(this);
		bone86_r2.setRotationPoint(0.0F, 9.8916F, -2.5292F);
		bone86.addChild(bone86_r2);
		setRotationAngle(bone86_r2, 0.3054F, 0.0F, 0.0F);
		bone86_r2.setTextureOffset(314, 454).addBox(-2.0F, -5.5F, -1.0F, 4.0F, 17.0F, 6.0F, 0.0F, false);

		bone86_r3 = new ModelRenderer(this);
		bone86_r3.setRotationPoint(0.5F, 9.8916F, -2.5292F);
		bone86.addChild(bone86_r3);
		setRotationAngle(bone86_r3, 0.3927F, 0.0F, 0.0F);
		bone86_r3.setTextureOffset(54, 386).addBox(-2.0F, -5.5F, 4.0F, 3.0F, 17.0F, 2.0F, 0.0F, false);

		bone86_r4 = new ModelRenderer(this);
		bone86_r4.setRotationPoint(-4.0F, 26.6365F, -6.6672F);
		bone86.addChild(bone86_r4);
		setRotationAngle(bone86_r4, 0.2182F, 0.0F, 0.0F);
		bone86_r4.setTextureOffset(293, 428).addBox(-0.71F, -1.5F, -9.5F, 1.0F, 4.0F, 14.0F, 0.0F, false);
		bone86_r4.setTextureOffset(428, 406).addBox(7.5F, -1.5F, -9.5F, 1.0F, 4.0F, 14.0F, 0.0F, false);

		bone86_r5 = new ModelRenderer(this);
		bone86_r5.setRotationPoint(-4.0F, 21.0971F, 5.615F);
		bone86.addChild(bone86_r5);
		setRotationAngle(bone86_r5, 0.6109F, 0.0F, 0.0F);
		bone86_r5.setTextureOffset(282, 1).addBox(-0.73F, -1.5F, -21.75F, 1.0F, 5.0F, 26.0F, 0.0F, false);
		bone86_r5.setTextureOffset(0, 241).addBox(0.48F, 2.5F, -21.75F, 7.0F, 1.0F, 26.0F, 0.0F, false);
		bone86_r5.setTextureOffset(239, 287).addBox(7.48F, -1.5F, -21.75F, 1.0F, 5.0F, 26.0F, 0.0F, false);

		bone86_r6 = new ModelRenderer(this);
		bone86_r6.setRotationPoint(-4.0F, 24.1767F, -0.8443F);
		bone86.addChild(bone86_r6);
		setRotationAngle(bone86_r6, 1.2217F, 0.0F, 0.0F);
		bone86_r6.setTextureOffset(357, 380).addBox(-0.71F, -1.5F, -1.79F, 1.0F, 4.0F, 6.0F, 0.0F, false);
		bone86_r6.setTextureOffset(195, 414).addBox(7.5F, -1.5F, -1.79F, 1.0F, 4.0F, 6.0F, 0.0F, false);

		bone86_r7 = new ModelRenderer(this);
		bone86_r7.setRotationPoint(-4.0F, 19.6365F, 4.3328F);
		bone86.addChild(bone86_r7);
		setRotationAngle(bone86_r7, 0.2182F, 0.0F, 0.0F);
		bone86_r7.setTextureOffset(480, 147).addBox(-0.71F, -1.5F, -4.79F, 1.0F, 4.0F, 9.0F, 0.0F, false);
		bone86_r7.setTextureOffset(480, 195).addBox(7.5F, -1.5F, -4.79F, 1.0F, 4.0F, 9.0F, 0.0F, false);

		bone86_r8 = new ModelRenderer(this);
		bone86_r8.setRotationPoint(0.5F, 7.8916F, -2.2792F);
		bone86.addChild(bone86_r8);
		setRotationAngle(bone86_r8, 0.3927F, 0.0F, 0.0F);
		bone86_r8.setTextureOffset(457, 363).addBox(-3.0F, 13.5F, -3.75F, 5.0F, 4.0F, 9.0F, 0.0F, false);

		dao = new ModelRenderer(this);
		dao.setRotationPoint(4.6896F, 13.6252F, -0.864F);
		bone43.addChild(dao);
		dao.setTextureOffset(0, 165).addBox(-0.9169F, -4.5536F, -17.655F, 3.0F, 2.0F, 35.0F, 0.0F, false);
		dao.setTextureOffset(430, 90).addBox(-0.9169F, -2.8036F, 4.345F, 3.0F, 3.0F, 13.0F, 0.0F, false);
		dao.setTextureOffset(161, 225).addBox(0.103F, -2.0536F, -16.655F, 1.0F, 2.0F, 34.0F, 0.0F, false);

		dao_r1 = new ModelRenderer(this);
		dao_r1.setRotationPoint(-0.397F, 7.6919F, 13.333F);
		dao.addChild(dao_r1);
		setRotationAngle(dao_r1, 0.829F, 0.0F, 0.0F);
		dao_r1.setTextureOffset(80, 198).addBox(-1.25F, -9.9237F, 9.1965F, 4.0F, 12.0F, 3.0F, 0.0F, false);

		dao_r2 = new ModelRenderer(this);
		dao_r2.setRotationPoint(-0.397F, 7.9419F, 13.833F);
		dao.addChild(dao_r2);
		setRotationAngle(dao_r2, 0.9163F, 0.0F, 0.0F);
		dao_r2.setTextureOffset(343, 219).addBox(0.0F, -6.9237F, 7.9465F, 2.0F, 8.0F, 2.0F, 0.0F, false);

		dao_r3 = new ModelRenderer(this);
		dao_r3.setRotationPoint(-0.397F, 8.4419F, -17.167F);
		dao.addChild(dao_r3);
		setRotationAngle(dao_r3, 1.0036F, 0.0F, 0.0F);
		dao_r3.setTextureOffset(26, 403).addBox(0.0F, -1.75F, 11.0F, 2.0F, 8.0F, 3.0F, 0.0F, false);

		dao_r4 = new ModelRenderer(this);
		dao_r4.setRotationPoint(0.603F, 1.624F, -17.0797F);
		dao.addChild(dao_r4);
		setRotationAngle(dao_r4, -1.0036F, 0.0F, 0.0F);
		dao_r4.setTextureOffset(234, 370).addBox(-3.0F, 0.25F, -2.0F, 6.0F, 2.0F, 4.0F, 0.0F, false);
		dao_r4.setTextureOffset(458, 179).addBox(-3.0F, -2.75F, -6.0F, 6.0F, 3.0F, 8.0F, 0.0F, false);

		dao_r5 = new ModelRenderer(this);
		dao_r5.setRotationPoint(-0.897F, -10.549F, -23.667F);
		dao.addChild(dao_r5);
		setRotationAngle(dao_r5, -1.0036F, 0.0F, 0.0F);
		dao_r5.setTextureOffset(12, 457).addBox(-1.0F, -0.5F, 9.0F, 5.0F, 5.0F, 9.0F, 0.0F, false);
		dao_r5.setTextureOffset(0, 381).addBox(0.0F, 0.5F, 10.0F, 3.0F, 10.0F, 6.0F, 0.0F, false);

		dao_r6 = new ModelRenderer(this);
		dao_r6.setRotationPoint(-0.397F, -10.549F, -24.167F);
		dao.addChild(dao_r6);
		setRotationAngle(dao_r6, -1.0036F, 0.0F, 0.0F);
		dao_r6.setTextureOffset(309, 434).addBox(-1.25F, -4.5F, 7.0F, 4.0F, 3.0F, 5.0F, 0.0F, false);

		dao_r7 = new ModelRenderer(this);
		dao_r7.setRotationPoint(-0.397F, 8.4419F, -23.667F);
		dao.addChild(dao_r7);
		setRotationAngle(dao_r7, 1.0036F, 0.0F, 0.0F);
		dao_r7.setTextureOffset(198, 433).addBox(0.0F, 0.5F, 11.0F, 2.0F, 6.0F, 3.0F, 0.0F, false);

		dao_r8 = new ModelRenderer(this);
		dao_r8.setRotationPoint(-0.397F, 8.4419F, -10.667F);
		dao.addChild(dao_r8);
		setRotationAngle(dao_r8, 1.0036F, 0.0F, 0.0F);
		dao_r8.setTextureOffset(405, 143).addBox(0.0F, -1.75F, 11.0F, 2.0F, 8.0F, 3.0F, 0.0F, false);

		dao_r9 = new ModelRenderer(this);
		dao_r9.setRotationPoint(-0.897F, 8.3432F, -4.5172F);
		dao.addChild(dao_r9);
		setRotationAngle(dao_r9, 1.0036F, 0.0F, 0.0F);
		dao_r9.setTextureOffset(233, 270).addBox(0.0F, -1.75F, 12.5F, 3.0F, 5.0F, 1.0F, 0.0F, false);
		dao_r9.setTextureOffset(184, 293).addBox(-0.01F, -1.75F, 11.0F, 3.0F, 5.0F, 1.0F, 0.0F, false);

		dao_r10 = new ModelRenderer(this);
		dao_r10.setRotationPoint(0.603F, -8.556F, -33.7884F);
		dao.addChild(dao_r10);
		setRotationAngle(dao_r10, -0.5236F, 0.0F, 0.0F);
		dao_r10.setTextureOffset(446, 472).addBox(-2.0F, -7.75F, 10.0F, 4.0F, 15.0F, 5.0F, 0.0F, false);

		dao_r11 = new ModelRenderer(this);
		dao_r11.setRotationPoint(-0.397F, -11.358F, -30.8744F);
		dao.addChild(dao_r11);
		setRotationAngle(dao_r11, -0.5236F, 0.0F, 0.0F);
		dao_r11.setTextureOffset(416, 25).addBox(-2.02F, -5.0F, 12.0F, 6.0F, 6.0F, 2.0F, 0.0F, false);

		dao_r12 = new ModelRenderer(this);
		dao_r12.setRotationPoint(0.2746F, -4.7607F, 0.345F);
		dao.addChild(dao_r12);
		setRotationAngle(dao_r12, 0.0F, 0.0F, 0.7854F);
		dao_r12.setTextureOffset(41, 198).addBox(-0.3284F, -0.7929F, -18.0F, 2.0F, 2.0F, 35.0F, 0.0F, false);

		bone55 = new ModelRenderer(this);
		bone55.setRotationPoint(-0.897F, 5.9419F, 12.083F);
		dao.addChild(bone55);

		bone55_r1 = new ModelRenderer(this);
		bone55_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone55.addChild(bone55_r1);
		setRotationAngle(bone55_r1, 0.829F, 0.0F, 0.0F);
		bone55_r1.setTextureOffset(317, 65).addBox(-0.02F, 5.5763F, 11.4465F, 3.0F, 2.0F, 4.0F, 0.0F, false);
		bone55_r1.setTextureOffset(432, 196).addBox(0.0F, -1.9237F, 13.4465F, 3.0F, 7.0F, 2.0F, 0.0F, false);

		bone55_r2 = new ModelRenderer(this);
		bone55_r2.setRotationPoint(2.0F, -5.6552F, 14.1018F);
		bone55.addChild(bone55_r2);
		setRotationAngle(bone55_r2, 0.4363F, 0.0F, 0.0F);
		bone55_r2.setTextureOffset(89, 314).addBox(-2.0F, -2.5F, 1.25F, 3.0F, 3.0F, 1.0F, 0.0F, false);

		bone55_r3 = new ModelRenderer(this);
		bone55_r3.setRotationPoint(2.0F, -7.1196F, 13.5477F);
		bone55.addChild(bone55_r3);
		setRotationAngle(bone55_r3, 0.9861F, 0.0F, 0.0F);
		bone55_r3.setTextureOffset(0, 241).addBox(-2.02F, -7.0F, 1.25F, 3.0F, 7.0F, 1.0F, 0.0F, false);

		bone55_r4 = new ModelRenderer(this);
		bone55_r4.setRotationPoint(0.5F, 1.25F, 1.25F);
		bone55.addChild(bone55_r4);
		setRotationAngle(bone55_r4, 0.829F, 0.0F, 0.0F);
		bone55_r4.setTextureOffset(237, 151).addBox(0.0F, -3.4237F, 11.6965F, 2.0F, 7.0F, 2.0F, 0.0F, false);

		bone48 = new ModelRenderer(this);
		bone48.setRotationPoint(0.603F, 4.5717F, -22.6025F);
		dao.addChild(bone48);

		bone48_r1 = new ModelRenderer(this);
		bone48_r1.setRotationPoint(0.0F, 16.5F, 9.5F);
		bone48.addChild(bone48_r1);
		setRotationAngle(bone48_r1, -2.1817F, 0.0F, 0.0F);
		bone48_r1.setTextureOffset(275, 240).addBox(-1.0F, -6.5242F, 0.434F, 2.0F, 6.0F, 4.0F, 0.0F, false);

		bone48_r2 = new ModelRenderer(this);
		bone48_r2.setRotationPoint(0.5F, 16.0F, 10.0F);
		bone48.addChild(bone48_r2);
		setRotationAngle(bone48_r2, 0.7854F, 0.0F, 0.0F);
		bone48_r2.setTextureOffset(225, 464).addBox(-3.5F, -12.3808F, -3.6589F, 6.0F, 17.0F, 4.0F, 0.0F, false);

		bone48_r3 = new ModelRenderer(this);
		bone48_r3.setRotationPoint(0.5F, 16.0F, 10.0F);
		bone48.addChild(bone48_r3);
		setRotationAngle(bone48_r3, 0.2618F, 0.0F, 0.0F);
		bone48_r3.setTextureOffset(221, 485).addBox(-3.5F, -18.4635F, -9.3591F, 6.0F, 9.0F, 4.0F, 0.0F, false);

		bone48_r4 = new ModelRenderer(this);
		bone48_r4.setRotationPoint(0.5F, 16.0F, 10.0F);
		bone48.addChild(bone48_r4);
		setRotationAngle(bone48_r4, 0.6109F, 0.0F, 0.0F);
		bone48_r4.setTextureOffset(228, 436).addBox(-3.52F, -19.1534F, -2.6398F, 6.0F, 24.0F, 4.0F, 0.0F, false);

		bone49 = new ModelRenderer(this);
		bone49.setRotationPoint(0.0F, 24.1179F, 12.5549F);
		bone48.addChild(bone49);

		bone49_r1 = new ModelRenderer(this);
		bone49_r1.setRotationPoint(0.5F, -3.9238F, -0.656F);
		bone49.addChild(bone49_r1);
		setRotationAngle(bone49_r1, -2.8798F, 0.0F, 0.0F);
		bone49_r1.setTextureOffset(372, 299).addBox(-2.5F, -4.885F, -3.5872F, 4.0F, 8.0F, 3.0F, 0.0F, false);

		bone49_r2 = new ModelRenderer(this);
		bone49_r2.setRotationPoint(0.5F, -3.9238F, -0.656F);
		bone49.addChild(bone49_r2);
		setRotationAngle(bone49_r2, -2.3562F, 0.0F, 0.0F);
		bone49_r2.setTextureOffset(12, 485).addBox(-2.5F, -20.5242F, -1.0661F, 4.0F, 16.0F, 3.0F, 0.0F, false);

		bone49_r3 = new ModelRenderer(this);
		bone49_r3.setRotationPoint(0.5F, -3.9238F, -0.656F);
		bone49.addChild(bone49_r3);
		setRotationAngle(bone49_r3, -2.5307F, 0.0F, 0.0F);
		bone49_r3.setTextureOffset(284, 466).addBox(-2.52F, -20.2737F, -4.6172F, 4.0F, 23.0F, 3.0F, 0.0F, false);

		bone50 = new ModelRenderer(this);
		bone50.setRotationPoint(0.603F, -11.556F, -39.7884F);
		dao.addChild(bone50);
		bone50.setTextureOffset(456, 260).addBox(-2.02F, 3.2524F, -18.1167F, 4.0F, 5.0F, 10.0F, 0.0F, false);
		bone50.setTextureOffset(365, 365).addBox(-2.52F, 3.2524F, -2.8667F, 5.0F, 5.0F, 16.0F, 0.0F, false);

		bone50_r1 = new ModelRenderer(this);
		bone50_r1.setRotationPoint(-0.5F, 0.0F, -21.0F);
		bone50.addChild(bone50_r1);
		setRotationAngle(bone50_r1, -0.5236F, 0.0F, 0.0F);
		bone50_r1.setTextureOffset(481, 507).addBox(-1.5F, -3.75F, 13.0F, 4.0F, 4.0F, 2.0F, 0.0F, false);

		bone50_r2 = new ModelRenderer(this);
		bone50_r2.setRotationPoint(-0.5F, 0.0F, 0.0F);
		bone50.addChild(bone50_r2);
		setRotationAngle(bone50_r2, -0.5236F, 0.0F, 0.0F);
		bone50_r2.setTextureOffset(409, 61).addBox(-2.0F, -3.75F, 13.0F, 5.0F, 4.0F, 2.0F, 0.0F, false);

		bone50_r3 = new ModelRenderer(this);
		bone50_r3.setRotationPoint(-0.5F, 0.0F, -31.25F);
		bone50.addChild(bone50_r3);
		setRotationAngle(bone50_r3, -0.5236F, 0.0F, 0.0F);
		bone50_r3.setTextureOffset(481, 500).addBox(-1.5F, -3.75F, 13.0F, 4.0F, 4.0F, 2.0F, 0.0F, false);

		bone50_r4 = new ModelRenderer(this);
		bone50_r4.setRotationPoint(-0.5F, 0.0F, -16.0F);
		bone50.addChild(bone50_r4);
		setRotationAngle(bone50_r4, -0.5236F, 0.0F, 0.0F);
		bone50_r4.setTextureOffset(419, 260).addBox(-2.0F, -3.75F, 13.0F, 5.0F, 4.0F, 2.0F, 0.0F, false);

		bone51 = new ModelRenderer(this);
		bone51.setRotationPoint(0.5883F, 2.4501F, -24.2327F);
		dao.addChild(bone51);
		bone51.setTextureOffset(60, 452).addBox(-0.5052F, -9.2537F, -8.4223F, 1.0F, 12.0F, 10.0F, 0.0F, false);

		bone51_r1 = new ModelRenderer(this);
		bone51_r1.setRotationPoint(-2.5042F, -5.5061F, -21.8056F);
		bone51.addChild(bone51_r1);
		setRotationAngle(bone51_r1, -0.5236F, 0.0F, 0.0F);
		bone51_r1.setTextureOffset(497, 10).addBox(2.0F, 1.4378F, 9.75F, 1.0F, 3.0F, 5.0F, 0.0F, false);

		bone51_r2 = new ModelRenderer(this);
		bone51_r2.setRotationPoint(-2.5042F, -5.5061F, -21.5556F);
		bone51.addChild(bone51_r2);
		setRotationAngle(bone51_r2, -0.5236F, 0.0F, 0.0F);
		bone51_r2.setTextureOffset(489, 15).addBox(2.0F, -9.8122F, 9.5F, 1.0F, 10.0F, 6.0F, 0.0F, false);

		bone52 = new ModelRenderer(this);
		bone52.setRotationPoint(-0.0042F, -0.0493F, -13.6726F);
		bone51.addChild(bone52);
		bone52.setTextureOffset(270, 154).addBox(-0.501F, -9.2043F, -13.7496F, 1.0F, 12.0F, 11.0F, 0.0F, false);

		bone52_r1 = new ModelRenderer(this);
		bone52_r1.setRotationPoint(-2.5F, -2.4567F, 7.117F);
		bone52.addChild(bone52_r1);
		setRotationAngle(bone52_r1, -0.5236F, 0.0F, 0.0F);
		bone52_r1.setTextureOffset(64, 488).addBox(2.0F, -0.9103F, -11.9186F, 1.0F, 10.0F, 6.0F, 0.0F, false);

		bone52_r2 = new ModelRenderer(this);
		bone52_r2.setRotationPoint(-2.5F, -5.4567F, -27.133F);
		bone52.addChild(bone52_r2);
		setRotationAngle(bone52_r2, -0.5236F, 0.0F, 0.0F);
		bone52_r2.setTextureOffset(453, 419).addBox(2.0F, 1.4378F, 9.75F, 1.0F, 3.0F, 5.0F, 0.0F, false);

		bone52_r3 = new ModelRenderer(this);
		bone52_r3.setRotationPoint(-2.5F, -5.4567F, -26.883F);
		bone52.addChild(bone52_r3);
		setRotationAngle(bone52_r3, -0.5236F, 0.0F, 0.0F);
		bone52_r3.setTextureOffset(488, 419).addBox(2.0F, -9.8122F, 9.5F, 1.0F, 10.0F, 6.0F, 0.0F, false);

		bone53 = new ModelRenderer(this);
		bone53.setRotationPoint(0.0035F, -0.1394F, -19.1475F);
		bone52.addChild(bone53);
		bone53.setTextureOffset(0, 58).addBox(-0.5045F, -9.065F, -22.6021F, 1.0F, 12.0F, 20.0F, 0.0F, false);

		bone53_r1 = new ModelRenderer(this);
		bone53_r1.setRotationPoint(-2.5035F, -5.3174F, -35.9855F);
		bone53.addChild(bone53_r1);
		setRotationAngle(bone53_r1, -0.5236F, 0.0F, 0.0F);
		bone53_r1.setTextureOffset(449, 270).addBox(2.0F, 1.4378F, 9.75F, 1.0F, 3.0F, 5.0F, 0.0F, false);

		bone53_r2 = new ModelRenderer(this);
		bone53_r2.setRotationPoint(-2.5035F, -5.3174F, -15.7355F);
		bone53.addChild(bone53_r2);
		setRotationAngle(bone53_r2, -0.5236F, 0.0F, 0.0F);
		bone53_r2.setTextureOffset(486, 372).addBox(2.0F, -9.8122F, 9.5F, 1.0F, 10.0F, 6.0F, 0.0F, false);

		bone53_r3 = new ModelRenderer(this);
		bone53_r3.setRotationPoint(-2.5035F, -5.3174F, -35.7355F);
		bone53.addChild(bone53_r3);
		setRotationAngle(bone53_r3, -0.5236F, 0.0F, 0.0F);
		bone53_r3.setTextureOffset(436, 487).addBox(2.0F, -9.8122F, 9.5F, 1.0F, 10.0F, 6.0F, 0.0F, false);

		bone54 = new ModelRenderer(this);
		bone54.setRotationPoint(-0.0007F, 0.1843F, -28.0006F);
		bone53.addChild(bone54);
		bone54.setTextureOffset(0, 0).addBox(-0.5038F, -9.2493F, -124.6016F, 1.0F, 12.0F, 122.0F, 0.0F, false);
		bone54.setTextureOffset(474, 269).addBox(-0.5028F, -10.7642F, -141.2932F, 1.0F, 3.0F, 10.0F, 0.0F, false);

		bone54_r1 = new ModelRenderer(this);
		bone54_r1.setRotationPoint(-2.5028F, -1.795F, -114.3519F);
		bone54.addChild(bone54_r1);
		setRotationAngle(bone54_r1, 1.0036F, 0.0F, 0.0F);
		bone54_r1.setTextureOffset(114, 98).addBox(2.0F, -22.8122F, -7.375F, 1.0F, 9.0F, 3.0F, 0.0F, false);
		bone54_r1.setTextureOffset(240, 0).addBox(2.0F, -18.8122F, -4.375F, 1.0F, 5.0F, 3.0F, 0.0F, false);
		bone54_r1.setTextureOffset(40, 251).addBox(2.0F, -25.8122F, -9.625F, 1.0F, 12.0F, 2.0F, 0.0F, false);

		bone54_r2 = new ModelRenderer(this);
		bone54_r2.setRotationPoint(-2.5028F, -5.545F, -120.1019F);
		bone54.addChild(bone54_r2);
		setRotationAngle(bone54_r2, 1.0036F, 0.0F, 0.0F);
		bone54_r2.setTextureOffset(391, 464).addBox(2.0F, -5.8122F, -9.625F, 1.0F, 6.0F, 10.0F, 0.0F, false);

		bone54_r3 = new ModelRenderer(this);
		bone54_r3.setRotationPoint(-2.5028F, -5.5017F, -15.7349F);
		bone54.addChild(bone54_r3);
		setRotationAngle(bone54_r3, -0.5236F, 0.0F, 0.0F);
		bone54_r3.setTextureOffset(348, 413).addBox(2.0F, -9.8122F, 9.5F, 1.0F, 10.0F, 6.0F, 0.0F, false);

		bone44 = new ModelRenderer(this);
		bone44.setRotationPoint(4.25F, 6.75F, -1.75F);
		bone43.addChild(bone44);
		setRotationAngle(bone44, -0.2182F, 0.0F, 0.0F);

		bone44_r1 = new ModelRenderer(this);
		bone44_r1.setRotationPoint(0.0F, 2.0F, -1.0F);
		bone44.addChild(bone44_r1);
		setRotationAngle(bone44_r1, 0.1309F, 0.0F, 0.3927F);
		bone44_r1.setTextureOffset(0, 105).addBox(4.4849F, 0.5127F, -6.4631F, 2.0F, 6.0F, 2.0F, 0.0F, true);

		bone44_r2 = new ModelRenderer(this);
		bone44_r2.setRotationPoint(0.0F, 2.0F, -1.0F);
		bone44.addChild(bone44_r2);
		setRotationAngle(bone44_r2, 0.333F, -0.6715F, -1.9845F);
		bone44_r2.setTextureOffset(171, 98).addBox(-7.5354F, 2.3424F, -3.9407F, 3.0F, 2.0F, 1.0F, 0.0F, true);
		bone44_r2.setTextureOffset(275, 262).addBox(-6.5354F, 0.3424F, -3.4407F, 8.0F, 3.0F, 3.0F, 0.0F, true);

		bone44_r3 = new ModelRenderer(this);
		bone44_r3.setRotationPoint(2.2292F, -0.0158F, -3.5371F);
		bone44.addChild(bone44_r3);
		setRotationAngle(bone44_r3, 0.6515F, -0.001F, -1.7728F);
		bone44_r3.setTextureOffset(82, 349).addBox(-1.477F, -2.3083F, -0.391F, 3.0F, 3.0F, 2.0F, 0.0F, true);

		bone44_r4 = new ModelRenderer(this);
		bone44_r4.setRotationPoint(0.0F, 2.0F, -1.0F);
		bone44.addChild(bone44_r4);
		setRotationAngle(bone44_r4, 0.2588F, -0.001F, -1.7728F);
		bone44_r4.setTextureOffset(321, 377).addBox(-0.8349F, 0.3424F, -5.0015F, 4.0F, 3.0F, 3.0F, 0.0F, true);

		bone45 = new ModelRenderer(this);
		bone45.setRotationPoint(1.75F, 13.25F, -4.0F);
		bone43.addChild(bone45);
		setRotationAngle(bone45, -0.0873F, 0.0F, 0.0F);

		bone45_r1 = new ModelRenderer(this);
		bone45_r1.setRotationPoint(1.5F, 6.4704F, 1.7706F);
		bone45.addChild(bone45_r1);
		setRotationAngle(bone45_r1, 0.0F, 0.0F, -1.5708F);
		bone45_r1.setTextureOffset(363, 434).addBox(0.6109F, -3.2672F, -3.1975F, 5.0F, 3.0F, 3.0F, 0.0F, true);
		bone45_r1.setTextureOffset(21, 229).addBox(3.6109F, -3.7672F, -2.6975F, 4.0F, 3.0F, 2.0F, 0.0F, true);

		bone133 = new ModelRenderer(this);
		bone133.setRotationPoint(0.1122F, 5.1399F, 0.0595F);
		bone45.addChild(bone133);

		bone133_r1 = new ModelRenderer(this);
		bone133_r1.setRotationPoint(4.3878F, 3.5805F, 1.711F);
		bone133.addChild(bone133_r1);
		setRotationAngle(bone133_r1, 0.0F, 0.0F, -2.2689F);
		bone133_r1.setTextureOffset(149, 252).addBox(0.6109F, -3.0172F, -2.9475F, 5.0F, 2.0F, 2.0F, 0.0F, true);

		bone133_r2 = new ModelRenderer(this);
		bone133_r2.setRotationPoint(6.8878F, 1.0805F, 1.211F);
		bone133.addChild(bone133_r2);
		setRotationAngle(bone133_r2, 0.0F, 0.0F, 2.8362F);
		bone133_r2.setTextureOffset(307, 55).addBox(0.6109F, -3.2672F, -2.1975F, 5.0F, 3.0F, 2.0F, 0.0F, true);

		bone46 = new ModelRenderer(this);
		bone46.setRotationPoint(2.0F, 13.25F, 1.0F);
		bone43.addChild(bone46);
		setRotationAngle(bone46, 0.0436F, 0.0873F, 0.0F);

		bone46_r1 = new ModelRenderer(this);
		bone46_r1.setRotationPoint(1.2836F, 7.3585F, -0.2701F);
		bone46.addChild(bone46_r1);
		setRotationAngle(bone46_r1, 0.0F, 0.0F, -1.5708F);
		bone46_r1.setTextureOffset(467, 342).addBox(0.5255F, -3.5021F, -3.2013F, 7.0F, 3.0F, 7.0F, 0.0F, true);
		bone46_r1.setTextureOffset(494, 480).addBox(5.1109F, -3.9072F, -2.9475F, 2.0F, 3.0F, 6.0F, 0.0F, true);

		bone132 = new ModelRenderer(this);
		bone132.setRotationPoint(-1.2615F, 7.6344F, 0.2304F);
		bone46.addChild(bone132);

		bone132_r1 = new ModelRenderer(this);
		bone132_r1.setRotationPoint(8.045F, -0.5259F, -1.0005F);
		bone132.addChild(bone132_r1);
		setRotationAngle(bone132_r1, 0.0F, 0.0F, 2.8362F);
		bone132_r1.setTextureOffset(78, 281).addBox(0.6109F, -2.7672F, -2.1975F, 5.0F, 2.0F, 6.0F, 0.0F, true);

		bone132_r2 = new ModelRenderer(this);
		bone132_r2.setRotationPoint(5.545F, 1.9741F, -0.5005F);
		bone132.addChild(bone132_r2);
		setRotationAngle(bone132_r2, 0.0F, 0.0F, -2.2689F);
		bone132_r2.setTextureOffset(419, 157).addBox(0.6109F, -3.0172F, -2.9475F, 5.0F, 2.0F, 6.0F, 0.0F, true);

		youshou = new ModelRenderer(this);
		youshou.setRotationPoint(13.6156F, -22.0038F, -3.4792F);
		shangbanshen.addChild(youshou);
		setRotationAngle(youshou, 0.0873F, -0.1309F, 0.0F);
		youshou.setTextureOffset(390, 260).addBox(12.9472F, -5.2504F, -5.9246F, 10.0F, 11.0F, 9.0F, 0.0F, false);
		youshou.setTextureOffset(280, 308).addBox(21.8326F, -15.0457F, -12.9246F, 12.0F, 17.0F, 13.0F, 0.0F, false);
		youshou.setTextureOffset(41, 165).addBox(21.8326F, -7.5457F, -13.9246F, 9.0F, 5.0F, 15.0F, 0.0F, false);

		youshou_r1 = new ModelRenderer(this);
		youshou_r1.setRotationPoint(34.7472F, -7.5231F, -6.3399F);
		youshou.addChild(youshou_r1);
		setRotationAngle(youshou_r1, 0.0F, 0.0F, -0.6981F);
		youshou_r1.setTextureOffset(90, 148).addBox(-4.4663F, 9.9958F, 4.4053F, 7.0F, 3.0F, 3.0F, 0.0F, false);
		youshou_r1.setTextureOffset(356, 106).addBox(-4.4663F, 9.9958F, -7.5947F, 7.0F, 3.0F, 3.0F, 0.0F, false);
		youshou_r1.setTextureOffset(222, 400).addBox(-17.4031F, -5.0042F, 4.4053F, 14.0F, 12.0F, 5.0F, 0.0F, false);
		youshou_r1.setTextureOffset(222, 318).addBox(-12.4031F, -14.0042F, 4.4053F, 15.0F, 19.0F, 10.0F, 0.0F, false);
		youshou_r1.setTextureOffset(166, 430).addBox(-6.4031F, -4.0042F, 4.4053F, 13.0F, 14.0F, 3.0F, 0.0F, false);
		youshou_r1.setTextureOffset(412, 52).addBox(5.5969F, 3.9958F, -8.0947F, 2.0F, 4.0F, 4.0F, 0.0F, false);
		youshou_r1.setTextureOffset(420, 420).addBox(5.5969F, -6.0042F, -8.0947F, 2.0F, 4.0F, 4.0F, 0.0F, false);
		youshou_r1.setTextureOffset(431, 240).addBox(-6.4031F, -4.0042F, -7.6147F, 13.0F, 14.0F, 3.0F, 0.0F, false);
		youshou_r1.setTextureOffset(365, 82).addBox(-2.4031F, -11.0042F, -3.5847F, 13.0F, 13.0F, 8.0F, 0.0F, false);
		youshou_r1.setTextureOffset(124, 38).addBox(-9.4031F, -20.0042F, -7.5847F, 16.0F, 3.0F, 15.0F, 0.0F, false);
		youshou_r1.setTextureOffset(389, 215).addBox(5.5969F, -7.0042F, -5.5847F, 3.0F, 19.0F, 11.0F, 0.0F, false);
		youshou_r1.setTextureOffset(451, 432).addBox(1.5011F, -20.6363F, -8.3447F, 3.0F, 3.0F, 11.0F, 0.0F, false);
		youshou_r1.setTextureOffset(452, 246).addBox(-7.4989F, -20.6363F, -8.3447F, 3.0F, 3.0F, 11.0F, 0.0F, false);
		youshou_r1.setTextureOffset(55, 237).addBox(-13.4989F, -17.1363F, -7.6147F, 20.0F, 13.0F, 15.0F, 0.0F, false);

		youshou_r2 = new ModelRenderer(this);
		youshou_r2.setRotationPoint(34.7472F, -7.5231F, -6.3399F);
		youshou.addChild(youshou_r2);
		setRotationAngle(youshou_r2, 0.0F, 0.0F, 0.0873F);
		youshou_r2.setTextureOffset(483, 208).addBox(6.9043F, -6.0819F, -3.5847F, 2.0F, 2.0F, 8.0F, 0.0F, false);
		youshou_r2.setTextureOffset(470, 115).addBox(-5.8879F, -15.2743F, -3.5847F, 5.0F, 3.0F, 8.0F, 0.0F, false);
		youshou_r2.setTextureOffset(454, 376).addBox(-2.4736F, -11.0316F, -5.5847F, 3.0F, 1.0F, 11.0F, 0.0F, false);

		youshou_r3 = new ModelRenderer(this);
		youshou_r3.setRotationPoint(34.7472F, -7.5231F, -6.3399F);
		youshou.addChild(youshou_r3);
		setRotationAngle(youshou_r3, 0.0F, 0.0F, 0.1309F);
		youshou_r3.setTextureOffset(245, 470).addBox(13.0524F, 0.766F, -3.5847F, 2.0F, 13.0F, 7.0F, 0.0F, false);
		youshou_r3.setTextureOffset(158, 261).addBox(11.0524F, 1.766F, -5.5847F, 3.0F, 11.0F, 11.0F, 0.0F, false);
		youshou_r3.setTextureOffset(120, 161).addBox(0.478F, 1.8893F, -7.5847F, 11.0F, 4.0F, 15.0F, 0.0F, false);

		youshou_r4 = new ModelRenderer(this);
		youshou_r4.setRotationPoint(34.7472F, -7.5231F, -6.3399F);
		youshou.addChild(youshou_r4);
		setRotationAngle(youshou_r4, 0.0F, 0.0F, 0.3054F);
		youshou_r4.setTextureOffset(149, 448).addBox(4.99F, 7.6962F, 4.4153F, 3.0F, 3.0F, 3.0F, 0.0F, false);
		youshou_r4.setTextureOffset(449, 97).addBox(4.99F, 7.4462F, -7.5847F, 3.0F, 3.0F, 3.0F, 0.0F, false);

		youshou_r5 = new ModelRenderer(this);
		youshou_r5.setRotationPoint(35.0036F, -9.7019F, 3.5804F);
		youshou.addChild(youshou_r5);
		setRotationAngle(youshou_r5, 0.3927F, 0.0F, -2.2689F);
		youshou_r5.setTextureOffset(75, 442).addBox(-3.5F, -1.0F, -5.015F, 6.0F, 4.0F, 10.0F, 0.0F, false);

		youshou_r6 = new ModelRenderer(this);
		youshou_r6.setRotationPoint(34.2024F, -0.5445F, 3.5804F);
		youshou.addChild(youshou_r6);
		setRotationAngle(youshou_r6, 0.3927F, 0.0F, -0.6981F);
		youshou_r6.setTextureOffset(339, 170).addBox(-3.5F, -2.0F, -5.015F, 7.0F, 4.0F, 10.0F, 0.0F, false);

		youshou_r7 = new ModelRenderer(this);
		youshou_r7.setRotationPoint(25.045F, -1.3456F, 3.5804F);
		youshou.addChild(youshou_r7);
		setRotationAngle(youshou_r7, -0.3927F, 0.0F, -2.2689F);
		youshou_r7.setTextureOffset(12, 443).addBox(-3.5F, -3.0F, -5.015F, 6.0F, 4.0F, 10.0F, 0.0F, false);

		youshou_r8 = new ModelRenderer(this);
		youshou_r8.setRotationPoint(25.8462F, -10.503F, 3.5804F);
		youshou.addChild(youshou_r8);
		setRotationAngle(youshou_r8, -0.3927F, 0.0F, -0.6981F);
		youshou_r8.setTextureOffset(431, 285).addBox(-3.5F, -8.0F, -7.265F, 7.0F, 4.0F, 10.0F, 0.0F, false);

		youshou_r9 = new ModelRenderer(this);
		youshou_r9.setRotationPoint(34.7472F, -7.5231F, -6.3399F);
		youshou.addChild(youshou_r9);
		setRotationAngle(youshou_r9, 0.0F, 0.0F, -1.309F);
		youshou_r9.setTextureOffset(233, 252).addBox(-1.2287F, -21.7799F, -7.5847F, 5.0F, 3.0F, 15.0F, 0.0F, false);

		youshou_r10 = new ModelRenderer(this);
		youshou_r10.setRotationPoint(34.6264F, 16.7954F, -6.071F);
		youshou.addChild(youshou_r10);
		setRotationAngle(youshou_r10, 0.3927F, 0.0F, -0.1745F);
		youshou_r10.setTextureOffset(18, 268).addBox(3.0519F, 5.3118F, -6.0127F, 1.0F, 3.0F, 4.0F, 0.0F, false);
		youshou_r10.setTextureOffset(284, 341).addBox(-8.1981F, 5.4618F, -9.0127F, 11.0F, 2.0F, 7.0F, 0.0F, false);
		youshou_r10.setTextureOffset(454, 309).addBox(-7.5438F, -0.6882F, -8.0127F, 9.0F, 7.0F, 6.0F, 0.0F, false);

		youshou_r11 = new ModelRenderer(this);
		youshou_r11.setRotationPoint(34.6264F, 16.7954F, -6.071F);
		youshou.addChild(youshou_r11);
		setRotationAngle(youshou_r11, 0.0F, 0.0F, -0.7418F);
		youshou_r11.setTextureOffset(237, 151).addBox(-8.137F, -18.9577F, -4.431F, 12.0F, 5.0F, 9.0F, 0.0F, false);

		youshou_r12 = new ModelRenderer(this);
		youshou_r12.setRotationPoint(34.6264F, 16.7954F, -6.071F);
		youshou.addChild(youshou_r12);
		setRotationAngle(youshou_r12, 0.0F, -0.829F, 0.0873F);
		youshou_r12.setTextureOffset(495, 40).addBox(8.5291F, -1.0605F, -6.7532F, 2.0F, 3.0F, 6.0F, 0.0F, false);

		youshou_r13 = new ModelRenderer(this);
		youshou_r13.setRotationPoint(34.6264F, 16.7954F, -6.071F);
		youshou.addChild(youshou_r13);
		setRotationAngle(youshou_r13, 0.0F, 0.829F, 0.0873F);
		youshou_r13.setTextureOffset(495, 204).addBox(8.7959F, -1.0605F, 0.0087F, 2.0F, 3.0F, 6.0F, 0.0F, false);

		youshou_r14 = new ModelRenderer(this);
		youshou_r14.setRotationPoint(34.6264F, 16.7954F, -6.071F);
		youshou.addChild(youshou_r14);
		setRotationAngle(youshou_r14, 0.0F, 0.9163F, -0.48F);
		youshou_r14.setTextureOffset(150, 474).addBox(5.8192F, -15.3749F, 1.5272F, 2.0F, 21.0F, 4.0F, 0.0F, false);

		youshou_r15 = new ModelRenderer(this);
		youshou_r15.setRotationPoint(34.6264F, 16.7954F, -6.071F);
		youshou.addChild(youshou_r15);
		setRotationAngle(youshou_r15, 0.0F, -0.9163F, -0.48F);
		youshou_r15.setTextureOffset(162, 474).addBox(5.5321F, -15.3749F, -6.2475F, 2.0F, 21.0F, 4.0F, 0.0F, false);

		youshou_r16 = new ModelRenderer(this);
		youshou_r16.setRotationPoint(34.6264F, 16.7954F, -6.071F);
		youshou.addChild(youshou_r16);
		setRotationAngle(youshou_r16, 0.0F, 0.0F, -0.3927F);
		youshou_r16.setTextureOffset(178, 353).addBox(6.7433F, -16.5872F, -2.931F, 3.0F, 21.0F, 5.0F, 0.0F, false);

		youshou_r17 = new ModelRenderer(this);
		youshou_r17.setRotationPoint(34.6264F, 16.7954F, -6.071F);
		youshou.addChild(youshou_r17);
		setRotationAngle(youshou_r17, 0.0F, 0.0F, 0.0873F);
		youshou_r17.setTextureOffset(174, 447).addBox(9.9301F, -1.0805F, -3.931F, 2.0F, 3.0F, 7.0F, 0.0F, false);

		youshou_r18 = new ModelRenderer(this);
		youshou_r18.setRotationPoint(34.6264F, 16.7954F, -6.071F);
		youshou.addChild(youshou_r18);
		setRotationAngle(youshou_r18, 0.1379F, 0.0024F, 0.1282F);
		youshou_r18.setTextureOffset(469, 242).addBox(-0.7903F, -0.7808F, -3.599F, 5.0F, 7.0F, 7.0F, 0.0F, false);

		youshou_r19 = new ModelRenderer(this);
		youshou_r19.setRotationPoint(34.6264F, 16.7954F, -6.071F);
		youshou.addChild(youshou_r19);
		setRotationAngle(youshou_r19, 0.1214F, 0.0656F, -0.3479F);
		youshou_r19.setTextureOffset(310, 0).addBox(-0.9727F, -13.6058F, -3.599F, 5.0F, 15.0F, 7.0F, 0.0F, false);

		youshou_r20 = new ModelRenderer(this);
		youshou_r20.setRotationPoint(34.6264F, 16.7954F, -6.071F);
		youshou.addChild(youshou_r20);
		setRotationAngle(youshou_r20, 0.1309F, 0.0F, -0.48F);
		youshou_r20.setTextureOffset(470, 90).addBox(-12.649F, 3.5917F, -3.311F, 7.0F, 3.0F, 7.0F, 0.0F, false);

		youshou_r21 = new ModelRenderer(this);
		youshou_r21.setRotationPoint(34.6264F, 16.7954F, -6.071F);
		youshou.addChild(youshou_r21);
		setRotationAngle(youshou_r21, 0.0F, 0.0F, -0.48F);
		youshou_r21.setTextureOffset(404, 395).addBox(-12.0249F, -0.3124F, -1.8009F, 8.0F, 4.0F, 5.0F, 0.0F, false);
		youshou_r21.setTextureOffset(124, 0).addBox(-9.0249F, -13.3123F, -3.431F, 5.0F, 17.0F, 7.0F, 0.0F, false);

		youshou_r22 = new ModelRenderer(this);
		youshou_r22.setRotationPoint(34.6264F, 16.7954F, -6.071F);
		youshou.addChild(youshou_r22);
		setRotationAngle(youshou_r22, 0.7854F, 0.0F, -0.48F);
		youshou_r22.setTextureOffset(361, 66).addBox(-12.0249F, -1.4943F, -1.0526F, 8.0F, 3.0F, 3.0F, 0.0F, false);

		youshou_r23 = new ModelRenderer(this);
		youshou_r23.setRotationPoint(34.6264F, 16.7954F, -6.071F);
		youshou.addChild(youshou_r23);
		setRotationAngle(youshou_r23, -0.0873F, 0.0F, -0.1745F);
		youshou_r23.setTextureOffset(399, 82).addBox(3.0519F, 5.641F, 0.6674F, 1.0F, 3.0F, 5.0F, 0.0F, false);
		youshou_r23.setTextureOffset(320, 341).addBox(-7.9481F, 5.641F, 0.6674F, 11.0F, 3.0F, 6.0F, 0.0F, false);

		youshou_r24 = new ModelRenderer(this);
		youshou_r24.setRotationPoint(31.8805F, 11.2225F, -3.2562F);
		youshou.addChild(youshou_r24);
		setRotationAngle(youshou_r24, -0.1745F, 0.0F, -0.1745F);
		youshou_r24.setTextureOffset(316, 413).addBox(-4.7979F, -1.9186F, -2.2503F, 9.0F, 14.0F, 7.0F, 0.0F, false);

		youshou_r25 = new ModelRenderer(this);
		youshou_r25.setRotationPoint(31.8805F, 11.2225F, -3.2562F);
		youshou.addChild(youshou_r25);
		setRotationAngle(youshou_r25, 0.2182F, 0.0F, -0.1745F);
		youshou_r25.setTextureOffset(224, 377).addBox(-4.8179F, -12.8957F, -4.4157F, 9.0F, 13.0F, 10.0F, 0.0F, false);

		youshou_r26 = new ModelRenderer(this);
		youshou_r26.setRotationPoint(34.6849F, 17.127F, -5.9722F);
		youshou.addChild(youshou_r26);
		setRotationAngle(youshou_r26, -0.1309F, 0.0F, -0.1745F);
		youshou_r26.setTextureOffset(188, 188).addBox(-7.5438F, -17.0427F, -7.4251F, 9.0F, 20.0F, 6.0F, 0.0F, false);

		youshou_r27 = new ModelRenderer(this);
		youshou_r27.setRotationPoint(18.9472F, -0.2504F, -6.4246F);
		youshou.addChild(youshou_r27);
		setRotationAngle(youshou_r27, 0.6109F, 0.0F, 0.0F);
		youshou_r27.setTextureOffset(122, 289).addBox(-1.25F, -7.0F, -7.5F, 5.0F, 13.0F, 21.0F, 0.0F, false);

		youshou_r28 = new ModelRenderer(this);
		youshou_r28.setRotationPoint(15.9472F, -0.2504F, -6.4246F);
		youshou.addChild(youshou_r28);
		setRotationAngle(youshou_r28, -0.1309F, 0.0F, -0.1745F);
		youshou_r28.setTextureOffset(60, 35).addBox(-17.0F, -2.0F, -2.5F, 21.0F, 5.0F, 6.0F, 0.0F, false);
		youshou_r28.setTextureOffset(198, 433).addBox(-8.0F, -7.0F, -0.5F, 5.0F, 8.0F, 10.0F, 0.0F, false);
		youshou_r28.setTextureOffset(0, 105).addBox(-17.0F, -6.0F, 0.5F, 21.0F, 7.0F, 8.0F, 0.0F, false);

		youshou_r29 = new ModelRenderer(this);
		youshou_r29.setRotationPoint(15.9472F, -0.2504F, -6.4246F);
		youshou.addChild(youshou_r29);
		setRotationAngle(youshou_r29, 0.6109F, 0.0F, -0.1745F);
		youshou_r29.setTextureOffset(323, 434).addBox(-6.0F, -6.0F, -1.5F, 6.0F, 12.0F, 8.0F, 0.0F, false);
		youshou_r29.setTextureOffset(291, 75).addBox(-5.0F, -5.0F, -6.5F, 9.0F, 10.0F, 19.0F, 0.0F, false);

		dao2 = new ModelRenderer(this);
		dao2.setRotationPoint(38.9778F, -1.6673F, -5.3496F);
		youshou.addChild(dao2);
		setRotationAngle(dao2, 1.2615F, 3.0918F, -0.4912F);
		dao2.setTextureOffset(0, 165).addBox(-1.02F, -2.6667F, -17.0F, 3.0F, 2.0F, 35.0F, 0.0F, false);
		dao2.setTextureOffset(430, 90).addBox(-1.02F, -0.9167F, 5.0F, 3.0F, 3.0F, 13.0F, 0.0F, false);
		dao2.setTextureOffset(161, 225).addBox(0.0F, -0.1667F, -16.0F, 1.0F, 2.0F, 34.0F, 0.0F, false);

		dao2_r1 = new ModelRenderer(this);
		dao2_r1.setRotationPoint(-0.5F, 9.5788F, 13.988F);
		dao2.addChild(dao2_r1);
		setRotationAngle(dao2_r1, 0.829F, 0.0F, 0.0F);
		dao2_r1.setTextureOffset(80, 198).addBox(-1.25F, -9.9237F, 9.1965F, 4.0F, 12.0F, 3.0F, 0.0F, false);

		dao2_r2 = new ModelRenderer(this);
		dao2_r2.setRotationPoint(-0.5F, 9.8288F, 14.488F);
		dao2.addChild(dao2_r2);
		setRotationAngle(dao2_r2, 0.9163F, 0.0F, 0.0F);
		dao2_r2.setTextureOffset(343, 219).addBox(0.0F, -6.9237F, 7.9465F, 2.0F, 8.0F, 2.0F, 0.0F, false);

		dao2_r3 = new ModelRenderer(this);
		dao2_r3.setRotationPoint(-0.5F, 10.3288F, -16.512F);
		dao2.addChild(dao2_r3);
		setRotationAngle(dao2_r3, 1.0036F, 0.0F, 0.0F);
		dao2_r3.setTextureOffset(26, 403).addBox(0.0F, -1.75F, 11.0F, 2.0F, 8.0F, 3.0F, 0.0F, false);

		dao2_r4 = new ModelRenderer(this);
		dao2_r4.setRotationPoint(0.5F, 3.5109F, -16.4247F);
		dao2.addChild(dao2_r4);
		setRotationAngle(dao2_r4, -1.0036F, 0.0F, 0.0F);
		dao2_r4.setTextureOffset(234, 370).addBox(-3.0F, 0.25F, -2.0F, 6.0F, 2.0F, 4.0F, 0.0F, false);
		dao2_r4.setTextureOffset(458, 179).addBox(-3.0F, -2.75F, -6.0F, 6.0F, 3.0F, 8.0F, 0.0F, false);

		dao2_r5 = new ModelRenderer(this);
		dao2_r5.setRotationPoint(-1.0F, -8.6622F, -23.012F);
		dao2.addChild(dao2_r5);
		setRotationAngle(dao2_r5, -1.0036F, 0.0F, 0.0F);
		dao2_r5.setTextureOffset(12, 457).addBox(-1.0F, -0.5F, 9.0F, 5.0F, 5.0F, 9.0F, 0.0F, false);
		dao2_r5.setTextureOffset(0, 381).addBox(0.0F, 0.5F, 10.0F, 3.0F, 10.0F, 6.0F, 0.0F, false);

		dao2_r6 = new ModelRenderer(this);
		dao2_r6.setRotationPoint(-0.5F, -8.6622F, -23.512F);
		dao2.addChild(dao2_r6);
		setRotationAngle(dao2_r6, -1.0036F, 0.0F, 0.0F);
		dao2_r6.setTextureOffset(309, 434).addBox(-1.25F, -4.5F, 7.0F, 4.0F, 3.0F, 5.0F, 0.0F, false);

		dao2_r7 = new ModelRenderer(this);
		dao2_r7.setRotationPoint(-0.5F, 10.3288F, -23.012F);
		dao2.addChild(dao2_r7);
		setRotationAngle(dao2_r7, 1.0036F, 0.0F, 0.0F);
		dao2_r7.setTextureOffset(198, 433).addBox(0.0F, 0.5F, 11.0F, 2.0F, 6.0F, 3.0F, 0.0F, false);

		dao2_r8 = new ModelRenderer(this);
		dao2_r8.setRotationPoint(-0.5F, 10.3288F, -10.012F);
		dao2.addChild(dao2_r8);
		setRotationAngle(dao2_r8, 1.0036F, 0.0F, 0.0F);
		dao2_r8.setTextureOffset(405, 143).addBox(0.0F, -1.75F, 11.0F, 2.0F, 8.0F, 3.0F, 0.0F, false);

		dao2_r9 = new ModelRenderer(this);
		dao2_r9.setRotationPoint(-1.0F, 10.2301F, -3.8622F);
		dao2.addChild(dao2_r9);
		setRotationAngle(dao2_r9, 1.0036F, 0.0F, 0.0F);
		dao2_r9.setTextureOffset(233, 270).addBox(0.0F, -1.75F, 12.5F, 3.0F, 5.0F, 1.0F, 0.0F, false);
		dao2_r9.setTextureOffset(184, 293).addBox(-0.01F, -1.75F, 11.0F, 3.0F, 5.0F, 1.0F, 0.0F, false);

		dao2_r10 = new ModelRenderer(this);
		dao2_r10.setRotationPoint(0.5F, -6.6691F, -33.1333F);
		dao2.addChild(dao2_r10);
		setRotationAngle(dao2_r10, -0.5236F, 0.0F, 0.0F);
		dao2_r10.setTextureOffset(446, 472).addBox(-2.0F, -7.75F, 10.0F, 4.0F, 15.0F, 5.0F, 0.0F, false);

		dao2_r11 = new ModelRenderer(this);
		dao2_r11.setRotationPoint(-0.5F, -9.4711F, -30.2194F);
		dao2.addChild(dao2_r11);
		setRotationAngle(dao2_r11, -0.5236F, 0.0F, 0.0F);
		dao2_r11.setTextureOffset(416, 25).addBox(-2.02F, -5.0F, 12.0F, 6.0F, 6.0F, 2.0F, 0.0F, false);

		dao2_r12 = new ModelRenderer(this);
		dao2_r12.setRotationPoint(0.1716F, -2.8738F, 1.0F);
		dao2.addChild(dao2_r12);
		setRotationAngle(dao2_r12, 0.0F, 0.0F, 0.7854F);
		dao2_r12.setTextureOffset(41, 198).addBox(-0.3284F, -0.7929F, -18.0F, 2.0F, 2.0F, 35.0F, 0.0F, false);

		bone76 = new ModelRenderer(this);
		bone76.setRotationPoint(-1.0F, 7.8288F, 12.738F);
		dao2.addChild(bone76);

		bone76_r1 = new ModelRenderer(this);
		bone76_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone76.addChild(bone76_r1);
		setRotationAngle(bone76_r1, 0.829F, 0.0F, 0.0F);
		bone76_r1.setTextureOffset(317, 65).addBox(-0.02F, 5.5763F, 11.4465F, 3.0F, 2.0F, 4.0F, 0.0F, false);
		bone76_r1.setTextureOffset(432, 196).addBox(0.0F, -1.9237F, 13.4465F, 3.0F, 7.0F, 2.0F, 0.0F, false);

		bone76_r2 = new ModelRenderer(this);
		bone76_r2.setRotationPoint(2.0F, -5.6552F, 14.1018F);
		bone76.addChild(bone76_r2);
		setRotationAngle(bone76_r2, 0.4363F, 0.0F, 0.0F);
		bone76_r2.setTextureOffset(89, 314).addBox(-2.0F, -2.5F, 1.25F, 3.0F, 3.0F, 1.0F, 0.0F, false);

		bone76_r3 = new ModelRenderer(this);
		bone76_r3.setRotationPoint(2.0F, -7.1196F, 13.5477F);
		bone76.addChild(bone76_r3);
		setRotationAngle(bone76_r3, 0.9861F, 0.0F, 0.0F);
		bone76_r3.setTextureOffset(0, 241).addBox(-2.02F, -7.0F, 1.25F, 3.0F, 7.0F, 1.0F, 0.0F, false);

		bone76_r4 = new ModelRenderer(this);
		bone76_r4.setRotationPoint(0.5F, 1.25F, 1.25F);
		bone76.addChild(bone76_r4);
		setRotationAngle(bone76_r4, 0.829F, 0.0F, 0.0F);
		bone76_r4.setTextureOffset(237, 151).addBox(0.0F, -3.4237F, 11.6965F, 2.0F, 7.0F, 2.0F, 0.0F, false);

		bone77 = new ModelRenderer(this);
		bone77.setRotationPoint(0.5F, 6.4586F, -21.9474F);
		dao2.addChild(bone77);

		bone77_r1 = new ModelRenderer(this);
		bone77_r1.setRotationPoint(0.0F, 16.5F, 9.5F);
		bone77.addChild(bone77_r1);
		setRotationAngle(bone77_r1, -2.1817F, 0.0F, 0.0F);
		bone77_r1.setTextureOffset(275, 240).addBox(-1.0F, -6.5242F, 0.434F, 2.0F, 6.0F, 4.0F, 0.0F, false);

		bone77_r2 = new ModelRenderer(this);
		bone77_r2.setRotationPoint(0.5F, 16.0F, 10.0F);
		bone77.addChild(bone77_r2);
		setRotationAngle(bone77_r2, 0.7854F, 0.0F, 0.0F);
		bone77_r2.setTextureOffset(225, 464).addBox(-3.5F, -12.3808F, -3.6589F, 6.0F, 17.0F, 4.0F, 0.0F, false);

		bone77_r3 = new ModelRenderer(this);
		bone77_r3.setRotationPoint(0.5F, 16.0F, 10.0F);
		bone77.addChild(bone77_r3);
		setRotationAngle(bone77_r3, 0.2618F, 0.0F, 0.0F);
		bone77_r3.setTextureOffset(221, 485).addBox(-3.5F, -18.4635F, -9.3591F, 6.0F, 9.0F, 4.0F, 0.0F, false);

		bone77_r4 = new ModelRenderer(this);
		bone77_r4.setRotationPoint(0.5F, 16.0F, 10.0F);
		bone77.addChild(bone77_r4);
		setRotationAngle(bone77_r4, 0.6109F, 0.0F, 0.0F);
		bone77_r4.setTextureOffset(228, 436).addBox(-3.52F, -19.1534F, -2.6398F, 6.0F, 24.0F, 4.0F, 0.0F, false);

		bone78 = new ModelRenderer(this);
		bone78.setRotationPoint(0.0F, 24.1179F, 12.5549F);
		bone77.addChild(bone78);

		bone78_r1 = new ModelRenderer(this);
		bone78_r1.setRotationPoint(0.5F, -3.9238F, -0.656F);
		bone78.addChild(bone78_r1);
		setRotationAngle(bone78_r1, -2.8798F, 0.0F, 0.0F);
		bone78_r1.setTextureOffset(372, 299).addBox(-2.5F, -4.885F, -3.5872F, 4.0F, 8.0F, 3.0F, 0.0F, false);

		bone78_r2 = new ModelRenderer(this);
		bone78_r2.setRotationPoint(0.5F, -3.9238F, -0.656F);
		bone78.addChild(bone78_r2);
		setRotationAngle(bone78_r2, -2.3562F, 0.0F, 0.0F);
		bone78_r2.setTextureOffset(12, 485).addBox(-2.5F, -20.5242F, -1.0661F, 4.0F, 16.0F, 3.0F, 0.0F, false);

		bone78_r3 = new ModelRenderer(this);
		bone78_r3.setRotationPoint(0.5F, -3.9238F, -0.656F);
		bone78.addChild(bone78_r3);
		setRotationAngle(bone78_r3, -2.5307F, 0.0F, 0.0F);
		bone78_r3.setTextureOffset(284, 466).addBox(-2.52F, -20.2737F, -4.6172F, 4.0F, 23.0F, 3.0F, 0.0F, false);

		bone134 = new ModelRenderer(this);
		bone134.setRotationPoint(0.5F, -9.6691F, -39.1333F);
		dao2.addChild(bone134);
		bone134.setTextureOffset(456, 260).addBox(-2.02F, 3.2524F, -18.1167F, 4.0F, 5.0F, 10.0F, 0.0F, false);
		bone134.setTextureOffset(365, 365).addBox(-2.52F, 3.2524F, -2.8667F, 5.0F, 5.0F, 16.0F, 0.0F, false);

		bone134_r1 = new ModelRenderer(this);
		bone134_r1.setRotationPoint(-0.5F, 0.0F, -21.0F);
		bone134.addChild(bone134_r1);
		setRotationAngle(bone134_r1, -0.5236F, 0.0F, 0.0F);
		bone134_r1.setTextureOffset(481, 507).addBox(-1.5F, -3.75F, 13.0F, 4.0F, 4.0F, 2.0F, 0.0F, false);

		bone134_r2 = new ModelRenderer(this);
		bone134_r2.setRotationPoint(-0.5F, 0.0F, 0.0F);
		bone134.addChild(bone134_r2);
		setRotationAngle(bone134_r2, -0.5236F, 0.0F, 0.0F);
		bone134_r2.setTextureOffset(409, 61).addBox(-2.0F, -3.75F, 13.0F, 5.0F, 4.0F, 2.0F, 0.0F, false);

		bone134_r3 = new ModelRenderer(this);
		bone134_r3.setRotationPoint(-0.5F, 0.0F, -31.25F);
		bone134.addChild(bone134_r3);
		setRotationAngle(bone134_r3, -0.5236F, 0.0F, 0.0F);
		bone134_r3.setTextureOffset(481, 500).addBox(-1.5F, -3.75F, 13.0F, 4.0F, 4.0F, 2.0F, 0.0F, false);

		bone134_r4 = new ModelRenderer(this);
		bone134_r4.setRotationPoint(-0.5F, 0.0F, -16.0F);
		bone134.addChild(bone134_r4);
		setRotationAngle(bone134_r4, -0.5236F, 0.0F, 0.0F);
		bone134_r4.setTextureOffset(419, 260).addBox(-2.0F, -3.75F, 13.0F, 5.0F, 4.0F, 2.0F, 0.0F, false);

		bone73 = new ModelRenderer(this);
		bone73.setRotationPoint(32.8248F, 24.6126F, -5.5841F);
		youshou.addChild(bone73);
		setRotationAngle(bone73, 0.0F, 0.0436F, -0.1745F);
		bone73.setTextureOffset(328, 82).addBox(-4.0F, -2.0F, -2.0F, 4.0F, 7.0F, 5.0F, 0.0F, false);
		bone73.setTextureOffset(371, 321).addBox(1.5F, -2.0F, -1.0F, 2.0F, 9.0F, 4.0F, 0.0F, false);

		bone73_r1 = new ModelRenderer(this);
		bone73_r1.setRotationPoint(3.0F, 7.0F, 0.0F);
		bone73.addChild(bone73_r1);
		setRotationAngle(bone73_r1, 0.7854F, 0.0F, 0.0F);
		bone73_r1.setTextureOffset(491, 31).addBox(-2.5F, -2.0F, -1.0F, 5.0F, 5.0F, 4.0F, 0.0F, false);
		bone73_r1.setTextureOffset(464, 66).addBox(-7.5F, -3.0F, -3.0F, 6.0F, 7.0F, 7.0F, 0.0F, false);

		bone73_r2 = new ModelRenderer(this);
		bone73_r2.setRotationPoint(0.1868F, 8.8676F, 7.5047F);
		bone73.addChild(bone73_r2);
		setRotationAngle(bone73_r2, -0.3057F, -0.0197F, -0.0193F);
		bone73_r2.setTextureOffset(34, 430).addBox(1.4695F, 3.7918F, -1.655F, 3.0F, 3.0F, 4.0F, 0.0F, false);
		bone73_r2.setTextureOffset(430, 332).addBox(-4.5305F, 3.7918F, -1.655F, 3.0F, 3.0F, 4.0F, 0.0F, false);
		bone73_r2.setTextureOffset(258, 252).addBox(-1.9237F, -3.5058F, 0.7937F, 4.0F, 13.0F, 2.0F, 0.0F, false);
		bone73_r2.setTextureOffset(480, 222).addBox(-4.0305F, -3.2082F, -1.155F, 8.0F, 9.0F, 3.0F, 0.0F, false);

		bone73_r3 = new ModelRenderer(this);
		bone73_r3.setRotationPoint(0.3583F, 6.5053F, 14.4299F);
		bone73.addChild(bone73_r3);
		setRotationAngle(bone73_r3, -0.3049F, -0.0213F, 0.0043F);
		bone73_r3.setTextureOffset(351, 397).addBox(2.9326F, 2.1096F, -13.214F, 1.0F, 4.0F, 7.0F, 0.0F, false);
		bone73_r3.setTextureOffset(104, 406).addBox(-4.8174F, 2.1096F, -10.214F, 2.0F, 4.0F, 4.0F, 0.0F, false);

		bone73_r4 = new ModelRenderer(this);
		bone73_r4.setRotationPoint(0.1868F, 8.8676F, 7.5047F);
		bone73.addChild(bone73_r4);
		setRotationAngle(bone73_r4, 0.4361F, -0.0197F, -0.0193F);
		bone73_r4.setTextureOffset(156, 115).addBox(-5.5305F, -7.1188F, 0.0277F, 11.0F, 2.0F, 5.0F, 0.0F, false);
		bone73_r4.setTextureOffset(496, 357).addBox(-2.9237F, -5.6973F, 2.4283F, 6.0F, 5.0F, 2.0F, 0.0F, false);
		bone73_r4.setTextureOffset(367, 156).addBox(-5.0305F, -6.1188F, 0.5277F, 10.0F, 5.0F, 3.0F, 0.0F, false);

		bone73_r5 = new ModelRenderer(this);
		bone73_r5.setRotationPoint(-3.0F, 7.0F, -1.0F);
		bone73.addChild(bone73_r5);
		setRotationAngle(bone73_r5, 0.7854F, 0.0F, 0.0F);
		bone73_r5.setTextureOffset(50, 434).addBox(-2.5F, 0.0F, 0.0F, 2.0F, 5.0F, 5.0F, 0.0F, false);

		bone74 = new ModelRenderer(this);
		bone74.setRotationPoint(0.3465F, 4.8976F, 0.9233F);
		bone73.addChild(bone74);
		setRotationAngle(bone74, -0.3927F, 0.0F, 0.0F);
		bone74.setTextureOffset(489, 170).addBox(-1.2513F, 6.0322F, -0.2884F, 6.0F, 6.0F, 3.0F, 0.0F, false);
		bone74.setTextureOffset(390, 343).addBox(-2.7513F, 2.0322F, -1.7884F, 3.0F, 6.0F, 3.0F, 0.0F, false);
		bone74.setTextureOffset(157, 405).addBox(-3.2513F, 8.0322F, -2.2884F, 4.0F, 4.0F, 4.0F, 0.0F, false);
		bone74.setTextureOffset(153, 291).addBox(1.7487F, 3.0322F, 0.2116F, 2.0F, 9.0F, 2.0F, 0.0F, false);

		bone74_r1 = new ModelRenderer(this);
		bone74_r1.setRotationPoint(1.0F, 14.9532F, 0.6832F);
		bone74.addChild(bone74_r1);
		setRotationAngle(bone74_r1, 0.0F, 0.3927F, 0.2182F);
		bone74_r1.setTextureOffset(117, 0).addBox(5.4417F, 7.1356F, -0.4434F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		bone74_r1.setTextureOffset(118, 41).addBox(5.4417F, -1.8644F, -0.4434F, 1.0F, 3.0F, 1.0F, 0.0F, false);

		bone74_r2 = new ModelRenderer(this);
		bone74_r2.setRotationPoint(1.0F, 14.9532F, 0.6832F);
		bone74.addChild(bone74_r2);
		setRotationAngle(bone74_r2, 0.0F, -0.3927F, 0.2182F);
		bone74_r2.setTextureOffset(124, 115).addBox(5.4635F, 7.1356F, -0.504F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		bone74_r2.setTextureOffset(76, 134).addBox(5.4635F, -1.8644F, -0.504F, 1.0F, 3.0F, 1.0F, 0.0F, false);

		bone74_r3 = new ModelRenderer(this);
		bone74_r3.setRotationPoint(1.0F, 14.9532F, 0.6832F);
		bone74.addChild(bone74_r3);
		setRotationAngle(bone74_r3, 0.0F, 0.0F, -0.1309F);
		bone74_r3.setTextureOffset(276, 28).addBox(-5.886F, 2.0115F, -1.9715F, 1.0F, 10.0F, 4.0F, 0.0F, false);

		bone74_r4 = new ModelRenderer(this);
		bone74_r4.setRotationPoint(1.0F, 14.9532F, 0.6832F);
		bone74.addChild(bone74_r4);
		setRotationAngle(bone74_r4, 0.0F, 0.0F, 0.1309F);
		bone74_r4.setTextureOffset(430, 313).addBox(-5.1648F, -1.5336F, -1.9715F, 1.0F, 5.0F, 4.0F, 0.0F, false);

		bone74_r5 = new ModelRenderer(this);
		bone74_r5.setRotationPoint(1.0F, 14.9532F, 0.6832F);
		bone74.addChild(bone74_r5);
		setRotationAngle(bone74_r5, 0.0F, 0.0F, -0.5672F);
		bone74_r5.setTextureOffset(214, 39).addBox(-2.4672F, -4.2423F, -5.0017F, 12.0F, 2.0F, 2.0F, 0.0F, false);
		bone74_r5.setTextureOffset(226, 197).addBox(-2.4672F, -4.2423F, 3.0586F, 12.0F, 2.0F, 2.0F, 0.0F, false);
		bone74_r5.setTextureOffset(495, 383).addBox(8.1447F, -4.2423F, -2.4715F, 3.0F, 2.0F, 5.0F, 0.0F, false);

		bone74_r6 = new ModelRenderer(this);
		bone74_r6.setRotationPoint(1.0F, 14.9532F, 0.6832F);
		bone74.addChild(bone74_r6);
		setRotationAngle(bone74_r6, 0.0F, 0.0F, -1.1345F);
		bone74_r6.setTextureOffset(194, 343).addBox(-1.0157F, -5.4975F, -5.0117F, 4.0F, 2.0F, 2.0F, 0.0F, false);
		bone74_r6.setTextureOffset(343, 46).addBox(-1.0157F, -5.4975F, 3.0586F, 4.0F, 2.0F, 2.0F, 0.0F, false);

		bone74_r7 = new ModelRenderer(this);
		bone74_r7.setRotationPoint(1.0F, 14.9532F, 0.6832F);
		bone74.addChild(bone74_r7);
		setRotationAngle(bone74_r7, 0.0F, 0.0F, -0.0873F);
		bone74_r7.setTextureOffset(216, 253).addBox(-7.2683F, -6.3403F, -2.4715F, 1.0F, 1.0F, 5.0F, 0.0F, false);
		bone74_r7.setTextureOffset(326, 300).addBox(-6.3628F, -4.6238F, -3.9715F, 1.0F, 1.0F, 8.0F, 0.0F, false);
		bone74_r7.setTextureOffset(385, 156).addBox(-5.9788F, -7.2889F, -3.9715F, 1.0F, 1.0F, 8.0F, 0.0F, false);

		bone74_r8 = new ModelRenderer(this);
		bone74_r8.setRotationPoint(1.0F, 14.9532F, 0.6832F);
		bone74.addChild(bone74_r8);
		setRotationAngle(bone74_r8, 0.0F, 0.0F, 0.4363F);
		bone74_r8.setTextureOffset(250, 347).addBox(-8.5986F, -2.3567F, -2.4715F, 6.0F, 2.0F, 5.0F, 0.0F, false);
		bone74_r8.setTextureOffset(284, 364).addBox(-6.9562F, -1.3229F, -3.9715F, 3.0F, 2.0F, 8.0F, 0.0F, false);
		bone74_r8.setTextureOffset(468, 431).addBox(-7.9562F, -3.8229F, -3.9715F, 6.0F, 2.0F, 8.0F, 0.0F, false);

		bone74_r9 = new ModelRenderer(this);
		bone74_r9.setRotationPoint(1.0F, 14.9532F, 0.6832F);
		bone74.addChild(bone74_r9);
		setRotationAngle(bone74_r9, 0.0F, 0.0F, -0.48F);
		bone74_r9.setTextureOffset(157, 68).addBox(-1.5162F, -3.9871F, -2.4715F, 1.0F, 6.0F, 5.0F, 0.0F, false);
		bone74_r9.setTextureOffset(490, 435).addBox(-3.5162F, -3.9871F, -2.9815F, 2.0F, 6.0F, 6.0F, 0.0F, false);
		bone74_r9.setTextureOffset(482, 326).addBox(-0.5162F, -1.9871F, -3.9715F, 2.0F, 4.0F, 8.0F, 0.0F, false);

		bone74_r10 = new ModelRenderer(this);
		bone74_r10.setRotationPoint(1.0F, 14.9532F, 0.6832F);
		bone74.addChild(bone74_r10);
		setRotationAngle(bone74_r10, 0.0F, 0.0F, -0.2182F);
		bone74_r10.setTextureOffset(189, 280).addBox(-7.4662F, 11.2335F, -3.5215F, 3.0F, 2.0F, 7.0F, 0.0F, false);

		bone74_r11 = new ModelRenderer(this);
		bone74_r11.setRotationPoint(1.0F, 14.9532F, 0.6832F);
		bone74.addChild(bone74_r11);
		setRotationAngle(bone74_r11, 0.0F, 0.0F, -0.3054F);
		bone74_r11.setTextureOffset(478, 170).addBox(-5.8252F, 7.9362F, -4.4715F, 1.0F, 5.0F, 9.0F, 0.0F, false);

		bone74_r12 = new ModelRenderer(this);
		bone74_r12.setRotationPoint(1.0F, 14.9532F, 0.6832F);
		bone74.addChild(bone74_r12);
		setRotationAngle(bone74_r12, 0.0F, 0.0F, 0.2182F);
		bone74_r12.setTextureOffset(132, 213).addBox(6.4234F, 12.1157F, -2.4715F, 1.0F, 2.0F, 5.0F, 0.0F, false);
		bone74_r12.setTextureOffset(279, 428).addBox(1.4234F, 12.1157F, -4.4815F, 5.0F, 2.0F, 9.0F, 0.0F, false);
		bone74_r12.setTextureOffset(0, 268).addBox(0.4234F, -4.8843F, -3.9815F, 5.0F, 17.0F, 8.0F, 0.0F, false);
		bone74_r12.setTextureOffset(0, 481).addBox(5.4215F, -4.9716F, -1.9815F, 2.0F, 17.0F, 4.0F, 0.0F, false);

		bone74_r13 = new ModelRenderer(this);
		bone74_r13.setRotationPoint(1.0F, 14.9532F, 0.6832F);
		bone74.addChild(bone74_r13);
		setRotationAngle(bone74_r13, 0.0F, 0.0F, -0.0436F);
		bone74_r13.setTextureOffset(204, 39).addBox(-4.8718F, -2.1275F, -2.9715F, 2.0F, 15.0F, 6.0F, 0.0F, false);
		bone74_r13.setTextureOffset(197, 225).addBox(-2.3718F, 1.8725F, -2.9715F, 3.0F, 11.0F, 6.0F, 0.0F, false);

		bone74_r14 = new ModelRenderer(this);
		bone74_r14.setRotationPoint(1.0F, 14.9532F, 0.6832F);
		bone74.addChild(bone74_r14);
		setRotationAngle(bone74_r14, 0.0F, 0.5672F, -0.5672F);
		bone74_r14.setTextureOffset(341, 241).addBox(7.7273F, -4.2323F, 0.9036F, 3.0F, 2.0F, 3.0F, 0.0F, false);

		bone74_r15 = new ModelRenderer(this);
		bone74_r15.setRotationPoint(1.0F, 14.9532F, 0.6832F);
		bone74.addChild(bone74_r15);
		setRotationAngle(bone74_r15, 0.0F, -0.5672F, -0.5672F);
		bone74_r15.setTextureOffset(32, 349).addBox(7.7579F, -4.2323F, -3.8555F, 3.0F, 2.0F, 3.0F, 0.0F, false);

		bone74_r16 = new ModelRenderer(this);
		bone74_r16.setRotationPoint(1.09F, 17.8246F, 4.3496F);
		bone74.addChild(bone74_r16);
		setRotationAngle(bone74_r16, -0.1742F, -0.0869F, -0.0076F);
		bone74_r16.setTextureOffset(484, 0).addBox(-2.6808F, -4.9392F, -2.8604F, 5.0F, 11.0F, 4.0F, 0.0F, false);

		bone74_r17 = new ModelRenderer(this);
		bone74_r17.setRotationPoint(1.09F, 17.8246F, 4.3496F);
		bone74.addChild(bone74_r17);
		setRotationAngle(bone74_r17, -0.3051F, -0.0869F, -0.0076F);
		bone74_r17.setTextureOffset(338, 350).addBox(-1.9308F, -3.5076F, -2.1118F, 4.0F, 1.0F, 5.0F, 0.0F, false);
		bone74_r17.setTextureOffset(307, 32).addBox(-1.4308F, -3.0076F, -2.1118F, 3.0F, 13.0F, 5.0F, 0.0F, false);
		bone74_r17.setTextureOffset(285, 230).addBox(-3.6808F, -5.2576F, -3.1118F, 7.0F, 2.0F, 4.0F, 0.0F, false);

		bone74_r18 = new ModelRenderer(this);
		bone74_r18.setRotationPoint(1.0F, 14.9532F, 0.6832F);
		bone74.addChild(bone74_r18);
		setRotationAngle(bone74_r18, 0.0F, 0.0F, -0.2618F);
		bone74_r18.setTextureOffset(41, 190).addBox(-0.9341F, -4.5782F, -3.9715F, 8.0F, 2.0F, 8.0F, 0.0F, false);
		bone74_r18.setTextureOffset(0, 403).addBox(6.8785F, -5.983F, -1.9715F, 2.0F, 5.0F, 4.0F, 0.0F, false);

		bone75 = new ModelRenderer(this);
		bone75.setRotationPoint(2.2458F, 28.3845F, 1.1312F);
		bone74.addChild(bone75);
		setRotationAngle(bone75, -0.0436F, -0.0436F, 0.2182F);

		bone75_r1 = new ModelRenderer(this);
		bone75_r1.setRotationPoint(-3.25F, 8.75F, -1.75F);
		bone75.addChild(bone75_r1);
		setRotationAngle(bone75_r1, 0.0F, 0.3491F, 1.5708F);
		bone75_r1.setTextureOffset(392, 175).addBox(3.5791F, -4.5172F, -2.9016F, 2.0F, 3.0F, 5.0F, 0.0F, false);

		bone75_r2 = new ModelRenderer(this);
		bone75_r2.setRotationPoint(-3.25F, 8.75F, -1.75F);
		bone75.addChild(bone75_r2);
		setRotationAngle(bone75_r2, 0.0F, -0.2182F, 1.5708F);
		bone75_r2.setTextureOffset(168, 495).addBox(4.2466F, -4.5372F, -0.5785F, 2.0F, 3.0F, 6.0F, 0.0F, false);

		bone75_r3 = new ModelRenderer(this);
		bone75_r3.setRotationPoint(-3.25F, 8.75F, -1.75F);
		bone75.addChild(bone75_r3);
		setRotationAngle(bone75_r3, 0.0F, 0.0F, 1.3963F);
		bone75_r3.setTextureOffset(404, 352).addBox(-2.6283F, -1.3336F, -1.4296F, 7.0F, 3.0F, 6.0F, 0.0F, false);

		bone75_r4 = new ModelRenderer(this);
		bone75_r4.setRotationPoint(-3.25F, 8.75F, -1.75F);
		bone75.addChild(bone75_r4);
		setRotationAngle(bone75_r4, 0.0F, 0.0F, 1.8762F);
		bone75_r4.setTextureOffset(488, 112).addBox(-5.2818F, -0.3083F, -1.4296F, 3.0F, 3.0F, 6.0F, 0.0F, false);

		bone75_r5 = new ModelRenderer(this);
		bone75_r5.setRotationPoint(-3.25F, 8.75F, -1.75F);
		bone75.addChild(bone75_r5);
		setRotationAngle(bone75_r5, 0.0F, -0.3491F, 1.5708F);
		bone75_r5.setTextureOffset(50, 333).addBox(-3.6192F, -2.2672F, 5.1295F, 4.0F, 3.0F, 2.0F, 0.0F, false);

		bone75_r6 = new ModelRenderer(this);
		bone75_r6.setRotationPoint(-3.25F, 8.75F, -1.75F);
		bone75.addChild(bone75_r6);
		setRotationAngle(bone75_r6, 0.0F, 0.1309F, 1.5708F);
		bone75_r6.setTextureOffset(126, 468).addBox(-2.9635F, -2.2672F, -0.5025F, 7.0F, 3.0F, 7.0F, 0.0F, false);
		bone75_r6.setTextureOffset(156, 56).addBox(-5.6109F, -2.5172F, -3.6975F, 10.0F, 1.0F, 5.0F, 0.0F, false);
		bone75_r6.setTextureOffset(343, 210).addBox(-5.6109F, -3.2672F, -3.1975F, 10.0F, 4.0F, 5.0F, 0.0F, false);

		bone75_r7 = new ModelRenderer(this);
		bone75_r7.setRotationPoint(-3.25F, 8.75F, -1.75F);
		bone75.addChild(bone75_r7);
		setRotationAngle(bone75_r7, 0.0F, 0.0F, 1.6581F);
		bone75_r7.setTextureOffset(40, 241).addBox(-5.1654F, -4.5172F, -1.6796F, 9.0F, 4.0F, 6.0F, 0.0F, false);

		bone75_r8 = new ModelRenderer(this);
		bone75_r8.setRotationPoint(-1.75F, 8.75F, -0.5F);
		bone75.addChild(bone75_r8);
		setRotationAngle(bone75_r8, 0.0F, 0.0F, 1.5708F);
		bone75_r8.setTextureOffset(439, 443).addBox(-8.9154F, -2.7672F, -0.1796F, 3.0F, 3.0F, 3.0F, 0.0F, false);

		bone75_r9 = new ModelRenderer(this);
		bone75_r9.setRotationPoint(-3.25F, 8.75F, -1.75F);
		bone75.addChild(bone75_r9);
		setRotationAngle(bone75_r9, 0.0F, 0.0F, 1.5708F);
		bone75_r9.setTextureOffset(124, 446).addBox(-9.1654F, -3.2672F, -1.1796F, 3.0F, 3.0F, 3.0F, 0.0F, false);
		bone75_r9.setTextureOffset(473, 379).addBox(-6.1654F, -5.2672F, -3.1796F, 2.0F, 4.0F, 9.0F, 0.0F, false);

		bone135 = new ModelRenderer(this);
		bone135.setRotationPoint(-5.6592F, 11.9622F, -0.0139F);
		bone75.addChild(bone135);

		bone135_r1 = new ModelRenderer(this);
		bone135_r1.setRotationPoint(0.0015F, 0.0212F, 0.0001F);
		bone135.addChild(bone135_r1);
		setRotationAngle(bone135_r1, 0.0106F, 0.1301F, 1.5877F);
		bone135_r1.setTextureOffset(33, 513).addBox(-3.2015F, -2.9977F, -9.2171F, 6.0F, 6.0F, 3.0F, 0.0F, false);

		bone135_r2 = new ModelRenderer(this);
		bone135_r2.setRotationPoint(0.0015F, 0.0212F, 0.0001F);
		bone135.addChild(bone135_r2);
		setRotationAngle(bone135_r2, 0.0F, 0.1309F, 1.5708F);
		bone135_r2.setTextureOffset(0, 526).addBox(-2.589F, -2.533F, -6.9066F, 5.0F, 5.0F, 14.0F, 0.0F, false);
		bone135_r2.setTextureOffset(33, 513).addBox(-3.089F, -3.033F, 6.0934F, 6.0F, 6.0F, 3.0F, 0.0F, false);

		_2dao = new ModelRenderer(this);
		_2dao.setRotationPoint(-5.7011F, 11.7137F, -1.7694F);
		bone75.addChild(_2dao);
		_2dao.setTextureOffset(0, 165).addBox(-1.02F, -2.6667F, -17.0F, 3.0F, 2.0F, 35.0F, 0.0F, false);
		_2dao.setTextureOffset(430, 90).addBox(-1.02F, -0.9167F, 5.0F, 3.0F, 3.0F, 13.0F, 0.0F, false);
		_2dao.setTextureOffset(161, 225).addBox(0.0F, -0.1667F, -16.0F, 1.0F, 2.0F, 34.0F, 0.0F, false);

		_2dao_r1 = new ModelRenderer(this);
		_2dao_r1.setRotationPoint(-0.5F, 9.5788F, 13.988F);
		_2dao.addChild(_2dao_r1);
		setRotationAngle(_2dao_r1, 0.829F, 0.0F, 0.0F);
		_2dao_r1.setTextureOffset(80, 198).addBox(-1.25F, -9.9237F, 9.1965F, 4.0F, 12.0F, 3.0F, 0.0F, false);

		_2dao_r2 = new ModelRenderer(this);
		_2dao_r2.setRotationPoint(-0.5F, 9.8288F, 14.488F);
		_2dao.addChild(_2dao_r2);
		setRotationAngle(_2dao_r2, 0.9163F, 0.0F, 0.0F);
		_2dao_r2.setTextureOffset(343, 219).addBox(0.0F, -6.9237F, 7.9465F, 2.0F, 8.0F, 2.0F, 0.0F, false);

		_2dao_r3 = new ModelRenderer(this);
		_2dao_r3.setRotationPoint(-0.5F, 10.3288F, -16.512F);
		_2dao.addChild(_2dao_r3);
		setRotationAngle(_2dao_r3, 1.0036F, 0.0F, 0.0F);
		_2dao_r3.setTextureOffset(26, 403).addBox(0.0F, -1.75F, 11.0F, 2.0F, 8.0F, 3.0F, 0.0F, false);

		_2dao_r4 = new ModelRenderer(this);
		_2dao_r4.setRotationPoint(0.5F, 3.5109F, -16.4247F);
		_2dao.addChild(_2dao_r4);
		setRotationAngle(_2dao_r4, -1.0036F, 0.0F, 0.0F);
		_2dao_r4.setTextureOffset(234, 370).addBox(-3.0F, 0.25F, -2.0F, 6.0F, 2.0F, 4.0F, 0.0F, false);
		_2dao_r4.setTextureOffset(458, 179).addBox(-3.0F, -2.75F, -6.0F, 6.0F, 3.0F, 8.0F, 0.0F, false);

		_2dao_r5 = new ModelRenderer(this);
		_2dao_r5.setRotationPoint(-1.0F, -8.6622F, -23.012F);
		_2dao.addChild(_2dao_r5);
		setRotationAngle(_2dao_r5, -1.0036F, 0.0F, 0.0F);
		_2dao_r5.setTextureOffset(12, 457).addBox(-1.0F, -0.5F, 9.0F, 5.0F, 5.0F, 9.0F, 0.0F, false);
		_2dao_r5.setTextureOffset(0, 381).addBox(0.0F, 0.5F, 10.0F, 3.0F, 10.0F, 6.0F, 0.0F, false);

		_2dao_r6 = new ModelRenderer(this);
		_2dao_r6.setRotationPoint(-0.5F, -8.6622F, -23.512F);
		_2dao.addChild(_2dao_r6);
		setRotationAngle(_2dao_r6, -1.0036F, 0.0F, 0.0F);
		_2dao_r6.setTextureOffset(309, 434).addBox(-1.25F, -4.5F, 7.0F, 4.0F, 3.0F, 5.0F, 0.0F, false);

		_2dao_r7 = new ModelRenderer(this);
		_2dao_r7.setRotationPoint(-0.5F, 10.3288F, -23.012F);
		_2dao.addChild(_2dao_r7);
		setRotationAngle(_2dao_r7, 1.0036F, 0.0F, 0.0F);
		_2dao_r7.setTextureOffset(198, 433).addBox(0.0F, 0.5F, 11.0F, 2.0F, 6.0F, 3.0F, 0.0F, false);

		_2dao_r8 = new ModelRenderer(this);
		_2dao_r8.setRotationPoint(-0.5F, 10.3288F, -10.012F);
		_2dao.addChild(_2dao_r8);
		setRotationAngle(_2dao_r8, 1.0036F, 0.0F, 0.0F);
		_2dao_r8.setTextureOffset(405, 143).addBox(0.0F, -1.75F, 11.0F, 2.0F, 8.0F, 3.0F, 0.0F, false);

		_2dao_r9 = new ModelRenderer(this);
		_2dao_r9.setRotationPoint(-1.0F, 10.2301F, -3.8622F);
		_2dao.addChild(_2dao_r9);
		setRotationAngle(_2dao_r9, 1.0036F, 0.0F, 0.0F);
		_2dao_r9.setTextureOffset(233, 270).addBox(0.0F, -1.75F, 12.5F, 3.0F, 5.0F, 1.0F, 0.0F, false);
		_2dao_r9.setTextureOffset(184, 293).addBox(-0.01F, -1.75F, 11.0F, 3.0F, 5.0F, 1.0F, 0.0F, false);

		_2dao_r10 = new ModelRenderer(this);
		_2dao_r10.setRotationPoint(0.5F, -6.6691F, -33.1333F);
		_2dao.addChild(_2dao_r10);
		setRotationAngle(_2dao_r10, -0.5236F, 0.0F, 0.0F);
		_2dao_r10.setTextureOffset(446, 472).addBox(-2.0F, -7.75F, 10.0F, 4.0F, 15.0F, 5.0F, 0.0F, false);

		_2dao_r11 = new ModelRenderer(this);
		_2dao_r11.setRotationPoint(-0.5F, -9.4711F, -30.2194F);
		_2dao.addChild(_2dao_r11);
		setRotationAngle(_2dao_r11, -0.5236F, 0.0F, 0.0F);
		_2dao_r11.setTextureOffset(416, 25).addBox(-2.02F, -5.0F, 12.0F, 6.0F, 6.0F, 2.0F, 0.0F, false);

		_2dao_r12 = new ModelRenderer(this);
		_2dao_r12.setRotationPoint(0.1716F, -2.8738F, 1.0F);
		_2dao.addChild(_2dao_r12);
		setRotationAngle(_2dao_r12, 0.0F, 0.0F, 0.7854F);
		_2dao_r12.setTextureOffset(41, 198).addBox(-0.3284F, -0.7929F, -18.0F, 2.0F, 2.0F, 35.0F, 0.0F, false);

		bone124 = new ModelRenderer(this);
		bone124.setRotationPoint(-1.0F, 7.8288F, 12.738F);
		_2dao.addChild(bone124);

		bone124_r1 = new ModelRenderer(this);
		bone124_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone124.addChild(bone124_r1);
		setRotationAngle(bone124_r1, 0.829F, 0.0F, 0.0F);
		bone124_r1.setTextureOffset(317, 65).addBox(-0.02F, 5.5763F, 11.4465F, 3.0F, 2.0F, 4.0F, 0.0F, false);
		bone124_r1.setTextureOffset(432, 196).addBox(0.0F, -1.9237F, 13.4465F, 3.0F, 7.0F, 2.0F, 0.0F, false);

		bone124_r2 = new ModelRenderer(this);
		bone124_r2.setRotationPoint(2.0F, -5.6552F, 14.1018F);
		bone124.addChild(bone124_r2);
		setRotationAngle(bone124_r2, 0.4363F, 0.0F, 0.0F);
		bone124_r2.setTextureOffset(89, 314).addBox(-2.0F, -2.5F, 1.25F, 3.0F, 3.0F, 1.0F, 0.0F, false);

		bone124_r3 = new ModelRenderer(this);
		bone124_r3.setRotationPoint(2.0F, -7.1196F, 13.5477F);
		bone124.addChild(bone124_r3);
		setRotationAngle(bone124_r3, 0.9861F, 0.0F, 0.0F);
		bone124_r3.setTextureOffset(0, 241).addBox(-2.02F, -7.0F, 1.25F, 3.0F, 7.0F, 1.0F, 0.0F, false);

		bone124_r4 = new ModelRenderer(this);
		bone124_r4.setRotationPoint(0.5F, 1.25F, 1.25F);
		bone124.addChild(bone124_r4);
		setRotationAngle(bone124_r4, 0.829F, 0.0F, 0.0F);
		bone124_r4.setTextureOffset(237, 151).addBox(0.0F, -3.4237F, 11.6965F, 2.0F, 7.0F, 2.0F, 0.0F, false);

		bone125 = new ModelRenderer(this);
		bone125.setRotationPoint(0.5F, 6.4586F, -21.9474F);
		_2dao.addChild(bone125);

		bone125_r1 = new ModelRenderer(this);
		bone125_r1.setRotationPoint(0.0F, 16.5F, 9.5F);
		bone125.addChild(bone125_r1);
		setRotationAngle(bone125_r1, -2.1817F, 0.0F, 0.0F);
		bone125_r1.setTextureOffset(275, 240).addBox(-1.0F, -6.5242F, 0.4339F, 2.0F, 6.0F, 4.0F, 0.0F, false);

		bone125_r2 = new ModelRenderer(this);
		bone125_r2.setRotationPoint(0.5F, 16.0F, 10.0F);
		bone125.addChild(bone125_r2);
		setRotationAngle(bone125_r2, 0.7854F, 0.0F, 0.0F);
		bone125_r2.setTextureOffset(225, 464).addBox(-3.5F, -12.3808F, -3.6589F, 6.0F, 17.0F, 4.0F, 0.0F, false);

		bone125_r3 = new ModelRenderer(this);
		bone125_r3.setRotationPoint(0.5F, 16.0F, 10.0F);
		bone125.addChild(bone125_r3);
		setRotationAngle(bone125_r3, 0.2618F, 0.0F, 0.0F);
		bone125_r3.setTextureOffset(221, 485).addBox(-3.5F, -18.4635F, -9.3591F, 6.0F, 9.0F, 4.0F, 0.0F, false);

		bone125_r4 = new ModelRenderer(this);
		bone125_r4.setRotationPoint(0.5F, 16.0F, 10.0F);
		bone125.addChild(bone125_r4);
		setRotationAngle(bone125_r4, 0.6109F, 0.0F, 0.0F);
		bone125_r4.setTextureOffset(228, 436).addBox(-3.52F, -19.1534F, -2.6398F, 6.0F, 24.0F, 4.0F, 0.0F, false);

		bone126 = new ModelRenderer(this);
		bone126.setRotationPoint(0.0F, 24.1179F, 12.5549F);
		bone125.addChild(bone126);

		bone126_r1 = new ModelRenderer(this);
		bone126_r1.setRotationPoint(0.5F, -3.9238F, -0.656F);
		bone126.addChild(bone126_r1);
		setRotationAngle(bone126_r1, -2.8798F, 0.0F, 0.0F);
		bone126_r1.setTextureOffset(372, 299).addBox(-2.5F, -4.885F, -3.5872F, 4.0F, 8.0F, 3.0F, 0.0F, false);

		bone126_r2 = new ModelRenderer(this);
		bone126_r2.setRotationPoint(0.5F, -3.9238F, -0.656F);
		bone126.addChild(bone126_r2);
		setRotationAngle(bone126_r2, -2.3562F, 0.0F, 0.0F);
		bone126_r2.setTextureOffset(12, 485).addBox(-2.5F, -20.5242F, -1.066F, 4.0F, 16.0F, 3.0F, 0.0F, false);

		bone126_r3 = new ModelRenderer(this);
		bone126_r3.setRotationPoint(0.5F, -3.9238F, -0.656F);
		bone126.addChild(bone126_r3);
		setRotationAngle(bone126_r3, -2.5307F, 0.0F, 0.0F);
		bone126_r3.setTextureOffset(284, 466).addBox(-2.52F, -20.2737F, -4.6172F, 4.0F, 23.0F, 3.0F, 0.0F, false);

		bone127 = new ModelRenderer(this);
		bone127.setRotationPoint(0.5F, -9.6691F, -39.1333F);
		_2dao.addChild(bone127);
		bone127.setTextureOffset(456, 260).addBox(-2.02F, 3.2524F, -18.1167F, 4.0F, 5.0F, 10.0F, 0.0F, false);
		bone127.setTextureOffset(365, 365).addBox(-2.52F, 3.2524F, -2.8667F, 5.0F, 5.0F, 16.0F, 0.0F, false);

		bone127_r1 = new ModelRenderer(this);
		bone127_r1.setRotationPoint(-0.5F, 0.0F, -21.0F);
		bone127.addChild(bone127_r1);
		setRotationAngle(bone127_r1, -0.5236F, 0.0F, 0.0F);
		bone127_r1.setTextureOffset(481, 507).addBox(-1.5F, -3.75F, 13.0F, 4.0F, 4.0F, 2.0F, 0.0F, false);

		bone127_r2 = new ModelRenderer(this);
		bone127_r2.setRotationPoint(-0.5F, 0.0F, 0.0F);
		bone127.addChild(bone127_r2);
		setRotationAngle(bone127_r2, -0.5236F, 0.0F, 0.0F);
		bone127_r2.setTextureOffset(409, 61).addBox(-2.0F, -3.75F, 13.0F, 5.0F, 4.0F, 2.0F, 0.0F, false);

		bone127_r3 = new ModelRenderer(this);
		bone127_r3.setRotationPoint(-0.5F, 0.0F, -31.25F);
		bone127.addChild(bone127_r3);
		setRotationAngle(bone127_r3, -0.5236F, 0.0F, 0.0F);
		bone127_r3.setTextureOffset(481, 500).addBox(-1.5F, -3.75F, 13.0F, 4.0F, 4.0F, 2.0F, 0.0F, false);

		bone127_r4 = new ModelRenderer(this);
		bone127_r4.setRotationPoint(-0.5F, 0.0F, -16.0F);
		bone127.addChild(bone127_r4);
		setRotationAngle(bone127_r4, -0.5236F, 0.0F, 0.0F);
		bone127_r4.setTextureOffset(419, 260).addBox(-2.0F, -3.75F, 13.0F, 5.0F, 4.0F, 2.0F, 0.0F, false);

		bone128 = new ModelRenderer(this);
		bone128.setRotationPoint(0.4853F, 4.337F, -23.5777F);
		_2dao.addChild(bone128);
		bone128.setTextureOffset(60, 452).addBox(-0.5053F, -9.2537F, -8.4223F, 1.0F, 12.0F, 10.0F, 0.0F, false);

		bone128_r1 = new ModelRenderer(this);
		bone128_r1.setRotationPoint(-2.5043F, -5.5061F, -21.8056F);
		bone128.addChild(bone128_r1);
		setRotationAngle(bone128_r1, -0.5236F, 0.0F, 0.0F);
		bone128_r1.setTextureOffset(497, 10).addBox(2.0F, 1.4378F, 9.75F, 1.0F, 3.0F, 5.0F, 0.0F, false);

		bone128_r2 = new ModelRenderer(this);
		bone128_r2.setRotationPoint(-2.5043F, -5.5061F, -21.5556F);
		bone128.addChild(bone128_r2);
		setRotationAngle(bone128_r2, -0.5236F, 0.0F, 0.0F);
		bone128_r2.setTextureOffset(489, 15).addBox(2.0F, -9.8122F, 9.5F, 1.0F, 10.0F, 6.0F, 0.0F, false);

		bone129 = new ModelRenderer(this);
		bone129.setRotationPoint(-0.0043F, -0.0493F, -13.6726F);
		bone128.addChild(bone129);
		bone129.setTextureOffset(270, 154).addBox(-0.501F, -9.2043F, -13.7496F, 1.0F, 12.0F, 11.0F, 0.0F, false);

		bone129_r1 = new ModelRenderer(this);
		bone129_r1.setRotationPoint(-2.5F, -2.4567F, 7.117F);
		bone129.addChild(bone129_r1);
		setRotationAngle(bone129_r1, -0.5236F, 0.0F, 0.0F);
		bone129_r1.setTextureOffset(64, 488).addBox(2.0F, -0.9103F, -11.9186F, 1.0F, 10.0F, 6.0F, 0.0F, false);

		bone129_r2 = new ModelRenderer(this);
		bone129_r2.setRotationPoint(-2.5F, -5.4567F, -27.133F);
		bone129.addChild(bone129_r2);
		setRotationAngle(bone129_r2, -0.5236F, 0.0F, 0.0F);
		bone129_r2.setTextureOffset(453, 419).addBox(2.0F, 1.4378F, 9.75F, 1.0F, 3.0F, 5.0F, 0.0F, false);

		bone129_r3 = new ModelRenderer(this);
		bone129_r3.setRotationPoint(-2.5F, -5.4567F, -26.883F);
		bone129.addChild(bone129_r3);
		setRotationAngle(bone129_r3, -0.5236F, 0.0F, 0.0F);
		bone129_r3.setTextureOffset(488, 419).addBox(2.0F, -9.8122F, 9.5F, 1.0F, 10.0F, 6.0F, 0.0F, false);
	}

	public void step2() {
		bone130 = new ModelRenderer(this);
		bone130.setRotationPoint(0.0035F, -0.1394F, -19.1475F);
		bone129.addChild(bone130);
		bone130.setTextureOffset(0, 58).addBox(-0.5045F, -9.065F, -22.6021F, 1.0F, 12.0F, 20.0F, 0.0F, false);

		bone130_r1 = new ModelRenderer(this);
		bone130_r1.setRotationPoint(-2.5035F, -5.3174F, -35.9855F);
		bone130.addChild(bone130_r1);
		setRotationAngle(bone130_r1, -0.5236F, 0.0F, 0.0F);
		bone130_r1.setTextureOffset(449, 270).addBox(2.0F, 1.4378F, 9.75F, 1.0F, 3.0F, 5.0F, 0.0F, false);

		bone130_r2 = new ModelRenderer(this);
		bone130_r2.setRotationPoint(-2.5035F, -5.3174F, -15.7355F);
		bone130.addChild(bone130_r2);
		setRotationAngle(bone130_r2, -0.5236F, 0.0F, 0.0F);
		bone130_r2.setTextureOffset(486, 372).addBox(2.0F, -9.8122F, 9.5F, 1.0F, 10.0F, 6.0F, 0.0F, false);

		bone130_r3 = new ModelRenderer(this);
		bone130_r3.setRotationPoint(-2.5035F, -5.3174F, -35.7355F);
		bone130.addChild(bone130_r3);
		setRotationAngle(bone130_r3, -0.5236F, 0.0F, 0.0F);
		bone130_r3.setTextureOffset(436, 487).addBox(2.0F, -9.8122F, 9.5F, 1.0F, 10.0F, 6.0F, 0.0F, false);

		bone131 = new ModelRenderer(this);
		bone131.setRotationPoint(-0.0007F, 0.1843F, -28.0006F);
		bone130.addChild(bone131);
		bone131.setTextureOffset(0, 0).addBox(-0.5038F, -9.2493F, -124.6016F, 1.0F, 12.0F, 122.0F, 0.0F, false);
		bone131.setTextureOffset(474, 269).addBox(-0.5028F, -10.7642F, -141.2932F, 1.0F, 3.0F, 10.0F, 0.0F, false);

		bone131_r1 = new ModelRenderer(this);
		bone131_r1.setRotationPoint(-2.5028F, -1.795F, -114.3519F);
		bone131.addChild(bone131_r1);
		setRotationAngle(bone131_r1, 1.0036F, 0.0F, 0.0F);
		bone131_r1.setTextureOffset(114, 98).addBox(2.0F, -22.8122F, -7.375F, 1.0F, 9.0F, 3.0F, 0.0F, false);
		bone131_r1.setTextureOffset(240, 0).addBox(2.0F, -18.8122F, -4.375F, 1.0F, 5.0F, 3.0F, 0.0F, false);
		bone131_r1.setTextureOffset(40, 251).addBox(2.0F, -25.8122F, -9.625F, 1.0F, 12.0F, 2.0F, 0.0F, false);

		bone131_r2 = new ModelRenderer(this);
		bone131_r2.setRotationPoint(-2.5028F, -5.545F, -120.1019F);
		bone131.addChild(bone131_r2);
		setRotationAngle(bone131_r2, 1.0036F, 0.0F, 0.0F);
		bone131_r2.setTextureOffset(391, 464).addBox(2.0F, -5.8122F, -9.625F, 1.0F, 6.0F, 10.0F, 0.0F, false);

		bone131_r3 = new ModelRenderer(this);
		bone131_r3.setRotationPoint(-2.5028F, -5.5017F, -15.7349F);
		bone131.addChild(bone131_r3);
		setRotationAngle(bone131_r3, -0.5236F, 0.0F, 0.0F);
		bone131_r3.setTextureOffset(348, 413).addBox(2.0F, -9.8122F, 9.5F, 1.0F, 10.0F, 6.0F, 0.0F, false);

		bone139 = new ModelRenderer(this);
		bone139.setRotationPoint(-4.25F, 6.75F, -1.75F);
		bone75.addChild(bone139);
		setRotationAngle(bone139, -0.2182F, 0.0F, 0.0F);

		bone139_r1 = new ModelRenderer(this);
		bone139_r1.setRotationPoint(0.0F, 2.0F, -1.0F);
		bone139.addChild(bone139_r1);
		setRotationAngle(bone139_r1, 0.1309F, 0.0F, -0.3927F);
		bone139_r1.setTextureOffset(0, 105).addBox(-7.2049F, 0.5127F, -6.4631F, 2.0F, 6.0F, 2.0F, 0.0F, false);

		bone139_r2 = new ModelRenderer(this);
		bone139_r2.setRotationPoint(0.0F, 2.0F, -1.0F);
		bone139.addChild(bone139_r2);
		setRotationAngle(bone139_r2, 0.333F, 0.6715F, 1.9845F);
		bone139_r2.setTextureOffset(171, 98).addBox(3.8154F, 2.3424F, -3.9407F, 3.0F, 2.0F, 1.0F, 0.0F, false);
		bone139_r2.setTextureOffset(275, 262).addBox(-2.1846F, 0.3424F, -3.4407F, 8.0F, 3.0F, 3.0F, 0.0F, false);

		bone139_r3 = new ModelRenderer(this);
		bone139_r3.setRotationPoint(-2.2292F, -0.0158F, -3.5371F);
		bone139.addChild(bone139_r3);
		setRotationAngle(bone139_r3, 0.6515F, 0.001F, 1.7728F);
		bone139_r3.setTextureOffset(82, 349).addBox(-1.743F, -2.3083F, -0.391F, 3.0F, 3.0F, 2.0F, 0.0F, false);

		bone139_r4 = new ModelRenderer(this);
		bone139_r4.setRotationPoint(0.0F, 2.0F, -1.0F);
		bone139.addChild(bone139_r4);
		setRotationAngle(bone139_r4, 0.2588F, 0.001F, 1.7728F);
		bone139_r4.setTextureOffset(321, 377).addBox(-3.8851F, 0.3424F, -5.0015F, 4.0F, 3.0F, 3.0F, 0.0F, false);

		bone140 = new ModelRenderer(this);
		bone140.setRotationPoint(-1.75F, 13.25F, -4.0F);
		bone75.addChild(bone140);
		setRotationAngle(bone140, -0.0873F, 0.0F, 0.0F);

		bone140_r1 = new ModelRenderer(this);
		bone140_r1.setRotationPoint(-1.5F, 6.4704F, 1.7706F);
		bone140.addChild(bone140_r1);
		setRotationAngle(bone140_r1, 0.0F, 0.0F, 1.5708F);
		bone140_r1.setTextureOffset(363, 434).addBox(-5.6109F, -3.2672F, -3.1975F, 5.0F, 3.0F, 3.0F, 0.0F, false);
		bone140_r1.setTextureOffset(21, 229).addBox(-7.6109F, -3.7672F, -2.6975F, 4.0F, 3.0F, 2.0F, 0.0F, false);

		bone141 = new ModelRenderer(this);
		bone141.setRotationPoint(-0.1122F, 5.1399F, 0.0595F);
		bone140.addChild(bone141);

		bone141_r1 = new ModelRenderer(this);
		bone141_r1.setRotationPoint(-4.3878F, 3.5805F, 1.711F);
		bone141.addChild(bone141_r1);
		setRotationAngle(bone141_r1, 0.0F, 0.0F, 2.2689F);
		bone141_r1.setTextureOffset(149, 252).addBox(-5.6109F, -3.0172F, -2.9475F, 5.0F, 2.0F, 2.0F, 0.0F, false);

		bone141_r2 = new ModelRenderer(this);
		bone141_r2.setRotationPoint(-6.8878F, 1.0805F, 1.211F);
		bone141.addChild(bone141_r2);
		setRotationAngle(bone141_r2, 0.0F, 0.0F, -2.8362F);
		bone141_r2.setTextureOffset(307, 55).addBox(-5.6109F, -3.2672F, -2.1975F, 5.0F, 3.0F, 2.0F, 0.0F, false);

		bone142 = new ModelRenderer(this);
		bone142.setRotationPoint(-2.0F, 13.25F, 1.0F);
		bone75.addChild(bone142);
		setRotationAngle(bone142, 0.0436F, -0.0873F, 0.0F);

		bone142_r1 = new ModelRenderer(this);
		bone142_r1.setRotationPoint(-1.2836F, 7.3585F, -0.2701F);
		bone142.addChild(bone142_r1);
		setRotationAngle(bone142_r1, 0.0F, 0.0F, 1.5708F);
		bone142_r1.setTextureOffset(467, 342).addBox(-7.5255F, -3.5021F, -3.2013F, 7.0F, 3.0F, 7.0F, 0.0F, false);
		bone142_r1.setTextureOffset(494, 480).addBox(-7.8609F, -3.9072F, -2.9475F, 2.0F, 3.0F, 6.0F, 0.0F, false);

		bone143 = new ModelRenderer(this);
		bone143.setRotationPoint(1.2615F, 7.6344F, 0.2304F);
		bone142.addChild(bone143);

		bone143_r1 = new ModelRenderer(this);
		bone143_r1.setRotationPoint(-8.045F, -0.5259F, -1.0005F);
		bone143.addChild(bone143_r1);
		setRotationAngle(bone143_r1, 0.0F, 0.0F, -2.8362F);
		bone143_r1.setTextureOffset(78, 281).addBox(-5.6109F, -2.7672F, -2.1975F, 5.0F, 2.0F, 6.0F, 0.0F, false);

		bone143_r2 = new ModelRenderer(this);
		bone143_r2.setRotationPoint(-5.545F, 1.9741F, -0.5005F);
		bone143.addChild(bone143_r2);
		setRotationAngle(bone143_r2, 0.0F, 0.0F, 2.2689F);
		bone143_r2.setTextureOffset(419, 157).addBox(-5.6109F, -3.0172F, -2.9475F, 5.0F, 2.0F, 6.0F, 0.0F, false);

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.0F, 46.2357F, 37.0333F);
		shangbanshen.addChild(bone);

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(10.0836F, -22.4666F, -0.7253F);
		shangbanshen.addChild(bone2);

		bone2_r1 = new ModelRenderer(this);
		bone2_r1.setRotationPoint(8.0642F, -7.7281F, 28.93F);
		bone2.addChild(bone2_r1);
		setRotationAngle(bone2_r1, 0.5224F, 0.2186F, 0.0154F);
		bone2_r1.setTextureOffset(233, 252).addBox(-8.0F, -5.25F, -2.125F, 4.0F, 13.0F, 2.0F, 0.0F, false);

		bone2_r2 = new ModelRenderer(this);
		bone2_r2.setRotationPoint(8.0642F, -7.7281F, 28.93F);
		bone2.addChild(bone2_r2);
		setRotationAngle(bone2_r2, 0.6564F, 0.2147F, 0.0442F);
		bone2_r2.setTextureOffset(0, 309).addBox(-3.0F, -9.25F, -1.875F, 9.0F, 20.0F, 3.0F, 0.0F, false);

		bone2_r3 = new ModelRenderer(this);
		bone2_r3.setRotationPoint(6.0F, 4.0F, 14.0F);
		bone2.addChild(bone2_r3);
		setRotationAngle(bone2_r3, 0.5255F, 0.2147F, 0.0442F);
		bone2_r3.setTextureOffset(82, 403).addBox(-2.6724F, -15.7325F, 4.9518F, 5.0F, 8.0F, 12.0F, 0.0F, false);

		bone2_r4 = new ModelRenderer(this);
		bone2_r4.setRotationPoint(14.012F, -5.8941F, 15.4813F);
		bone2.addChild(bone2_r4);
		setRotationAngle(bone2_r4, 0.2558F, 0.3016F, -0.0887F);
		bone2_r4.setTextureOffset(34, 448).addBox(-1.75F, -5.6452F, -10.4204F, 3.0F, 8.0F, 10.0F, 0.0F, false);

		bone2_r5 = new ModelRenderer(this);
		bone2_r5.setRotationPoint(6.0F, 4.0F, 14.0F);
		bone2.addChild(bone2_r5);
		setRotationAngle(bone2_r5, 0.2637F, 0.2147F, -0.0431F);
		bone2_r5.setTextureOffset(89, 310).addBox(5.8276F, -7.2325F, -1.7982F, 2.0F, 15.0F, 9.0F, 0.0F, false);

		bone2_r6 = new ModelRenderer(this);
		bone2_r6.setRotationPoint(6.0F, 4.0F, 14.0F);
		bone2.addChild(bone2_r6);
		setRotationAngle(bone2_r6, 0.4818F, 0.2147F, 0.0442F);
		bone2_r6.setTextureOffset(226, 172).addBox(-10.1724F, -7.1112F, -11.1039F, 6.0F, 6.0F, 29.0F, 0.0F, false);
		bone2_r6.setTextureOffset(60, 0).addBox(3.8276F, -7.1112F, -11.1039F, 2.0F, 6.0F, 29.0F, 0.0F, false);

		bone2_r7 = new ModelRenderer(this);
		bone2_r7.setRotationPoint(6.0F, 4.0F, 14.0F);
		bone2.addChild(bone2_r7);
		setRotationAngle(bone2_r7, 0.8309F, 0.2147F, 0.0442F);
		bone2_r7.setTextureOffset(239, 39).addBox(-6.6724F, -16.4645F, -11.107F, 13.0F, 13.0F, 4.0F, 0.0F, false);

		bone2_r8 = new ModelRenderer(this);
		bone2_r8.setRotationPoint(14.012F, -5.8941F, 15.4813F);
		bone2.addChild(bone2_r8);
		setRotationAngle(bone2_r8, 0.3867F, 0.3016F, -0.176F);
		bone2_r8.setTextureOffset(0, 241).addBox(-1.75F, -5.7103F, -0.0875F, 4.0F, 16.0F, 9.0F, 0.0F, false);

		bone2_r9 = new ModelRenderer(this);
		bone2_r9.setRotationPoint(6.0F, 4.0F, 14.0F);
		bone2.addChild(bone2_r9);
		setRotationAngle(bone2_r9, 0.1764F, 0.2147F, 0.0442F);
		bone2_r9.setTextureOffset(494, 447).addBox(-2.6724F, 4.3496F, -12.5248F, 5.0F, 3.0F, 4.0F, 0.0F, false);
		bone2_r9.setTextureOffset(386, 329).addBox(-2.6724F, 1.3496F, -9.5248F, 5.0F, 3.0F, 6.0F, 0.0F, false);
		bone2_r9.setTextureOffset(474, 33).addBox(-2.6724F, -1.6504F, -5.5248F, 5.0F, 3.0F, 7.0F, 0.0F, false);
		bone2_r9.setTextureOffset(467, 294).addBox(-2.6724F, -8.6504F, -0.5248F, 5.0F, 7.0F, 7.0F, 0.0F, false);

		bone2_r10 = new ModelRenderer(this);
		bone2_r10.setRotationPoint(6.0F, 4.0F, 14.0F);
		bone2.addChild(bone2_r10);
		setRotationAngle(bone2_r10, 0.2035F, -0.558F, -0.1026F);
		bone2_r10.setTextureOffset(341, 413).addBox(-7.7408F, 4.3596F, -7.497F, 3.0F, 3.0F, 3.0F, 0.0F, false);
		bone2_r10.setTextureOffset(384, 424).addBox(-4.2053F, 1.3596F, -3.9615F, 3.0F, 3.0F, 3.0F, 0.0F, false);
		bone2_r10.setTextureOffset(218, 433).addBox(-0.6698F, -1.6404F, -0.4259F, 3.0F, 3.0F, 3.0F, 0.0F, false);
		bone2_r10.setTextureOffset(442, 214).addBox(2.8658F, -4.6404F, 3.1096F, 3.0F, 3.0F, 3.0F, 0.0F, false);

		bone2_r11 = new ModelRenderer(this);
		bone2_r11.setRotationPoint(6.0F, 4.0F, 14.0F);
		bone2.addChild(bone2_r11);
		setRotationAngle(bone2_r11, 0.0891F, 0.2147F, 0.0442F);
		bone2_r11.setTextureOffset(416, 443).addBox(-4.1724F, -14.067F, 4.8394F, 8.0F, 9.0F, 7.0F, 0.0F, false);

		bone2_r12 = new ModelRenderer(this);
		bone2_r12.setRotationPoint(6.0F, 4.0F, 14.0F);
		bone2.addChild(bone2_r12);
		setRotationAngle(bone2_r12, 0.3946F, 0.2147F, 0.0442F);
		bone2_r12.setTextureOffset(80, 198).addBox(-5.6724F, -12.9671F, -5.6927F, 11.0F, 7.0F, 15.0F, 0.0F, false);

		bone2_r13 = new ModelRenderer(this);
		bone2_r13.setRotationPoint(6.0F, 4.0F, 14.0F);
		bone2.addChild(bone2_r13);
		setRotationAngle(bone2_r13, 0.7175F, 0.2147F, 0.0442F);
		bone2_r13.setTextureOffset(306, 272).addBox(-3.6724F, -7.4843F, -11.3269F, 7.0F, 7.0F, 20.0F, 0.0F, false);

		bone2_r14 = new ModelRenderer(this);
		bone2_r14.setRotationPoint(6.0F, 4.0F, 14.0F);
		bone2.addChild(bone2_r14);
		setRotationAngle(bone2_r14, 1.0491F, 0.2147F, 0.0442F);
		bone2_r14.setTextureOffset(340, 260).addBox(-4.6724F, -9.6953F, -14.3157F, 9.0F, 4.0F, 16.0F, 0.0F, false);

		bone33 = new ModelRenderer(this);
		bone33.setRotationPoint(3.6254F, -1.3376F, 23.1802F);
		bone2.addChild(bone33);

		bone33_r1 = new ModelRenderer(this);
		bone33_r1.setRotationPoint(2.0F, 3.0F, 0.0F);
		bone33.addChild(bone33_r1);
		setRotationAngle(bone33_r1, 0.3946F, 0.2147F, 0.0442F);
		bone33_r1.setTextureOffset(496, 73).addBox(-1.25F, -0.75F, 0.125F, 7.0F, 6.0F, 1.0F, 0.0F, false);
		bone33_r1.setTextureOffset(460, 497).addBox(-3.25F, -7.75F, -2.875F, 2.0F, 11.0F, 3.0F, 0.0F, false);

		bone34 = new ModelRenderer(this);
		bone34.setRotationPoint(2.5205F, 0.4482F, 17.8852F);
		bone2.addChild(bone34);

		bone34_r1 = new ModelRenderer(this);
		bone34_r1.setRotationPoint(2.0F, 5.0F, 1.0F);
		bone34.addChild(bone34_r1);
		setRotationAngle(bone34_r1, 0.3946F, 0.2147F, 0.0442F);
		bone34_r1.setTextureOffset(495, 470).addBox(-1.25F, -0.75F, 0.125F, 7.0F, 6.0F, 1.0F, 0.0F, false);
		bone34_r1.setTextureOffset(317, 497).addBox(-3.25F, -7.75F, -2.875F, 2.0F, 11.0F, 3.0F, 0.0F, false);

		bone36 = new ModelRenderer(this);
		bone36.setRotationPoint(0.3106F, 9.0198F, 9.2952F);
		bone2.addChild(bone36);

		bone36_r1 = new ModelRenderer(this);
		bone36_r1.setRotationPoint(2.0F, 4.0F, 1.0F);
		bone36.addChild(bone36_r1);
		setRotationAngle(bone36_r1, 0.3946F, 0.2147F, 0.0442F);
		bone36_r1.setTextureOffset(495, 234).addBox(-1.25F, -0.75F, 0.125F, 7.0F, 6.0F, 1.0F, 0.0F, false);
		bone36_r1.setTextureOffset(307, 497).addBox(-3.25F, -7.75F, -2.875F, 2.0F, 11.0F, 3.0F, 0.0F, false);

		bone35 = new ModelRenderer(this);
		bone35.setRotationPoint(1.4156F, 6.234F, 13.5902F);
		bone2.addChild(bone35);

		bone35_r1 = new ModelRenderer(this);
		bone35_r1.setRotationPoint(2.0F, 3.0F, 1.0F);
		bone35.addChild(bone35_r1);
		setRotationAngle(bone35_r1, 0.3946F, 0.2147F, 0.0442F);
		bone35_r1.setTextureOffset(426, 60).addBox(-1.25F, -0.75F, 0.125F, 7.0F, 6.0F, 1.0F, 0.0F, false);
		bone35_r1.setTextureOffset(348, 468).addBox(-3.25F, -7.75F, -2.875F, 2.0F, 11.0F, 3.0F, 0.0F, false);

		bone79 = new ModelRenderer(this);
		bone79.setRotationPoint(-10.0836F, -22.4666F, -0.7253F);
		shangbanshen.addChild(bone79);

		bone79_r1 = new ModelRenderer(this);
		bone79_r1.setRotationPoint(-8.0642F, -7.7281F, 28.93F);
		bone79.addChild(bone79_r1);
		setRotationAngle(bone79_r1, 0.5224F, -0.2186F, -0.0154F);
		bone79_r1.setTextureOffset(233, 252).addBox(4.0F, -5.25F, -2.125F, 4.0F, 13.0F, 2.0F, 0.0F, true);

		bone79_r2 = new ModelRenderer(this);
		bone79_r2.setRotationPoint(-8.0642F, -7.7281F, 28.93F);
		bone79.addChild(bone79_r2);
		setRotationAngle(bone79_r2, 0.6564F, -0.2147F, -0.0442F);
		bone79_r2.setTextureOffset(0, 309).addBox(-6.0F, -9.25F, -1.875F, 9.0F, 20.0F, 3.0F, 0.0F, true);

		bone79_r3 = new ModelRenderer(this);
		bone79_r3.setRotationPoint(-6.0F, 4.0F, 14.0F);
		bone79.addChild(bone79_r3);
		setRotationAngle(bone79_r3, 0.5255F, -0.2147F, -0.0442F);
		bone79_r3.setTextureOffset(82, 403).addBox(-2.3276F, -15.7325F, 4.9518F, 5.0F, 8.0F, 12.0F, 0.0F, true);

		bone79_r4 = new ModelRenderer(this);
		bone79_r4.setRotationPoint(-14.012F, -5.8941F, 15.4813F);
		bone79.addChild(bone79_r4);
		setRotationAngle(bone79_r4, 0.2558F, -0.3016F, 0.0887F);
		bone79_r4.setTextureOffset(34, 448).addBox(-1.25F, -5.6452F, -10.4204F, 3.0F, 8.0F, 10.0F, 0.0F, true);

		bone79_r5 = new ModelRenderer(this);
		bone79_r5.setRotationPoint(-6.0F, 4.0F, 14.0F);
		bone79.addChild(bone79_r5);
		setRotationAngle(bone79_r5, 0.2637F, -0.2147F, 0.0431F);
		bone79_r5.setTextureOffset(89, 310).addBox(-7.8276F, -7.2325F, -1.7982F, 2.0F, 15.0F, 9.0F, 0.0F, true);

		bone79_r6 = new ModelRenderer(this);
		bone79_r6.setRotationPoint(-6.0F, 4.0F, 14.0F);
		bone79.addChild(bone79_r6);
		setRotationAngle(bone79_r6, 0.4818F, -0.2147F, -0.0442F);
		bone79_r6.setTextureOffset(226, 172).addBox(4.1724F, -7.1112F, -11.1039F, 6.0F, 6.0F, 29.0F, 0.0F, true);
		bone79_r6.setTextureOffset(60, 0).addBox(-5.8276F, -7.1112F, -11.1039F, 2.0F, 6.0F, 29.0F, 0.0F, true);

		bone79_r7 = new ModelRenderer(this);
		bone79_r7.setRotationPoint(-6.0F, 4.0F, 14.0F);
		bone79.addChild(bone79_r7);
		setRotationAngle(bone79_r7, 0.8309F, -0.2147F, -0.0442F);
		bone79_r7.setTextureOffset(239, 39).addBox(-6.3276F, -16.4645F, -11.107F, 13.0F, 13.0F, 4.0F, 0.0F, true);

		bone79_r8 = new ModelRenderer(this);
		bone79_r8.setRotationPoint(-14.012F, -5.8941F, 15.4813F);
		bone79.addChild(bone79_r8);
		setRotationAngle(bone79_r8, 0.3867F, -0.3016F, 0.176F);
		bone79_r8.setTextureOffset(0, 241).addBox(-2.25F, -5.7103F, -0.0875F, 4.0F, 16.0F, 9.0F, 0.0F, true);

		bone79_r9 = new ModelRenderer(this);
		bone79_r9.setRotationPoint(-6.0F, 4.0F, 14.0F);
		bone79.addChild(bone79_r9);
		setRotationAngle(bone79_r9, 0.1764F, -0.2147F, -0.0442F);
		bone79_r9.setTextureOffset(494, 447).addBox(-2.3276F, 4.3496F, -12.5248F, 5.0F, 3.0F, 4.0F, 0.0F, true);
		bone79_r9.setTextureOffset(386, 329).addBox(-2.3276F, 1.3496F, -9.5248F, 5.0F, 3.0F, 6.0F, 0.0F, true);
		bone79_r9.setTextureOffset(474, 33).addBox(-2.3276F, -1.6504F, -5.5248F, 5.0F, 3.0F, 7.0F, 0.0F, true);
		bone79_r9.setTextureOffset(467, 294).addBox(-2.3276F, -8.6504F, -0.5248F, 5.0F, 7.0F, 7.0F, 0.0F, true);

		bone79_r10 = new ModelRenderer(this);
		bone79_r10.setRotationPoint(-6.0F, 4.0F, 14.0F);
		bone79.addChild(bone79_r10);
		setRotationAngle(bone79_r10, 0.2035F, 0.558F, 0.1026F);
		bone79_r10.setTextureOffset(341, 413).addBox(4.2053F, 4.3596F, -7.497F, 3.0F, 3.0F, 3.0F, 0.0F, true);
		bone79_r10.setTextureOffset(384, 424).addBox(0.6698F, 1.3596F, -3.9615F, 3.0F, 3.0F, 3.0F, 0.0F, true);
		bone79_r10.setTextureOffset(218, 433).addBox(-2.8658F, -1.6404F, -0.4259F, 3.0F, 3.0F, 3.0F, 0.0F, true);
		bone79_r10.setTextureOffset(442, 214).addBox(-6.4013F, -4.6404F, 3.1096F, 3.0F, 3.0F, 3.0F, 0.0F, true);

		bone79_r11 = new ModelRenderer(this);
		bone79_r11.setRotationPoint(-6.0F, 4.0F, 14.0F);
		bone79.addChild(bone79_r11);
		setRotationAngle(bone79_r11, 0.0891F, -0.2147F, -0.0442F);
		bone79_r11.setTextureOffset(416, 443).addBox(-3.8276F, -14.067F, 4.8394F, 8.0F, 9.0F, 7.0F, 0.0F, true);

		bone79_r12 = new ModelRenderer(this);
		bone79_r12.setRotationPoint(-6.0F, 4.0F, 14.0F);
		bone79.addChild(bone79_r12);
		setRotationAngle(bone79_r12, 0.3946F, -0.2147F, -0.0442F);
		bone79_r12.setTextureOffset(80, 198).addBox(-5.3276F, -12.9671F, -5.6927F, 11.0F, 7.0F, 15.0F, 0.0F, true);

		bone79_r13 = new ModelRenderer(this);
		bone79_r13.setRotationPoint(-6.0F, 4.0F, 14.0F);
		bone79.addChild(bone79_r13);
		setRotationAngle(bone79_r13, 0.7175F, -0.2147F, -0.0442F);
		bone79_r13.setTextureOffset(306, 272).addBox(-3.3276F, -7.4843F, -11.3269F, 7.0F, 7.0F, 20.0F, 0.0F, true);

		bone79_r14 = new ModelRenderer(this);
		bone79_r14.setRotationPoint(-6.0F, 4.0F, 14.0F);
		bone79.addChild(bone79_r14);
		setRotationAngle(bone79_r14, 1.0491F, -0.2147F, -0.0442F);
		bone79_r14.setTextureOffset(340, 260).addBox(-4.3276F, -9.6953F, -14.3157F, 9.0F, 4.0F, 16.0F, 0.0F, true);

		bone80 = new ModelRenderer(this);
		bone80.setRotationPoint(-3.6254F, -1.3376F, 23.1802F);
		bone79.addChild(bone80);

		bone80_r1 = new ModelRenderer(this);
		bone80_r1.setRotationPoint(-2.0F, 3.0F, 0.0F);
		bone80.addChild(bone80_r1);
		setRotationAngle(bone80_r1, 0.3946F, -0.2147F, -0.0442F);
		bone80_r1.setTextureOffset(496, 73).addBox(-5.75F, -0.75F, 0.125F, 7.0F, 6.0F, 1.0F, 0.0F, true);
		bone80_r1.setTextureOffset(460, 497).addBox(1.25F, -7.75F, -2.875F, 2.0F, 11.0F, 3.0F, 0.0F, true);

		bone81 = new ModelRenderer(this);
		bone81.setRotationPoint(-2.5205F, 0.4482F, 17.8852F);
		bone79.addChild(bone81);

		bone81_r1 = new ModelRenderer(this);
		bone81_r1.setRotationPoint(-2.0F, 5.0F, 1.0F);
		bone81.addChild(bone81_r1);
		setRotationAngle(bone81_r1, 0.3946F, -0.2147F, -0.0442F);
		bone81_r1.setTextureOffset(495, 470).addBox(-5.75F, -0.75F, 0.125F, 7.0F, 6.0F, 1.0F, 0.0F, true);
		bone81_r1.setTextureOffset(317, 497).addBox(1.25F, -7.75F, -2.875F, 2.0F, 11.0F, 3.0F, 0.0F, true);

		bone82 = new ModelRenderer(this);
		bone82.setRotationPoint(-0.3106F, 9.0198F, 9.2952F);
		bone79.addChild(bone82);

		bone82_r1 = new ModelRenderer(this);
		bone82_r1.setRotationPoint(-2.0F, 4.0F, 1.0F);
		bone82.addChild(bone82_r1);
		setRotationAngle(bone82_r1, 0.3946F, -0.2147F, -0.0442F);
		bone82_r1.setTextureOffset(495, 234).addBox(-5.75F, -0.75F, 0.125F, 7.0F, 6.0F, 1.0F, 0.0F, true);
		bone82_r1.setTextureOffset(307, 497).addBox(1.25F, -7.75F, -2.875F, 2.0F, 11.0F, 3.0F, 0.0F, true);

		bone83 = new ModelRenderer(this);
		bone83.setRotationPoint(-1.4156F, 6.234F, 13.5902F);
		bone79.addChild(bone83);

		bone83_r1 = new ModelRenderer(this);
		bone83_r1.setRotationPoint(-2.0F, 3.0F, 1.0F);
		bone83.addChild(bone83_r1);
		setRotationAngle(bone83_r1, 0.3946F, -0.2147F, -0.0442F);
		bone83_r1.setTextureOffset(426, 60).addBox(-5.75F, -0.75F, 0.125F, 7.0F, 6.0F, 1.0F, 0.0F, true);
		bone83_r1.setTextureOffset(348, 468).addBox(1.25F, -7.75F, -2.875F, 2.0F, 11.0F, 3.0F, 0.0F, true);

		tou = new ModelRenderer(this);
		tou.setRotationPoint(0.0F, -35.0F, -12.0F);
		shangbanshen.addChild(tou);

		tou_r1 = new ModelRenderer(this);
		tou_r1.setRotationPoint(0.0F, -5.9928F, -4.2515F);
		tou.addChild(tou_r1);
		setRotationAngle(tou_r1, 1.0908F, 0.0F, 0.0F);
		tou_r1.setTextureOffset(117, 198).addBox(-4.0F, -17.5F, -1.0F, 8.0F, 10.0F, 5.0F, 0.0F, false);

		tou_r2 = new ModelRenderer(this);
		tou_r2.setRotationPoint(-9.288F, -16.0501F, -4.1414F);
		tou.addChild(tou_r2);
		setRotationAngle(tou_r2, 0.1028F, 0.1152F, -0.3483F);
		tou_r2.setTextureOffset(300, 350).addBox(-1.5875F, -4.2489F, -2.7082F, 2.0F, 8.0F, 3.0F, 0.0F, false);

		tou_r3 = new ModelRenderer(this);
		tou_r3.setRotationPoint(9.288F, -16.0501F, -4.1414F);
		tou.addChild(tou_r3);
		setRotationAngle(tou_r3, 0.1028F, -0.1152F, 0.3483F);
		tou_r3.setTextureOffset(366, 343).addBox(-0.4125F, -4.2489F, -2.7082F, 2.0F, 8.0F, 3.0F, 0.0F, false);

		tou_r4 = new ModelRenderer(this);
		tou_r4.setRotationPoint(-9.288F, -16.0501F, -4.1414F);
		tou.addChild(tou_r4);
		setRotationAngle(tou_r4, 0.0591F, 0.1152F, -0.3483F);
		tou_r4.setTextureOffset(380, 499).addBox(-0.6175F, -19.3795F, 0.7332F, 1.0F, 13.0F, 2.0F, 0.0F, false);

		tou_r5 = new ModelRenderer(this);
		tou_r5.setRotationPoint(9.288F, -16.0501F, -4.1414F);
		tou.addChild(tou_r5);
		setRotationAngle(tou_r5, 0.0591F, -0.1152F, 0.3483F);
		tou_r5.setTextureOffset(386, 499).addBox(-0.4425F, -19.3795F, 0.7332F, 1.0F, 13.0F, 2.0F, 0.0F, false);

		tou_r6 = new ModelRenderer(this);
		tou_r6.setRotationPoint(-9.288F, -16.0501F, -4.1414F);
		tou.addChild(tou_r6);
		setRotationAngle(tou_r6, -0.5954F, 0.1152F, -0.3483F);
		tou_r6.setTextureOffset(196, 95).addBox(-0.5875F, -6.6295F, -3.327F, 1.0F, 3.0F, 3.0F, 0.0F, false);

		tou_r7 = new ModelRenderer(this);
		tou_r7.setRotationPoint(9.288F, -16.0501F, -4.1414F);
		tou.addChild(tou_r7);
		setRotationAngle(tou_r7, -0.5954F, -0.1152F, 0.3483F);
		tou_r7.setTextureOffset(256, 222).addBox(-0.4125F, -6.6295F, -3.327F, 1.0F, 3.0F, 3.0F, 0.0F, false);

		tou_r8 = new ModelRenderer(this);
		tou_r8.setRotationPoint(-9.288F, -16.0501F, -4.1414F);
		tou.addChild(tou_r8);
		setRotationAngle(tou_r8, -0.0718F, 0.1152F, -0.3483F);
		tou_r8.setTextureOffset(128, 354).addBox(-0.6075F, -17.6091F, -1.56F, 1.0F, 14.0F, 2.0F, 0.0F, false);

		tou_r9 = new ModelRenderer(this);
		tou_r9.setRotationPoint(9.288F, -16.0501F, -4.1414F);
		tou.addChild(tou_r9);
		setRotationAngle(tou_r9, -0.0718F, -0.1152F, 0.3483F);
		tou_r9.setTextureOffset(146, 497).addBox(-0.4325F, -17.6091F, -1.56F, 1.0F, 14.0F, 2.0F, 0.0F, false);

		tou_r10 = new ModelRenderer(this);
		tou_r10.setRotationPoint(-9.288F, -16.0501F, -4.1414F);
		tou.addChild(tou_r10);
		setRotationAngle(tou_r10, -0.2027F, 0.1152F, -0.3483F);
		tou_r10.setTextureOffset(498, 257).addBox(-1.5975F, -4.1894F, -4.0069F, 2.0F, 10.0F, 3.0F, 0.0F, false);

		tou_r11 = new ModelRenderer(this);
		tou_r11.setRotationPoint(9.288F, -16.0501F, -4.1414F);
		tou.addChild(tou_r11);
		setRotationAngle(tou_r11, -0.2027F, -0.1152F, 0.3483F);
		tou_r11.setTextureOffset(498, 412).addBox(-0.4225F, -4.1894F, -4.0069F, 2.0F, 10.0F, 3.0F, 0.0F, false);

		tou_r12 = new ModelRenderer(this);
		tou_r12.setRotationPoint(-9.248F, -16.3701F, -4.2214F);
		tou.addChild(tou_r12);
		setRotationAngle(tou_r12, 0.2494F, -0.0489F, -0.3463F);
		tou_r12.setTextureOffset(204, 39).addBox(-0.0875F, 1.9036F, 0.818F, 1.0F, 1.0F, 2.0F, 0.0F, false);
		tou_r12.setTextureOffset(209, 134).addBox(-0.0875F, 7.4359F, -2.0619F, 1.0F, 1.0F, 2.0F, 0.0F, false);

		tou_r13 = new ModelRenderer(this);
		tou_r13.setRotationPoint(9.248F, -16.3701F, -4.2214F);
		tou.addChild(tou_r13);
		setRotationAngle(tou_r13, 0.2494F, 0.0489F, 0.3463F);
		tou_r13.setTextureOffset(204, 42).addBox(-0.9125F, 1.9036F, 0.818F, 1.0F, 1.0F, 2.0F, 0.0F, false);
		tou_r13.setTextureOffset(152, 212).addBox(-0.9125F, 7.4359F, -2.0619F, 1.0F, 1.0F, 2.0F, 0.0F, false);

		tou_r14 = new ModelRenderer(this);
		tou_r14.setRotationPoint(-9.248F, -16.3701F, -4.2214F);
		tou.addChild(tou_r14);
		setRotationAngle(tou_r14, -0.2306F, -0.0489F, -0.3463F);
		tou_r14.setTextureOffset(36, 202).addBox(-0.0975F, 1.3107F, 1.6046F, 1.0F, 6.0F, 3.0F, 0.0F, false);

		tou_r15 = new ModelRenderer(this);
		tou_r15.setRotationPoint(9.248F, -16.3701F, -4.2214F);
		tou.addChild(tou_r15);
		setRotationAngle(tou_r15, -0.2306F, 0.0489F, 0.3463F);
		tou_r15.setTextureOffset(80, 220).addBox(-0.9225F, 1.3107F, 1.6046F, 1.0F, 6.0F, 3.0F, 0.0F, false);

		tou_r16 = new ModelRenderer(this);
		tou_r16.setRotationPoint(-9.248F, -16.3701F, -4.2214F);
		tou.addChild(tou_r16);
		setRotationAngle(tou_r16, 0.293F, -0.0489F, -0.3463F);
		tou_r16.setTextureOffset(160, 149).addBox(-2.0875F, 4.5376F, -6.9374F, 6.0F, 1.0F, 4.0F, 0.0F, false);
		tou_r16.setTextureOffset(255, 429).addBox(-2.5875F, 3.7876F, -6.4374F, 3.0F, 3.0F, 7.0F, 0.0F, false);

		tou_r17 = new ModelRenderer(this);
		tou_r17.setRotationPoint(9.248F, -16.3701F, -4.2214F);
		tou.addChild(tou_r17);
		setRotationAngle(tou_r17, 0.293F, 0.0489F, 0.3463F);
		tou_r17.setTextureOffset(196, 106).addBox(-4.6625F, 4.5376F, -6.9374F, 6.0F, 1.0F, 4.0F, 0.0F, false);
		tou_r17.setTextureOffset(482, 470).addBox(-0.4125F, 3.7876F, -6.4374F, 3.0F, 3.0F, 7.0F, 0.0F, false);

		tou_r18 = new ModelRenderer(this);
		tou_r18.setRotationPoint(0.0F, -3.3085F, -7.0926F);
		tou.addChild(tou_r18);
		setRotationAngle(tou_r18, 0.8727F, 0.0F, 0.0F);
		tou_r18.setTextureOffset(276, 299).addBox(-4.0F, -7.737F, 4.0F, 8.0F, 3.0F, 2.0F, 0.0F, false);
		tou_r18.setTextureOffset(294, 75).addBox(-2.01F, -18.5F, -1.75F, 4.0F, 14.0F, 4.0F, 0.0F, false);
		tou_r18.setTextureOffset(306, 299).addBox(-3.01F, -4.5F, -0.5F, 6.0F, 1.0F, 4.0F, 0.0F, false);
		tou_r18.setTextureOffset(458, 0).addBox(-4.01F, -17.5F, -1.0F, 8.0F, 12.0F, 5.0F, 0.0F, false);

		tou_r19 = new ModelRenderer(this);
		tou_r19.setRotationPoint(0.0F, -4.3085F, -4.7779F);
		tou.addChild(tou_r19);
		setRotationAngle(tou_r19, 0.9031F, -0.2217F, -0.2719F);
		tou_r19.setTextureOffset(40, 256).addBox(-4.6573F, 2.0F, -4.0245F, 3.0F, 1.0F, 9.0F, 0.0F, false);

		tou_r20 = new ModelRenderer(this);
		tou_r20.setRotationPoint(0.0F, -4.3085F, -6.7179F);
		tou.addChild(tou_r20);
		setRotationAngle(tou_r20, 0.9031F, -0.2217F, -0.2719F);
		tou_r20.setTextureOffset(99, 101).addBox(-4.6573F, -3.5F, -4.0245F, 2.0F, 7.0F, 9.0F, 0.0F, false);

		tou_r21 = new ModelRenderer(this);
		tou_r21.setRotationPoint(0.0F, -4.3085F, -4.7779F);
		tou.addChild(tou_r21);
		setRotationAngle(tou_r21, 0.9031F, 0.2217F, 0.2719F);
		tou_r21.setTextureOffset(72, 339).addBox(1.1573F, 2.0F, -4.0245F, 3.0F, 1.0F, 9.0F, 0.0F, false);

		tou_r22 = new ModelRenderer(this);
		tou_r22.setRotationPoint(0.0F, -4.3085F, -6.7179F);
		tou.addChild(tou_r22);
		setRotationAngle(tou_r22, 0.9031F, 0.2217F, 0.2719F);
		tou_r22.setTextureOffset(170, 382).addBox(2.6573F, -3.5F, -4.0245F, 2.0F, 7.0F, 9.0F, 0.0F, false);

		tou_r23 = new ModelRenderer(this);
		tou_r23.setRotationPoint(-0.0029F, -13.9623F, 1.758F);
		tou.addChild(tou_r23);
		setRotationAngle(tou_r23, -0.657F, -0.3835F, 0.281F);
		tou_r23.setTextureOffset(0, 502).addBox(-3.1834F, -6.1831F, 3.5264F, 2.0F, 14.0F, 1.0F, 0.0F, true);

		tou_r24 = new ModelRenderer(this);
		tou_r24.setRotationPoint(0.0029F, -13.9623F, 1.758F);
		tou.addChild(tou_r24);
		setRotationAngle(tou_r24, -0.657F, 0.3835F, -0.281F);
		tou_r24.setTextureOffset(0, 502).addBox(0.9474F, -6.1831F, 3.5264F, 2.0F, 14.0F, 1.0F, 0.0F, false);

		tou_r25 = new ModelRenderer(this);
		tou_r25.setRotationPoint(0.0029F, -13.9623F, 1.758F);
		tou.addChild(tou_r25);
		setRotationAngle(tou_r25, -0.6021F, 0.0F, 0.0F);
		tou_r25.setTextureOffset(212, 68).addBox(-2.9952F, -6.1831F, 2.8106F, 6.0F, 12.0F, 1.0F, 0.0F, false);

		tou_r26 = new ModelRenderer(this);
		tou_r26.setRotationPoint(0.0029F, -13.9623F, 1.758F);
		tou.addChild(tou_r26);
		setRotationAngle(tou_r26, -0.6545F, 0.0F, 0.0F);
		tou_r26.setTextureOffset(465, 17).addBox(-5.0029F, -6.3209F, 0.218F, 10.0F, 14.0F, 2.0F, 0.0F, false);

		tou_r27 = new ModelRenderer(this);
		tou_r27.setRotationPoint(0.0F, -16.3643F, -1.3308F);
		tou.addChild(tou_r27);
		setRotationAngle(tou_r27, -0.7418F, 0.0F, 0.0F);
		tou_r27.setTextureOffset(152, 97).addBox(-3.0F, -6.3499F, -1.872F, 6.0F, 12.0F, 2.0F, 0.0F, false);

		tou_r28 = new ModelRenderer(this);
		tou_r28.setRotationPoint(0.0F, -16.3643F, -1.3308F);
		tou.addChild(tou_r28);
		setRotationAngle(tou_r28, -0.9136F, -0.5484F, 0.5942F);
		tou_r28.setTextureOffset(152, 499).addBox(-3.445F, -6.3499F, 0.7976F, 1.0F, 14.0F, 2.0F, 0.0F, false);

		tou_r29 = new ModelRenderer(this);
		tou_r29.setRotationPoint(0.0F, -16.3643F, -1.3308F);
		tou.addChild(tou_r29);
		setRotationAngle(tou_r29, -0.9136F, 0.5484F, -0.5942F);
		tou_r29.setTextureOffset(158, 499).addBox(1.945F, -6.3499F, 0.7976F, 1.0F, 14.0F, 2.0F, 0.0F, false);

		tou_r30 = new ModelRenderer(this);
		tou_r30.setRotationPoint(0.0F, -16.3643F, -1.3308F);
		tou.addChild(tou_r30);
		setRotationAngle(tou_r30, -0.6545F, 0.0F, 0.0F);
		tou_r30.setTextureOffset(260, 460).addBox(-5.0F, -6.3145F, 0.681F, 10.0F, 15.0F, 2.0F, 0.0F, false);

		tou_r31 = new ModelRenderer(this);
		tou_r31.setRotationPoint(0.0F, -9.0405F, 5.4765F);
		tou.addChild(tou_r31);
		setRotationAngle(tou_r31, 0.0436F, 0.0F, 0.0F);
		tou_r31.setTextureOffset(124, 56).addBox(-7.8654F, 0.5726F, -6.5129F, 15.0F, 5.0F, 1.0F, 0.0F, false);

		tou_r32 = new ModelRenderer(this);
		tou_r32.setRotationPoint(0.0F, -9.0105F, 5.4765F);
		tou.addChild(tou_r32);
		setRotationAngle(tou_r32, 0.1745F, 0.0F, 0.0F);
		tou_r32.setTextureOffset(0, 38).addBox(-8.1254F, 3.6413F, -7.3956F, 16.0F, 1.0F, 7.0F, 0.0F, false);
		tou_r32.setTextureOffset(361, 124).addBox(-3.25F, 3.6413F, -0.4328F, 6.0F, 1.0F, 7.0F, 0.0F, false);

		tou_r33 = new ModelRenderer(this);
		tou_r33.setRotationPoint(0.0F, -4.9022F, 1.6594F);
		tou.addChild(tou_r33);
		setRotationAngle(tou_r33, -0.1309F, 0.0F, 0.0F);
		tou_r33.setTextureOffset(0, 300).addBox(-7.3754F, -1.75F, -8.121F, 14.0F, 2.0F, 7.0F, 0.0F, false);

		tou_r34 = new ModelRenderer(this);
		tou_r34.setRotationPoint(0.0F, -4.9022F, 4.6594F);
		tou.addChild(tou_r34);
		setRotationAngle(tou_r34, 0.0436F, 0.0F, 0.0F);
		tou_r34.setTextureOffset(187, 467).addBox(-1.8754F, -1.75F, -8.121F, 3.0F, 12.0F, 7.0F, 0.0F, false);
		tou_r34.setTextureOffset(439, 17).addBox(-2.8754F, -1.75F, -7.121F, 5.0F, 12.0F, 8.0F, 0.0F, false);
		tou_r34.setTextureOffset(428, 260).addBox(-6.8754F, -1.75F, -7.121F, 13.0F, 4.0F, 6.0F, 0.0F, false);
		tou_r34.setTextureOffset(388, 245).addBox(-3.0F, -1.75F, -1.1582F, 6.0F, 4.0F, 7.0F, 0.0F, false);

		tou_r35 = new ModelRenderer(this);
		tou_r35.setRotationPoint(-3.5F, -1.0894F, 1.6713F);
		tou.addChild(tou_r35);
		setRotationAngle(tou_r35, -0.48F, 0.0F, 0.2182F);
		tou_r35.setTextureOffset(230, 0).addBox(-1.1254F, -5.6396F, -0.9718F, 2.0F, 15.0F, 2.0F, 0.0F, false);
		tou_r35.setTextureOffset(220, 106).addBox(-1.3754F, -5.8704F, -1.5282F, 3.0F, 7.0F, 3.0F, 0.0F, false);

		tou_r36 = new ModelRenderer(this);
		tou_r36.setRotationPoint(3.5F, -1.0894F, 1.6713F);
		tou.addChild(tou_r36);
		setRotationAngle(tou_r36, -0.48F, 0.0F, -0.2182F);
		tou_r36.setTextureOffset(230, 17).addBox(-0.8754F, -5.6396F, -0.9718F, 2.0F, 15.0F, 2.0F, 0.0F, false);
		tou_r36.setTextureOffset(175, 261).addBox(-1.6254F, -5.8704F, -1.5282F, 3.0F, 7.0F, 3.0F, 0.0F, false);

		tou_r37 = new ModelRenderer(this);
		tou_r37.setRotationPoint(0.0F, -9.0405F, 5.4765F);
		tou.addChild(tou_r37);
		setRotationAngle(tou_r37, 0.3054F, 0.0F, 0.0F);
		tou_r37.setTextureOffset(420, 125).addBox(-7.8754F, -1.1426F, -6.4392F, 15.0F, 5.0F, 5.0F, 0.0F, false);
		tou_r37.setTextureOffset(182, 331).addBox(-3.0F, -1.1426F, -1.4764F, 6.0F, 5.0F, 7.0F, 0.0F, false);

		tou_r38 = new ModelRenderer(this);
		tou_r38.setRotationPoint(0.0F, -9.0105F, 5.4765F);
		tou.addChild(tou_r38);
		setRotationAngle(tou_r38, 0.212F, 0.6003F, 0.121F);
		tou_r38.setTextureOffset(392, 52).addBox(-6.429F, 3.6413F, -4.9846F, 6.0F, 1.0F, 8.0F, 0.0F, false);

		tou_r39 = new ModelRenderer(this);
		tou_r39.setRotationPoint(0.0F, -4.9022F, 4.6594F);
		tou.addChild(tou_r39);
		setRotationAngle(tou_r39, 0.0532F, 0.6102F, 0.0305F);
		tou_r39.setTextureOffset(462, 322).addBox(-5.8082F, -1.75F, -5.4354F, 6.0F, 4.0F, 8.0F, 0.0F, false);

		tou_r40 = new ModelRenderer(this);
		tou_r40.setRotationPoint(0.0F, -9.0405F, 5.4765F);
		tou.addChild(tou_r40);
		setRotationAngle(tou_r40, 0.3674F, 0.5788F, 0.2075F);
		tou_r40.setTextureOffset(460, 229).addBox(-5.6257F, -1.1326F, -5.696F, 6.0F, 5.0F, 8.0F, 0.0F, false);

		tou_r41 = new ModelRenderer(this);
		tou_r41.setRotationPoint(0.0F, -9.0105F, 5.4765F);
		tou.addChild(tou_r41);
		setRotationAngle(tou_r41, 0.212F, -0.6003F, -0.121F);
		tou_r41.setTextureOffset(396, 25).addBox(0.429F, 3.6413F, -4.9846F, 6.0F, 1.0F, 8.0F, 0.0F, false);

		tou_r42 = new ModelRenderer(this);
		tou_r42.setRotationPoint(0.0F, -4.9022F, 4.6594F);
		tou.addChild(tou_r42);
		setRotationAngle(tou_r42, 0.0532F, -0.6102F, -0.0305F);
		tou_r42.setTextureOffset(463, 210).addBox(-0.1918F, -1.75F, -5.4354F, 6.0F, 4.0F, 8.0F, 0.0F, false);

		tou_r43 = new ModelRenderer(this);
		tou_r43.setRotationPoint(0.0F, -9.0405F, 5.4765F);
		tou.addChild(tou_r43);
		setRotationAngle(tou_r43, 0.3674F, -0.5788F, -0.2075F);
		tou_r43.setTextureOffset(147, 461).addBox(-0.3743F, -1.1326F, -5.696F, 6.0F, 5.0F, 8.0F, 0.0F, false);

		tou_r44 = new ModelRenderer(this);
		tou_r44.setRotationPoint(0.0F, -9.0405F, 5.4765F);
		tou.addChild(tou_r44);
		setRotationAngle(tou_r44, 0.5236F, 0.0F, 0.0F);
		tou_r44.setTextureOffset(0, 229).addBox(-4.0F, -2.1426F, -2.4764F, 8.0F, 2.0F, 5.0F, 0.0F, false);

		tou_r45 = new ModelRenderer(this);
		tou_r45.setRotationPoint(0.0F, -4.3085F, -4.7779F);
		tou.addChild(tou_r45);
		setRotationAngle(tou_r45, 0.8727F, 0.0F, 0.0F);
		tou_r45.setTextureOffset(366, 343).addBox(-3.0F, 2.0F, -5.3747F, 6.0F, 1.0F, 12.0F, 0.0F, false);

		tou_r46 = new ModelRenderer(this);
		tou_r46.setRotationPoint(0.0F, -11.5462F, -7.2864F);
		tou.addChild(tou_r46);
		setRotationAngle(tou_r46, -0.2618F, 0.0F, 0.0F);
		tou_r46.setTextureOffset(438, 153).addBox(-5.25F, -0.305F, -2.5F, 10.0F, 3.0F, 7.0F, 0.0F, false);

		tou_r47 = new ModelRenderer(this);
		tou_r47.setRotationPoint(0.0F, -4.3085F, -6.7179F);
		tou.addChild(tou_r47);
		setRotationAngle(tou_r47, 0.3491F, 0.0F, 0.0F);
		tou_r47.setTextureOffset(407, 87).addBox(-3.0F, -11.25F, -3.3747F, 6.0F, 4.0F, 12.0F, 0.0F, false);

		tou_r48 = new ModelRenderer(this);
		tou_r48.setRotationPoint(0.0F, -4.3085F, -6.7179F);
		tou.addChild(tou_r48);
		setRotationAngle(tou_r48, 0.8727F, 0.0F, 0.0F);
		tou_r48.setTextureOffset(42, 265).addBox(-3.0F, -3.53F, -5.3747F, 6.0F, 7.0F, 24.0F, 0.0F, false);

		youtui = new ModelRenderer(this);
		youtui.setRotationPoint(6.75F, -7.8292F, 1.8438F);
		xiabanshen.addChild(youtui);
		setRotationAngle(youtui, -0.0912F, -0.262F, -0.0862F);

		youtui_r1 = new ModelRenderer(this);
		youtui_r1.setRotationPoint(10.0F, 24.8149F, -15.2028F);
		youtui.addChild(youtui_r1);
		setRotationAngle(youtui_r1, 0.1745F, 0.0F, 0.0F);
		youtui_r1.setTextureOffset(386, 0).addBox(-1.0F, -1.0F, 0.0F, 10.0F, 14.0F, 8.0F, 0.0F, false);

		youtui_r2 = new ModelRenderer(this);
		youtui_r2.setRotationPoint(9.0F, 10.5969F, -1.0318F);
		youtui.addChild(youtui_r2);
		setRotationAngle(youtui_r2, -0.4363F, 0.0F, 0.0F);
		youtui_r2.setTextureOffset(153, 293).addBox(-3.0F, 23.0F, 0.5F, 11.0F, 8.0F, 9.0F, 0.0F, false);
		youtui_r2.setTextureOffset(22, 58).addBox(-2.0F, 6.0F, 6.5F, 8.0F, 17.0F, 3.0F, 0.0F, false);

		youtui_r3 = new ModelRenderer(this);
		youtui_r3.setRotationPoint(11.0F, 39.7369F, -7.5508F);
		youtui.addChild(youtui_r3);
		setRotationAngle(youtui_r3, -0.7418F, 0.0F, 0.0F);
		youtui_r3.setTextureOffset(451, 37).addBox(-3.5F, -5.75F, -2.75F, 8.0F, 6.0F, 7.0F, 0.0F, false);

		youtui_r4 = new ModelRenderer(this);
		youtui_r4.setRotationPoint(9.0F, 18.0969F, -6.0318F);
		youtui.addChild(youtui_r4);
		setRotationAngle(youtui_r4, -0.1745F, 0.0F, 0.0F);
		youtui_r4.setTextureOffset(74, 165).addBox(-1.0F, 6.0F, 6.5F, 6.0F, 13.0F, 2.0F, 0.0F, false);

		youtui_r5 = new ModelRenderer(this);
		youtui_r5.setRotationPoint(8.99F, 9.8578F, -2.782F);
		youtui.addChild(youtui_r5);
		setRotationAngle(youtui_r5, -0.4363F, 0.0F, 0.0F);
		youtui_r5.setTextureOffset(134, 353).addBox(-3.99F, 6.0F, 0.5F, 13.0F, 18.0F, 8.0F, 0.0F, false);

		youtui_r6 = new ModelRenderer(this);
		youtui_r6.setRotationPoint(11.0F, 26.3688F, 8.8677F);
		youtui.addChild(youtui_r6);
		setRotationAngle(youtui_r6, 0.2618F, 0.0F, 0.0F);
		youtui_r6.setTextureOffset(204, 0).addBox(-1.0F, 0.4491F, -2.687F, 2.0F, 2.0F, 1.0F, 0.0F, false);

		youtui_r7 = new ModelRenderer(this);
		youtui_r7.setRotationPoint(11.0F, 26.3688F, 8.8677F);
		youtui.addChild(youtui_r7);
		setRotationAngle(youtui_r7, -0.1309F, 0.0F, 0.0F);
		youtui_r7.setTextureOffset(204, 3).addBox(-1.0F, 0.1476F, 2.6714F, 2.0F, 2.0F, 1.0F, 0.0F, false);

		youtui_r8 = new ModelRenderer(this);
		youtui_r8.setRotationPoint(10.0F, -4.2815F, -5.7253F);
		youtui.addChild(youtui_r8);
		setRotationAngle(youtui_r8, -0.3054F, 0.0F, 0.0F);
		youtui_r8.setTextureOffset(7, 505).addBox(-0.75F, 1.0F, -0.5F, 9.0F, 15.0F, 4.0F, 0.0F, false);
		youtui_r8.setTextureOffset(136, 429).addBox(-1.0F, 0.5F, -2.25F, 10.0F, 14.0F, 5.0F, 0.0F, false);

		youtui_r9 = new ModelRenderer(this);
		youtui_r9.setRotationPoint(11.0F, 26.3688F, 8.8677F);
		youtui.addChild(youtui_r9);
		setRotationAngle(youtui_r9, 0.0807F, 0.0334F, -0.3914F);
		youtui_r9.setTextureOffset(296, 277).addBox(-3.0707F, -0.0202F, -1.0327F, 1.0F, 2.0F, 3.0F, 0.0F, false);

		youtui_r10 = new ModelRenderer(this);
		youtui_r10.setRotationPoint(11.0F, 26.3688F, 8.8677F);
		youtui.addChild(youtui_r10);
		setRotationAngle(youtui_r10, 0.0807F, -0.0334F, 0.3914F);
		youtui_r10.setTextureOffset(296, 299).addBox(2.0707F, -0.0202F, -1.0327F, 1.0F, 2.0F, 3.0F, 0.0F, false);

		youtui_r11 = new ModelRenderer(this);
		youtui_r11.setRotationPoint(11.0F, 26.3688F, 8.8677F);
		youtui.addChild(youtui_r11);
		setRotationAngle(youtui_r11, 0.0873F, 0.0F, 0.0F);
		youtui_r11.setTextureOffset(470, 80).addBox(-2.0F, -0.111F, -2.0327F, 4.0F, 2.0F, 5.0F, 0.0F, false);
		youtui_r11.setTextureOffset(343, 27).addBox(-1.5F, -8.6642F, -3.9799F, 3.0F, 9.0F, 2.0F, 0.0F, false);
		youtui_r11.setTextureOffset(465, 141).addBox(-2.5F, -8.1165F, -2.8678F, 5.0F, 8.0F, 7.0F, 0.0F, false);

		youtui_r12 = new ModelRenderer(this);
		youtui_r12.setRotationPoint(11.0F, 16.0799F, 7.7477F);
		youtui.addChild(youtui_r12);
		setRotationAngle(youtui_r12, -0.0436F, 0.0F, 0.0F);
		youtui_r12.setTextureOffset(435, 370).addBox(-3.5F, -4.5F, -4.0F, 7.0F, 9.0F, 8.0F, 0.0F, false);

		youtui_r13 = new ModelRenderer(this);
		youtui_r13.setRotationPoint(9.0F, -4.5315F, 5.6447F);
		youtui.addChild(youtui_r13);
		setRotationAngle(youtui_r13, -0.0436F, 0.0F, 0.0F);
		youtui_r13.setTextureOffset(54, 399).addBox(-3.0F, 11.0F, -2.0F, 10.0F, 5.0F, 10.0F, 0.0F, false);
		youtui_r13.setTextureOffset(320, 117).addBox(-3.0F, 16.0F, -1.0F, 10.0F, 10.0F, 2.0F, 0.0F, false);

		youtui_r14 = new ModelRenderer(this);
		youtui_r14.setRotationPoint(9.0F, -4.5315F, -3.3553F);
		youtui.addChild(youtui_r14);
		setRotationAngle(youtui_r14, -0.0436F, 0.0F, 0.0F);
		youtui_r14.setTextureOffset(106, 467).addBox(-2.0F, 7.0F, 7.0F, 8.0F, 17.0F, 2.0F, 0.0F, false);

		youtui_r15 = new ModelRenderer(this);
		youtui_r15.setRotationPoint(9.0F, -5.2815F, -5.3553F);
		youtui.addChild(youtui_r15);
		setRotationAngle(youtui_r15, -0.0436F, 0.0F, 0.0F);
		youtui_r15.setTextureOffset(120, 180).addBox(-4.0F, 6.75F, 6.0F, 13.0F, 2.0F, 1.0F, 0.0F, false);
		youtui_r15.setTextureOffset(196, 161).addBox(-4.0F, 8.75F, 5.0F, 13.0F, 2.0F, 3.0F, 0.0F, false);
		youtui_r15.setTextureOffset(82, 354).addBox(-4.01F, 11.0F, 0.06F, 13.0F, 13.0F, 9.0F, 0.0F, false);

		youtui_r16 = new ModelRenderer(this);
		youtui_r16.setRotationPoint(7.7475F, 17.7917F, -6.4139F);
		youtui.addChild(youtui_r16);
		setRotationAngle(youtui_r16, -0.3054F, 0.0F, -0.0873F);
		youtui_r16.setTextureOffset(47, 58).addBox(-2.5075F, -16.0723F, -5.063F, 5.0F, 20.0F, 9.0F, 0.0F, false);

		youtui_r17 = new ModelRenderer(this);
		youtui_r17.setRotationPoint(9.0F, 2.6778F, 3.7248F);
		youtui.addChild(youtui_r17);
		setRotationAngle(youtui_r17, 0.3491F, 0.0F, 0.0F);
		youtui_r17.setTextureOffset(367, 132).addBox(-1.5F, -5.5F, -7.0F, 7.0F, 12.0F, 12.0F, 0.0F, false);

		youtui_r18 = new ModelRenderer(this);
		youtui_r18.setRotationPoint(10.0F, -4.7815F, -6.3553F);
		youtui.addChild(youtui_r18);
		setRotationAngle(youtui_r18, 0.5236F, 0.0F, 0.0F);
		youtui_r18.setTextureOffset(343, 27).addBox(-7.0F, 7.0F, -3.0F, 14.0F, 8.0F, 11.0F, 0.0F, false);
		youtui_r18.setTextureOffset(58, 105).addBox(-7.0F, 4.0F, -3.0F, 14.0F, 3.0F, 13.0F, 0.0F, false);
		youtui_r18.setTextureOffset(404, 404).addBox(-4.0F, 1.0F, 3.0F, 10.0F, 7.0F, 9.0F, 0.0F, false);

		youtui_r19 = new ModelRenderer(this);
		youtui_r19.setRotationPoint(10.0F, -8.0413F, 0.473F);
		youtui.addChild(youtui_r19);
		setRotationAngle(youtui_r19, -1.2217F, 0.0F, 0.0F);
		youtui_r19.setTextureOffset(80, 220).addBox(-2.0F, 1.0F, 7.0F, 10.0F, 2.0F, 9.0F, 0.0F, false);

		youtui_r20 = new ModelRenderer(this);
		youtui_r20.setRotationPoint(10.0F, -7.5315F, -6.3553F);
		youtui.addChild(youtui_r20);
		setRotationAngle(youtui_r20, -0.3054F, 0.0F, 0.0F);
		youtui_r20.setTextureOffset(382, 27).addBox(-5.0F, 1.0F, 2.75F, 3.0F, 3.0F, 7.0F, 0.0F, false);
		youtui_r20.setTextureOffset(160, 134).addBox(-2.0F, 1.0F, -2.0F, 12.0F, 3.0F, 12.0F, 0.0F, false);

		youtui_r21 = new ModelRenderer(this);
		youtui_r21.setRotationPoint(18.4395F, 14.3285F, -5.5652F);
		youtui.addChild(youtui_r21);
		setRotationAngle(youtui_r21, -0.3011F, 0.0522F, 0.1666F);
		youtui_r21.setTextureOffset(312, 477).addBox(-0.2678F, -2.7335F, -2.5F, 3.0F, 15.0F, 5.0F, 0.0F, false);

		youtui_r22 = new ModelRenderer(this);
		youtui_r22.setRotationPoint(18.4395F, 14.3285F, -5.5652F);
		youtui.addChild(youtui_r22);
		setRotationAngle(youtui_r22, -0.3011F, -0.0522F, -0.1666F);
		youtui_r22.setTextureOffset(464, 477).addBox(0.5017F, -16.6308F, -2.52F, 3.0F, 15.0F, 5.0F, 0.0F, false);

		youtui_r23 = new ModelRenderer(this);
		youtui_r23.setRotationPoint(10.0F, -4.7815F, -6.3553F);
		youtui.addChild(youtui_r23);
		setRotationAngle(youtui_r23, -0.3054F, 0.0F, 0.0F);
		youtui_r23.setTextureOffset(106, 426).addBox(-1.0F, 1.0F, 4.0F, 10.0F, 15.0F, 5.0F, 0.0F, false);
		youtui_r23.setTextureOffset(66, 376).addBox(-1.0F, 16.0F, 0.0F, 10.0F, 14.0F, 9.0F, 0.0F, false);

		youtui_r24 = new ModelRenderer(this);
		youtui_r24.setRotationPoint(7.7475F, 17.7917F, -6.4139F);
		youtui.addChild(youtui_r24);
		setRotationAngle(youtui_r24, 0.1745F, 0.0F, -0.0873F);
		youtui_r24.setTextureOffset(455, 277).addBox(-2.4975F, 1.1461F, -6.3045F, 5.0F, 9.0F, 8.0F, 0.0F, false);

		qiang2 = new ModelRenderer(this);
		qiang2.setRotationPoint(27.4832F, -8.1733F, -2.8037F);
		youtui.addChild(qiang2);
		setRotationAngle(qiang2, 2.138F, 0.0F, -0.0436F);
		qiang2.setTextureOffset(124, 0).addBox(-6.4566F, -20.5421F, -107.0064F, 9.0F, 6.0F, 62.0F, 0.0F, false);
		qiang2.setTextureOffset(41, 189).addBox(1.0434F, -20.5421F, -110.0064F, 1.0F, 6.0F, 3.0F, 0.0F, false);
		qiang2.setTextureOffset(171, 187).addBox(-6.4566F, -20.5421F, -110.0064F, 1.0F, 6.0F, 3.0F, 0.0F, false);
		qiang2.setTextureOffset(248, 277).addBox(-4.9566F, -20.5421F, -110.0064F, 6.0F, 1.0F, 3.0F, 0.0F, false);
		qiang2.setTextureOffset(76, 134).addBox(-4.4566F, -15.5421F, -123.0064F, 5.0F, 2.0F, 12.0F, 0.0F, false);
		qiang2.setTextureOffset(445, 196).addBox(-4.4566F, -19.5421F, -123.0064F, 5.0F, 4.0F, 10.0F, 0.0F, false);
		qiang2.setTextureOffset(483, 73).addBox(-3.4566F, -18.7921F, -114.0064F, 3.0F, 5.0F, 7.0F, 0.0F, false);
		qiang2.setTextureOffset(32, 338).addBox(-5.4566F, -19.5421F, -120.2564F, 7.0F, 5.0F, 6.0F, 0.0F, false);
		qiang2.setTextureOffset(58, 229).addBox(-5.4566F, -16.5421F, -113.9664F, 7.0F, 2.0F, 2.0F, 0.0F, false);
		qiang2.setTextureOffset(158, 252).addBox(-5.4566F, -21.5421F, -117.2564F, 7.0F, 2.0F, 5.0F, 0.0F, false);
		qiang2.setTextureOffset(0, 0).addBox(-4.9566F, -18.5421F, -93.7564F, 6.0F, 10.0F, 48.0F, 0.0F, false);
		qiang2.setTextureOffset(424, 0).addBox(-4.9766F, -14.2921F, -45.5064F, 6.0F, 5.0F, 11.0F, 0.0F, false);
		qiang2.setTextureOffset(34, 430).addBox(1.5234F, -32.9201F, 3.8173F, 1.0F, 4.0F, 14.0F, 0.0F, false);
		qiang2.setTextureOffset(429, 196).addBox(-6.9966F, -32.9201F, 3.8173F, 1.0F, 4.0F, 14.0F, 0.0F, false);
		qiang2.setTextureOffset(124, 97).addBox(-5.4566F, -32.9201F, 3.8173F, 7.0F, 1.0F, 14.0F, 0.0F, false);
		qiang2.setTextureOffset(262, 318).addBox(-0.4566F, -8.5507F, -104.1278F, 1.0F, 2.0F, 8.0F, 0.0F, false);
		qiang2.setTextureOffset(233, 270).addBox(-4.9566F, -8.5507F, -104.1278F, 1.0F, 2.0F, 8.0F, 0.0F, false);
		qiang2.setTextureOffset(276, 32).addBox(-0.4566F, -18.5421F, -106.0064F, 1.0F, 10.0F, 12.0F, 0.0F, false);
		qiang2.setTextureOffset(275, 240).addBox(-4.9566F, -18.5421F, -106.0064F, 1.0F, 10.0F, 12.0F, 0.0F, false);
		qiang2.setTextureOffset(240, 27).addBox(-6.4566F, -14.5421F, -107.0064F, 9.0F, 2.0F, 4.0F, 0.0F, false);
		qiang2.setTextureOffset(46, 251).addBox(1.0434F, -14.5421F, -110.0064F, 1.0F, 2.0F, 3.0F, 0.0F, false);
		qiang2.setTextureOffset(243, 131).addBox(-6.4566F, -14.5421F, -110.0064F, 1.0F, 2.0F, 3.0F, 0.0F, false);
		qiang2.setTextureOffset(405, 143).addBox(-6.4566F, -14.5421F, -91.0156F, 9.0F, 2.0F, 11.0F, 0.0F, false);
		qiang2.setTextureOffset(79, 285).addBox(-6.4566F, -14.5421F, -66.9847F, 9.0F, 2.0F, 23.0F, 0.0F, false);
		qiang2.setTextureOffset(256, 338).addBox(-4.9566F, -24.5421F, -46.9847F, 6.0F, 10.0F, 16.0F, 0.0F, false);
		qiang2.setTextureOffset(456, 417).addBox(-3.9566F, -29.5421F, -0.2347F, 4.0F, 4.0F, 10.0F, 0.0F, false);
		qiang2.setTextureOffset(47, 58).addBox(-4.9566F, -25.2921F, -30.2347F, 6.0F, 14.0F, 29.0F, 0.0F, false);
		qiang2.setTextureOffset(152, 187).addBox(-3.9566F, -29.5421F, -33.2347F, 4.0F, 4.0F, 28.0F, 0.0F, false);
		qiang2.setTextureOffset(68, 307).addBox(-3.4566F, -28.5421F, -4.9847F, 3.0F, 3.0F, 5.0F, 0.0F, false);

		qiang2_r1 = new ModelRenderer(this);
		qiang2_r1.setRotationPoint(-1.5F, -6.8727F, 8.0818F);
		qiang2.addChild(qiang2_r1);
		setRotationAngle(qiang2_r1, -0.7418F, 0.0F, 0.0F);
		qiang2_r1.setTextureOffset(465, 190).addBox(-2.9566F, -8.2809F, -3.808F, 5.0F, 7.0F, 7.0F, 0.0F, false);

		qiang2_r2 = new ModelRenderer(this);
		qiang2_r2.setRotationPoint(-1.5F, -6.8727F, 7.0818F);
		qiang2.addChild(qiang2_r2);
		setRotationAngle(qiang2_r2, -0.7418F, 0.0F, 0.0F);
		qiang2_r2.setTextureOffset(0, 58).addBox(-2.7066F, -8.2809F, -4.308F, 4.0F, 14.0F, 6.0F, 0.0F, false);

		qiang2_r3 = new ModelRenderer(this);
		qiang2_r3.setRotationPoint(-1.0F, -15.0833F, -2.6033F);
		qiang2.addChild(qiang2_r3);
		setRotationAngle(qiang2_r3, 0.5672F, 0.0F, 0.0F);
		qiang2_r3.setTextureOffset(189, 261).addBox(-2.9566F, -3.4101F, -2.8023F, 4.0F, 12.0F, 2.0F, 0.0F, false);
		qiang2_r3.setTextureOffset(126, 478).addBox(-4.9566F, -3.4101F, -0.8023F, 8.0F, 13.0F, 2.0F, 0.0F, false);

		qiang2_r4 = new ModelRenderer(this);
		qiang2_r4.setRotationPoint(-1.0F, -24.1159F, 9.6745F);
		qiang2.addChild(qiang2_r4);
		setRotationAngle(qiang2_r4, 1.0472F, 0.0F, 0.0F);
		qiang2_r4.setTextureOffset(217, 261).addBox(-2.9566F, -1.9849F, 1.3695F, 4.0F, 9.0F, 3.0F, 0.0F, false);

		qiang2_r5 = new ModelRenderer(this);
		qiang2_r5.setRotationPoint(0.0F, -14.291F, -73.5687F);
		qiang2.addChild(qiang2_r5);
		setRotationAngle(qiang2_r5, 2.3562F, 0.0F, 0.0F);
		qiang2_r5.setTextureOffset(41, 185).addBox(-6.4266F, 3.2421F, -6.0691F, 8.0F, 1.0F, 3.0F, 0.0F, false);

		qiang2_r6 = new ModelRenderer(this);
		qiang2_r6.setRotationPoint(0.0F, -14.291F, -97.5996F);
		qiang2.addChild(qiang2_r6);
		setRotationAngle(qiang2_r6, 2.3562F, 0.0F, 0.0F);
		qiang2_r6.setTextureOffset(36, 229).addBox(-6.4266F, 3.2421F, -6.0691F, 8.0F, 1.0F, 3.0F, 0.0F, false);

		qiang2_r7 = new ModelRenderer(this);
		qiang2_r7.setRotationPoint(0.0F, -13.2904F, -79.5091F);
		qiang2.addChild(qiang2_r7);
		setRotationAngle(qiang2_r7, 0.7854F, 0.0F, 0.0F);
		qiang2_r7.setTextureOffset(254, 240).addBox(-6.4266F, -0.8786F, -0.7105F, 8.0F, 1.0F, 3.0F, 0.0F, false);

		qiang2_r8 = new ModelRenderer(this);
		qiang2_r8.setRotationPoint(0.0F, -13.2904F, -103.0F);
		qiang2.addChild(qiang2_r8);
		setRotationAngle(qiang2_r8, 0.7854F, 0.0F, 0.0F);
		qiang2_r8.setTextureOffset(267, 197).addBox(-6.4266F, -0.8786F, -0.7105F, 8.0F, 1.0F, 3.0F, 0.0F, false);

		qiang2_r9 = new ModelRenderer(this);
		qiang2_r9.setRotationPoint(-0.5F, -19.692F, -45.6087F);
		qiang2.addChild(qiang2_r9);
		setRotationAngle(qiang2_r9, 0.5672F, 0.0F, 0.0F);
		qiang2_r9.setTextureOffset(452, 106).addBox(-6.4766F, -6.5078F, -1.9119F, 10.0F, 14.0F, 3.0F, 0.0F, false);

		qiang2_r10 = new ModelRenderer(this);
		qiang2_r10.setRotationPoint(0.0F, -8.2649F, -95.587F);
		qiang2.addChild(qiang2_r10);
		setRotationAngle(qiang2_r10, 0.2182F, 0.0F, 0.0F);
		qiang2_r10.setTextureOffset(307, 32).addBox(-6.4766F, -5.5504F, 31.6807F, 9.0F, 5.0F, 18.0F, 0.0F, false);

		qiang2_r11 = new ModelRenderer(this);
		qiang2_r11.setRotationPoint(-1.5F, -18.4971F, -95.643F);
		qiang2.addChild(qiang2_r11);
		setRotationAngle(qiang2_r11, 0.7854F, 0.0F, 0.0F);
		qiang2_r11.setTextureOffset(334, 260).addBox(-3.4766F, 5.3681F, -8.7105F, 1.0F, 3.0F, 9.0F, 0.0F, false);
		qiang2_r11.setTextureOffset(310, 391).addBox(1.0134F, 5.3681F, -8.7105F, 1.0F, 3.0F, 9.0F, 0.0F, false);

		qiang2_r12 = new ModelRenderer(this);
		qiang2_r12.setRotationPoint(-1.5F, -18.4971F, -104.357F);
		qiang2.addChild(qiang2_r12);
		setRotationAngle(qiang2_r12, -0.7854F, 0.0F, 0.0F);
		qiang2_r12.setTextureOffset(361, 112).addBox(-3.4766F, 5.3772F, 2.5014F, 1.0F, 3.0F, 6.0F, 0.0F, false);
		qiang2_r12.setTextureOffset(295, 374).addBox(1.0134F, 5.3772F, 2.5014F, 1.0F, 3.0F, 6.0F, 0.0F, false);

		qiang2_r13 = new ModelRenderer(this);
		qiang2_r13.setRotationPoint(-0.5F, -14.8333F, -51.625F);
		qiang2.addChild(qiang2_r13);
		setRotationAngle(qiang2_r13, 0.5672F, 0.0F, 0.0F);
		qiang2_r13.setTextureOffset(76, 474).addBox(-4.9566F, 1.5192F, -1.9057F, 7.0F, 14.0F, 3.0F, 0.0F, false);

		qiang2_r14 = new ModelRenderer(this);
		qiang2_r14.setRotationPoint(-0.5F, -5.8333F, -44.625F);
		qiang2.addChild(qiang2_r14);
		setRotationAngle(qiang2_r14, 0.5672F, 0.0F, 0.0F);
		qiang2_r14.setTextureOffset(306, 272).addBox(-4.4566F, -1.2578F, -13.2869F, 6.0F, 15.0F, 4.0F, 0.0F, false);
		qiang2_r14.setTextureOffset(255, 364).addBox(-5.9566F, -8.7578F, 7.7131F, 9.0F, 12.0F, 11.0F, 0.0F, false);
		qiang2_r14.setTextureOffset(48, 339).addBox(-4.9566F, 1.2422F, 12.7131F, 7.0F, 26.0F, 10.0F, 0.0F, false);
		qiang2_r14.setTextureOffset(444, 328).addBox(-4.4566F, -2.1278F, 1.7131F, 6.0F, 15.0F, 6.0F, 0.0F, false);

		qiang2_r15 = new ModelRenderer(this);
		qiang2_r15.setRotationPoint(-1.5F, -6.3333F, -45.125F);
		qiang2.addChild(qiang2_r15);
		setRotationAngle(qiang2_r15, 0.5672F, 0.0F, 0.0F);
		qiang2_r15.setTextureOffset(106, 359).addBox(-5.4766F, 12.2422F, 16.7131F, 1.0F, 3.0F, 20.0F, 0.0F, false);
		qiang2_r15.setTextureOffset(156, 359).addBox(3.0234F, 12.2422F, 16.7131F, 1.0F, 3.0F, 20.0F, 0.0F, false);
		qiang2_r15.setTextureOffset(30, 268).addBox(-5.4766F, 12.2422F, 48.7131F, 1.0F, 3.0F, 17.0F, 0.0F, false);
		qiang2_r15.setTextureOffset(107, 386).addBox(3.0234F, 12.2422F, 48.7131F, 1.0F, 3.0F, 17.0F, 0.0F, false);
		qiang2_r15.setTextureOffset(97, 441).addBox(-5.4766F, 7.2422F, 16.7131F, 1.0F, 3.0F, 7.0F, 0.0F, false);
		qiang2_r15.setTextureOffset(491, 297).addBox(3.0234F, 7.2422F, 16.7131F, 1.0F, 3.0F, 7.0F, 0.0F, false);
		qiang2_r15.setTextureOffset(0, 58).addBox(-5.4766F, 10.2422F, 16.7131F, 1.0F, 2.0F, 45.0F, 0.0F, false);
		qiang2_r15.setTextureOffset(124, 68).addBox(3.0234F, 10.2422F, 16.7131F, 1.0F, 2.0F, 45.0F, 0.0F, false);
		qiang2_r15.setTextureOffset(310, 0).addBox(-5.4766F, 7.2422F, 35.7131F, 1.0F, 3.0F, 24.0F, 0.0F, false);
		qiang2_r15.setTextureOffset(306, 314).addBox(3.0234F, 7.2422F, 35.7131F, 1.0F, 3.0F, 24.0F, 0.0F, false);

		qiang2_r16 = new ModelRenderer(this);
		qiang2_r16.setRotationPoint(-5.0F, -17.4544F, -11.3501F);
		qiang2.addChild(qiang2_r16);
		setRotationAngle(qiang2_r16, 1.3526F, 0.0F, 0.0F);
		qiang2_r16.setTextureOffset(262, 277).addBox(-1.9566F, -0.1932F, -2.2858F, 1.0F, 2.0F, 4.0F, 0.0F, false);
		qiang2_r16.setTextureOffset(214, 390).addBox(6.5434F, -0.1932F, -2.2858F, 1.0F, 2.0F, 4.0F, 0.0F, false);

		qiang2_r17 = new ModelRenderer(this);
		qiang2_r17.setRotationPoint(-5.0F, -16.0152F, -7.2743F);
		qiang2.addChild(qiang2_r17);
		setRotationAngle(qiang2_r17, 1.3526F, 0.0F, 0.0F);
		qiang2_r17.setTextureOffset(394, 127).addBox(-1.9566F, -0.1932F, -2.2858F, 1.0F, 2.0F, 4.0F, 0.0F, false);
		qiang2_r17.setTextureOffset(84, 403).addBox(6.5434F, -0.6932F, -2.2858F, 1.0F, 2.0F, 4.0F, 0.0F, false);

		qiang2_r18 = new ModelRenderer(this);
		qiang2_r18.setRotationPoint(-5.0F, -12.6609F, -18.8745F);
		qiang2.addChild(qiang2_r18);
		setRotationAngle(qiang2_r18, 1.3526F, 0.0F, 0.0F);
		qiang2_r18.setTextureOffset(124, 0).addBox(-1.9566F, -2.1932F, -2.7858F, 1.0F, 4.0F, 2.0F, 0.0F, false);
		qiang2_r18.setTextureOffset(124, 38).addBox(6.5434F, -2.1932F, -2.7858F, 1.0F, 4.0F, 2.0F, 0.0F, false);

		qiang2_r19 = new ModelRenderer(this);
		qiang2_r19.setRotationPoint(-5.0F, -22.3285F, 2.6355F);
		qiang2.addChild(qiang2_r19);
		setRotationAngle(qiang2_r19, 1.3526F, 0.0F, 0.0F);
		qiang2_r19.setTextureOffset(132, 38).addBox(-1.9566F, -2.1932F, -2.2857F, 1.0F, 4.0F, 2.0F, 0.0F, false);
		qiang2_r19.setTextureOffset(141, 0).addBox(6.5434F, -2.1932F, -2.2857F, 1.0F, 4.0F, 2.0F, 0.0F, false);

		qiang2_r20 = new ModelRenderer(this);
		qiang2_r20.setRotationPoint(-0.5F, -6.5833F, -44.625F);
		qiang2.addChild(qiang2_r20);
		setRotationAngle(qiang2_r20, 0.5672F, 0.0F, 0.0F);
		qiang2_r20.setTextureOffset(267, 277).addBox(-6.9566F, 1.2422F, 9.7131F, 11.0F, 15.0F, 7.0F, 0.0F, false);

		qiang2_r21 = new ModelRenderer(this);
		qiang2_r21.setRotationPoint(-1.0F, -20.0335F, -118.1574F);
		qiang2.addChild(qiang2_r21);
		setRotationAngle(qiang2_r21, 0.5847F, 0.0F, 0.0F);
		qiang2_r21.setTextureOffset(177, 252).addBox(-4.4366F, -0.7607F, -2.0261F, 6.0F, 2.0F, 3.0F, 0.0F, false);

		qiang2_r22 = new ModelRenderer(this);
		qiang2_r22.setRotationPoint(25.4375F, 9.2756F, -32.277F);
		qiang2.addChild(qiang2_r22);
		setRotationAngle(qiang2_r22, 0.5672F, 0.0F, 0.0F);
		qiang2_r22.setTextureOffset(124, 0).addBox(-29.8941F, -20.1351F, -11.5831F, 5.0F, 14.0F, 24.0F, 0.0F, false);

		bone123 = new ModelRenderer(this);
		bone123.setRotationPoint(-0.9983F, -13.3702F, 21.8855F);
		qiang2.addChild(bone123);
		bone123.setTextureOffset(149, 149).addBox(-4.9583F, -11.9218F, -23.1202F, 8.0F, 7.0F, 31.0F, 0.0F, false);

		bone123_r1 = new ModelRenderer(this);
		bone123_r1.setRotationPoint(-1.8303F, 1.3428F, -77.8637F);
		bone123.addChild(bone123_r1);
		setRotationAngle(bone123_r1, 0.0F, 0.0F, -0.1745F);
		bone123_r1.setTextureOffset(171, 68).addBox(-2.4927F, -1.7126F, 56.7436F, 4.0F, 5.0F, 33.0F, 0.0F, false);

		bone123_r2 = new ModelRenderer(this);
		bone123_r2.setRotationPoint(0.8421F, 1.1691F, -77.8637F);
		bone123.addChild(bone123_r2);
		setRotationAngle(bone123_r2, 0.0F, 0.0F, 0.1745F);
		bone123_r2.setTextureOffset(185, 187).addBox(-2.8915F, -1.3804F, 56.7436F, 4.0F, 5.0F, 33.0F, 0.0F, false);
		bone123_r2.setTextureOffset(196, 134).addBox(-2.8915F, -6.3804F, 54.7436F, 4.0F, 5.0F, 33.0F, 0.0F, false);

		bone123_r3 = new ModelRenderer(this);
		bone123_r3.setRotationPoint(-0.8455F, 1.1691F, -77.8637F);
		bone123.addChild(bone123_r3);
		setRotationAngle(bone123_r3, 0.0F, 0.0F, -0.1745F);
		bone123_r3.setTextureOffset(196, 134).addBox(-2.9927F, -6.7126F, 54.7436F, 4.0F, 5.0F, 33.0F, 0.0F, true);

		bone123_r4 = new ModelRenderer(this);
		bone123_r4.setRotationPoint(-0.5017F, -12.7131F, 8.7613F);
		bone123.addChild(bone123_r4);
		setRotationAngle(bone123_r4, 0.3927F, 0.0F, 0.0F);
		bone123_r4.setTextureOffset(54, 414).addBox(-2.9566F, 16.6144F, -7.7578F, 5.0F, 9.0F, 11.0F, 0.0F, false);
		bone123_r4.setTextureOffset(0, 0).addBox(-2.9566F, -2.3856F, -15.7578F, 5.0F, 19.0F, 19.0F, 0.0F, false);
		bone123_r4.setTextureOffset(76, 134).addBox(2.0434F, -0.3856F, -7.7578F, 2.0F, 7.0F, 4.0F, 0.0F, true);
		bone123_r4.setTextureOffset(171, 68).addBox(-4.9566F, -1.3856F, -3.7578F, 9.0F, 25.0F, 5.0F, 0.0F, false);
		bone123_r4.setTextureOffset(76, 134).addBox(-4.9566F, -0.3856F, -7.7578F, 2.0F, 7.0F, 4.0F, 0.0F, false);

		bone123_r5 = new ModelRenderer(this);
		bone123_r5.setRotationPoint(-0.0017F, 3.2672F, 14.046F);
		bone123.addChild(bone123_r5);
		setRotationAngle(bone123_r5, -0.4538F, 0.0F, 0.0F);
		bone123_r5.setTextureOffset(74, 423).addBox(-3.4366F, 4.7646F, -9.7531F, 4.0F, 6.0F, 12.0F, 0.0F, false);

		bone84 = new ModelRenderer(this);
		bone84.setRotationPoint(1.25F, 0.4243F, -20.7289F);
		qiang2.addChild(bone84);
		setRotationAngle(bone84, 0.6545F, 0.1745F, -0.3927F);
		bone84.setTextureOffset(404, 439).addBox(1.2666F, -0.1831F, -2.6818F, 1.0F, 29.0F, 5.0F, 0.0F, false);
		bone84.setTextureOffset(48, 375).addBox(-1.7534F, -1.1831F, -1.6818F, 5.0F, 3.0F, 3.0F, 0.0F, false);

		bone84_r1 = new ModelRenderer(this);
		bone84_r1.setRotationPoint(-5.7968F, 7.2256F, -2.8405F);
		bone84.addChild(bone84_r1);
		setRotationAngle(bone84_r1, 0.1745F, 0.0F, 0.0F);
		bone84_r1.setTextureOffset(358, 464).addBox(7.0835F, -0.6331F, -4.6376F, 1.0F, 23.0F, 5.0F, 0.0F, false);

		bone84_r2 = new ModelRenderer(this);
		bone84_r2.setRotationPoint(-5.7968F, 9.9565F, -4.4407F);
		bone84.addChild(bone84_r2);
		setRotationAngle(bone84_r2, -0.5672F, 0.0F, 0.0F);
		bone84_r2.setTextureOffset(171, 38).addBox(7.0835F, -9.4967F, -3.9646F, 1.0F, 9.0F, 6.0F, 0.0F, false);

		bone94 = new ModelRenderer(this);
		bone94.setRotationPoint(-3.25F, 0.4243F, -20.7289F);
		qiang2.addChild(bone94);
		setRotationAngle(bone94, 0.6545F, -0.1745F, 0.3927F);
		bone94.setTextureOffset(0, 438).addBox(-4.5474F, 0.5846F, -2.884F, 1.0F, 29.0F, 5.0F, 0.0F, false);
		bone94.setTextureOffset(305, 240).addBox(-5.5274F, -0.4154F, -1.884F, 5.0F, 3.0F, 3.0F, 0.0F, false);

		bone94_r1 = new ModelRenderer(this);
		bone94_r1.setRotationPoint(5.7968F, 7.2256F, -2.8405F);
		bone94.addChild(bone94_r1);
		setRotationAngle(bone94_r1, 0.1745F, 0.0F, 0.0F);
		bone94_r1.setTextureOffset(175, 462).addBox(-10.3242F, 0.0878F, -4.97F, 1.0F, 23.0F, 5.0F, 0.0F, false);

		bone94_r2 = new ModelRenderer(this);
		bone94_r2.setRotationPoint(5.7968F, 9.9565F, -4.4407F);
		bone94.addChild(bone94_r2);
		setRotationAngle(bone94_r2, -0.5672F, 0.0F, 0.0F);
		bone94_r2.setTextureOffset(41, 165).addBox(-10.3042F, -8.7406F, -3.7227F, 1.0F, 9.0F, 6.0F, 0.0F, false);

		bone95 = new ModelRenderer(this);
		bone95.setRotationPoint(0.25F, 6.4243F, -15.7289F);
		qiang2.addChild(bone95);
		setRotationAngle(bone95, 0.6545F, 0.1745F, -0.3927F);
		bone95.setTextureOffset(248, 436).addBox(1.2666F, -0.1831F, -2.6818F, 1.0F, 29.0F, 5.0F, 0.0F, false);
		bone95.setTextureOffset(203, 293).addBox(-0.7534F, -1.1831F, -1.6818F, 4.0F, 3.0F, 3.0F, 0.0F, false);

		bone95_r1 = new ModelRenderer(this);
		bone95_r1.setRotationPoint(-5.7968F, 7.2256F, -2.8405F);
		bone95.addChild(bone95_r1);
		setRotationAngle(bone95_r1, 0.1745F, 0.0F, 0.0F);
		bone95_r1.setTextureOffset(434, 459).addBox(7.0835F, -0.6331F, -4.6376F, 1.0F, 23.0F, 5.0F, 0.0F, false);

		bone95_r2 = new ModelRenderer(this);
		bone95_r2.setRotationPoint(-5.7968F, 9.9565F, -4.4407F);
		bone95.addChild(bone95_r2);
		setRotationAngle(bone95_r2, -0.5672F, 0.0F, 0.0F);
		bone95_r2.setTextureOffset(171, 38).addBox(7.0835F, -9.4967F, -3.9646F, 1.0F, 9.0F, 6.0F, 0.0F, false);

		bone96 = new ModelRenderer(this);
		bone96.setRotationPoint(-2.25F, 6.4243F, -15.7289F);
		qiang2.addChild(bone96);
		setRotationAngle(bone96, 0.6545F, -0.1745F, 0.3927F);
		bone96.setTextureOffset(0, 438).addBox(-4.5474F, 0.5846F, -2.884F, 1.0F, 29.0F, 5.0F, 0.0F, false);
		bone96.setTextureOffset(108, 35).addBox(-5.5274F, -0.4154F, -1.884F, 4.0F, 3.0F, 3.0F, 0.0F, false);

		bone96_r1 = new ModelRenderer(this);
		bone96_r1.setRotationPoint(5.7968F, 7.2256F, -2.8405F);
		bone96.addChild(bone96_r1);
		setRotationAngle(bone96_r1, 0.1745F, 0.0F, 0.0F);
		bone96_r1.setTextureOffset(175, 462).addBox(-10.3242F, 0.0878F, -4.97F, 1.0F, 23.0F, 5.0F, 0.0F, false);

		bone96_r2 = new ModelRenderer(this);
		bone96_r2.setRotationPoint(5.7968F, 9.9565F, -4.4407F);
		bone96.addChild(bone96_r2);
		setRotationAngle(bone96_r2, -0.5672F, 0.0F, 0.0F);
		bone96_r2.setTextureOffset(41, 165).addBox(-10.3042F, -8.7406F, -3.7227F, 1.0F, 9.0F, 6.0F, 0.0F, false);

		bone97 = new ModelRenderer(this);
		bone97.setRotationPoint(-8.5F, -14.3231F, -104.8615F);
		qiang2.addChild(bone97);
		setRotationAngle(bone97, 0.2618F, -0.0436F, -0.7418F);
		bone97.setTextureOffset(63, 310).addBox(-2.5079F, -3.5543F, -12.8576F, 1.0F, 5.0F, 24.0F, 0.0F, false);

		bone97_r1 = new ModelRenderer(this);
		bone97_r1.setRotationPoint(-1.0864F, -0.6358F, 13.1374F);
		bone97.addChild(bone97_r1);
		setRotationAngle(bone97_r1, -0.5236F, 0.0F, 0.0F);
		bone97_r1.setTextureOffset(14, 58).addBox(-1.4015F, -1.53F, -3.1869F, 1.0F, 4.0F, 2.0F, 0.0F, false);

		bone97_r2 = new ModelRenderer(this);
		bone97_r2.setRotationPoint(-1.0864F, -0.6358F, -12.8626F);
		bone97.addChild(bone97_r2);
		setRotationAngle(bone97_r2, -0.5236F, 0.0F, 0.0F);
		bone97_r2.setTextureOffset(60, 35).addBox(-1.4015F, -2.53F, -1.4549F, 1.0F, 4.0F, 2.0F, 0.0F, false);

		bone98 = new ModelRenderer(this);
		bone98.setRotationPoint(-4.2047F, 0.747F, -18.4595F);
		bone97.addChild(bone98);
		bone98.setTextureOffset(263, 425).addBox(-1.4215F, -2.9185F, 0.005F, 1.0F, 5.0F, 14.0F, 0.0F, false);

		bone98_r1 = new ModelRenderer(this);
		bone98_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone98.addChild(bone98_r1);
		setRotationAngle(bone98_r1, -0.5236F, 0.0F, 0.0F);
		bone98_r1.setTextureOffset(41, 0).addBox(-1.4015F, -2.53F, -1.4549F, 1.0F, 4.0F, 2.0F, 0.0F, false);

		bone98_r2 = new ModelRenderer(this);
		bone98_r2.setRotationPoint(0.0F, 0.0F, 14.0F);
		bone98.addChild(bone98_r2);
		setRotationAngle(bone98_r2, -0.5236F, 0.0F, 0.0F);
		bone98_r2.setTextureOffset(0, 58).addBox(-1.4015F, -2.53F, -1.4549F, 1.0F, 4.0F, 2.0F, 0.0F, false);

		bone99 = new ModelRenderer(this);
		bone99.setRotationPoint(6.5F, -14.3231F, -104.8615F);
		qiang2.addChild(bone99);
		setRotationAngle(bone99, 0.2618F, 0.0436F, 0.7418F);
		bone99.setTextureOffset(0, 309).addBox(0.0587F, -2.3217F, -13.2515F, 1.0F, 5.0F, 24.0F, 0.0F, false);

		bone99_r1 = new ModelRenderer(this);
		bone99_r1.setRotationPoint(1.0864F, -0.6358F, 13.1374F);
		bone99.addChild(bone99_r1);
		setRotationAngle(bone99_r1, -0.5236F, 0.0F, 0.0F);
		bone99_r1.setTextureOffset(29, 0).addBox(-1.0078F, -0.2656F, -2.9118F, 1.0F, 4.0F, 2.0F, 0.0F, false);

		bone99_r2 = new ModelRenderer(this);
		bone99_r2.setRotationPoint(1.0864F, -0.6358F, -12.8626F);
		bone99.addChild(bone99_r2);
		setRotationAngle(bone99_r2, -0.5236F, 0.0F, 0.0F);
		bone99_r2.setTextureOffset(0, 38).addBox(-1.0078F, -1.2656F, -1.1798F, 1.0F, 4.0F, 2.0F, 0.0F, false);

		bone100 = new ModelRenderer(this);
		bone100.setRotationPoint(4.2047F, 0.747F, -18.4595F);
		bone99.addChild(bone100);
		bone100.setTextureOffset(18, 424).addBox(-1.0278F, -1.6859F, -0.3889F, 1.0F, 5.0F, 14.0F, 0.0F, false);

		bone100_r1 = new ModelRenderer(this);
		bone100_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone100.addChild(bone100_r1);
		setRotationAngle(bone100_r1, -0.5236F, 0.0F, 0.0F);
		bone100_r1.setTextureOffset(0, 0).addBox(-1.0078F, -1.2656F, -1.1798F, 1.0F, 4.0F, 2.0F, 0.0F, false);

		bone100_r2 = new ModelRenderer(this);
		bone100_r2.setRotationPoint(0.0F, 0.0F, 14.0F);
		bone100.addChild(bone100_r2);
		setRotationAngle(bone100_r2, -0.5236F, 0.0F, 0.0F);
		bone100_r2.setTextureOffset(12, 0).addBox(-1.0078F, -1.2656F, -1.1798F, 1.0F, 4.0F, 2.0F, 0.0F, false);

		bone101 = new ModelRenderer(this);
		bone101.setRotationPoint(0.5F, -10.5F, -101.75F);
		qiang2.addChild(bone101);
		setRotationAngle(bone101, -0.0436F, 0.2182F, 0.3054F);

		bone101_r1 = new ModelRenderer(this);
		bone101_r1.setRotationPoint(-0.6912F, 5.4107F, 14.3115F);
		bone101.addChild(bone101_r1);
		setRotationAngle(bone101_r1, 0.0F, -0.0436F, 0.0F);
		bone101_r1.setTextureOffset(138, 198).addBox(0.545F, -5.8021F, -15.2257F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		bone101_r1.setTextureOffset(117, 91).addBox(0.4798F, -6.3235F, -15.4804F, 1.0F, 5.0F, 1.0F, 0.0F, false);

		bone101_r2 = new ModelRenderer(this);
		bone101_r2.setRotationPoint(1.672F, 0.3103F, 28.6199F);
		bone101.addChild(bone101_r2);
		setRotationAngle(bone101_r2, -0.7854F, -0.0436F, 0.0F);
		bone101_r2.setTextureOffset(407, 87).addBox(-1.31F, -2.5079F, -1.9318F, 1.0F, 6.0F, 4.0F, 0.0F, false);

		bone101_r3 = new ModelRenderer(this);
		bone101_r3.setRotationPoint(0.0588F, 6.2715F, 13.5265F);
		bone101.addChild(bone101_r3);
		setRotationAngle(bone101_r3, -0.0436F, -0.0436F, 0.0F);
		bone101_r3.setTextureOffset(277, 32).addBox(0.9476F, -7.1538F, -14.3363F, 1.0F, 4.0F, 28.0F, 0.0F, false);

		bone101_r4 = new ModelRenderer(this);
		bone101_r4.setRotationPoint(0.0588F, 5.4107F, 13.8115F);
		bone101.addChild(bone101_r4);
		setRotationAngle(bone101_r4, 0.0F, -0.0436F, 0.0F);
		bone101_r4.setTextureOffset(127, 256).addBox(0.9276F, -8.2398F, -14.3172F, 1.0F, 4.0F, 29.0F, 0.0F, false);

		bone102 = new ModelRenderer(this);
		bone102.setRotationPoint(-2.5F, -10.5F, -101.75F);
		qiang2.addChild(bone102);
		setRotationAngle(bone102, -0.0436F, -0.2182F, -0.3054F);

		bone102_r1 = new ModelRenderer(this);
		bone102_r1.setRotationPoint(0.6912F, 5.4107F, 14.3115F);
		bone102.addChild(bone102_r1);
		setRotationAngle(bone102_r1, 0.0F, 0.0436F, 0.0F);
		bone102_r1.setTextureOffset(194, 119).addBox(-5.1309F, -6.3941F, -14.9343F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		bone102_r1.setTextureOffset(117, 85).addBox(-4.0656F, -6.9155F, -15.189F, 1.0F, 5.0F, 1.0F, 0.0F, false);

		bone102_r2 = new ModelRenderer(this);
		bone102_r2.setRotationPoint(-1.672F, 0.3103F, 28.6199F);
		bone102.addChild(bone102_r2);
		setRotationAngle(bone102_r2, -0.7854F, 0.0436F, 0.0F);
		bone102_r2.setTextureOffset(405, 194).addBox(-1.4858F, -3.1325F, -2.1444F, 1.0F, 6.0F, 4.0F, 0.0F, false);

		bone102_r3 = new ModelRenderer(this);
		bone102_r3.setRotationPoint(-0.0588F, 6.2715F, 13.5265F);
		bone102.addChild(bone102_r3);
		setRotationAngle(bone102_r3, -0.0436F, 0.0436F, 0.0F);
		bone102_r3.setTextureOffset(276, 276).addBox(-3.7434F, -7.7579F, -14.071F, 1.0F, 4.0F, 28.0F, 0.0F, false);

		bone102_r4 = new ModelRenderer(this);
		bone102_r4.setRotationPoint(-0.0588F, 5.4107F, 13.8115F);
		bone102.addChild(bone102_r4);
		setRotationAngle(bone102_r4, 0.0F, 0.0436F, 0.0F);
		bone102_r4.setTextureOffset(254, 207).addBox(-3.7634F, -8.8318F, -14.0258F, 1.0F, 4.0F, 29.0F, 0.0F, false);

		bone103 = new ModelRenderer(this);
		bone103.setRotationPoint(1.5F, -10.5F, -89.75F);
		qiang2.addChild(bone103);
		setRotationAngle(bone103, -0.0436F, 0.2182F, 0.3054F);

		bone103_r1 = new ModelRenderer(this);
		bone103_r1.setRotationPoint(-0.6912F, 5.4107F, 14.3115F);
		bone103.addChild(bone103_r1);
		setRotationAngle(bone103_r1, 0.0F, -0.0436F, 0.0F);
		bone103_r1.setTextureOffset(188, 119).addBox(-0.3936F, -5.4926F, -15.378F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		bone103_r1.setTextureOffset(110, 0).addBox(-0.4589F, -6.0141F, -15.6328F, 1.0F, 3.0F, 1.0F, 0.0F, false);

		bone103_r2 = new ModelRenderer(this);
		bone103_r2.setRotationPoint(1.672F, 0.3103F, 28.6199F);
		bone103.addChild(bone103_r2);
		setRotationAngle(bone103_r2, -0.7854F, -0.0436F, 0.0F);
		bone103_r2.setTextureOffset(392, 103).addBox(-2.2487F, -2.1814F, -1.8207F, 1.0F, 6.0F, 4.0F, 0.0F, false);

		bone103_r3 = new ModelRenderer(this);
		bone103_r3.setRotationPoint(0.0588F, 6.2715F, 13.5265F);
		bone103.addChild(bone103_r3);
		setRotationAngle(bone103_r3, -0.0436F, -0.0436F, 0.0F);
		bone103_r3.setTextureOffset(275, 240).addBox(0.0089F, -6.838F, -14.4749F, 1.0F, 4.0F, 28.0F, 0.0F, false);

		bone103_r4 = new ModelRenderer(this);
		bone103_r4.setRotationPoint(0.0588F, 5.4107F, 13.8115F);
		bone103.addChild(bone103_r4);
		setRotationAngle(bone103_r4, 0.0F, -0.0436F, 0.0F);
		bone103_r4.setTextureOffset(202, 252).addBox(-0.0111F, -7.9304F, -14.4695F, 1.0F, 4.0F, 29.0F, 0.0F, false);

		bone104 = new ModelRenderer(this);
		bone104.setRotationPoint(-3.5F, -10.5F, -89.75F);
		qiang2.addChild(bone104);
		setRotationAngle(bone104, -0.0436F, -0.2182F, -0.3054F);

		bone104_r1 = new ModelRenderer(this);
		bone104_r1.setRotationPoint(0.6912F, 5.4107F, 14.3115F);
		bone104.addChild(bone104_r1);
		setRotationAngle(bone104_r1, 0.0F, 0.0436F, 0.0F);
		bone104_r1.setTextureOffset(185, 98).addBox(-4.1922F, -6.0846F, -15.0866F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		bone104_r1.setTextureOffset(41, 89).addBox(-3.127F, -6.6061F, -15.3413F, 1.0F, 3.0F, 1.0F, 0.0F, false);

		bone104_r2 = new ModelRenderer(this);
		bone104_r2.setRotationPoint(-1.672F, 0.3103F, 28.6199F);
		bone104.addChild(bone104_r2);
		setRotationAngle(bone104_r2, -0.7854F, 0.0436F, 0.0F);
		bone104_r2.setTextureOffset(391, 365).addBox(-0.5472F, -2.806F, -2.0333F, 1.0F, 6.0F, 4.0F, 0.0F, false);

		bone104_r3 = new ModelRenderer(this);
		bone104_r3.setRotationPoint(-0.0588F, 6.2715F, 13.5265F);
		bone104.addChild(bone104_r3);
		setRotationAngle(bone104_r3, -0.0436F, 0.0436F, 0.0F);
		bone104_r3.setTextureOffset(0, 268).addBox(-2.8048F, -7.4422F, -14.2096F, 1.0F, 4.0F, 28.0F, 0.0F, false);

		bone104_r4 = new ModelRenderer(this);
		bone104_r4.setRotationPoint(-0.0588F, 5.4107F, 13.8115F);
		bone104.addChild(bone104_r4);
		setRotationAngle(bone104_r4, 0.0F, 0.0436F, 0.0F);
		bone104_r4.setTextureOffset(96, 252).addBox(-2.8248F, -8.5224F, -14.1781F, 1.0F, 4.0F, 29.0F, 0.0F, false);

		bone105 = new ModelRenderer(this);
		bone105.setRotationPoint(0.5F, -10.5F, -77.75F);
		qiang2.addChild(bone105);
		setRotationAngle(bone105, -0.0436F, 0.2182F, 0.3054F);

		bone105_r1 = new ModelRenderer(this);
		bone105_r1.setRotationPoint(-0.6912F, 5.4107F, 14.3115F);
		bone105.addChild(bone105_r1);
		setRotationAngle(bone105_r1, 0.0F, -0.0436F, 0.0F);
		bone105_r1.setTextureOffset(60, 185).addBox(0.545F, -5.8021F, -15.2257F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		bone105_r1.setTextureOffset(84, 0).addBox(0.4798F, -6.3235F, -15.4804F, 1.0F, 3.0F, 1.0F, 0.0F, false);

		bone105_r2 = new ModelRenderer(this);
		bone105_r2.setRotationPoint(1.672F, 0.3103F, 28.6199F);
		bone105.addChild(bone105_r2);
		setRotationAngle(bone105_r2, -0.7854F, -0.0436F, 0.0F);
		bone105_r2.setTextureOffset(392, 103).addBox(-1.31F, -2.5079F, -1.9318F, 1.0F, 6.0F, 4.0F, 0.0F, false);

		bone105_r3 = new ModelRenderer(this);
		bone105_r3.setRotationPoint(0.0588F, 6.2715F, 13.5265F);
		bone105.addChild(bone105_r3);
		setRotationAngle(bone105_r3, -0.0436F, -0.0436F, 0.0F);
		bone105_r3.setTextureOffset(275, 240).addBox(0.9476F, -7.1538F, -14.3363F, 1.0F, 4.0F, 28.0F, 0.0F, false);

		bone105_r4 = new ModelRenderer(this);
		bone105_r4.setRotationPoint(0.0588F, 5.4107F, 13.8115F);
		bone105.addChild(bone105_r4);
		setRotationAngle(bone105_r4, 0.0F, -0.0436F, 0.0F);
		bone105_r4.setTextureOffset(202, 252).addBox(0.9276F, -8.2398F, -14.3172F, 1.0F, 4.0F, 29.0F, 0.0F, false);

		bone106 = new ModelRenderer(this);
		bone106.setRotationPoint(-2.5F, -10.5F, -77.75F);
		qiang2.addChild(bone106);
		setRotationAngle(bone106, -0.0436F, -0.2182F, -0.3054F);

		bone106_r1 = new ModelRenderer(this);
		bone106_r1.setRotationPoint(0.6912F, 5.4107F, 14.3115F);
		bone106.addChild(bone106_r1);
		setRotationAngle(bone106_r1, 0.0F, 0.0436F, 0.0F);
		bone106_r1.setTextureOffset(179, 98).addBox(-5.1309F, -6.3941F, -14.9343F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		bone106_r1.setTextureOffset(77, 0).addBox(-4.0656F, -6.9155F, -15.189F, 1.0F, 3.0F, 1.0F, 0.0F, false);

		bone106_r2 = new ModelRenderer(this);
		bone106_r2.setRotationPoint(-1.672F, 0.3103F, 28.6199F);
		bone106.addChild(bone106_r2);
		setRotationAngle(bone106_r2, -0.7854F, 0.0436F, 0.0F);
		bone106_r2.setTextureOffset(391, 365).addBox(-1.4858F, -3.1325F, -2.1444F, 1.0F, 6.0F, 4.0F, 0.0F, false);

		bone106_r3 = new ModelRenderer(this);
		bone106_r3.setRotationPoint(-0.0588F, 6.2715F, 13.5265F);
		bone106.addChild(bone106_r3);
		setRotationAngle(bone106_r3, -0.0436F, 0.0436F, 0.0F);
		bone106_r3.setTextureOffset(0, 268).addBox(-3.7434F, -7.7579F, -14.071F, 1.0F, 4.0F, 28.0F, 0.0F, false);

		bone106_r4 = new ModelRenderer(this);
		bone106_r4.setRotationPoint(-0.0588F, 5.4107F, 13.8115F);
		bone106.addChild(bone106_r4);
		setRotationAngle(bone106_r4, 0.0F, 0.0436F, 0.0F);
		bone106_r4.setTextureOffset(96, 252).addBox(-3.7634F, -8.8318F, -14.0258F, 1.0F, 4.0F, 29.0F, 0.0F, false);

		bone107 = new ModelRenderer(this);
		bone107.setRotationPoint(1.538F, -20.5908F, -29.0781F);
		qiang2.addChild(bone107);
		setRotationAngle(bone107, 0.0436F, 0.3054F, 0.0873F);
		bone107.setTextureOffset(366, 320).addBox(1.2813F, -6.9441F, 6.2677F, 1.0F, 5.0F, 18.0F, 0.0F, false);

		bone107_r1 = new ModelRenderer(this);
		bone107_r1.setRotationPoint(-6.816F, -4.2725F, 4.5667F);
		bone107.addChild(bone107_r1);
		setRotationAngle(bone107_r1, 0.5236F, 0.0F, 0.0F);
		bone107_r1.setTextureOffset(20, 386).addBox(8.0973F, -1.4631F, -5.9411F, 1.0F, 5.0F, 8.0F, 0.0F, false);

		bone107_r2 = new ModelRenderer(this);
		bone107_r2.setRotationPoint(2.684F, -2.6796F, 13.5446F);
		bone107.addChild(bone107_r2);
		setRotationAngle(bone107_r2, 0.2182F, 0.0F, 0.0F);
		bone107_r2.setTextureOffset(151, 115).addBox(-3.4227F, -1.803F, -14.997F, 3.0F, 3.0F, 2.0F, 0.0F, false);
		bone107_r2.setTextureOffset(297, 134).addBox(-1.4227F, -1.803F, -13.997F, 1.0F, 5.0F, 25.0F, 0.0F, false);

		bone108 = new ModelRenderer(this);
		bone108.setRotationPoint(-3.538F, -20.5908F, -29.0781F);
		qiang2.addChild(bone108);
		setRotationAngle(bone108, 0.0436F, -0.3054F, -0.0873F);
		bone108.setTextureOffset(28, 363).addBox(-4.139F, -7.0857F, 6.8475F, 1.0F, 5.0F, 18.0F, 0.0F, false);

		bone108_r1 = new ModelRenderer(this);
		bone108_r1.setRotationPoint(6.816F, -4.2725F, 4.5667F);
		bone108.addChild(bone108_r1);
		setRotationAngle(bone108_r1, 0.5236F, 0.0F, 0.0F);
		bone108_r1.setTextureOffset(327, 56).addBox(-10.955F, -1.2958F, -5.3681F, 1.0F, 5.0F, 8.0F, 0.0F, false);

		bone108_r2 = new ModelRenderer(this);
		bone108_r2.setRotationPoint(-2.684F, -2.6796F, 13.5446F);
		bone108.addChild(bone108_r2);
		setRotationAngle(bone108_r2, 0.2182F, 0.0F, 0.0F);
		bone108_r2.setTextureOffset(112, 117).addBox(-1.975F, -1.8157F, -14.4003F, 3.0F, 3.0F, 2.0F, 0.0F, false);
		bone108_r2.setTextureOffset(293, 104).addBox(-1.475F, -1.8157F, -13.4003F, 1.0F, 5.0F, 25.0F, 0.0F, false);

		bone109 = new ModelRenderer(this);
		bone109.setRotationPoint(-0.5F, -13.5833F, -121.7071F);
		qiang2.addChild(bone109);
		bone109.setTextureOffset(502, 0).addBox(-3.4566F, 1.7913F, 0.7007F, 1.0F, 5.0F, 1.0F, 0.0F, false);
		bone109.setTextureOffset(506, 0).addBox(-2.4566F, 6.4213F, 0.7007F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		bone109.setTextureOffset(502, 0).addBox(-0.4566F, 1.7913F, 0.7007F, 1.0F, 5.0F, 1.0F, 0.0F, false);

		bone109_r1 = new ModelRenderer(this);
		bone109_r1.setRotationPoint(3.0F, 1.5F, 1.0F);
		bone109.addChild(bone109_r1);
		setRotationAngle(bone109_r1, 0.7854F, 0.0F, 0.0F);
		bone109_r1.setTextureOffset(504, 11).addBox(-3.4566F, -1.2986F, -0.7105F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		bone109_r1.setTextureOffset(504, 11).addBox(-6.4566F, -1.2986F, -0.7105F, 1.0F, 2.0F, 1.0F, 0.0F, false);

		bone110 = new ModelRenderer(this);
		bone110.setRotationPoint(-0.5F, -13.5833F, -118.7071F);
		qiang2.addChild(bone110);
		bone110.setTextureOffset(502, 0).addBox(-3.4566F, 1.7913F, 0.7007F, 1.0F, 5.0F, 1.0F, 0.0F, false);
		bone110.setTextureOffset(506, 0).addBox(-2.4566F, 6.4213F, 0.7007F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		bone110.setTextureOffset(502, 0).addBox(-0.4566F, 1.7913F, 0.7007F, 1.0F, 5.0F, 1.0F, 0.0F, false);

		bone110_r1 = new ModelRenderer(this);
		bone110_r1.setRotationPoint(3.0F, 1.5F, 1.0F);
		bone110.addChild(bone110_r1);
		setRotationAngle(bone110_r1, 0.7854F, 0.0F, 0.0F);
		bone110_r1.setTextureOffset(504, 11).addBox(-3.4566F, -1.2986F, -0.7105F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		bone110_r1.setTextureOffset(504, 11).addBox(-6.4566F, -1.2986F, -0.7105F, 1.0F, 2.0F, 1.0F, 0.0F, false);

		bone111 = new ModelRenderer(this);
		bone111.setRotationPoint(-0.5F, -13.5833F, -115.7071F);
		qiang2.addChild(bone111);
		bone111.setTextureOffset(502, 0).addBox(-3.4566F, 1.7913F, 0.7007F, 1.0F, 5.0F, 1.0F, 0.0F, false);
		bone111.setTextureOffset(506, 0).addBox(-2.4566F, 6.4213F, 0.7007F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		bone111.setTextureOffset(502, 0).addBox(-0.4566F, 1.7913F, 0.7007F, 1.0F, 5.0F, 1.0F, 0.0F, false);

		bone111_r1 = new ModelRenderer(this);
		bone111_r1.setRotationPoint(3.0F, 1.5F, 1.0F);
		bone111.addChild(bone111_r1);
		setRotationAngle(bone111_r1, 0.7854F, 0.0F, 0.0F);
		bone111_r1.setTextureOffset(504, 11).addBox(-3.4566F, -1.2986F, -0.7105F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		bone111_r1.setTextureOffset(504, 11).addBox(-6.4566F, -1.2986F, -0.7105F, 1.0F, 2.0F, 1.0F, 0.0F, false);

		bone112 = new ModelRenderer(this);
		bone112.setRotationPoint(-0.5F, -13.5833F, -112.7071F);
		qiang2.addChild(bone112);
		bone112.setTextureOffset(502, 0).addBox(-3.4566F, 1.7913F, 0.7007F, 1.0F, 5.0F, 1.0F, 0.0F, false);
		bone112.setTextureOffset(506, 0).addBox(-2.4566F, 6.4213F, 0.7007F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		bone112.setTextureOffset(502, 0).addBox(-0.4566F, 1.7913F, 0.7007F, 1.0F, 5.0F, 1.0F, 0.0F, false);

		bone112_r1 = new ModelRenderer(this);
		bone112_r1.setRotationPoint(3.0F, 1.5F, 1.0F);
		bone112.addChild(bone112_r1);
		setRotationAngle(bone112_r1, 0.7854F, 0.0F, 0.0F);
		bone112_r1.setTextureOffset(504, 11).addBox(-3.4566F, -1.2986F, -0.7105F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		bone112_r1.setTextureOffset(504, 11).addBox(-6.4566F, -1.2986F, -0.7105F, 1.0F, 2.0F, 1.0F, 0.0F, false);

		bone113 = new ModelRenderer(this);
		bone113.setRotationPoint(4.25F, -14.7414F, -42.4161F);
		qiang2.addChild(bone113);
		setRotationAngle(bone113, -0.1745F, 0.5236F, -0.2618F);

		bone113_r1 = new ModelRenderer(this);
		bone113_r1.setRotationPoint(0.7191F, 4.4094F, 3.292F);
		bone113.addChild(bone113_r1);
		setRotationAngle(bone113_r1, 0.9599F, 0.0F, 0.0F);
		bone113_r1.setTextureOffset(227, 417).addBox(-1.6223F, -2.8334F, -9.9062F, 1.0F, 4.0F, 15.0F, 0.0F, false);

		bone113_r2 = new ModelRenderer(this);
		bone113_r2.setRotationPoint(0.7191F, 0.7584F, 2.8721F);
		bone113.addChild(bone113_r2);
		setRotationAngle(bone113_r2, 1.1781F, 0.0F, 0.0F);
		bone113_r2.setTextureOffset(384, 343).addBox(-1.6323F, -3.408F, -13.1749F, 1.0F, 4.0F, 18.0F, 0.0F, false);

		bone113_r3 = new ModelRenderer(this);
		bone113_r3.setRotationPoint(0.7191F, -0.4012F, 5.9616F);
		bone113.addChild(bone113_r3);
		setRotationAngle(bone113_r3, 1.7017F, 0.0F, 0.0F);
		bone113_r3.setTextureOffset(340, 490).addBox(-1.6123F, -3.5033F, -1.6808F, 1.0F, 5.0F, 7.0F, 0.0F, false);

		bone114 = new ModelRenderer(this);
		bone114.setRotationPoint(-6.25F, -14.7414F, -42.4161F);
		qiang2.addChild(bone114);
		setRotationAngle(bone114, -0.1745F, -0.5236F, 0.2618F);

		bone114_r1 = new ModelRenderer(this);
		bone114_r1.setRotationPoint(-0.7191F, 4.4094F, 3.292F);
		bone114.addChild(bone114_r1);
		setRotationAngle(bone114_r1, 0.9599F, 0.0F, 0.0F);
		bone114_r1.setTextureOffset(348, 415).addBox(-1.1782F, -1.8299F, -9.6029F, 1.0F, 4.0F, 15.0F, 0.0F, false);

		bone114_r2 = new ModelRenderer(this);
		bone114_r2.setRotationPoint(-0.7191F, 0.7584F, 2.8721F);
		bone114.addChild(bone114_r2);
		setRotationAngle(bone114_r2, 1.1781F, 0.0F, 0.0F);
		bone114_r2.setTextureOffset(150, 383).addBox(-1.1882F, -2.3626F, -13.0961F, 1.0F, 4.0F, 18.0F, 0.0F, false);

		bone114_r3 = new ModelRenderer(this);
		bone114_r3.setRotationPoint(-0.7191F, -0.4012F, 5.9616F);
		bone114.addChild(bone114_r3);
		setRotationAngle(bone114_r3, 1.7017F, 0.0F, 0.0F);
		bone114_r3.setTextureOffset(291, 490).addBox(-1.1682F, -2.5586F, -2.1352F, 1.0F, 5.0F, 7.0F, 0.0F, false);

		bone115 = new ModelRenderer(this);
		bone115.setRotationPoint(4.25F, -15.7414F, -36.4161F);
		qiang2.addChild(bone115);
		setRotationAngle(bone115, -0.1745F, 0.5236F, -0.2618F);

		bone115_r1 = new ModelRenderer(this);
		bone115_r1.setRotationPoint(0.7191F, 4.4094F, 3.292F);
		bone115.addChild(bone115_r1);
		setRotationAngle(bone115_r1, 0.9599F, 0.0F, 0.0F);
		bone115_r1.setTextureOffset(409, 52).addBox(-1.6223F, -2.8334F, -9.9062F, 1.0F, 4.0F, 15.0F, 0.0F, true);

		bone115_r2 = new ModelRenderer(this);
		bone115_r2.setRotationPoint(0.7191F, 0.7584F, 2.8721F);
		bone115.addChild(bone115_r2);
		setRotationAngle(bone115_r2, 1.1781F, 0.0F, 0.0F);
		bone115_r2.setTextureOffset(366, 5).addBox(-1.6323F, -3.408F, -13.1749F, 1.0F, 4.0F, 18.0F, 0.0F, true);

		bone115_r3 = new ModelRenderer(this);
		bone115_r3.setRotationPoint(0.7191F, -0.4012F, 5.9616F);
		bone115.addChild(bone115_r3);
		setRotationAngle(bone115_r3, 1.7017F, 0.0F, 0.0F);
		bone115_r3.setTextureOffset(267, 301).addBox(-1.6123F, -3.5033F, -1.6808F, 1.0F, 5.0F, 7.0F, 0.0F, true);

		bone116 = new ModelRenderer(this);
		bone116.setRotationPoint(-6.25F, -15.7414F, -36.4161F);
		qiang2.addChild(bone116);
		setRotationAngle(bone116, -0.1745F, -0.5236F, 0.2618F);

		bone116_r1 = new ModelRenderer(this);
		bone116_r1.setRotationPoint(-0.7191F, 4.4094F, 3.292F);
		bone116.addChild(bone116_r1);
		setRotationAngle(bone116_r1, 0.9599F, 0.0F, 0.0F);
		bone116_r1.setTextureOffset(409, 52).addBox(-1.1782F, -1.8299F, -9.6029F, 1.0F, 4.0F, 15.0F, 0.0F, false);

		bone116_r2 = new ModelRenderer(this);
		bone116_r2.setRotationPoint(-0.7191F, 0.7584F, 2.8721F);
		bone116.addChild(bone116_r2);
		setRotationAngle(bone116_r2, 1.1781F, 0.0F, 0.0F);
		bone116_r2.setTextureOffset(366, 5).addBox(-1.1882F, -2.3626F, -13.0961F, 1.0F, 4.0F, 18.0F, 0.0F, false);

		bone116_r3 = new ModelRenderer(this);
		bone116_r3.setRotationPoint(-0.7191F, -0.4012F, 5.9616F);
		bone116.addChild(bone116_r3);
		setRotationAngle(bone116_r3, 1.7017F, 0.0F, 0.0F);
		bone116_r3.setTextureOffset(267, 301).addBox(-1.1682F, -2.5586F, -2.1352F, 1.0F, 5.0F, 7.0F, 0.0F, false);

		bone117 = new ModelRenderer(this);
		bone117.setRotationPoint(4.25F, -16.7414F, -30.4161F);
		qiang2.addChild(bone117);
		setRotationAngle(bone117, -0.1745F, 0.5236F, -0.2618F);

		bone117_r1 = new ModelRenderer(this);
		bone117_r1.setRotationPoint(0.7191F, 4.4094F, 3.292F);
		bone117.addChild(bone117_r1);
		setRotationAngle(bone117_r1, 0.9599F, 0.0F, 0.0F);
		bone117_r1.setTextureOffset(409, 52).addBox(-1.6223F, -2.8334F, -9.9062F, 1.0F, 4.0F, 15.0F, 0.0F, true);

		bone117_r2 = new ModelRenderer(this);
		bone117_r2.setRotationPoint(0.7191F, 0.7584F, 2.8721F);
		bone117.addChild(bone117_r2);
		setRotationAngle(bone117_r2, 1.1781F, 0.0F, 0.0F);
		bone117_r2.setTextureOffset(366, 5).addBox(-1.6323F, -3.408F, -13.1749F, 1.0F, 4.0F, 18.0F, 0.0F, true);

		bone117_r3 = new ModelRenderer(this);
		bone117_r3.setRotationPoint(0.7191F, -0.4012F, 5.9616F);
		bone117.addChild(bone117_r3);
		setRotationAngle(bone117_r3, 1.7017F, 0.0F, 0.0F);
		bone117_r3.setTextureOffset(267, 301).addBox(-1.6123F, -3.5033F, -1.6808F, 1.0F, 5.0F, 7.0F, 0.0F, true);

		bone118 = new ModelRenderer(this);
		bone118.setRotationPoint(-6.25F, -16.7414F, -30.4161F);
		qiang2.addChild(bone118);
		setRotationAngle(bone118, -0.1745F, -0.5236F, 0.2618F);

		bone118_r1 = new ModelRenderer(this);
		bone118_r1.setRotationPoint(-0.7191F, 4.4094F, 3.292F);
		bone118.addChild(bone118_r1);
		setRotationAngle(bone118_r1, 0.9599F, 0.0F, 0.0F);
		bone118_r1.setTextureOffset(409, 52).addBox(-1.1782F, -1.8299F, -9.6029F, 1.0F, 4.0F, 15.0F, 0.0F, false);

		bone118_r2 = new ModelRenderer(this);
		bone118_r2.setRotationPoint(-0.7191F, 0.7584F, 2.8721F);
		bone118.addChild(bone118_r2);
		setRotationAngle(bone118_r2, 1.1781F, 0.0F, 0.0F);
		bone118_r2.setTextureOffset(366, 5).addBox(-1.1882F, -2.3626F, -13.0961F, 1.0F, 4.0F, 18.0F, 0.0F, false);
		bone118_r2.setTextureOffset(366, 5).addBox(-1.1882F, -2.3626F, -13.0961F, 1.0F, 4.0F, 18.0F, 0.0F, false);

		bone118_r3 = new ModelRenderer(this);
		bone118_r3.setRotationPoint(-0.7191F, -0.4012F, 5.9616F);
		bone118.addChild(bone118_r3);
		setRotationAngle(bone118_r3, 1.7017F, 0.0F, 0.0F);
		bone118_r3.setTextureOffset(267, 301).addBox(-1.1682F, -2.5586F, -2.1352F, 1.0F, 5.0F, 7.0F, 0.0F, false);

		bone119 = new ModelRenderer(this);
		bone119.setRotationPoint(-1.0F, -0.9476F, -43.2727F);
		qiang2.addChild(bone119);

		bone119_r1 = new ModelRenderer(this);
		bone119_r1.setRotationPoint(-5.0F, -0.8092F, -0.2553F);
		bone119.addChild(bone119_r1);
		setRotationAngle(bone119_r1, 0.0F, 0.1309F, 0.0F);
		bone119_r1.setTextureOffset(180, 36).addBox(-0.1976F, 9.0737F, -34.7232F, 1.0F, 6.0F, 2.0F, 0.0F, false);

		bone119_r2 = new ModelRenderer(this);
		bone119_r2.setRotationPoint(5.0F, -0.8092F, -0.2553F);
		bone119.addChild(bone119_r2);
		setRotationAngle(bone119_r2, 0.0F, -0.1309F, 0.0F);
		bone119_r2.setTextureOffset(78, 265).addBox(-3.1993F, 9.0737F, -34.4735F, 1.0F, 6.0F, 2.0F, 0.0F, false);

		bone119_r3 = new ModelRenderer(this);
		bone119_r3.setRotationPoint(-5.0F, -0.8092F, -0.2553F);
		bone119.addChild(bone119_r3);
		setRotationAngle(bone119_r3, 0.7418F, 0.1309F, 0.0F);
		bone119_r3.setTextureOffset(66, 58).addBox(-0.4476F, -11.2319F, -18.9325F, 1.0F, 3.0F, 1.0F, 0.0F, false);

		bone119_r4 = new ModelRenderer(this);
		bone119_r4.setRotationPoint(5.0F, -0.8092F, -0.2553F);
		bone119.addChild(bone119_r4);
		setRotationAngle(bone119_r4, 0.7418F, -0.1309F, 0.0F);
		bone119_r4.setTextureOffset(72, 58).addBox(-3.1993F, -11.0632F, -18.7484F, 1.0F, 3.0F, 1.0F, 0.0F, false);

		bone119_r5 = new ModelRenderer(this);
		bone119_r5.setRotationPoint(-5.0F, -0.8092F, -0.2553F);
		bone119.addChild(bone119_r5);
		setRotationAngle(bone119_r5, 1.2217F, 0.1309F, 0.0F);
		bone119_r5.setTextureOffset(99, 105).addBox(0.0524F, -17.7077F, -10.6268F, 1.0F, 2.0F, 3.0F, 0.0F, false);

		bone119_r6 = new ModelRenderer(this);
		bone119_r6.setRotationPoint(5.0F, -0.8092F, -0.2553F);
		bone119.addChild(bone119_r6);
		setRotationAngle(bone119_r6, 1.2217F, -0.1309F, 0.0F);
		bone119_r6.setTextureOffset(237, 94).addBox(-2.9493F, -17.473F, -10.5414F, 1.0F, 2.0F, 3.0F, 0.0F, false);

		bone119_r7 = new ModelRenderer(this);
		bone119_r7.setRotationPoint(-5.0F, -0.8092F, -0.2553F);
		bone119.addChild(bone119_r7);
		setRotationAngle(bone119_r7, 0.5672F, 0.1309F, 0.0F);
		bone119_r7.setTextureOffset(17, 241).addBox(0.0524F, -7.0404F, -2.4824F, 1.0F, 7.0F, 2.0F, 0.0F, false);

		bone119_r8 = new ModelRenderer(this);
		bone119_r8.setRotationPoint(5.0F, -0.8092F, -0.2553F);
		bone119.addChild(bone119_r8);
		setRotationAngle(bone119_r8, 0.5672F, -0.1309F, 0.0F);
		bone119_r8.setTextureOffset(246, 172).addBox(-2.9493F, -6.9062F, -2.2717F, 1.0F, 7.0F, 2.0F, 0.0F, false);

		bone119_r9 = new ModelRenderer(this);
		bone119_r9.setRotationPoint(-5.0F, -0.8092F, -0.2553F);
		bone119.addChild(bone119_r9);
		setRotationAngle(bone119_r9, -0.2182F, 0.1309F, 0.0F);
		bone119_r9.setTextureOffset(337, 473).addBox(0.0524F, 0.1358F, -9.9428F, 1.0F, 8.0F, 9.0F, 0.0F, false);

		bone119_r10 = new ModelRenderer(this);
		bone119_r10.setRotationPoint(5.0F, -0.8092F, -0.2553F);
		bone119.addChild(bone119_r10);
		setRotationAngle(bone119_r10, -0.2182F, -0.1309F, 0.0F);
		bone119_r10.setTextureOffset(404, 473).addBox(-2.9493F, 0.0817F, -9.699F, 1.0F, 8.0F, 9.0F, 0.0F, false);

		bone119_r11 = new ModelRenderer(this);
		bone119_r11.setRotationPoint(-5.0F, -0.8092F, -0.2553F);
		bone119.addChild(bone119_r11);
		setRotationAngle(bone119_r11, 0.3927F, 0.1309F, 0.0F);
		bone119_r11.setTextureOffset(0, 202).addBox(0.0324F, -3.8931F, -35.7014F, 1.0F, 5.0F, 34.0F, 0.0F, false);
		bone119_r11.setTextureOffset(406, 6).addBox(0.0324F, -6.8931F, -17.7014F, 1.0F, 3.0F, 16.0F, 0.0F, false);

		bone119_r12 = new ModelRenderer(this);
		bone119_r12.setRotationPoint(5.0F, -0.8092F, -0.2553F);
		bone119.addChild(bone119_r12);
		setRotationAngle(bone119_r12, 0.3927F, -0.1309F, 0.0F);
		bone119_r12.setTextureOffset(204, 0).addBox(-2.9693F, -3.7975F, -35.4707F, 1.0F, 5.0F, 34.0F, 0.0F, false);
		bone119_r12.setTextureOffset(100, 407).addBox(-2.9693F, -6.7975F, -17.4707F, 1.0F, 3.0F, 16.0F, 0.0F, false);

		bone120 = new ModelRenderer(this);
		bone120.setRotationPoint(-1.5F, -32.6865F, -29.0336F);
		qiang2.addChild(bone120);

		bone120_r1 = new ModelRenderer(this);
		bone120_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone120.addChild(bone120_r1);
		setRotationAngle(bone120_r1, 0.1745F, 0.0F, 0.0F);
		bone120_r1.setTextureOffset(212, 417).addBox(-3.9966F, 3.4107F, -11.3069F, 7.0F, 4.0F, 8.0F, 0.0F, false);

		bone120_r2 = new ModelRenderer(this);
		bone120_r2.setRotationPoint(0.0F, 5.3084F, -10.0202F);
		bone120.addChild(bone120_r2);
		setRotationAngle(bone120_r2, 0.7854F, 0.0F, 0.0F);
		bone120_r2.setTextureOffset(50, 105).addBox(-3.9766F, -1.1736F, -2.9605F, 7.0F, 4.0F, 3.0F, 0.0F, false);
		bone120_r2.setTextureOffset(266, 64).addBox(-3.9766F, -1.1736F, -5.9605F, 7.0F, 1.0F, 3.0F, 0.0F, false);

		bone120_r3 = new ModelRenderer(this);
		bone120_r3.setRotationPoint(0.0F, 3.024F, 2.1015F);
		bone120.addChild(bone120_r3);
		setRotationAngle(bone120_r3, 0.5236F, 0.0F, 0.0F);
		bone120_r3.setTextureOffset(0, 403).addBox(-3.9766F, -1.376F, -5.6512F, 7.0F, 4.0F, 12.0F, 0.0F, false);

		bone120_r4 = new ModelRenderer(this);
		bone120_r4.setRotationPoint(0.0F, 2.3567F, -2.0708F);
		bone120.addChild(bone120_r4);
		setRotationAngle(bone120_r4, 0.1745F, 0.0F, 0.0F);
		bone120_r4.setTextureOffset(304, 164).addBox(-3.9966F, -2.3393F, -10.8069F, 7.0F, 4.0F, 21.0F, 0.0F, false);

		bone120_r5 = new ModelRenderer(this);
		bone120_r5.setRotationPoint(1.0F, 12.9945F, -18.5751F);
		bone120.addChild(bone120_r5);
		setRotationAngle(bone120_r5, 0.5672F, 0.0F, 0.0F);
		bone120_r5.setTextureOffset(30, 288).addBox(-5.5066F, -3.5078F, 3.0881F, 1.0F, 3.0F, 5.0F, 0.0F, false);
		bone120_r5.setTextureOffset(342, 192).addBox(1.4934F, -3.5078F, 3.0881F, 1.0F, 3.0F, 5.0F, 0.0F, false);

		bone120_r6 = new ModelRenderer(this);
		bone120_r6.setRotationPoint(0.5F, 3.5052F, -12.4712F);
		bone120.addChild(bone120_r6);
		setRotationAngle(bone120_r6, -0.1745F, 0.0F, 0.0F);
		bone120_r6.setTextureOffset(47, 58).addBox(-4.9766F, -1.837F, -1.7058F, 1.0F, 6.0F, 3.0F, 0.0F, false);
		bone120_r6.setTextureOffset(152, 187).addBox(2.0234F, -1.837F, -1.7058F, 1.0F, 6.0F, 3.0F, 0.0F, false);

		bone120_r7 = new ModelRenderer(this);
		bone120_r7.setRotationPoint(0.5F, -2.3284F, -12.307F);
		bone120.addChild(bone120_r7);
		setRotationAngle(bone120_r7, 0.0436F, 0.0F, 0.0F);
		bone120_r7.setTextureOffset(183, 115).addBox(-5.0066F, 3.1657F, -1.7691F, 8.0F, 1.0F, 3.0F, 0.0F, false);

		bone121 = new ModelRenderer(this);
		bone121.setRotationPoint(-1.0F, -6.8727F, 3.0818F);
		qiang2.addChild(bone121);
		bone121.setTextureOffset(110, 0).addBox(2.5034F, 30.7307F, -15.5505F, 1.0F, 6.0F, 5.0F, 0.0F, false);
		bone121.setTextureOffset(0, 17).addBox(-4.4966F, 35.7307F, -12.0505F, 7.0F, 1.0F, 1.0F, 0.0F, false);
		bone121.setTextureOffset(77, 0).addBox(-5.7066F, 30.7307F, -15.5505F, 1.0F, 6.0F, 5.0F, 0.0F, false);

		bone121_r1 = new ModelRenderer(this);
		bone121_r1.setRotationPoint(0.0F, 2.0F, -3.0F);
		bone121.addChild(bone121_r1);
		setRotationAngle(bone121_r1, -0.3491F, 0.0F, 0.0F);
		bone121_r1.setTextureOffset(476, 357).addBox(-2.9766F, -5.2241F, -0.9064F, 4.0F, 9.0F, 6.0F, 0.0F, false);

		bone121_r2 = new ModelRenderer(this);
		bone121_r2.setRotationPoint(0.0F, 9.8916F, -2.5292F);
		bone121.addChild(bone121_r2);
		setRotationAngle(bone121_r2, 0.3054F, 0.0F, 0.0F);
		bone121_r2.setTextureOffset(314, 454).addBox(-2.9566F, -5.2242F, -1.0937F, 4.0F, 17.0F, 6.0F, 0.0F, false);

		bone121_r3 = new ModelRenderer(this);
		bone121_r3.setRotationPoint(0.5F, 9.8916F, -2.5292F);
		bone121.addChild(bone121_r3);
		setRotationAngle(bone121_r3, 0.3927F, 0.0F, 0.0F);
		bone121_r3.setTextureOffset(54, 386).addBox(-2.9566F, -5.2334F, 3.8826F, 3.0F, 17.0F, 2.0F, 0.0F, false);

		bone121_r4 = new ModelRenderer(this);
		bone121_r4.setRotationPoint(-4.0F, 26.6365F, -6.6672F);
		bone121.addChild(bone121_r4);
		setRotationAngle(bone121_r4, 0.2182F, 0.0F, 0.0F);
		bone121_r4.setTextureOffset(293, 428).addBox(-1.6666F, -1.217F, -9.5693F, 1.0F, 4.0F, 14.0F, 0.0F, false);
		bone121_r4.setTextureOffset(428, 406).addBox(6.5434F, -1.217F, -9.5693F, 1.0F, 4.0F, 14.0F, 0.0F, false);

		bone121_r5 = new ModelRenderer(this);
		bone121_r5.setRotationPoint(-4.0F, 21.0971F, 5.615F);
		bone121.addChild(bone121_r5);
		setRotationAngle(bone121_r5, 0.6109F, 0.0F, 0.0F);
		bone121_r5.setTextureOffset(282, 1).addBox(-1.6866F, -1.2651F, -21.9223F, 1.0F, 5.0F, 26.0F, 0.0F, false);
		bone121_r5.setTextureOffset(0, 241).addBox(-0.4766F, 2.7349F, -21.9223F, 7.0F, 1.0F, 26.0F, 0.0F, false);
		bone121_r5.setTextureOffset(239, 287).addBox(6.5234F, -1.2651F, -21.9223F, 1.0F, 5.0F, 26.0F, 0.0F, false);

		bone121_r6 = new ModelRenderer(this);
		bone121_r6.setRotationPoint(-4.0F, 24.1767F, -0.8443F);
		bone121.addChild(bone121_r6);
		setRotationAngle(bone121_r6, 1.2217F, 0.0F, 0.0F);
		bone121_r6.setTextureOffset(357, 380).addBox(-1.6666F, -1.4064F, -2.0659F, 1.0F, 4.0F, 6.0F, 0.0F, false);
		bone121_r6.setTextureOffset(195, 414).addBox(6.5434F, -1.4064F, -2.0659F, 1.0F, 4.0F, 6.0F, 0.0F, false);

		bone121_r7 = new ModelRenderer(this);
		bone121_r7.setRotationPoint(-4.0F, 19.6365F, 4.3328F);
		bone121.addChild(bone121_r7);
		setRotationAngle(bone121_r7, 0.2182F, 0.0F, 0.0F);
		bone121_r7.setTextureOffset(480, 147).addBox(-1.6666F, -1.217F, -4.8593F, 1.0F, 4.0F, 9.0F, 0.0F, false);
		bone121_r7.setTextureOffset(480, 195).addBox(6.5434F, -1.217F, -4.8593F, 1.0F, 4.0F, 9.0F, 0.0F, false);

		bone121_r8 = new ModelRenderer(this);
		bone121_r8.setRotationPoint(0.5F, 7.8916F, -2.2792F);
		bone121.addChild(bone121_r8);
		setRotationAngle(bone121_r8, 0.3927F, 0.0F, 0.0F);
		bone121_r8.setTextureOffset(457, 363).addBox(-3.9566F, 13.7666F, -3.8674F, 5.0F, 4.0F, 9.0F, 0.0F, false);

		bone9 = new ModelRenderer(this);
		bone9.setRotationPoint(11.0F, 17.6727F, 10.6184F);
		youtui.addChild(bone9);

		bone9_r1 = new ModelRenderer(this);
		bone9_r1.setRotationPoint(1.0F, 6.0F, -1.0F);
		bone9.addChild(bone9_r1);
		setRotationAngle(bone9_r1, 0.6981F, 0.0F, 0.0F);
		bone9_r1.setTextureOffset(29, 17).addBox(-2.75F, 7.5F, 3.5F, 3.0F, 1.0F, 1.0F, 0.0F, false);

		bone9_r2 = new ModelRenderer(this);
		bone9_r2.setRotationPoint(-7.0F, -0.0511F, -1.209F);
		bone9.addChild(bone9_r2);
		setRotationAngle(bone9_r2, 0.3927F, 0.0F, 0.0F);
		bone9_r2.setTextureOffset(98, 134).addBox(4.49F, 1.5F, 3.5F, 5.0F, 10.0F, 1.0F, 0.0F, false);

		bone9_r3 = new ModelRenderer(this);
		bone9_r3.setRotationPoint(-3.0F, 4.8612F, 2.7432F);
		bone9.addChild(bone9_r3);
		setRotationAngle(bone9_r3, 0.3927F, 0.0F, -0.0873F);
		bone9_r3.setTextureOffset(317, 308).addBox(-1.01F, -3.5508F, -1.2715F, 2.0F, 9.0F, 4.0F, 0.0F, false);

		bone9_r4 = new ModelRenderer(this);
		bone9_r4.setRotationPoint(3.0F, 4.8612F, 2.7432F);
		bone9.addChild(bone9_r4);
		setRotationAngle(bone9_r4, 0.3927F, 0.0F, 0.0873F);
		bone9_r4.setTextureOffset(366, 362).addBox(-1.01F, -3.5508F, -1.2715F, 2.0F, 9.0F, 4.0F, 0.0F, false);

		bone9_r5 = new ModelRenderer(this);
		bone9_r5.setRotationPoint(-3.0F, 4.8612F, 2.7432F);
		bone9.addChild(bone9_r5);
		setRotationAngle(bone9_r5, 0.6981F, 0.0F, -0.0873F);
		bone9_r5.setTextureOffset(283, 151).addBox(-1.0F, -2.0337F, -3.0995F, 2.0F, 10.0F, 4.0F, 0.0F, false);

		bone9_r6 = new ModelRenderer(this);
		bone9_r6.setRotationPoint(3.0F, 4.8612F, 2.7432F);
		bone9.addChild(bone9_r6);
		setRotationAngle(bone9_r6, 0.6981F, 0.0F, 0.0873F);
		bone9_r6.setTextureOffset(251, 285).addBox(-1.0F, -2.0337F, -3.0995F, 2.0F, 10.0F, 4.0F, 0.0F, false);

		bone9_r7 = new ModelRenderer(this);
		bone9_r7.setRotationPoint(-3.0F, 4.8612F, 2.7432F);
		bone9.addChild(bone9_r7);
		setRotationAngle(bone9_r7, 0.0F, 0.0F, -0.0873F);
		bone9_r7.setTextureOffset(289, 240).addBox(-1.0F, -5.5656F, -3.6816F, 2.0F, 6.0F, 5.0F, 0.0F, false);

		bone9_r8 = new ModelRenderer(this);
		bone9_r8.setRotationPoint(3.0F, 4.8612F, 2.7432F);
		bone9.addChild(bone9_r8);
		setRotationAngle(bone9_r8, 0.0F, 0.0F, 0.0873F);
		bone9_r8.setTextureOffset(290, 32).addBox(-1.0F, -5.5656F, -3.6816F, 2.0F, 6.0F, 5.0F, 0.0F, false);

		bone11 = new ModelRenderer(this);
		bone11.setRotationPoint(11.0474F, 39.6231F, -6.7644F);
		youtui.addChild(bone11);
		setRotationAngle(bone11, 0.4363F, 0.0F, 0.0F);
		bone11.setTextureOffset(120, 289).addBox(-4.181F, -1.4682F, -2.9994F, 6.0F, 13.0F, 5.0F, 0.0F, false);
		bone11.setTextureOffset(207, 480).addBox(0.819F, -5.4682F, -0.1894F, 3.0F, 17.0F, 4.0F, 0.0F, false);
		bone11.setTextureOffset(482, 185).addBox(-0.681F, 5.5318F, -0.9394F, 5.0F, 5.0F, 5.0F, 0.0F, false);

		bone11_r1 = new ModelRenderer(this);
		bone11_r1.setRotationPoint(0.0784F, 5.9951F, -9.4361F);
		bone11.addChild(bone11_r1);
		setRotationAngle(bone11_r1, 0.0436F, 0.0F, 0.0F);
		bone11_r1.setTextureOffset(34, 301).addBox(0.8869F, 1.7988F, 1.8689F, 4.0F, 5.0F, 8.0F, 0.0F, false);
		bone11_r1.setTextureOffset(254, 219).addBox(-5.1131F, 0.7988F, 1.8689F, 4.0F, 6.0F, 10.0F, 0.0F, false);
		bone11_r1.setTextureOffset(197, 252).addBox(-4.1131F, 13.6838F, -7.9847F, 8.0F, 2.0F, 4.0F, 0.0F, false);

		bone11_r2 = new ModelRenderer(this);
		bone11_r2.setRotationPoint(-0.0347F, 11.0088F, -4.4904F);
		bone11.addChild(bone11_r2);
		setRotationAngle(bone11_r2, 0.6981F, 0.0F, 0.0F);
		bone11_r2.setTextureOffset(463, 463).addBox(-0.1463F, -0.4771F, 0.491F, 6.0F, 7.0F, 7.0F, 0.0F, false);
		bone11_r2.setTextureOffset(424, 165).addBox(-7.1463F, -0.4771F, 0.491F, 7.0F, 6.0F, 10.0F, 0.0F, false);

		bone11_r3 = new ModelRenderer(this);
		bone11_r3.setRotationPoint(0.0784F, 5.9951F, -9.4361F);
		bone11.addChild(bone11_r3);
		setRotationAngle(bone11_r3, 0.3491F, 0.0F, 0.0F);
		bone11_r3.setTextureOffset(131, 448).addBox(-3.1131F, -2.7132F, -1.2026F, 6.0F, 14.0F, 6.0F, 0.0F, false);
		bone11_r3.setTextureOffset(210, 370).addBox(-4.1131F, -4.7132F, -2.2026F, 8.0F, 7.0F, 4.0F, 0.0F, false);

		bone11_r4 = new ModelRenderer(this);
		bone11_r4.setRotationPoint(0.0784F, 5.9951F, -9.4361F);
		bone11.addChild(bone11_r4);
		setRotationAngle(bone11_r4, -1.5272F, 1.4399F, -1.5708F);
		bone11_r4.setTextureOffset(494, 323).addBox(-6.4508F, -7.7011F, -7.3678F, 5.0F, 6.0F, 3.0F, 0.0F, false);

		bone11_r5 = new ModelRenderer(this);
		bone11_r5.setRotationPoint(0.0784F, 5.9951F, -9.4361F);
		bone11.addChild(bone11_r5);
		setRotationAngle(bone11_r5, -1.5708F, 1.2217F, -1.5708F);
		bone11_r5.setTextureOffset(160, 134).addBox(-3.0707F, 5.6303F, -6.3881F, 2.0F, 9.0F, 3.0F, 0.0F, false);

		bone11_r6 = new ModelRenderer(this);
		bone11_r6.setRotationPoint(0.0784F, 5.9951F, -9.4361F);
		bone11.addChild(bone11_r6);
		setRotationAngle(bone11_r6, 0.0678F, 0.8715F, 0.0519F);
		bone11_r6.setTextureOffset(92, 101).addBox(-2.5272F, 13.6838F, -8.2833F, 6.0F, 2.0F, 2.0F, 0.0F, false);

		bone11_r7 = new ModelRenderer(this);
		bone11_r7.setRotationPoint(0.0784F, 5.9951F, -9.4361F);
		bone11.addChild(bone11_r7);
		setRotationAngle(bone11_r7, -0.395F, 0.833F, -0.2992F);
		bone11_r7.setTextureOffset(494, 494).addBox(-4.4679F, 0.3511F, -3.6713F, 4.0F, 15.0F, 1.0F, 0.0F, false);
		bone11_r7.setTextureOffset(414, 0).addBox(-5.2781F, -6.6075F, -5.2822F, 6.0F, 4.0F, 2.0F, 0.0F, false);
		bone11_r7.setTextureOffset(39, 39).addBox(-1.0281F, -10.5975F, -5.2822F, 2.0F, 4.0F, 2.0F, 0.0F, false);

		bone11_r8 = new ModelRenderer(this);
		bone11_r8.setRotationPoint(0.0784F, 5.9951F, -9.4361F);
		bone11.addChild(bone11_r8);
		setRotationAngle(bone11_r8, 0.0327F, 0.833F, -0.2992F);
		bone11_r8.setTextureOffset(194, 68).addBox(-5.2781F, -4.5541F, -3.7295F, 4.0F, 4.0F, 1.0F, 0.0F, false);

		bone11_r9 = new ModelRenderer(this);
		bone11_r9.setRotationPoint(0.0784F, 5.9951F, -9.4361F);
		bone11.addChild(bone11_r9);
		setRotationAngle(bone11_r9, -1.4399F, 1.2217F, -1.5708F);
		bone11_r9.setTextureOffset(297, 164).addBox(-3.0707F, -3.0449F, -7.0983F, 2.0F, 8.0F, 3.0F, 0.0F, false);

		bone11_r10 = new ModelRenderer(this);
		bone11_r10.setRotationPoint(0.0784F, 5.9951F, -9.4361F);
		bone11.addChild(bone11_r10);
		setRotationAngle(bone11_r10, -0.8496F, 0.3471F, -1.0663F);
		bone11_r10.setTextureOffset(200, 119).addBox(2.9618F, -6.3884F, -5.2822F, 1.0F, 1.0F, 2.0F, 0.0F, false);

		bone11_r11 = new ModelRenderer(this);
		bone11_r11.setRotationPoint(0.0784F, 5.9951F, -9.4361F);
		bone11.addChild(bone11_r11);
		setRotationAngle(bone11_r11, -0.7809F, 0.7024F, -0.5695F);
		bone11_r11.setTextureOffset(58, 112).addBox(0.6458F, -11.2126F, -8.4285F, 3.0F, 3.0F, 3.0F, 0.0F, false);

		bone11_r12 = new ModelRenderer(this);
		bone11_r12.setRotationPoint(0.0784F, 5.9951F, -9.4361F);
		bone11.addChild(bone11_r12);
		setRotationAngle(bone11_r12, 0.0678F, -0.8715F, -0.0519F);
		bone11_r12.setTextureOffset(303, 230).addBox(-3.6182F, 13.6838F, -8.11F, 6.0F, 2.0F, 2.0F, 0.0F, false);

		bone11_r13 = new ModelRenderer(this);
		bone11_r13.setRotationPoint(0.0784F, 5.9951F, -9.4361F);
		bone11.addChild(bone11_r13);
		setRotationAngle(bone11_r13, -1.5272F, -1.4399F, 1.5708F);
		bone11_r13.setTextureOffset(494, 369).addBox(1.4508F, -7.6912F, -7.1417F, 5.0F, 6.0F, 3.0F, 0.0F, false);

		bone11_r14 = new ModelRenderer(this);
		bone11_r14.setRotationPoint(0.0784F, 5.9951F, -9.4361F);
		bone11.addChild(bone11_r14);
		setRotationAngle(bone11_r14, -1.5708F, -1.2217F, 1.5708F);
		bone11_r14.setTextureOffset(196, 134).addBox(1.0707F, 5.6303F, -6.1618F, 2.0F, 9.0F, 3.0F, 0.0F, false);

		bone11_r15 = new ModelRenderer(this);
		bone11_r15.setRotationPoint(0.0784F, 5.9951F, -9.4361F);
		bone11.addChild(bone11_r15);
		setRotationAngle(bone11_r15, -0.8496F, -0.3471F, 1.0663F);
		bone11_r15.setTextureOffset(203, 134).addBox(-5.0446F, -6.2856F, -5.1089F, 1.0F, 1.0F, 2.0F, 0.0F, false);

		bone11_r16 = new ModelRenderer(this);
		bone11_r16.setRotationPoint(0.0784F, 5.9951F, -9.4361F);
		bone11.addChild(bone11_r16);
		setRotationAngle(bone11_r16, -0.395F, -0.833F, 0.2992F);
		bone11_r16.setTextureOffset(223, 252).addBox(-1.5974F, -10.5975F, -5.1089F, 2.0F, 4.0F, 2.0F, 0.0F, false);
		bone11_r16.setTextureOffset(424, 16).addBox(-1.5974F, -6.6075F, -5.1089F, 6.0F, 4.0F, 2.0F, 0.0F, false);

		bone11_r17 = new ModelRenderer(this);
		bone11_r17.setRotationPoint(0.0784F, 5.9951F, -9.4361F);
		bone11.addChild(bone11_r17);
		setRotationAngle(bone11_r17, 0.0327F, -0.833F, 0.2992F);
		bone11_r17.setTextureOffset(283, 308).addBox(0.3226F, -4.4822F, -3.5717F, 4.0F, 4.0F, 1.0F, 0.0F, false);

		bone11_r18 = new ModelRenderer(this);
		bone11_r18.setRotationPoint(0.0784F, 5.9951F, -9.4361F);
		bone11.addChild(bone11_r18);
		setRotationAngle(bone11_r18, -1.4399F, -1.2217F, 1.5708F);
		bone11_r18.setTextureOffset(314, 164).addBox(1.0707F, -3.0153F, -6.8739F, 2.0F, 8.0F, 3.0F, 0.0F, false);

		bone11_r19 = new ModelRenderer(this);
		bone11_r19.setRotationPoint(0.3284F, 5.9951F, -9.4361F);
		bone11.addChild(bone11_r19);
		setRotationAngle(bone11_r19, -0.395F, -0.833F, 0.2992F);
		bone11_r19.setTextureOffset(496, 121).addBox(0.3225F, 0.3511F, -3.498F, 4.0F, 15.0F, 1.0F, 0.0F, false);

		bone11_r20 = new ModelRenderer(this);
		bone11_r20.setRotationPoint(0.0784F, 5.9951F, -9.4361F);
		bone11.addChild(bone11_r20);
		setRotationAngle(bone11_r20, -0.7809F, -0.7024F, 0.5695F);
		bone11_r20.setTextureOffset(313, 341).addBox(-3.7913F, -11.2126F, -8.2552F, 3.0F, 3.0F, 3.0F, 0.0F, false);

		bone11_r21 = new ModelRenderer(this);
		bone11_r21.setRotationPoint(0.0784F, 5.9951F, -9.4361F);
		bone11.addChild(bone11_r21);
		setRotationAngle(bone11_r21, -0.2618F, 0.0F, 0.0F);
		bone11_r21.setTextureOffset(118, 406).addBox(-3.1131F, 0.3511F, -2.0014F, 6.0F, 15.0F, 2.0F, 0.0F, false);
		bone11_r21.setTextureOffset(482, 460).addBox(-4.1231F, -10.5975F, -4.5076F, 8.0F, 8.0F, 2.0F, 0.0F, false);

		bone11_r22 = new ModelRenderer(this);
		bone11_r22.setRotationPoint(0.0784F, 5.9951F, -9.4361F);
		bone11.addChild(bone11_r22);
		setRotationAngle(bone11_r22, -0.5672F, 0.0F, 0.0F);
		bone11_r22.setTextureOffset(127, 275).addBox(-4.1131F, -11.2226F, -8.2106F, 8.0F, 3.0F, 3.0F, 0.0F, false);

		bone20 = new ModelRenderer(this);
		bone20.setRotationPoint(-0.6224F, 9.0982F, 1.3818F);
		bone11.addChild(bone20);
		setRotationAngle(bone20, -0.2618F, 0.0F, 0.0F);

		bone12 = new ModelRenderer(this);
		bone12.setRotationPoint(0.2182F, 0.1756F, 0.7326F);
		bone20.addChild(bone12);
		bone12.setTextureOffset(244, 417).addBox(-5.2937F, 65.4744F, -0.8291F, 4.0F, 3.0F, 4.0F, 0.0F, false);
		bone12.setTextureOffset(374, 269).addBox(0.4815F, 65.4744F, -0.8291F, 4.0F, 3.0F, 4.0F, 0.0F, false);
		bone12.setTextureOffset(93, 0).addBox(-8.8445F, 7.3738F, -1.4891F, 3.0F, 17.0F, 11.0F, 0.0F, false);
		bone12.setTextureOffset(60, 0).addBox(5.0323F, 7.3738F, -1.4891F, 3.0F, 17.0F, 11.0F, 0.0F, false);

		bone12_r1 = new ModelRenderer(this);
		bone12_r1.setRotationPoint(-2.2476F, 3.2439F, -5.3897F);
		bone12.addChild(bone12_r1);
		setRotationAngle(bone12_r1, 0.2403F, 0.9903F, 0.1148F);
		bone12_r1.setTextureOffset(384, 386).addBox(-4.9013F, 27.4922F, -6.9058F, 6.0F, 34.0F, 4.0F, 0.0F, false);

		bone12_r2 = new ModelRenderer(this);
		bone12_r2.setRotationPoint(-2.2476F, 3.2439F, -5.3897F);
		bone12.addChild(bone12_r2);
		setRotationAngle(bone12_r2, 0.2618F, 0.0F, 0.0F);
		bone12_r2.setTextureOffset(107, 446).addBox(-0.6585F, 40.6604F, 1.7177F, 5.0F, 14.0F, 7.0F, 0.0F, false);
		bone12_r2.setTextureOffset(158, 261).addBox(0.3415F, 46.1128F, 0.6056F, 3.0F, 9.0F, 2.0F, 0.0F, false);
		bone12_r2.setTextureOffset(380, 189).addBox(-0.1585F, 54.6659F, 2.5528F, 4.0F, 2.0F, 5.0F, 0.0F, false);

		bone12_r3 = new ModelRenderer(this);
		bone12_r3.setRotationPoint(-2.2476F, 3.2439F, -5.3897F);
		bone12.addChild(bone12_r3);
		setRotationAngle(bone12_r3, 0.4363F, 0.0F, 0.0F);
		bone12_r3.setTextureOffset(446, 446).addBox(-0.6585F, 8.8137F, 10.0248F, 5.0F, 13.0F, 7.0F, 0.0F, false);
		bone12_r3.setTextureOffset(171, 38).addBox(0.8415F, 55.1901F, -7.6831F, 2.0F, 3.0F, 1.0F, 0.0F, false);
		bone12_r3.setTextureOffset(468, 334).addBox(-0.1585F, 21.8192F, 10.8599F, 4.0F, 2.0F, 5.0F, 0.0F, false);

		bone12_r4 = new ModelRenderer(this);
		bone12_r4.setRotationPoint(-2.2476F, 3.2439F, -5.3897F);
		bone12.addChild(bone12_r4);
		setRotationAngle(bone12_r4, 0.2427F, -0.0992F, 0.3806F);
		bone12_r4.setTextureOffset(158, 0).addBox(24.7342F, 49.8824F, 3.8028F, 1.0F, 3.0F, 2.0F, 0.0F, false);

		bone12_r5 = new ModelRenderer(this);
		bone12_r5.setRotationPoint(-2.2476F, 3.2439F, -5.3897F);
		bone12.addChild(bone12_r5);
		setRotationAngle(bone12_r5, 0.4068F, -0.1624F, 0.3591F);
		bone12_r5.setTextureOffset(120, 161).addBox(12.1643F, 19.536F, 12.1099F, 1.0F, 3.0F, 2.0F, 0.0F, false);

		bone12_r6 = new ModelRenderer(this);
		bone12_r6.setRotationPoint(-2.2476F, 3.2439F, -5.3897F);
		bone12.addChild(bone12_r6);
		setRotationAngle(bone12_r6, 0.6109F, 0.0F, 0.0F);
		bone12_r6.setTextureOffset(173, 161).addBox(0.8415F, 24.2849F, 6.2016F, 2.0F, 3.0F, 1.0F, 0.0F, false);

		bone12_r7 = new ModelRenderer(this);
		bone12_r7.setRotationPoint(-2.2476F, 3.2439F, -5.3897F);
		bone12.addChild(bone12_r7);
		setRotationAngle(bone12_r7, 0.2427F, 0.0992F, -0.3806F);
		bone12_r7.setTextureOffset(128, 161).addBox(-22.3316F, 51.2918F, 3.8028F, 1.0F, 3.0F, 2.0F, 0.0F, false);

		bone12_r8 = new ModelRenderer(this);
		bone12_r8.setRotationPoint(-2.2476F, 3.2439F, -5.3897F);
		bone12.addChild(bone12_r8);
		setRotationAngle(bone12_r8, 0.4068F, 0.1624F, -0.3591F);
		bone12_r8.setTextureOffset(157, 161).addBox(-9.7617F, 20.9454F, 12.1099F, 1.0F, 3.0F, 2.0F, 0.0F, false);

		bone12_r9 = new ModelRenderer(this);
		bone12_r9.setRotationPoint(-2.2476F, 3.2439F, -5.3897F);
		bone12.addChild(bone12_r9);
		setRotationAngle(bone12_r9, 0.0436F, 0.0F, 0.0F);
		bone12_r9.setTextureOffset(180, 0).addBox(0.8415F, 52.6336F, 19.0041F, 2.0F, 3.0F, 1.0F, 0.0F, false);
		bone12_r9.setTextureOffset(220, 348).addBox(-1.6585F, 6.366F, -0.2218F, 7.0F, 6.0F, 16.0F, 0.0F, false);
		bone12_r9.setTextureOffset(157, 161).addBox(-1.0969F, 37.2699F, 9.787F, 5.0F, 9.0F, 6.0F, 0.0F, false);

		bone12_r10 = new ModelRenderer(this);
		bone12_r10.setRotationPoint(-2.2476F, 3.2439F, -5.3897F);
		bone12.addChild(bone12_r10);
		setRotationAngle(bone12_r10, 0.2182F, 0.0F, 0.0F);
		bone12_r10.setTextureOffset(188, 188).addBox(0.8415F, 18.7675F, 20.005F, 2.0F, 3.0F, 1.0F, 0.0F, false);

		bone12_r11 = new ModelRenderer(this);
		bone12_r11.setRotationPoint(-2.2476F, 3.2439F, -5.3897F);
		bone12.addChild(bone12_r11);
		setRotationAngle(bone12_r11, -0.6109F, 0.0F, 0.0F);
		bone12_r11.setTextureOffset(125, 323).addBox(-3.6585F, -12.8555F, 10.7641F, 9.0F, 12.0F, 5.0F, 0.0F, false);
		bone12_r11.setTextureOffset(444, 214).addBox(-2.3721F, -8.5809F, -0.0674F, 4.0F, 4.0F, 11.0F, 0.0F, false);

		bone12_r12 = new ModelRenderer(this);
		bone12_r12.setRotationPoint(-2.2476F, 3.2439F, -4.8897F);
		bone12.addChild(bone12_r12);
		setRotationAngle(bone12_r12, -0.6109F, 0.0F, 0.0F);
		bone12_r12.setTextureOffset(126, 382).addBox(1.3415F, -8.8555F, 9.7641F, 5.0F, 8.0F, 6.0F, 0.0F, false);

		bone12_r13 = new ModelRenderer(this);
		bone12_r13.setRotationPoint(0.7854F, 4.2008F, 2.8509F);
		bone12.addChild(bone12_r13);
		setRotationAngle(bone12_r13, -0.6981F, -0.0436F, 0.0873F);
		bone12_r13.setTextureOffset(425, 339).addBox(-0.4373F, -1.8381F, -7.9043F, 3.0F, 3.0F, 13.0F, 0.0F, false);

		bone12_r14 = new ModelRenderer(this);
		bone12_r14.setRotationPoint(-2.2476F, 3.2439F, -5.3897F);
		bone12.addChild(bone12_r14);
		setRotationAngle(bone12_r14, 0.1309F, 0.0F, 0.0F);
		bone12_r14.setTextureOffset(263, 477).addBox(-0.7201F, 61.348F, -7.7743F, 5.0F, 11.0F, 5.0F, 0.0F, false);
		bone12_r14.setTextureOffset(0, 165).addBox(-2.6585F, 35.729F, -4.7839F, 9.0F, 29.0F, 6.0F, 0.0F, false);
		bone12_r14.setTextureOffset(386, 299).addBox(-3.0802F, 10.729F, -5.0526F, 9.0F, 25.0F, 5.0F, 0.0F, false);
		bone12_r14.setTextureOffset(124, 115).addBox(-3.6585F, 8.3115F, -6.0338F, 11.0F, 2.0F, 5.0F, 0.0F, false);

		bone12_r15 = new ModelRenderer(this);
		bone12_r15.setRotationPoint(-2.2476F, 3.2439F, -5.3897F);
		bone12.addChild(bone12_r15);
		setRotationAngle(bone12_r15, -0.1745F, 0.0F, 0.0F);
		bone12_r15.setTextureOffset(340, 280).addBox(-3.7201F, 63.5518F, 14.448F, 11.0F, 7.0F, 5.0F, 0.0F, false);

		bone12_r16 = new ModelRenderer(this);
		bone12_r16.setRotationPoint(-2.2476F, 3.2439F, -5.3897F);
		bone12.addChild(bone12_r16);
		setRotationAngle(bone12_r16, -0.2618F, 0.0F, 0.0F);
		bone12_r16.setTextureOffset(111, 43).addBox(7.2799F, 0.0566F, 16.5214F, 2.0F, 17.0F, 3.0F, 0.0F, false);
		bone12_r16.setTextureOffset(272, 207).addBox(-6.5769F, 0.0566F, 16.5214F, 2.0F, 17.0F, 3.0F, 0.0F, false);
		bone12_r16.setTextureOffset(338, 338).addBox(6.2799F, -2.7478F, 2.7081F, 5.0F, 6.0F, 18.0F, 0.0F, false);
		bone12_r16.setTextureOffset(339, 146).addBox(-7.5969F, -2.7478F, 2.7081F, 5.0F, 6.0F, 18.0F, 0.0F, false);

		bone12_r17 = new ModelRenderer(this);
		bone12_r17.setRotationPoint(-7.0688F, 10.053F, 6.2009F);
		bone12.addChild(bone12_r17);
		setRotationAngle(bone12_r17, -0.2618F, -0.0873F, -0.3054F);
		bone12_r17.setTextureOffset(409, 294).addBox(-3.5F, -3.325F, -2.25F, 6.0F, 6.0F, 4.0F, 0.0F, false);

		bone12_r18 = new ModelRenderer(this);
		bone12_r18.setRotationPoint(6.5323F, 10.053F, 6.2009F);
		bone12.addChild(bone12_r18);
		setRotationAngle(bone12_r18, -0.2618F, 0.0873F, 0.3054F);
		bone12_r18.setTextureOffset(480, 392).addBox(-2.5F, -3.325F, -2.25F, 6.0F, 6.0F, 4.0F, 0.0F, false);

		bone12_r19 = new ModelRenderer(this);
		bone12_r19.setRotationPoint(-2.2476F, 3.2439F, -5.3897F);
		bone12.addChild(bone12_r19);
		setRotationAngle(bone12_r19, 0.3927F, 0.0F, 0.0F);
		bone12_r19.setTextureOffset(305, 230).addBox(-3.5969F, 10.3316F, -5.6925F, 10.0F, 14.0F, 16.0F, 0.0F, false);

		bone12_r20 = new ModelRenderer(this);
		bone12_r20.setRotationPoint(-2.2476F, 3.2439F, -5.3897F);
		bone12.addChild(bone12_r20);
		setRotationAngle(bone12_r20, -0.2182F, 0.0F, 0.0F);
		bone12_r20.setTextureOffset(282, 409).addBox(-3.5969F, 14.2648F, 15.6819F, 10.0F, 12.0F, 7.0F, 0.0F, false);
		bone12_r20.setTextureOffset(478, 100).addBox(-2.2069F, 48.9271F, 18.9496F, 8.0F, 9.0F, 3.0F, 0.0F, false);
		bone12_r20.setTextureOffset(204, 0).addBox(-2.0969F, 26.9271F, 14.9496F, 7.0F, 28.0F, 6.0F, 0.0F, false);

		bone12_r21 = new ModelRenderer(this);
		bone12_r21.setRotationPoint(-2.2476F, 3.2439F, -5.3897F);
		bone12.addChild(bone12_r21);
		setRotationAngle(bone12_r21, 1.0472F, 0.0F, 0.0F);
		bone12_r21.setTextureOffset(357, 241).addBox(-2.0969F, 36.8176F, -58.0984F, 8.0F, 4.0F, 15.0F, 0.0F, false);

		bone12_r22 = new ModelRenderer(this);
		bone12_r22.setRotationPoint(-2.2476F, 3.2439F, -5.3897F);
		bone12.addChild(bone12_r22);
		setRotationAngle(bone12_r22, 1.0472F, 0.1345F, 0.0397F);
		bone12_r22.setTextureOffset(444, 402).addBox(4.8453F, 39.0814F, -58.6112F, 4.0F, 4.0F, 11.0F, 0.0F, false);
		bone12_r22.setTextureOffset(280, 75).addBox(4.8453F, 40.0814F, -45.6112F, 3.0F, 3.0F, 4.0F, 0.0F, false);

		bone12_r23 = new ModelRenderer(this);
		bone12_r23.setRotationPoint(-2.2476F, 3.2439F, -5.3897F);
		bone12.addChild(bone12_r23);
		setRotationAngle(bone12_r23, 1.0472F, -0.1345F, -0.0397F);
		bone12_r23.setTextureOffset(155, 447).addBox(-5.3253F, 39.7269F, -58.9845F, 4.0F, 3.0F, 11.0F, 0.0F, false);
		bone12_r23.setTextureOffset(309, 409).addBox(-4.3253F, 39.7269F, -45.9845F, 3.0F, 3.0F, 4.0F, 0.0F, false);

		bone12_r24 = new ModelRenderer(this);
		bone12_r24.setRotationPoint(-2.2476F, 3.2439F, -5.3897F);
		bone12.addChild(bone12_r24);
		setRotationAngle(bone12_r24, 0.0F, 0.0F, 0.0873F);
		bone12_r24.setTextureOffset(38, 386).addBox(8.1298F, 20.7871F, 4.5606F, 4.0F, 40.0F, 4.0F, 0.0F, false);
		bone12_r24.setTextureOffset(356, 492).addBox(9.139F, 20.8011F, 9.0606F, 3.0F, 13.0F, 3.0F, 0.0F, false);

		bone12_r25 = new ModelRenderer(this);
		bone12_r25.setRotationPoint(-2.2476F, 3.2439F, -5.3897F);
		bone12.addChild(bone12_r25);
		setRotationAngle(bone12_r25, 0.0F, 0.0F, -0.0873F);
		bone12_r25.setTextureOffset(368, 386).addBox(-8.4609F, 21.1081F, 4.5606F, 4.0F, 40.0F, 4.0F, 0.0F, false);
		bone12_r25.setTextureOffset(368, 492).addBox(-8.4701F, 21.1221F, 9.0606F, 3.0F, 13.0F, 3.0F, 0.0F, false);

		bone12_r26 = new ModelRenderer(this);
		bone12_r26.setRotationPoint(-2.2476F, 3.2439F, -5.3897F);
		bone12.addChild(bone12_r26);
		setRotationAngle(bone12_r26, -0.1739F, 0.0151F, 0.0859F);
		bone12_r26.setTextureOffset(424, 484).addBox(8.8926F, 31.2755F, 14.633F, 3.0F, 18.0F, 3.0F, 0.0F, false);

		bone12_r27 = new ModelRenderer(this);
		bone12_r27.setRotationPoint(-2.2476F, 3.2439F, -5.3897F);
		bone12.addChild(bone12_r27);
		setRotationAngle(bone12_r27, -0.1739F, -0.0151F, -0.0859F);
		bone12_r27.setTextureOffset(484, 126).addBox(-8.2236F, 31.5965F, 14.633F, 3.0F, 18.0F, 3.0F, 0.0F, false);

		bone12_r28 = new ModelRenderer(this);
		bone12_r28.setRotationPoint(-2.2476F, 3.2439F, -5.3897F);
		bone12.addChild(bone12_r28);
		setRotationAngle(bone12_r28, 0.2403F, -0.9903F, -0.2021F);
		bone12_r28.setTextureOffset(158, 0).addBox(-0.6274F, 10.729F, -8.4188F, 8.0F, 17.0F, 6.0F, 0.0F, false);
		bone12_r28.setTextureOffset(171, 106).addBox(-1.1465F, 8.3314F, -9.4351F, 10.0F, 2.0F, 5.0F, 0.0F, false);
		bone12_r28.setTextureOffset(431, 135).addBox(6.1035F, 4.5814F, -7.4351F, 2.0F, 3.0F, 3.0F, 0.0F, false);

		bone12_r29 = new ModelRenderer(this);
		bone12_r29.setRotationPoint(-2.2476F, 3.2439F, -5.3897F);
		bone12.addChild(bone12_r29);
		setRotationAngle(bone12_r29, 0.2403F, 0.9903F, 0.2021F);
		bone12_r29.setTextureOffset(127, 252).addBox(-5.3937F, 10.729F, -5.3126F, 8.0F, 17.0F, 6.0F, 0.0F, false);
		bone12_r29.setTextureOffset(74, 441).addBox(-6.8746F, 4.5814F, -4.3289F, 2.0F, 3.0F, 3.0F, 0.0F, false);
		bone12_r29.setTextureOffset(212, 94).addBox(-6.8746F, 8.3314F, -6.3289F, 10.0F, 2.0F, 5.0F, 0.0F, false);

		bone12_r30 = new ModelRenderer(this);
		bone12_r30.setRotationPoint(-2.2476F, 3.2439F, -5.3897F);
		bone12.addChild(bone12_r30);
		setRotationAngle(bone12_r30, 0.2403F, -0.9903F, -0.1148F);
		bone12_r30.setTextureOffset(262, 387).addBox(0.9079F, 27.1739F, -9.9777F, 6.0F, 34.0F, 4.0F, 0.0F, false);

		bone24 = new ModelRenderer(this);
		bone24.setRotationPoint(-0.4671F, 53.83F, 15.6624F);
		bone12.addChild(bone24);

		bone24_r1 = new ModelRenderer(this);
		bone24_r1.setRotationPoint(-1.823F, -40.9394F, -19.599F);
		bone24.addChild(bone24_r1);
		setRotationAngle(bone24_r1, 0.6112F, -0.0076F, -0.0869F);
		bone24_r1.setTextureOffset(222, 313).addBox(-6.2212F, 50.1805F, -13.0375F, 2.0F, 12.0F, 3.0F, 0.0F, false);

		bone24_r2 = new ModelRenderer(this);
		bone24_r2.setRotationPoint(-1.823F, -40.9394F, -19.599F);
		bone24.addChild(bone24_r2);
		setRotationAngle(bone24_r2, -0.0869F, -0.0076F, -0.0869F);
		bone24_r2.setTextureOffset(0, 202).addBox(-6.2212F, 38.5708F, 22.2681F, 2.0F, 8.0F, 3.0F, 0.0F, false);

		bone24_r3 = new ModelRenderer(this);
		bone24_r3.setRotationPoint(-1.823F, -40.9394F, -19.599F);
		bone24.addChild(bone24_r3);
		setRotationAngle(bone24_r3, 0.3058F, -0.0076F, -0.0869F);
		bone24_r3.setTextureOffset(26, 310).addBox(-6.2412F, 44.2351F, 5.9516F, 2.0F, 19.0F, 4.0F, 0.0F, false);

		bone24_r4 = new ModelRenderer(this);
		bone24_r4.setRotationPoint(-1.823F, -40.9394F, -19.599F);
		bone24.addChild(bone24_r4);
		setRotationAngle(bone24_r4, 0.3054F, 0.0F, 0.0F);
		bone24_r4.setTextureOffset(26, 485).addBox(-0.9185F, 44.4352F, 7.8369F, 5.0F, 19.0F, 1.0F, 0.0F, false);

		bone24_r5 = new ModelRenderer(this);
		bone24_r5.setRotationPoint(-1.823F, -40.9394F, -19.599F);
		bone24.addChild(bone24_r5);
		setRotationAngle(bone24_r5, -0.0869F, 0.0076F, 0.0869F);
		bone24_r5.setTextureOffset(23, 202).addBox(7.8902F, 38.2498F, 22.2681F, 2.0F, 8.0F, 3.0F, 0.0F, false);

		bone24_r6 = new ModelRenderer(this);
		bone24_r6.setRotationPoint(-1.823F, -40.9394F, -19.599F);
		bone24.addChild(bone24_r6);
		setRotationAngle(bone24_r6, 0.6112F, 0.0076F, 0.0869F);
		bone24_r6.setTextureOffset(361, 46).addBox(7.8902F, 49.9346F, -12.8311F, 2.0F, 12.0F, 3.0F, 0.0F, false);

		bone24_r7 = new ModelRenderer(this);
		bone24_r7.setRotationPoint(-1.823F, -40.9394F, -19.599F);
		bone24.addChild(bone24_r7);
		setRotationAngle(bone24_r7, 0.3058F, 0.0076F, 0.0869F);
		bone24_r7.setTextureOffset(382, 476).addBox(7.8802F, 43.9386F, 6.0744F, 2.0F, 19.0F, 4.0F, 0.0F, false);

		bone15 = new ModelRenderer(this);
		bone15.setRotationPoint(1.4721F, 44.7616F, 8.4792F);
		bone12.addChild(bone15);

		bone15_r1 = new ModelRenderer(this);
		bone15_r1.setRotationPoint(-3.7197F, -41.5177F, -13.3689F);
		bone15.addChild(bone15_r1);
		setRotationAngle(bone15_r1, -0.2002F, 0.3501F, -0.1189F);
		bone15_r1.setTextureOffset(450, 492).addBox(-5.3616F, 38.932F, 20.8781F, 1.0F, 13.0F, 4.0F, 0.0F, false);

		bone15_r2 = new ModelRenderer(this);
		bone15_r2.setRotationPoint(-3.7197F, -41.5177F, -13.3689F);
		bone15.addChild(bone15_r2);
		setRotationAngle(bone15_r2, -0.4183F, 0.3501F, -0.1189F);
		bone15_r2.setTextureOffset(65, 202).addBox(-5.3516F, 40.6896F, 31.6925F, 1.0F, 5.0F, 4.0F, 0.0F, false);

		bone15_r3 = new ModelRenderer(this);
		bone15_r3.setRotationPoint(-3.7197F, -41.5177F, -13.3689F);
		bone15.addChild(bone15_r3);
		setRotationAngle(bone15_r3, -0.0693F, 0.3501F, -0.1189F);
		bone15_r3.setTextureOffset(227, 498).addBox(-5.3516F, 41.324F, 15.6178F, 1.0F, 9.0F, 4.0F, 0.0F, false);

		bone16 = new ModelRenderer(this);
		bone16.setRotationPoint(-6.0994F, 44.7312F, 8.9604F);
		bone12.addChild(bone16);

		bone16_r1 = new ModelRenderer(this);
		bone16_r1.setRotationPoint(3.7197F, -41.5177F, -13.8689F);
		bone16.addChild(bone16_r1);
		setRotationAngle(bone16_r1, -0.2002F, -0.3501F, 0.1189F);
		bone16_r1.setTextureOffset(279, 492).addBox(7.7667F, 38.7532F, 19.5619F, 1.0F, 13.0F, 4.0F, 0.0F, false);

		bone16_r2 = new ModelRenderer(this);
		bone16_r2.setRotationPoint(3.7197F, -41.5177F, -13.8689F);
		bone16.addChild(bone16_r2);
		setRotationAngle(bone16_r2, -0.4183F, -0.3501F, 0.1189F);
		bone16_r2.setTextureOffset(66, 58).addBox(7.7867F, 40.7999F, 30.3688F, 1.0F, 5.0F, 4.0F, 0.0F, false);

		bone16_r3 = new ModelRenderer(this);
		bone16_r3.setRotationPoint(3.7197F, -41.5177F, -13.8689F);
		bone16.addChild(bone16_r3);
		setRotationAngle(bone16_r3, -0.0693F, -0.3501F, 0.1189F);
		bone16_r3.setTextureOffset(12, 439).addBox(7.7867F, 40.975F, 14.3363F, 1.0F, 9.0F, 4.0F, 0.0F, false);

		bone13 = new ModelRenderer(this);
		bone13.setRotationPoint(2.7221F, 42.7616F, 7.9792F);
		bone12.addChild(bone13);

		bone13_r1 = new ModelRenderer(this);
		bone13_r1.setRotationPoint(-4.9697F, -39.5177F, -13.3689F);
		bone13.addChild(bone13_r1);
		setRotationAngle(bone13_r1, -0.2002F, 0.3501F, -0.1189F);
		bone13_r1.setTextureOffset(450, 492).addBox(-3.8014F, 37.1236F, 20.5494F, 1.0F, 13.0F, 4.0F, 0.0F, false);

		bone13_r2 = new ModelRenderer(this);
		bone13_r2.setRotationPoint(-4.9697F, -39.5177F, -13.3689F);
		bone13.addChild(bone13_r2);
		setRotationAngle(bone13_r2, -0.4183F, 0.3501F, -0.1189F);
		bone13_r2.setTextureOffset(65, 202).addBox(-3.7914F, 38.9953F, 30.9802F, 1.0F, 5.0F, 4.0F, 0.0F, false);

		bone13_r3 = new ModelRenderer(this);
		bone13_r3.setRotationPoint(-4.9697F, -39.5177F, -13.3689F);
		bone13.addChild(bone13_r3);
		setRotationAngle(bone13_r3, -0.0693F, 0.3501F, -0.1189F);
		bone13_r3.setTextureOffset(470, 497).addBox(-3.7914F, 39.4883F, 15.528F, 1.0F, 9.0F, 4.0F, 0.0F, false);

		bone17 = new ModelRenderer(this);
		bone17.setRotationPoint(-7.2173F, 42.7616F, 7.9792F);
		bone12.addChild(bone17);

		bone17_r1 = new ModelRenderer(this);
		bone17_r1.setRotationPoint(4.9697F, -39.5177F, -13.3689F);
		bone17.addChild(bone17_r1);
		setRotationAngle(bone17_r1, -0.2002F, -0.3501F, 0.1189F);
		bone17_r1.setTextureOffset(279, 492).addBox(6.2065F, 36.9448F, 19.2332F, 1.0F, 13.0F, 4.0F, 0.0F, false);

		bone17_r2 = new ModelRenderer(this);
		bone17_r2.setRotationPoint(4.9697F, -39.5177F, -13.3689F);
		bone17.addChild(bone17_r2);
		setRotationAngle(bone17_r2, -0.4183F, -0.3501F, 0.1189F);
		bone17_r2.setTextureOffset(66, 58).addBox(6.2265F, 39.1056F, 29.6565F, 1.0F, 5.0F, 4.0F, 0.0F, false);

		bone17_r3 = new ModelRenderer(this);
		bone17_r3.setRotationPoint(4.9697F, -39.5177F, -13.3689F);
		bone17.addChild(bone17_r3);
		setRotationAngle(bone17_r3, -0.0693F, -0.3501F, 0.1189F);
		bone17_r3.setTextureOffset(12, 439).addBox(6.2265F, 39.1392F, 14.2464F, 1.0F, 9.0F, 4.0F, 0.0F, false);

		bone14 = new ModelRenderer(this);
		bone14.setRotationPoint(3.7221F, 40.2616F, 6.9792F);
		bone12.addChild(bone14);

		bone14_r1 = new ModelRenderer(this);
		bone14_r1.setRotationPoint(-5.9697F, -37.0177F, -12.3689F);
		bone14.addChild(bone14_r1);
		setRotationAngle(bone14_r1, -0.2002F, 0.3501F, -0.1189F);
		bone14_r1.setTextureOffset(450, 492).addBox(-2.2471F, 34.9059F, 19.5923F, 1.0F, 13.0F, 4.0F, 0.0F, false);

		bone14_r2 = new ModelRenderer(this);
		bone14_r2.setRotationPoint(-5.9697F, -37.0177F, -12.3689F);
		bone14.addChild(bone14_r2);
		setRotationAngle(bone14_r2, -0.4183F, 0.3501F, -0.1189F);
		bone14_r2.setTextureOffset(65, 202).addBox(-2.2371F, 37.0373F, 29.5658F, 1.0F, 5.0F, 4.0F, 0.0F, false);

		bone14_r3 = new ModelRenderer(this);
		bone14_r3.setRotationPoint(-5.9697F, -37.0177F, -12.3689F);
		bone14.addChild(bone14_r3);
		setRotationAngle(bone14_r3, -0.0693F, 0.3501F, -0.1189F);
		bone14_r3.setTextureOffset(439, 106).addBox(-2.2371F, 37.1646F, 14.8686F, 1.0F, 9.0F, 4.0F, 0.0F, false);

		bone18 = new ModelRenderer(this);
		bone18.setRotationPoint(-8.2173F, 40.2616F, 6.9792F);
		bone12.addChild(bone18);

		bone18_r1 = new ModelRenderer(this);
		bone18_r1.setRotationPoint(5.9697F, -37.0177F, -12.3689F);
		bone18.addChild(bone18_r1);
		setRotationAngle(bone18_r1, -0.2002F, -0.3501F, 0.1189F);
		bone18_r1.setTextureOffset(279, 492).addBox(4.6522F, 34.7271F, 18.2762F, 1.0F, 13.0F, 4.0F, 0.0F, false);

		bone18_r2 = new ModelRenderer(this);
		bone18_r2.setRotationPoint(5.9697F, -37.0177F, -12.3689F);
		bone18.addChild(bone18_r2);
		setRotationAngle(bone18_r2, -0.4183F, -0.3501F, 0.1189F);
		bone18_r2.setTextureOffset(66, 58).addBox(4.6722F, 37.1476F, 28.2421F, 1.0F, 5.0F, 4.0F, 0.0F, false);

		bone18_r3 = new ModelRenderer(this);
		bone18_r3.setRotationPoint(5.9697F, -37.0177F, -12.3689F);
		bone18.addChild(bone18_r3);
		setRotationAngle(bone18_r3, -0.0693F, -0.3501F, 0.1189F);
		bone18_r3.setTextureOffset(12, 439).addBox(4.6722F, 36.8156F, 13.587F, 1.0F, 9.0F, 4.0F, 0.0F, false);

		bone19 = new ModelRenderer(this);
		bone19.setRotationPoint(-2.1452F, 13.3105F, 18.1912F);
		bone12.addChild(bone19);

		bone19_r1 = new ModelRenderer(this);
		bone19_r1.setRotationPoint(-0.1759F, -6.0751F, -21.9018F);
		bone19.addChild(bone19_r1);
		setRotationAngle(bone19_r1, 0.1304F, -0.0114F, 0.0865F);
		bone19_r1.setTextureOffset(60, 0).addBox(5.3312F, 9.0008F, 18.9152F, 2.0F, 8.0F, 3.0F, 0.0F, false);

		bone19_r2 = new ModelRenderer(this);
		bone19_r2.setRotationPoint(-0.1759F, -6.0751F, -21.9018F);
		bone19.addChild(bone19_r2);
		setRotationAngle(bone19_r2, 0.5231F, -0.0114F, 0.0865F);
		bone19_r2.setTextureOffset(328, 486).addBox(5.3212F, 15.6329F, 14.1699F, 2.0F, 14.0F, 4.0F, 0.0F, false);

		bone19_r3 = new ModelRenderer(this);
		bone19_r3.setRotationPoint(-0.1759F, -6.0751F, -21.9018F);
		bone19.addChild(bone19_r3);
		setRotationAngle(bone19_r3, 0.5231F, 0.0114F, -0.0865F);
		bone19_r3.setTextureOffset(52, 488).addBox(-3.6823F, 15.9294F, 14.0471F, 2.0F, 14.0F, 4.0F, 0.0F, false);

		bone19_r4 = new ModelRenderer(this);
		bone19_r4.setRotationPoint(-0.1759F, -6.0751F, -21.9018F);
		bone19.addChild(bone19_r4);
		setRotationAngle(bone19_r4, 0.5236F, 0.0F, 0.0F);
		bone19_r4.setTextureOffset(216, 134).addBox(-0.9185F, 16.0263F, 15.9751F, 5.0F, 14.0F, 1.0F, 0.0F, false);

		bone19_r5 = new ModelRenderer(this);
		bone19_r5.setRotationPoint(-0.1759F, -6.0751F, -21.9018F);
		bone19.addChild(bone19_r5);
		setRotationAngle(bone19_r5, 0.1304F, 0.0114F, -0.0865F);
		bone19_r5.setTextureOffset(88, 58).addBox(-3.6623F, 9.3218F, 18.9152F, 2.0F, 8.0F, 3.0F, 0.0F, false);

		bone19_r6 = new ModelRenderer(this);
		bone19_r6.setRotationPoint(-0.1759F, -6.0751F, -21.9018F);
		bone19.addChild(bone19_r6);
		setRotationAngle(bone19_r6, 0.8285F, 0.0114F, -0.0865F);
		bone19_r6.setTextureOffset(93, 0).addBox(-3.6623F, 25.6192F, 3.195F, 2.0F, 8.0F, 3.0F, 0.0F, false);

		bone19_r7 = new ModelRenderer(this);
		bone19_r7.setRotationPoint(-0.1759F, -6.0751F, -21.9018F);
		bone19.addChild(bone19_r7);
		setRotationAngle(bone19_r7, 0.8285F, -0.0114F, 0.0865F);
		bone19_r7.setTextureOffset(124, 68).addBox(5.3312F, 25.3733F, 3.4013F, 2.0F, 8.0F, 3.0F, 0.0F, false);

		zuotui = new ModelRenderer(this);
		zuotui.setRotationPoint(-7.25F, -7.8292F, 1.8438F);
		xiabanshen.addChild(zuotui);
		setRotationAngle(zuotui, -0.0912F, 0.262F, 0.0862F);

		zuotui_r1 = new ModelRenderer(this);
		zuotui_r1.setRotationPoint(-10.0F, 24.8149F, -15.2028F);
		zuotui.addChild(zuotui_r1);
		setRotationAngle(zuotui_r1, 0.1745F, 0.0F, 0.0F);
		zuotui_r1.setTextureOffset(386, 0).addBox(-9.0F, -1.0F, 0.0F, 10.0F, 14.0F, 8.0F, 0.0F, true);

		zuotui_r2 = new ModelRenderer(this);
		zuotui_r2.setRotationPoint(-9.0F, 10.5969F, -1.0318F);
		zuotui.addChild(zuotui_r2);
		setRotationAngle(zuotui_r2, -0.4363F, 0.0F, 0.0F);
		zuotui_r2.setTextureOffset(153, 293).addBox(-8.0F, 23.0F, 0.5F, 11.0F, 8.0F, 9.0F, 0.0F, true);
		zuotui_r2.setTextureOffset(22, 58).addBox(-6.0F, 6.0F, 6.5F, 8.0F, 17.0F, 3.0F, 0.0F, true);

		zuotui_r3 = new ModelRenderer(this);
		zuotui_r3.setRotationPoint(-11.0F, 39.7369F, -7.5508F);
		zuotui.addChild(zuotui_r3);
		setRotationAngle(zuotui_r3, -0.7418F, 0.0F, 0.0F);
		zuotui_r3.setTextureOffset(451, 37).addBox(-4.5F, -5.75F, -2.75F, 8.0F, 6.0F, 7.0F, 0.0F, true);

		zuotui_r4 = new ModelRenderer(this);
		zuotui_r4.setRotationPoint(-9.0F, 18.0969F, -6.0318F);
		zuotui.addChild(zuotui_r4);
		setRotationAngle(zuotui_r4, -0.1745F, 0.0F, 0.0F);
		zuotui_r4.setTextureOffset(74, 165).addBox(-5.0F, 6.0F, 6.5F, 6.0F, 13.0F, 2.0F, 0.0F, true);

		zuotui_r5 = new ModelRenderer(this);
		zuotui_r5.setRotationPoint(-8.99F, 9.8578F, -2.782F);
		zuotui.addChild(zuotui_r5);
		setRotationAngle(zuotui_r5, -0.4363F, 0.0F, 0.0F);
		zuotui_r5.setTextureOffset(134, 353).addBox(-9.01F, 6.0F, 0.5F, 13.0F, 18.0F, 8.0F, 0.0F, true);

		zuotui_r6 = new ModelRenderer(this);
		zuotui_r6.setRotationPoint(-11.0F, 26.3688F, 8.8677F);
		zuotui.addChild(zuotui_r6);
		setRotationAngle(zuotui_r6, 0.2618F, 0.0F, 0.0F);
		zuotui_r6.setTextureOffset(204, 0).addBox(-1.0F, 0.4491F, -2.687F, 2.0F, 2.0F, 1.0F, 0.0F, true);

		zuotui_r7 = new ModelRenderer(this);
		zuotui_r7.setRotationPoint(-11.0F, 26.3688F, 8.8677F);
		zuotui.addChild(zuotui_r7);
		setRotationAngle(zuotui_r7, -0.1309F, 0.0F, 0.0F);
		zuotui_r7.setTextureOffset(204, 3).addBox(-1.0F, 0.1476F, 2.6714F, 2.0F, 2.0F, 1.0F, 0.0F, true);

		zuotui_r8 = new ModelRenderer(this);
		zuotui_r8.setRotationPoint(-10.0F, -4.2815F, -5.7253F);
		zuotui.addChild(zuotui_r8);
		setRotationAngle(zuotui_r8, -0.3054F, 0.0F, 0.0F);
		zuotui_r8.setTextureOffset(7, 505).addBox(-8.76F, 1.0F, -0.5F, 9.0F, 15.0F, 4.0F, 0.0F, true);
		zuotui_r8.setTextureOffset(136, 429).addBox(-9.26F, 0.5F, -2.25F, 10.0F, 14.0F, 5.0F, 0.0F, true);

		zuotui_r9 = new ModelRenderer(this);
		zuotui_r9.setRotationPoint(-11.0F, 26.3688F, 8.8677F);
		zuotui.addChild(zuotui_r9);
		setRotationAngle(zuotui_r9, 0.0807F, -0.0334F, 0.3914F);
		zuotui_r9.setTextureOffset(296, 277).addBox(2.0707F, -0.0202F, -1.0327F, 1.0F, 2.0F, 3.0F, 0.0F, true);

		zuotui_r10 = new ModelRenderer(this);
		zuotui_r10.setRotationPoint(-11.0F, 26.3688F, 8.8677F);
		zuotui.addChild(zuotui_r10);
		setRotationAngle(zuotui_r10, 0.0807F, 0.0334F, -0.3914F);
		zuotui_r10.setTextureOffset(296, 299).addBox(-3.0707F, -0.0202F, -1.0327F, 1.0F, 2.0F, 3.0F, 0.0F, true);

		zuotui_r11 = new ModelRenderer(this);
		zuotui_r11.setRotationPoint(-11.0F, 26.3688F, 8.8677F);
		zuotui.addChild(zuotui_r11);
		setRotationAngle(zuotui_r11, 0.0873F, 0.0F, 0.0F);
		zuotui_r11.setTextureOffset(470, 80).addBox(-2.0F, -0.111F, -2.0327F, 4.0F, 2.0F, 5.0F, 0.0F, true);
		zuotui_r11.setTextureOffset(343, 27).addBox(-1.5F, -8.6642F, -3.9799F, 3.0F, 9.0F, 2.0F, 0.0F, true);
		zuotui_r11.setTextureOffset(465, 141).addBox(-2.5F, -8.1165F, -2.8678F, 5.0F, 8.0F, 7.0F, 0.0F, true);

		zuotui_r12 = new ModelRenderer(this);
		zuotui_r12.setRotationPoint(-11.0F, 16.0799F, 7.7477F);
		zuotui.addChild(zuotui_r12);
		setRotationAngle(zuotui_r12, -0.0436F, 0.0F, 0.0F);
		zuotui_r12.setTextureOffset(435, 370).addBox(-3.5F, -4.5F, -4.0F, 7.0F, 9.0F, 8.0F, 0.0F, true);

		zuotui_r13 = new ModelRenderer(this);
		zuotui_r13.setRotationPoint(-9.0F, -4.5315F, 5.6447F);
		zuotui.addChild(zuotui_r13);
		setRotationAngle(zuotui_r13, -0.0436F, 0.0F, 0.0F);
		zuotui_r13.setTextureOffset(54, 399).addBox(-7.0F, 11.0F, -2.0F, 10.0F, 5.0F, 10.0F, 0.0F, true);
		zuotui_r13.setTextureOffset(320, 117).addBox(-7.0F, 16.0F, -1.0F, 10.0F, 10.0F, 2.0F, 0.0F, true);

		zuotui_r14 = new ModelRenderer(this);
		zuotui_r14.setRotationPoint(-9.0F, -4.5315F, -3.3553F);
		zuotui.addChild(zuotui_r14);
		setRotationAngle(zuotui_r14, -0.0436F, 0.0F, 0.0F);
		zuotui_r14.setTextureOffset(106, 467).addBox(-6.0F, 7.0F, 7.0F, 8.0F, 17.0F, 2.0F, 0.0F, true);

		zuotui_r15 = new ModelRenderer(this);
		zuotui_r15.setRotationPoint(-9.0F, -5.2815F, -5.3553F);
		zuotui.addChild(zuotui_r15);
		setRotationAngle(zuotui_r15, -0.0436F, 0.0F, 0.0F);
		zuotui_r15.setTextureOffset(120, 180).addBox(-9.0F, 6.75F, 6.0F, 13.0F, 2.0F, 1.0F, 0.0F, true);
		zuotui_r15.setTextureOffset(196, 161).addBox(-9.0F, 8.75F, 5.0F, 13.0F, 2.0F, 3.0F, 0.0F, true);
		zuotui_r15.setTextureOffset(82, 354).addBox(-9.01F, 11.0F, 0.06F, 13.0F, 13.0F, 9.0F, 0.0F, true);

		zuotui_r16 = new ModelRenderer(this);
		zuotui_r16.setRotationPoint(-7.7475F, 17.7917F, -6.4139F);
		zuotui.addChild(zuotui_r16);
		setRotationAngle(zuotui_r16, -0.3054F, 0.0F, 0.0873F);
		zuotui_r16.setTextureOffset(47, 58).addBox(-2.5025F, -16.0723F, -5.063F, 5.0F, 20.0F, 9.0F, 0.0F, true);

		zuotui_r17 = new ModelRenderer(this);
		zuotui_r17.setRotationPoint(-9.0F, 2.6778F, 3.7248F);
		zuotui.addChild(zuotui_r17);
		setRotationAngle(zuotui_r17, 0.3491F, 0.0F, 0.0F);
		zuotui_r17.setTextureOffset(367, 132).addBox(-5.5F, -5.5F, -7.0F, 7.0F, 12.0F, 12.0F, 0.0F, true);

		zuotui_r18 = new ModelRenderer(this);
		zuotui_r18.setRotationPoint(-10.0F, -4.7815F, -6.3553F);
		zuotui.addChild(zuotui_r18);
		setRotationAngle(zuotui_r18, 0.5236F, 0.0F, 0.0F);
		zuotui_r18.setTextureOffset(343, 27).addBox(-7.0F, 7.0F, -3.0F, 14.0F, 8.0F, 11.0F, 0.0F, true);
		zuotui_r18.setTextureOffset(58, 105).addBox(-7.0F, 4.0F, -3.0F, 14.0F, 3.0F, 13.0F, 0.0F, true);
		zuotui_r18.setTextureOffset(404, 404).addBox(-6.0F, 1.0F, 3.0F, 10.0F, 7.0F, 9.0F, 0.0F, true);

		zuotui_r19 = new ModelRenderer(this);
		zuotui_r19.setRotationPoint(-10.0F, -8.0413F, 0.473F);
		zuotui.addChild(zuotui_r19);
		setRotationAngle(zuotui_r19, -1.2217F, 0.0F, 0.0F);
		zuotui_r19.setTextureOffset(80, 220).addBox(-8.5F, 1.0F, 7.0F, 10.0F, 2.0F, 9.0F, 0.0F, true);

		zuotui_r20 = new ModelRenderer(this);
		zuotui_r20.setRotationPoint(-10.0F, -7.5315F, -6.3553F);
		zuotui.addChild(zuotui_r20);
		setRotationAngle(zuotui_r20, -0.3054F, 0.0F, 0.0F);
		zuotui_r20.setTextureOffset(382, 27).addBox(2.0F, 1.0F, 2.75F, 3.0F, 3.0F, 7.0F, 0.0F, true);
		zuotui_r20.setTextureOffset(160, 134).addBox(-10.0F, 1.0F, -2.0F, 12.0F, 3.0F, 12.0F, 0.0F, true);

		zuotui_r21 = new ModelRenderer(this);
		zuotui_r21.setRotationPoint(-18.4395F, 14.3285F, -5.5652F);
		zuotui.addChild(zuotui_r21);
		setRotationAngle(zuotui_r21, -0.3011F, -0.0522F, -0.1666F);
		zuotui_r21.setTextureOffset(312, 477).addBox(-2.7422F, -2.7335F, -2.5F, 3.0F, 15.0F, 5.0F, 0.0F, true);

		zuotui_r22 = new ModelRenderer(this);
		zuotui_r22.setRotationPoint(-18.4395F, 14.3285F, -5.5652F);
		zuotui.addChild(zuotui_r22);
		setRotationAngle(zuotui_r22, -0.3011F, 0.0522F, 0.1666F);
		zuotui_r22.setTextureOffset(464, 477).addBox(-3.5117F, -16.6308F, -2.52F, 3.0F, 15.0F, 5.0F, 0.0F, true);

		zuotui_r23 = new ModelRenderer(this);
		zuotui_r23.setRotationPoint(-10.0F, -4.7815F, -6.3553F);
		zuotui.addChild(zuotui_r23);
		setRotationAngle(zuotui_r23, -0.3054F, 0.0F, 0.0F);
		zuotui_r23.setTextureOffset(106, 426).addBox(-9.01F, 1.0F, 4.0F, 10.0F, 15.0F, 5.0F, 0.0F, true);
		zuotui_r23.setTextureOffset(66, 376).addBox(-9.01F, 16.0F, 0.0F, 10.0F, 14.0F, 9.0F, 0.0F, true);

		zuotui_r24 = new ModelRenderer(this);
		zuotui_r24.setRotationPoint(-7.7475F, 17.7917F, -6.4139F);
		zuotui.addChild(zuotui_r24);
		setRotationAngle(zuotui_r24, 0.1745F, 0.0F, 0.0873F);
		zuotui_r24.setTextureOffset(455, 277).addBox(-2.5025F, 1.1461F, -6.3045F, 5.0F, 9.0F, 8.0F, 0.0F, true);

		bone47 = new ModelRenderer(this);
		bone47.setRotationPoint(-11.0F, 17.6727F, 10.6184F);
		zuotui.addChild(bone47);

		bone47_r1 = new ModelRenderer(this);
		bone47_r1.setRotationPoint(-1.0F, 6.0F, -1.0F);
		bone47.addChild(bone47_r1);
		setRotationAngle(bone47_r1, 0.6981F, 0.0F, 0.0F);
		bone47_r1.setTextureOffset(29, 17).addBox(-0.75F, 7.5F, 3.5F, 3.0F, 1.0F, 1.0F, 0.0F, true);

		bone47_r2 = new ModelRenderer(this);
		bone47_r2.setRotationPoint(7.0F, -0.0511F, -1.209F);
		bone47.addChild(bone47_r2);
		setRotationAngle(bone47_r2, 0.3927F, 0.0F, 0.0F);
		bone47_r2.setTextureOffset(98, 134).addBox(-9.51F, 1.5F, 3.5F, 5.0F, 10.0F, 1.0F, 0.0F, true);

		bone47_r3 = new ModelRenderer(this);
		bone47_r3.setRotationPoint(3.0F, 4.8612F, 2.7432F);
		bone47.addChild(bone47_r3);
		setRotationAngle(bone47_r3, 0.3927F, 0.0F, 0.0873F);
		bone47_r3.setTextureOffset(317, 308).addBox(-1.01F, -3.5508F, -1.2715F, 2.0F, 9.0F, 4.0F, 0.0F, true);

		bone47_r4 = new ModelRenderer(this);
		bone47_r4.setRotationPoint(-3.0F, 4.8612F, 2.7432F);
		bone47.addChild(bone47_r4);
		setRotationAngle(bone47_r4, 0.3927F, 0.0F, -0.0873F);
		bone47_r4.setTextureOffset(366, 362).addBox(-1.01F, -3.5508F, -1.2715F, 2.0F, 9.0F, 4.0F, 0.0F, true);

		bone47_r5 = new ModelRenderer(this);
		bone47_r5.setRotationPoint(3.0F, 4.8612F, 2.7432F);
		bone47.addChild(bone47_r5);
		setRotationAngle(bone47_r5, 0.6981F, 0.0F, 0.0873F);
		bone47_r5.setTextureOffset(283, 151).addBox(-1.0F, -2.0337F, -3.0995F, 2.0F, 10.0F, 4.0F, 0.0F, true);

		bone47_r6 = new ModelRenderer(this);
		bone47_r6.setRotationPoint(-3.0F, 4.8612F, 2.7432F);
		bone47.addChild(bone47_r6);
		setRotationAngle(bone47_r6, 0.6981F, 0.0F, -0.0873F);
		bone47_r6.setTextureOffset(251, 285).addBox(-1.0F, -2.0337F, -3.0995F, 2.0F, 10.0F, 4.0F, 0.0F, true);

		bone47_r7 = new ModelRenderer(this);
		bone47_r7.setRotationPoint(3.0F, 4.8612F, 2.7432F);
		bone47.addChild(bone47_r7);
		setRotationAngle(bone47_r7, 0.0F, 0.0F, 0.0873F);
		bone47_r7.setTextureOffset(289, 240).addBox(-1.0F, -5.5656F, -3.6816F, 2.0F, 6.0F, 5.0F, 0.0F, true);

		bone47_r8 = new ModelRenderer(this);
		bone47_r8.setRotationPoint(-3.0F, 4.8612F, 2.7432F);
		bone47.addChild(bone47_r8);
		setRotationAngle(bone47_r8, 0.0F, 0.0F, -0.0873F);
		bone47_r8.setTextureOffset(290, 32).addBox(-1.0F, -5.5656F, -3.6816F, 2.0F, 6.0F, 5.0F, 0.0F, true);

		bone59 = new ModelRenderer(this);
		bone59.setRotationPoint(-11.0474F, 39.6231F, -6.7644F);
		zuotui.addChild(bone59);
		setRotationAngle(bone59, 0.4363F, 0.0F, 0.0F);
		bone59.setTextureOffset(120, 289).addBox(-1.819F, -1.4682F, -2.9994F, 6.0F, 13.0F, 5.0F, 0.0F, true);
		bone59.setTextureOffset(207, 480).addBox(-3.819F, -5.4682F, -0.1894F, 3.0F, 17.0F, 4.0F, 0.0F, true);
		bone59.setTextureOffset(482, 185).addBox(-4.319F, 5.5318F, -0.9394F, 5.0F, 5.0F, 5.0F, 0.0F, true);

		bone59_r1 = new ModelRenderer(this);
		bone59_r1.setRotationPoint(-0.0784F, 5.9951F, -9.4361F);
		bone59.addChild(bone59_r1);
		setRotationAngle(bone59_r1, 0.0436F, 0.0F, 0.0F);
		bone59_r1.setTextureOffset(34, 301).addBox(-4.8869F, 1.7988F, 1.8689F, 4.0F, 5.0F, 8.0F, 0.0F, true);
		bone59_r1.setTextureOffset(254, 219).addBox(1.1131F, 0.7988F, 1.8689F, 4.0F, 6.0F, 10.0F, 0.0F, true);
		bone59_r1.setTextureOffset(197, 252).addBox(-3.8869F, 13.6838F, -7.9847F, 8.0F, 2.0F, 4.0F, 0.0F, true);

		bone59_r2 = new ModelRenderer(this);
		bone59_r2.setRotationPoint(0.0347F, 11.0088F, -4.4904F);
		bone59.addChild(bone59_r2);
		setRotationAngle(bone59_r2, 0.6981F, 0.0F, 0.0F);
		bone59_r2.setTextureOffset(463, 463).addBox(-5.8537F, -0.4771F, 0.491F, 6.0F, 7.0F, 7.0F, 0.0F, true);
		bone59_r2.setTextureOffset(424, 165).addBox(0.1463F, -0.4771F, 0.491F, 7.0F, 6.0F, 10.0F, 0.0F, true);

		bone59_r3 = new ModelRenderer(this);
		bone59_r3.setRotationPoint(-0.0784F, 5.9951F, -9.4361F);
		bone59.addChild(bone59_r3);
		setRotationAngle(bone59_r3, 0.3491F, 0.0F, 0.0F);
		bone59_r3.setTextureOffset(131, 448).addBox(-2.8869F, -2.7132F, -1.2026F, 6.0F, 14.0F, 6.0F, 0.0F, true);
		bone59_r3.setTextureOffset(210, 370).addBox(-4.1369F, -4.7132F, -2.2026F, 8.0F, 7.0F, 4.0F, 0.0F, true);

		bone59_r4 = new ModelRenderer(this);
		bone59_r4.setRotationPoint(-0.0784F, 5.9951F, -9.4361F);
		bone59.addChild(bone59_r4);
		setRotationAngle(bone59_r4, -1.5272F, -1.4399F, 1.5708F);
		bone59_r4.setTextureOffset(494, 323).addBox(1.4508F, -7.7011F, -7.3678F, 5.0F, 6.0F, 3.0F, 0.0F, true);

		bone59_r5 = new ModelRenderer(this);
		bone59_r5.setRotationPoint(-0.0784F, 5.9951F, -9.4361F);
		bone59.addChild(bone59_r5);
		setRotationAngle(bone59_r5, -1.5708F, -1.2217F, 1.5708F);
		bone59_r5.setTextureOffset(160, 134).addBox(1.0707F, 5.6303F, -6.3881F, 2.0F, 9.0F, 3.0F, 0.0F, true);

		bone59_r6 = new ModelRenderer(this);
		bone59_r6.setRotationPoint(-0.0784F, 5.9951F, -9.4361F);
		bone59.addChild(bone59_r6);
		setRotationAngle(bone59_r6, 0.0678F, -0.8715F, -0.0519F);
		bone59_r6.setTextureOffset(92, 101).addBox(-3.4728F, 13.6838F, -8.2833F, 6.0F, 2.0F, 2.0F, 0.0F, true);

		bone59_r7 = new ModelRenderer(this);
		bone59_r7.setRotationPoint(-0.0784F, 5.9951F, -9.4361F);
		bone59.addChild(bone59_r7);
		setRotationAngle(bone59_r7, -0.395F, -0.833F, 0.2992F);
		bone59_r7.setTextureOffset(494, 494).addBox(0.4679F, 0.3511F, -3.6713F, 4.0F, 15.0F, 1.0F, 0.0F, true);
		bone59_r7.setTextureOffset(414, 0).addBox(-1.4519F, -6.6075F, -5.2822F, 6.0F, 4.0F, 2.0F, 0.0F, true);
		bone59_r7.setTextureOffset(39, 39).addBox(-1.4519F, -10.5975F, -5.2822F, 2.0F, 4.0F, 2.0F, 0.0F, true);

		bone59_r8 = new ModelRenderer(this);
		bone59_r8.setRotationPoint(-0.0784F, 5.9951F, -9.4361F);
		bone59.addChild(bone59_r8);
		setRotationAngle(bone59_r8, 0.0327F, -0.833F, 0.2992F);
		bone59_r8.setTextureOffset(194, 68).addBox(0.4681F, -4.5541F, -3.7295F, 4.0F, 4.0F, 1.0F, 0.0F, true);

		bone59_r9 = new ModelRenderer(this);
		bone59_r9.setRotationPoint(-0.0784F, 5.9951F, -9.4361F);
		bone59.addChild(bone59_r9);
		setRotationAngle(bone59_r9, -1.4399F, -1.2217F, 1.5708F);
		bone59_r9.setTextureOffset(297, 164).addBox(1.0707F, -3.0449F, -7.0983F, 2.0F, 8.0F, 3.0F, 0.0F, true);

		bone59_r10 = new ModelRenderer(this);
		bone59_r10.setRotationPoint(-0.0784F, 5.9951F, -9.4361F);
		bone59.addChild(bone59_r10);
		setRotationAngle(bone59_r10, -0.8496F, -0.3471F, 1.0663F);
		bone59_r10.setTextureOffset(200, 119).addBox(-4.9418F, -6.3884F, -5.2822F, 1.0F, 1.0F, 2.0F, 0.0F, true);

		bone59_r11 = new ModelRenderer(this);
		bone59_r11.setRotationPoint(-0.0784F, 5.9951F, -9.4361F);
		bone59.addChild(bone59_r11);
		setRotationAngle(bone59_r11, -0.7809F, -0.7024F, 0.5695F);
		bone59_r11.setTextureOffset(58, 112).addBox(-3.6458F, -11.2126F, -8.4285F, 3.0F, 3.0F, 3.0F, 0.0F, true);

		bone59_r12 = new ModelRenderer(this);
		bone59_r12.setRotationPoint(-0.0784F, 5.9951F, -9.4361F);
		bone59.addChild(bone59_r12);
		setRotationAngle(bone59_r12, 0.0678F, 0.8715F, 0.0519F);
		bone59_r12.setTextureOffset(303, 230).addBox(-2.3818F, 13.6838F, -8.11F, 6.0F, 2.0F, 2.0F, 0.0F, true);

		bone59_r13 = new ModelRenderer(this);
		bone59_r13.setRotationPoint(-0.0784F, 5.9951F, -9.4361F);
		bone59.addChild(bone59_r13);
		setRotationAngle(bone59_r13, -1.5272F, 1.4399F, -1.5708F);
		bone59_r13.setTextureOffset(494, 369).addBox(-6.4508F, -7.6912F, -7.1417F, 5.0F, 6.0F, 3.0F, 0.0F, true);

		bone59_r14 = new ModelRenderer(this);
		bone59_r14.setRotationPoint(-0.0784F, 5.9951F, -9.4361F);
		bone59.addChild(bone59_r14);
		setRotationAngle(bone59_r14, -1.5708F, 1.2217F, -1.5708F);
		bone59_r14.setTextureOffset(196, 134).addBox(-3.0707F, 5.6303F, -6.1618F, 2.0F, 9.0F, 3.0F, 0.0F, true);

		bone59_r15 = new ModelRenderer(this);
		bone59_r15.setRotationPoint(-0.0784F, 5.9951F, -9.4361F);
		bone59.addChild(bone59_r15);
		setRotationAngle(bone59_r15, -0.8496F, 0.3471F, -1.0663F);
		bone59_r15.setTextureOffset(203, 134).addBox(3.0646F, -6.2856F, -5.1089F, 1.0F, 1.0F, 2.0F, 0.0F, true);

		bone59_r16 = new ModelRenderer(this);
		bone59_r16.setRotationPoint(-0.0784F, 5.9951F, -9.4361F);
		bone59.addChild(bone59_r16);
		setRotationAngle(bone59_r16, -0.395F, 0.833F, -0.2992F);
		bone59_r16.setTextureOffset(223, 252).addBox(-0.8826F, -10.5975F, -5.1089F, 2.0F, 4.0F, 2.0F, 0.0F, true);
		bone59_r16.setTextureOffset(424, 16).addBox(-5.1326F, -6.6075F, -5.1089F, 6.0F, 4.0F, 2.0F, 0.0F, true);

		bone59_r17 = new ModelRenderer(this);
		bone59_r17.setRotationPoint(-0.0784F, 5.9951F, -9.4361F);
		bone59.addChild(bone59_r17);
		setRotationAngle(bone59_r17, 0.0327F, 0.833F, -0.2992F);
		bone59_r17.setTextureOffset(283, 308).addBox(-5.1326F, -4.4822F, -3.5717F, 4.0F, 4.0F, 1.0F, 0.0F, true);

		bone59_r18 = new ModelRenderer(this);
		bone59_r18.setRotationPoint(-0.0784F, 5.9951F, -9.4361F);
		bone59.addChild(bone59_r18);
		setRotationAngle(bone59_r18, -1.4399F, 1.2217F, -1.5708F);
		bone59_r18.setTextureOffset(314, 164).addBox(-3.0707F, -3.0153F, -6.8739F, 2.0F, 8.0F, 3.0F, 0.0F, true);

		bone59_r19 = new ModelRenderer(this);
		bone59_r19.setRotationPoint(-0.3284F, 5.9951F, -9.4361F);
		bone59.addChild(bone59_r19);
		setRotationAngle(bone59_r19, -0.395F, 0.833F, -0.2992F);
		bone59_r19.setTextureOffset(496, 121).addBox(-4.3225F, 0.3511F, -3.498F, 4.0F, 15.0F, 1.0F, 0.0F, true);

		bone59_r20 = new ModelRenderer(this);
		bone59_r20.setRotationPoint(-0.0784F, 5.9951F, -9.4361F);
		bone59.addChild(bone59_r20);
		setRotationAngle(bone59_r20, -0.7809F, 0.7024F, -0.5695F);
		bone59_r20.setTextureOffset(313, 341).addBox(0.7913F, -11.2126F, -8.2552F, 3.0F, 3.0F, 3.0F, 0.0F, true);

		bone59_r21 = new ModelRenderer(this);
		bone59_r21.setRotationPoint(-0.0784F, 5.9951F, -9.4361F);
		bone59.addChild(bone59_r21);
		setRotationAngle(bone59_r21, -0.2618F, 0.0F, 0.0F);
		bone59_r21.setTextureOffset(118, 406).addBox(-3.1369F, 0.3511F, -2.0014F, 6.0F, 15.0F, 2.0F, 0.0F, true);
		bone59_r21.setTextureOffset(482, 460).addBox(-4.1469F, -10.5975F, -4.5076F, 8.0F, 8.0F, 2.0F, 0.0F, true);

		bone59_r22 = new ModelRenderer(this);
		bone59_r22.setRotationPoint(-0.0784F, 5.9951F, -9.4361F);
		bone59.addChild(bone59_r22);
		setRotationAngle(bone59_r22, -0.5672F, 0.0F, 0.0F);
		bone59_r22.setTextureOffset(127, 275).addBox(-3.8869F, -11.2226F, -8.2106F, 8.0F, 3.0F, 3.0F, 0.0F, true);

		bone60 = new ModelRenderer(this);
		bone60.setRotationPoint(0.6224F, 9.0982F, 1.3818F);
		bone59.addChild(bone60);
		setRotationAngle(bone60, -0.2618F, 0.0F, 0.0F);

		bone61 = new ModelRenderer(this);
		bone61.setRotationPoint(-0.2182F, 0.1756F, 0.7326F);
		bone60.addChild(bone61);
		bone61.setTextureOffset(244, 417).addBox(1.2937F, 65.4744F, -0.8291F, 4.0F, 3.0F, 4.0F, 0.0F, true);
		bone61.setTextureOffset(374, 269).addBox(-4.4815F, 65.4744F, -0.8291F, 4.0F, 3.0F, 4.0F, 0.0F, true);
		bone61.setTextureOffset(93, 0).addBox(5.8445F, 7.3738F, -1.4891F, 3.0F, 17.0F, 11.0F, 0.0F, true);
		bone61.setTextureOffset(60, 0).addBox(-8.0323F, 7.3738F, -1.4891F, 3.0F, 17.0F, 11.0F, 0.0F, true);

		bone61_r1 = new ModelRenderer(this);
		bone61_r1.setRotationPoint(2.2476F, 3.2439F, -5.3897F);
		bone61.addChild(bone61_r1);
		setRotationAngle(bone61_r1, 0.2403F, -0.9903F, -0.1148F);
		bone61_r1.setTextureOffset(384, 386).addBox(-1.0987F, 27.4922F, -6.9058F, 6.0F, 34.0F, 4.0F, 0.0F, true);

		bone61_r2 = new ModelRenderer(this);
		bone61_r2.setRotationPoint(2.2476F, 3.2439F, -5.3897F);
		bone61.addChild(bone61_r2);
		setRotationAngle(bone61_r2, 0.2618F, 0.0F, 0.0F);
		bone61_r2.setTextureOffset(107, 446).addBox(-4.3415F, 40.6604F, 1.7177F, 5.0F, 14.0F, 7.0F, 0.0F, true);
		bone61_r2.setTextureOffset(158, 261).addBox(-3.3415F, 46.1128F, 0.6056F, 3.0F, 9.0F, 2.0F, 0.0F, true);
		bone61_r2.setTextureOffset(380, 189).addBox(-3.8415F, 54.6659F, 2.5528F, 4.0F, 2.0F, 5.0F, 0.0F, true);

		bone61_r3 = new ModelRenderer(this);
		bone61_r3.setRotationPoint(2.2476F, 3.2439F, -5.3897F);
		bone61.addChild(bone61_r3);
		setRotationAngle(bone61_r3, 0.4363F, 0.0F, 0.0F);
		bone61_r3.setTextureOffset(446, 446).addBox(-4.3415F, 8.8137F, 10.0248F, 5.0F, 13.0F, 7.0F, 0.0F, true);
		bone61_r3.setTextureOffset(171, 38).addBox(-2.8415F, 55.1901F, -7.6831F, 2.0F, 3.0F, 1.0F, 0.0F, true);
		bone61_r3.setTextureOffset(468, 334).addBox(-3.8415F, 21.8192F, 10.8599F, 4.0F, 2.0F, 5.0F, 0.0F, true);

		bone61_r4 = new ModelRenderer(this);
		bone61_r4.setRotationPoint(2.2476F, 3.2439F, -5.3897F);
		bone61.addChild(bone61_r4);
		setRotationAngle(bone61_r4, 0.2427F, 0.0992F, -0.3806F);
		bone61_r4.setTextureOffset(158, 0).addBox(-25.7342F, 49.8824F, 3.8028F, 1.0F, 3.0F, 2.0F, 0.0F, true);

		bone61_r5 = new ModelRenderer(this);
		bone61_r5.setRotationPoint(2.2476F, 3.2439F, -5.3897F);
		bone61.addChild(bone61_r5);
		setRotationAngle(bone61_r5, 0.4068F, 0.1624F, -0.3591F);
		bone61_r5.setTextureOffset(120, 161).addBox(-13.1643F, 19.536F, 12.1099F, 1.0F, 3.0F, 2.0F, 0.0F, true);

		bone61_r6 = new ModelRenderer(this);
		bone61_r6.setRotationPoint(2.2476F, 3.2439F, -5.3897F);
		bone61.addChild(bone61_r6);
		setRotationAngle(bone61_r6, 0.6109F, 0.0F, 0.0F);
		bone61_r6.setTextureOffset(173, 161).addBox(-2.8415F, 24.2849F, 6.2016F, 2.0F, 3.0F, 1.0F, 0.0F, true);

		bone61_r7 = new ModelRenderer(this);
		bone61_r7.setRotationPoint(2.2476F, 3.2439F, -5.3897F);
		bone61.addChild(bone61_r7);
		setRotationAngle(bone61_r7, 0.2427F, -0.0992F, 0.3806F);
		bone61_r7.setTextureOffset(128, 161).addBox(21.3316F, 51.2918F, 3.8028F, 1.0F, 3.0F, 2.0F, 0.0F, true);

		bone61_r8 = new ModelRenderer(this);
		bone61_r8.setRotationPoint(2.2476F, 3.2439F, -5.3897F);
		bone61.addChild(bone61_r8);
		setRotationAngle(bone61_r8, 0.4068F, -0.1624F, 0.3591F);
		bone61_r8.setTextureOffset(157, 161).addBox(8.7617F, 20.9454F, 12.1099F, 1.0F, 3.0F, 2.0F, 0.0F, true);

		bone61_r9 = new ModelRenderer(this);
		bone61_r9.setRotationPoint(2.2476F, 3.2439F, -5.3897F);
		bone61.addChild(bone61_r9);
		setRotationAngle(bone61_r9, 0.0436F, 0.0F, 0.0F);
		bone61_r9.setTextureOffset(180, 0).addBox(-2.8415F, 52.6336F, 19.0041F, 2.0F, 3.0F, 1.0F, 0.0F, true);
		bone61_r9.setTextureOffset(220, 348).addBox(-5.3415F, 6.366F, -0.2218F, 7.0F, 6.0F, 16.0F, 0.0F, true);
		bone61_r9.setTextureOffset(157, 161).addBox(-4.7799F, 37.2699F, 9.787F, 5.0F, 9.0F, 6.0F, 0.0F, true);

		bone61_r10 = new ModelRenderer(this);
		bone61_r10.setRotationPoint(2.2476F, 3.2439F, -5.3897F);
		bone61.addChild(bone61_r10);
		setRotationAngle(bone61_r10, 0.2182F, 0.0F, 0.0F);
		bone61_r10.setTextureOffset(188, 188).addBox(-2.8415F, 18.7675F, 20.005F, 2.0F, 3.0F, 1.0F, 0.0F, true);

		bone61_r11 = new ModelRenderer(this);
		bone61_r11.setRotationPoint(2.2476F, 3.2439F, -5.3897F);
		bone61.addChild(bone61_r11);
		setRotationAngle(bone61_r11, -0.6109F, 0.0F, 0.0F);
		bone61_r11.setTextureOffset(125, 323).addBox(-5.3415F, -12.8555F, 10.7641F, 9.0F, 12.0F, 5.0F, 0.0F, true);
		bone61_r11.setTextureOffset(444, 214).addBox(-1.6279F, -8.5809F, -0.0674F, 4.0F, 4.0F, 11.0F, 0.0F, true);

		bone61_r12 = new ModelRenderer(this);
		bone61_r12.setRotationPoint(2.2476F, 3.2439F, -4.8897F);
		bone61.addChild(bone61_r12);
		setRotationAngle(bone61_r12, -0.6109F, 0.0F, 0.0F);
		bone61_r12.setTextureOffset(126, 382).addBox(-6.3415F, -8.8555F, 9.7641F, 5.0F, 8.0F, 6.0F, 0.0F, true);

		bone61_r13 = new ModelRenderer(this);
		bone61_r13.setRotationPoint(-0.7854F, 4.2008F, 2.8509F);
		bone61.addChild(bone61_r13);
		setRotationAngle(bone61_r13, -0.6981F, 0.0436F, -0.0873F);
		bone61_r13.setTextureOffset(425, 339).addBox(-2.5627F, -1.8381F, -7.9043F, 3.0F, 3.0F, 13.0F, 0.0F, true);

		bone61_r14 = new ModelRenderer(this);
		bone61_r14.setRotationPoint(2.2476F, 3.2439F, -5.3897F);
		bone61.addChild(bone61_r14);
		setRotationAngle(bone61_r14, 0.1309F, 0.0F, 0.0F);
		bone61_r14.setTextureOffset(263, 477).addBox(-4.2799F, 61.348F, -7.7743F, 5.0F, 11.0F, 5.0F, 0.0F, true);
		bone61_r14.setTextureOffset(0, 165).addBox(-6.3415F, 35.729F, -4.7839F, 9.0F, 29.0F, 6.0F, 0.0F, true);
		bone61_r14.setTextureOffset(386, 299).addBox(-6.7632F, 10.729F, -5.0526F, 9.0F, 25.0F, 5.0F, 0.0F, true);
		bone61_r14.setTextureOffset(124, 115).addBox(-7.3415F, 8.3115F, -6.0338F, 11.0F, 2.0F, 5.0F, 0.0F, true);

		bone61_r15 = new ModelRenderer(this);
		bone61_r15.setRotationPoint(2.2476F, 3.2439F, -5.3897F);
		bone61.addChild(bone61_r15);
		setRotationAngle(bone61_r15, -0.1745F, 0.0F, 0.0F);
		bone61_r15.setTextureOffset(340, 280).addBox(-7.2799F, 63.5518F, 14.448F, 11.0F, 7.0F, 5.0F, 0.0F, true);

		bone61_r16 = new ModelRenderer(this);
		bone61_r16.setRotationPoint(2.2476F, 3.2439F, -5.3897F);
		bone61.addChild(bone61_r16);
		setRotationAngle(bone61_r16, -0.2618F, 0.0F, 0.0F);
		bone61_r16.setTextureOffset(111, 43).addBox(-10.2599F, 0.0566F, 16.5214F, 2.0F, 17.0F, 3.0F, 0.0F, true);
		bone61_r16.setTextureOffset(272, 207).addBox(3.5969F, 0.0566F, 16.5214F, 2.0F, 17.0F, 3.0F, 0.0F, true);
		bone61_r16.setTextureOffset(338, 338).addBox(-11.2799F, -2.7478F, 2.7081F, 5.0F, 6.0F, 18.0F, 0.0F, true);
		bone61_r16.setTextureOffset(339, 146).addBox(2.5969F, -2.7478F, 2.7081F, 5.0F, 6.0F, 18.0F, 0.0F, true);

		bone61_r17 = new ModelRenderer(this);
		bone61_r17.setRotationPoint(7.0688F, 10.053F, 6.2009F);
		bone61.addChild(bone61_r17);
		setRotationAngle(bone61_r17, -0.2618F, 0.0873F, 0.3054F);
		bone61_r17.setTextureOffset(409, 294).addBox(-2.5F, -3.325F, -2.25F, 6.0F, 6.0F, 4.0F, 0.0F, true);

		bone61_r18 = new ModelRenderer(this);
		bone61_r18.setRotationPoint(-6.5323F, 10.053F, 6.2009F);
		bone61.addChild(bone61_r18);
		setRotationAngle(bone61_r18, -0.2618F, -0.0873F, -0.3054F);
		bone61_r18.setTextureOffset(480, 392).addBox(-3.5F, -3.325F, -2.25F, 6.0F, 6.0F, 4.0F, 0.0F, true);

		bone61_r19 = new ModelRenderer(this);
		bone61_r19.setRotationPoint(2.2476F, 3.2439F, -5.3897F);
		bone61.addChild(bone61_r19);
		setRotationAngle(bone61_r19, 0.3927F, 0.0F, 0.0F);
		bone61_r19.setTextureOffset(305, 230).addBox(-7.2799F, 10.3316F, -5.6925F, 10.0F, 14.0F, 16.0F, 0.0F, true);

		bone61_r20 = new ModelRenderer(this);
		bone61_r20.setRotationPoint(2.2476F, 3.2439F, -5.3897F);
		bone61.addChild(bone61_r20);
		setRotationAngle(bone61_r20, -0.2182F, 0.0F, 0.0F);
		bone61_r20.setTextureOffset(282, 409).addBox(-7.2799F, 14.2648F, 15.6819F, 10.0F, 12.0F, 7.0F, 0.0F, true);
		bone61_r20.setTextureOffset(478, 100).addBox(-5.9199F, 48.9271F, 18.9496F, 8.0F, 9.0F, 3.0F, 0.0F, true);
		bone61_r20.setTextureOffset(204, 0).addBox(-5.7799F, 26.9271F, 14.9496F, 7.0F, 28.0F, 6.0F, 0.0F, true);

		bone61_r21 = new ModelRenderer(this);
		bone61_r21.setRotationPoint(2.2476F, 3.2439F, -5.3897F);
		bone61.addChild(bone61_r21);
		setRotationAngle(bone61_r21, 1.0472F, 0.0F, 0.0F);
		bone61_r21.setTextureOffset(357, 241).addBox(-6.0299F, 36.8176F, -58.0984F, 8.0F, 4.0F, 15.0F, 0.0F, true);

		bone61_r22 = new ModelRenderer(this);
		bone61_r22.setRotationPoint(2.2476F, 3.2439F, -5.3897F);
		bone61.addChild(bone61_r22);
		setRotationAngle(bone61_r22, 1.0472F, -0.1345F, -0.0397F);
		bone61_r22.setTextureOffset(444, 402).addBox(-8.9721F, 39.0814F, -58.6112F, 4.0F, 4.0F, 11.0F, 0.0F, true);
		bone61_r22.setTextureOffset(280, 75).addBox(-7.9721F, 40.0814F, -45.6112F, 3.0F, 3.0F, 4.0F, 0.0F, true);

		bone61_r23 = new ModelRenderer(this);
		bone61_r23.setRotationPoint(2.2476F, 3.2439F, -5.3897F);
		bone61.addChild(bone61_r23);
		setRotationAngle(bone61_r23, 1.0472F, 0.1345F, 0.0397F);
		bone61_r23.setTextureOffset(155, 447).addBox(1.1985F, 39.7269F, -58.9845F, 4.0F, 3.0F, 11.0F, 0.0F, true);
		bone61_r23.setTextureOffset(309, 409).addBox(1.1985F, 39.7269F, -45.9845F, 3.0F, 3.0F, 4.0F, 0.0F, true);

		bone61_r24 = new ModelRenderer(this);
		bone61_r24.setRotationPoint(2.2476F, 3.2439F, -5.3897F);
		bone61.addChild(bone61_r24);
		setRotationAngle(bone61_r24, 0.0F, 0.0F, -0.0873F);
		bone61_r24.setTextureOffset(38, 386).addBox(-12.1298F, 20.7871F, 4.5606F, 4.0F, 40.0F, 4.0F, 0.0F, true);
		bone61_r24.setTextureOffset(356, 492).addBox(-12.139F, 20.8011F, 9.0606F, 3.0F, 13.0F, 3.0F, 0.0F, true);

		bone61_r25 = new ModelRenderer(this);
		bone61_r25.setRotationPoint(2.2476F, 3.2439F, -5.3897F);
		bone61.addChild(bone61_r25);
		setRotationAngle(bone61_r25, 0.0F, 0.0F, 0.0873F);
		bone61_r25.setTextureOffset(368, 386).addBox(4.4609F, 21.1081F, 4.5606F, 4.0F, 40.0F, 4.0F, 0.0F, true);
		bone61_r25.setTextureOffset(368, 492).addBox(5.4701F, 21.1221F, 9.0606F, 3.0F, 13.0F, 3.0F, 0.0F, true);

		bone61_r26 = new ModelRenderer(this);
		bone61_r26.setRotationPoint(2.2476F, 3.2439F, -5.3897F);
		bone61.addChild(bone61_r26);
		setRotationAngle(bone61_r26, -0.1739F, -0.0151F, -0.0859F);
		bone61_r26.setTextureOffset(424, 484).addBox(-11.8926F, 31.2755F, 14.633F, 3.0F, 18.0F, 3.0F, 0.0F, true);

		bone61_r27 = new ModelRenderer(this);
		bone61_r27.setRotationPoint(2.2476F, 3.2439F, -5.3897F);
		bone61.addChild(bone61_r27);
		setRotationAngle(bone61_r27, -0.1739F, 0.0151F, 0.0859F);
		bone61_r27.setTextureOffset(484, 126).addBox(5.2236F, 31.5965F, 14.633F, 3.0F, 18.0F, 3.0F, 0.0F, true);

		bone61_r28 = new ModelRenderer(this);
		bone61_r28.setRotationPoint(2.2476F, 3.2439F, -5.3897F);
		bone61.addChild(bone61_r28);
		setRotationAngle(bone61_r28, 0.2403F, 0.9903F, 0.2021F);
		bone61_r28.setTextureOffset(158, 0).addBox(-7.3726F, 10.729F, -8.4188F, 8.0F, 17.0F, 6.0F, 0.0F, true);
		bone61_r28.setTextureOffset(171, 106).addBox(-8.8535F, 8.3314F, -9.4351F, 10.0F, 2.0F, 5.0F, 0.0F, true);
		bone61_r28.setTextureOffset(431, 135).addBox(-8.8535F, 4.5814F, -7.4351F, 2.0F, 3.0F, 3.0F, 0.0F, true);

		bone61_r29 = new ModelRenderer(this);
		bone61_r29.setRotationPoint(2.2476F, 3.2439F, -5.3897F);
		bone61.addChild(bone61_r29);
		setRotationAngle(bone61_r29, 0.2403F, -0.9903F, -0.2021F);
		bone61_r29.setTextureOffset(127, 252).addBox(-2.6063F, 10.729F, -5.3126F, 8.0F, 17.0F, 6.0F, 0.0F, true);
		bone61_r29.setTextureOffset(74, 441).addBox(4.1246F, 4.5814F, -4.3289F, 2.0F, 3.0F, 3.0F, 0.0F, true);
		bone61_r29.setTextureOffset(212, 94).addBox(-3.1254F, 8.3314F, -6.3289F, 10.0F, 2.0F, 5.0F, 0.0F, true);

		bone61_r30 = new ModelRenderer(this);
		bone61_r30.setRotationPoint(2.2476F, 3.2439F, -5.3897F);
		bone61.addChild(bone61_r30);
		setRotationAngle(bone61_r30, 0.2403F, 0.9903F, 0.1148F);
		bone61_r30.setTextureOffset(262, 387).addBox(-6.9079F, 27.1739F, -9.9777F, 6.0F, 34.0F, 4.0F, 0.0F, true);

		bone62 = new ModelRenderer(this);
		bone62.setRotationPoint(0.4671F, 53.83F, 15.6624F);
		bone61.addChild(bone62);

		bone62_r1 = new ModelRenderer(this);
		bone62_r1.setRotationPoint(1.823F, -40.9394F, -19.599F);
		bone62.addChild(bone62_r1);
		setRotationAngle(bone62_r1, 0.6112F, 0.0076F, 0.0869F);
		bone62_r1.setTextureOffset(222, 313).addBox(4.2212F, 50.1805F, -13.0375F, 2.0F, 12.0F, 3.0F, 0.0F, true);

		bone62_r2 = new ModelRenderer(this);
		bone62_r2.setRotationPoint(1.823F, -40.9394F, -19.599F);
		bone62.addChild(bone62_r2);
		setRotationAngle(bone62_r2, -0.0869F, 0.0076F, 0.0869F);
		bone62_r2.setTextureOffset(0, 202).addBox(4.2212F, 38.5708F, 22.2681F, 2.0F, 8.0F, 3.0F, 0.0F, true);

		bone62_r3 = new ModelRenderer(this);
		bone62_r3.setRotationPoint(1.823F, -40.9394F, -19.599F);
		bone62.addChild(bone62_r3);
		setRotationAngle(bone62_r3, 0.3058F, 0.0076F, 0.0869F);
		bone62_r3.setTextureOffset(26, 310).addBox(4.2112F, 44.2351F, 5.9516F, 2.0F, 19.0F, 4.0F, 0.0F, true);

		bone62_r4 = new ModelRenderer(this);
		bone62_r4.setRotationPoint(1.823F, -40.9394F, -19.599F);
		bone62.addChild(bone62_r4);
		setRotationAngle(bone62_r4, 0.3054F, 0.0F, 0.0F);
		bone62_r4.setTextureOffset(26, 485).addBox(-4.6015F, 44.4352F, 7.8369F, 5.0F, 19.0F, 1.0F, 0.0F, true);

		bone62_r5 = new ModelRenderer(this);
		bone62_r5.setRotationPoint(1.823F, -40.9394F, -19.599F);
		bone62.addChild(bone62_r5);
		setRotationAngle(bone62_r5, -0.0869F, -0.0076F, -0.0869F);
		bone62_r5.setTextureOffset(23, 202).addBox(-9.8902F, 38.2498F, 22.2681F, 2.0F, 8.0F, 3.0F, 0.0F, true);

		bone62_r6 = new ModelRenderer(this);
		bone62_r6.setRotationPoint(1.823F, -40.9394F, -19.599F);
		bone62.addChild(bone62_r6);
		setRotationAngle(bone62_r6, 0.6112F, -0.0076F, -0.0869F);
		bone62_r6.setTextureOffset(361, 46).addBox(-9.8902F, 49.9346F, -12.8311F, 2.0F, 12.0F, 3.0F, 0.0F, true);

		bone62_r7 = new ModelRenderer(this);
		bone62_r7.setRotationPoint(1.823F, -40.9394F, -19.599F);
		bone62.addChild(bone62_r7);
		setRotationAngle(bone62_r7, 0.3058F, -0.0076F, -0.0869F);
		bone62_r7.setTextureOffset(382, 476).addBox(-9.9102F, 43.9386F, 6.0744F, 2.0F, 19.0F, 4.0F, 0.0F, true);

		bone63 = new ModelRenderer(this);
		bone63.setRotationPoint(-1.4721F, 44.7616F, 8.4792F);
		bone61.addChild(bone63);

		bone63_r1 = new ModelRenderer(this);
		bone63_r1.setRotationPoint(3.7197F, -41.5177F, -13.3689F);
		bone63.addChild(bone63_r1);
		setRotationAngle(bone63_r1, -0.2002F, -0.3501F, 0.1189F);
		bone63_r1.setTextureOffset(450, 492).addBox(4.3316F, 38.932F, 20.8781F, 1.0F, 13.0F, 4.0F, 0.0F, true);

		bone63_r2 = new ModelRenderer(this);
		bone63_r2.setRotationPoint(3.7197F, -41.5177F, -13.3689F);
		bone63.addChild(bone63_r2);
		setRotationAngle(bone63_r2, -0.4183F, -0.3501F, 0.1189F);
		bone63_r2.setTextureOffset(65, 202).addBox(4.3516F, 40.6896F, 31.6925F, 1.0F, 5.0F, 4.0F, 0.0F, true);

		bone63_r3 = new ModelRenderer(this);
		bone63_r3.setRotationPoint(3.7197F, -41.5177F, -13.3689F);
		bone63.addChild(bone63_r3);
		setRotationAngle(bone63_r3, -0.0693F, -0.3501F, 0.1189F);
		bone63_r3.setTextureOffset(227, 498).addBox(4.3516F, 41.324F, 15.6178F, 1.0F, 9.0F, 4.0F, 0.0F, true);

		bone64 = new ModelRenderer(this);
		bone64.setRotationPoint(6.0994F, 44.7312F, 8.9604F);
		bone61.addChild(bone64);

		bone64_r1 = new ModelRenderer(this);
		bone64_r1.setRotationPoint(-3.7197F, -41.5177F, -13.8689F);
		bone64.addChild(bone64_r1);
		setRotationAngle(bone64_r1, -0.2002F, 0.3501F, -0.1189F);
		bone64_r1.setTextureOffset(279, 492).addBox(-8.7967F, 38.7532F, 19.5619F, 1.0F, 13.0F, 4.0F, 0.0F, true);

		bone64_r2 = new ModelRenderer(this);
		bone64_r2.setRotationPoint(-3.7197F, -41.5177F, -13.8689F);
		bone64.addChild(bone64_r2);
		setRotationAngle(bone64_r2, -0.4183F, 0.3501F, -0.1189F);
		bone64_r2.setTextureOffset(66, 58).addBox(-8.7867F, 40.7999F, 30.3688F, 1.0F, 5.0F, 4.0F, 0.0F, true);

		bone64_r3 = new ModelRenderer(this);
		bone64_r3.setRotationPoint(-3.7197F, -41.5177F, -13.8689F);
		bone64.addChild(bone64_r3);
		setRotationAngle(bone64_r3, -0.0693F, 0.3501F, -0.1189F);
		bone64_r3.setTextureOffset(12, 439).addBox(-8.7867F, 40.975F, 14.3363F, 1.0F, 9.0F, 4.0F, 0.0F, true);

		bone65 = new ModelRenderer(this);
		bone65.setRotationPoint(-2.7221F, 42.7616F, 7.9792F);
		bone61.addChild(bone65);

		bone65_r1 = new ModelRenderer(this);
		bone65_r1.setRotationPoint(4.9697F, -39.5177F, -13.3689F);
		bone65.addChild(bone65_r1);
		setRotationAngle(bone65_r1, -0.2002F, -0.3501F, 0.1189F);
		bone65_r1.setTextureOffset(450, 492).addBox(2.7714F, 37.1236F, 20.5494F, 1.0F, 13.0F, 4.0F, 0.0F, true);

		bone65_r2 = new ModelRenderer(this);
		bone65_r2.setRotationPoint(4.9697F, -39.5177F, -13.3689F);
		bone65.addChild(bone65_r2);
		setRotationAngle(bone65_r2, -0.4183F, -0.3501F, 0.1189F);
		bone65_r2.setTextureOffset(65, 202).addBox(2.7914F, 38.9953F, 30.9802F, 1.0F, 5.0F, 4.0F, 0.0F, true);

		bone65_r3 = new ModelRenderer(this);
		bone65_r3.setRotationPoint(4.9697F, -39.5177F, -13.3689F);
		bone65.addChild(bone65_r3);
		setRotationAngle(bone65_r3, -0.0693F, -0.3501F, 0.1189F);
		bone65_r3.setTextureOffset(470, 497).addBox(2.7914F, 39.4883F, 15.528F, 1.0F, 9.0F, 4.0F, 0.0F, true);

		bone69 = new ModelRenderer(this);
		bone69.setRotationPoint(7.2173F, 42.7616F, 7.9792F);
		bone61.addChild(bone69);

		bone69_r1 = new ModelRenderer(this);
		bone69_r1.setRotationPoint(-4.9697F, -39.5177F, -13.3689F);
		bone69.addChild(bone69_r1);
		setRotationAngle(bone69_r1, -0.2002F, 0.3501F, -0.1189F);
		bone69_r1.setTextureOffset(279, 492).addBox(-7.2365F, 36.9448F, 19.2332F, 1.0F, 13.0F, 4.0F, 0.0F, true);

		bone69_r2 = new ModelRenderer(this);
		bone69_r2.setRotationPoint(-4.9697F, -39.5177F, -13.3689F);
		bone69.addChild(bone69_r2);
		setRotationAngle(bone69_r2, -0.4183F, 0.3501F, -0.1189F);
		bone69_r2.setTextureOffset(66, 58).addBox(-7.2265F, 39.1056F, 29.6565F, 1.0F, 5.0F, 4.0F, 0.0F, true);

		bone69_r3 = new ModelRenderer(this);
		bone69_r3.setRotationPoint(-4.9697F, -39.5177F, -13.3689F);
		bone69.addChild(bone69_r3);
		setRotationAngle(bone69_r3, -0.0693F, 0.3501F, -0.1189F);
		bone69_r3.setTextureOffset(12, 439).addBox(-7.2265F, 39.1392F, 14.2464F, 1.0F, 9.0F, 4.0F, 0.0F, true);

		bone70 = new ModelRenderer(this);
		bone70.setRotationPoint(-3.7221F, 40.2616F, 6.9792F);
		bone61.addChild(bone70);

		bone70_r1 = new ModelRenderer(this);
		bone70_r1.setRotationPoint(5.9697F, -37.0177F, -12.3689F);
		bone70.addChild(bone70_r1);
		setRotationAngle(bone70_r1, -0.2002F, -0.3501F, 0.1189F);
		bone70_r1.setTextureOffset(450, 492).addBox(1.2171F, 34.9059F, 19.5923F, 1.0F, 13.0F, 4.0F, 0.0F, true);

		bone70_r2 = new ModelRenderer(this);
		bone70_r2.setRotationPoint(5.9697F, -37.0177F, -12.3689F);
		bone70.addChild(bone70_r2);
		setRotationAngle(bone70_r2, -0.4183F, -0.3501F, 0.1189F);
		bone70_r2.setTextureOffset(65, 202).addBox(1.2371F, 37.0373F, 29.5658F, 1.0F, 5.0F, 4.0F, 0.0F, true);

		bone70_r3 = new ModelRenderer(this);
		bone70_r3.setRotationPoint(5.9697F, -37.0177F, -12.3689F);
		bone70.addChild(bone70_r3);
		setRotationAngle(bone70_r3, -0.0693F, -0.3501F, 0.1189F);
		bone70_r3.setTextureOffset(439, 106).addBox(1.2371F, 37.1646F, 14.8686F, 1.0F, 9.0F, 4.0F, 0.0F, true);

		bone71 = new ModelRenderer(this);
		bone71.setRotationPoint(8.2173F, 40.2616F, 6.9792F);
		bone61.addChild(bone71);

		bone71_r1 = new ModelRenderer(this);
		bone71_r1.setRotationPoint(-5.9697F, -37.0177F, -12.3689F);
		bone71.addChild(bone71_r1);
		setRotationAngle(bone71_r1, -0.2002F, 0.3501F, -0.1189F);
		bone71_r1.setTextureOffset(279, 492).addBox(-5.6822F, 34.7271F, 18.2762F, 1.0F, 13.0F, 4.0F, 0.0F, true);

		bone71_r2 = new ModelRenderer(this);
		bone71_r2.setRotationPoint(-5.9697F, -37.0177F, -12.3689F);
		bone71.addChild(bone71_r2);
		setRotationAngle(bone71_r2, -0.4183F, 0.3501F, -0.1189F);
		bone71_r2.setTextureOffset(66, 58).addBox(-5.6722F, 37.1476F, 28.2421F, 1.0F, 5.0F, 4.0F, 0.0F, true);

		bone71_r3 = new ModelRenderer(this);
		bone71_r3.setRotationPoint(-5.9697F, -37.0177F, -12.3689F);
		bone71.addChild(bone71_r3);
		setRotationAngle(bone71_r3, -0.0693F, 0.3501F, -0.1189F);
		bone71_r3.setTextureOffset(12, 439).addBox(-5.6722F, 36.8156F, 13.587F, 1.0F, 9.0F, 4.0F, 0.0F, true);

		bone72 = new ModelRenderer(this);
		bone72.setRotationPoint(2.1452F, 13.3105F, 18.1912F);
		bone61.addChild(bone72);

		bone72_r1 = new ModelRenderer(this);
		bone72_r1.setRotationPoint(0.1759F, -6.0751F, -21.9018F);
		bone72.addChild(bone72_r1);
		setRotationAngle(bone72_r1, 0.1304F, 0.0114F, -0.0865F);
		bone72_r1.setTextureOffset(60, 0).addBox(-7.3312F, 9.0008F, 18.9152F, 2.0F, 8.0F, 3.0F, 0.0F, true);

		bone72_r2 = new ModelRenderer(this);
		bone72_r2.setRotationPoint(0.1759F, -6.0751F, -21.9018F);
		bone72.addChild(bone72_r2);
		setRotationAngle(bone72_r2, 0.5231F, 0.0114F, -0.0865F);
		bone72_r2.setTextureOffset(328, 486).addBox(-7.3512F, 15.6329F, 14.1699F, 2.0F, 14.0F, 4.0F, 0.0F, true);

		bone72_r3 = new ModelRenderer(this);
		bone72_r3.setRotationPoint(0.1759F, -6.0751F, -21.9018F);
		bone72.addChild(bone72_r3);
		setRotationAngle(bone72_r3, 0.5231F, -0.0114F, 0.0865F);
		bone72_r3.setTextureOffset(52, 488).addBox(1.6523F, 15.9294F, 14.0471F, 2.0F, 14.0F, 4.0F, 0.0F, true);

		bone72_r4 = new ModelRenderer(this);
		bone72_r4.setRotationPoint(0.1759F, -6.0751F, -21.9018F);
		bone72.addChild(bone72_r4);
		setRotationAngle(bone72_r4, 0.5236F, 0.0F, 0.0F);
		bone72_r4.setTextureOffset(216, 134).addBox(-4.6015F, 16.0263F, 15.9751F, 5.0F, 14.0F, 1.0F, 0.0F, true);

		bone72_r5 = new ModelRenderer(this);
		bone72_r5.setRotationPoint(0.1759F, -6.0751F, -21.9018F);
		bone72.addChild(bone72_r5);
		setRotationAngle(bone72_r5, 0.1304F, -0.0114F, 0.0865F);
		bone72_r5.setTextureOffset(88, 58).addBox(1.6623F, 9.3218F, 18.9152F, 2.0F, 8.0F, 3.0F, 0.0F, true);

		bone72_r6 = new ModelRenderer(this);
		bone72_r6.setRotationPoint(0.1759F, -6.0751F, -21.9018F);
		bone72.addChild(bone72_r6);
		setRotationAngle(bone72_r6, 0.8285F, -0.0114F, 0.0865F);
		bone72_r6.setTextureOffset(93, 0).addBox(1.6623F, 25.6192F, 3.195F, 2.0F, 8.0F, 3.0F, 0.0F, true);

		bone72_r7 = new ModelRenderer(this);
		bone72_r7.setRotationPoint(0.1759F, -6.0751F, -21.9018F);
		bone72.addChild(bone72_r7);
		setRotationAngle(bone72_r7, 0.8285F, 0.0114F, -0.0865F);
		bone72_r7.setTextureOffset(124, 68).addBox(-7.3312F, 25.3733F, 3.4013F, 2.0F, 8.0F, 3.0F, 0.0F, true);

		bone67 = new ModelRenderer(this);
		bone67.setRotationPoint(-0.25F, -23.1002F, -8.4967F);
		xiabanshen.addChild(bone67);

		bone67_r1 = new ModelRenderer(this);
		bone67_r1.setRotationPoint(0.0F, -6.0F, 5.0F);
		bone67.addChild(bone67_r1);
		setRotationAngle(bone67_r1, -0.0873F, 0.0F, 0.0F);
		bone67_r1.setTextureOffset(428, 428).addBox(-5.5F, -2.7505F, -4.7391F, 11.0F, 9.0F, 6.0F, 0.0F, false);
		bone67_r1.setTextureOffset(96, 323).addBox(-3.0F, -7.2495F, -6.7609F, 6.0F, 14.0F, 17.0F, 0.0F, false);

		bone66 = new ModelRenderer(this);
		bone66.setRotationPoint(9.0F, -27.1706F, 3.1368F);
		xiabanshen.addChild(bone66);

		bone66_r1 = new ModelRenderer(this);
		bone66_r1.setRotationPoint(-2.0F, -9.0F, 0.0F);
		bone66.addChild(bone66_r1);
		setRotationAngle(bone66_r1, -0.2781F, -0.3077F, -0.0862F);
		bone66_r1.setTextureOffset(78, 491).addBox(-0.2374F, -5.1702F, 1.0856F, 2.0F, 15.0F, 3.0F, 0.0F, false);

		bone68 = new ModelRenderer(this);
		bone68.setRotationPoint(-9.5F, -27.1706F, 3.1368F);
		xiabanshen.addChild(bone68);

		bone68_r1 = new ModelRenderer(this);
		bone68_r1.setRotationPoint(2.0F, -9.0F, 0.0F);
		bone68.addChild(bone68_r1);
		setRotationAngle(bone68_r1, -0.2781F, 0.3077F, 0.0862F);
		bone68_r1.setTextureOffset(308, 104).addBox(-2.2626F, -5.1702F, 1.0856F, 2.0F, 15.0F, 3.0F, 0.0F, false);

		bone4 = new ModelRenderer(this);
		bone4.setRotationPoint(-0.0965F, -25.8745F, 18.7987F);
		xiabanshen.addChild(bone4);

		bone4_r1 = new ModelRenderer(this);
		bone4_r1.setRotationPoint(9.0F, 10.0F, 2.0F);
		bone4.addChild(bone4_r1);
		setRotationAngle(bone4_r1, 0.4676F, 1.1869F, 0.5423F);
		bone4_r1.setTextureOffset(124, 97).addBox(-3.2478F, -7.6659F, -1.0406F, 5.0F, 11.0F, 2.0F, 0.0F, false);

		bone4_r2 = new ModelRenderer(this);
		bone4_r2.setRotationPoint(-9.307F, 10.0F, 2.0F);
		bone4.addChild(bone4_r2);
		setRotationAngle(bone4_r2, 0.4676F, -1.1869F, -0.5423F);
		bone4_r2.setTextureOffset(0, 134).addBox(-1.7522F, -7.6659F, -1.0406F, 5.0F, 11.0F, 2.0F, 0.0F, false);

		bone4_r3 = new ModelRenderer(this);
		bone4_r3.setRotationPoint(-0.1535F, 3.4995F, 4.723F);
		bone4.addChild(bone4_r3);
		setRotationAngle(bone4_r3, -0.476F, -1.1821F, 0.4452F);
		bone4_r3.setTextureOffset(492, 402).addBox(-9.0792F, -2.125F, 7.3836F, 5.0F, 7.0F, 3.0F, 0.0F, false);
		bone4_r3.setTextureOffset(153, 323).addBox(-10.0792F, -3.125F, 5.8836F, 6.0F, 5.0F, 3.0F, 0.0F, false);

		bone4_r4 = new ModelRenderer(this);
		bone4_r4.setRotationPoint(-0.1535F, 3.4995F, 4.723F);
		bone4.addChild(bone4_r4);
		setRotationAngle(bone4_r4, -0.476F, 1.1821F, -0.4452F);
		bone4_r4.setTextureOffset(424, 181).addBox(4.0792F, -3.125F, 5.8836F, 6.0F, 5.0F, 3.0F, 0.0F, false);
		bone4_r4.setTextureOffset(493, 247).addBox(4.0792F, -2.125F, 7.3836F, 5.0F, 7.0F, 3.0F, 0.0F, false);

		bone4_r5 = new ModelRenderer(this);
		bone4_r5.setRotationPoint(-0.1535F, 3.4995F, 4.723F);
		bone4.addChild(bone4_r5);
		setRotationAngle(bone4_r5, -0.2819F, -0.8967F, 0.2226F);
		bone4_r5.setTextureOffset(380, 124).addBox(-7.0128F, -2.125F, 5.6764F, 6.0F, 4.0F, 3.0F, 0.0F, false);

		bone4_r6 = new ModelRenderer(this);
		bone4_r6.setRotationPoint(-0.1535F, 3.4995F, 4.723F);
		bone4.addChild(bone4_r6);
		setRotationAngle(bone4_r6, -0.2819F, 0.8967F, -0.2226F);
		bone4_r6.setTextureOffset(488, 338).addBox(1.0128F, -2.125F, 5.6764F, 6.0F, 4.0F, 3.0F, 0.0F, false);

		bone4_r7 = new ModelRenderer(this);
		bone4_r7.setRotationPoint(-0.1535F, 4.4995F, 4.723F);
		bone4.addChild(bone4_r7);
		setRotationAngle(bone4_r7, 0.1077F, -0.3786F, -0.1068F);
		bone4_r7.setTextureOffset(102, 310).addBox(-6.25F, -4.385F, 1.4783F, 3.0F, 3.0F, 6.0F, 0.0F, false);

		bone4_r8 = new ModelRenderer(this);
		bone4_r8.setRotationPoint(-0.1535F, 4.4995F, 4.723F);
		bone4.addChild(bone4_r8);
		setRotationAngle(bone4_r8, 0.1077F, 0.3786F, 0.1068F);
		bone4_r8.setTextureOffset(486, 269).addBox(3.25F, -4.385F, 1.4783F, 3.0F, 3.0F, 6.0F, 0.0F, false);

		bone4_r9 = new ModelRenderer(this);
		bone4_r9.setRotationPoint(-0.1535F, 3.4995F, 4.723F);
		bone4.addChild(bone4_r9);
		setRotationAngle(bone4_r9, -0.1745F, 0.0F, 0.0F);
		bone4_r9.setTextureOffset(196, 172).addBox(-7.5F, -2.135F, 0.4783F, 15.0F, 4.0F, 4.0F, 0.0F, false);

		bone4_r10 = new ModelRenderer(this);
		bone4_r10.setRotationPoint(-2.4035F, -7.1255F, -1.2987F);
		bone4.addChild(bone4_r10);
		setRotationAngle(bone4_r10, 0.2639F, 0.3829F, 0.2355F);
		bone4_r10.setTextureOffset(370, 464).addBox(7.75F, 11.7934F, 5.9962F, 4.0F, 26.0F, 2.0F, 0.0F, false);

		bone4_r11 = new ModelRenderer(this);
		bone4_r11.setRotationPoint(6.3614F, 16.309F, 6.7512F);
		bone4.addChild(bone4_r11);
		setRotationAngle(bone4_r11, 0.3599F, 0.7756F, 0.41F);
		bone4_r11.setTextureOffset(389, 445).addBox(0.0F, -1.625F, -0.315F, 5.0F, 28.0F, 1.0F, 0.0F, false);

		bone4_r12 = new ModelRenderer(this);
		bone4_r12.setRotationPoint(-6.6684F, 16.309F, 6.7512F);
		bone4.addChild(bone4_r12);
		setRotationAngle(bone4_r12, 0.3599F, -0.7756F, -0.41F);
		bone4_r12.setTextureOffset(213, 451).addBox(-5.75F, -1.625F, -0.315F, 5.0F, 28.0F, 1.0F, 0.0F, false);

		bone4_r13 = new ModelRenderer(this);
		bone4_r13.setRotationPoint(2.0965F, -7.1255F, -1.2987F);
		bone4.addChild(bone4_r13);
		setRotationAngle(bone4_r13, 0.2639F, -0.3829F, -0.2355F);
		bone4_r13.setTextureOffset(40, 466).addBox(-12.25F, 11.7934F, 5.9962F, 4.0F, 26.0F, 2.0F, 0.0F, false);

		bone4_r14 = new ModelRenderer(this);
		bone4_r14.setRotationPoint(-0.1535F, 21.1583F, 9.472F);
		bone4.addChild(bone4_r14);
		setRotationAngle(bone4_r14, 0.096F, 0.0F, 0.0F);
		bone4_r14.setTextureOffset(290, 446).addBox(-5.25F, -1.5086F, 0.1115F, 10.0F, 18.0F, 2.0F, 0.0F, false);

		bone4_r15 = new ModelRenderer(this);
		bone4_r15.setRotationPoint(-0.1535F, 21.1583F, 9.472F);
		bone4.addChild(bone4_r15);
		setRotationAngle(bone4_r15, 0.3142F, 0.0F, 0.0F);
		bone4_r15.setTextureOffset(363, 445).addBox(-5.25F, -17.2659F, -0.612F, 10.0F, 16.0F, 3.0F, 0.0F, false);

		bone6 = new ModelRenderer(this);
		bone6.setRotationPoint(-0.25F, -17.3507F, -11.4776F);
		xiabanshen.addChild(bone6);

		bone6_r1 = new ModelRenderer(this);
		bone6_r1.setRotationPoint(-4.9946F, 8.1071F, -0.1653F);
		bone6.addChild(bone6_r1);
		setRotationAngle(bone6_r1, -0.3092F, -0.6961F, 0.0585F);
		bone6_r1.setTextureOffset(197, 486).addBox(-3.4252F, -5.1071F, -0.1843F, 2.0F, 16.0F, 3.0F, 0.0F, false);

		bone6_r2 = new ModelRenderer(this);
		bone6_r2.setRotationPoint(4.9946F, 8.1071F, -0.1653F);
		bone6.addChild(bone6_r2);
		setRotationAngle(bone6_r2, -0.3092F, 0.6961F, -0.0585F);
		bone6_r2.setTextureOffset(241, 490).addBox(1.4252F, -5.1071F, -0.1843F, 2.0F, 16.0F, 3.0F, 0.0F, false);

		bone6_r3 = new ModelRenderer(this);
		bone6_r3.setRotationPoint(1.9946F, 8.1071F, -2.4153F);
		bone6.addChild(bone6_r3);
		setRotationAngle(bone6_r3, -0.0698F, 0.0F, 0.0F);
		bone6_r3.setTextureOffset(82, 456).addBox(-6.4946F, -4.6071F, -2.3429F, 9.0F, 15.0F, 3.0F, 0.0F, false);

		bone6_r4 = new ModelRenderer(this);
		bone6_r4.setRotationPoint(-1.9946F, 8.1071F, -2.4153F);
		bone6.addChild(bone6_r4);
		setRotationAngle(bone6_r4, -0.091F, -0.6961F, 0.0585F);
		bone6_r4.setTextureOffset(480, 480).addBox(-3.4252F, -4.6071F, -0.1843F, 2.0F, 15.0F, 5.0F, 0.0F, false);

		bone6_r5 = new ModelRenderer(this);
		bone6_r5.setRotationPoint(1.9946F, 8.1071F, -2.4153F);
		bone6.addChild(bone6_r5);
		setRotationAngle(bone6_r5, -0.091F, 0.6961F, -0.0585F);
		bone6_r5.setTextureOffset(96, 481).addBox(1.4252F, -4.6071F, -0.1843F, 2.0F, 15.0F, 5.0F, 0.0F, false);

		bone6_r6 = new ModelRenderer(this);
		bone6_r6.setRotationPoint(1.9946F, 8.1071F, -2.4153F);
		bone6.addChild(bone6_r6);
		setRotationAngle(bone6_r6, -0.5061F, 0.0F, 0.0F);
		bone6_r6.setTextureOffset(321, 369).addBox(-6.4946F, -8.1853F, -4.0704F, 9.0F, 5.0F, 3.0F, 0.0F, false);

		bone7 = new ModelRenderer(this);
		bone7.setRotationPoint(-0.125F, 16.4318F, -3.5593F);
		bone6.addChild(bone7);

		bone7_r1 = new ModelRenderer(this);
		bone7_r1.setRotationPoint(3.4835F, 4.5682F, -3.9407F);
		bone7.addChild(bone7_r1);
		setRotationAngle(bone7_r1, -0.2182F, 0.0F, 0.0F);
		bone7_r1.setTextureOffset(416, 459).addBox(-6.8585F, -4.5F, -0.7582F, 7.0F, 21.0F, 2.0F, 0.0F, false);

		bone7_r2 = new ModelRenderer(this);
		bone7_r2.setRotationPoint(5.4835F, 4.5682F, -3.4407F);
		bone7.addChild(bone7_r2);
		setRotationAngle(bone7_r2, -0.6372F, -0.2705F, 0.9494F);
		bone7_r2.setTextureOffset(209, 285).addBox(1.9436F, 1.592F, -0.8823F, 2.0F, 2.0F, 2.0F, 0.0F, false);
		bone7_r2.setTextureOffset(290, 75).addBox(-5.8346F, -6.1862F, -0.8823F, 2.0F, 2.0F, 2.0F, 0.0F, false);

		bone7_r3 = new ModelRenderer(this);
		bone7_r3.setRotationPoint(5.4835F, 4.5682F, -3.4407F);
		bone7.addChild(bone7_r3);
		setRotationAngle(bone7_r3, -0.2725F, -0.6364F, 0.1646F);
		bone7_r3.setTextureOffset(332, 321).addBox(-1.7514F, -6.5F, -0.8723F, 4.0F, 11.0F, 2.0F, 0.0F, false);

		bone7_r4 = new ModelRenderer(this);
		bone7_r4.setRotationPoint(-5.2334F, 4.5682F, -3.4407F);
		bone7.addChild(bone7_r4);
		setRotationAngle(bone7_r4, -0.6372F, 0.2705F, -0.9494F);
		bone7_r4.setTextureOffset(299, 0).addBox(3.0062F, -6.1862F, -0.8823F, 2.0F, 2.0F, 2.0F, 0.0F, false);
		bone7_r4.setTextureOffset(299, 4).addBox(-4.772F, 1.592F, -0.8823F, 2.0F, 2.0F, 2.0F, 0.0F, false);

		bone7_r5 = new ModelRenderer(this);
		bone7_r5.setRotationPoint(-5.2334F, 4.5682F, -3.4407F);
		bone7.addChild(bone7_r5);
		setRotationAngle(bone7_r5, -0.2725F, 0.6364F, -0.1646F);
		bone7_r5.setTextureOffset(357, 241).addBox(-2.2486F, -6.5F, -0.8723F, 4.0F, 11.0F, 2.0F, 0.0F, false);

		bone7_r6 = new ModelRenderer(this);
		bone7_r6.setRotationPoint(-3.2334F, 17.5682F, -6.9407F);
		bone7.addChild(bone7_r6);
		setRotationAngle(bone7_r6, -0.6372F, 0.2705F, -0.9494F);
		bone7_r6.setTextureOffset(50, 300).addBox(-4.772F, 1.592F, -0.8823F, 2.0F, 2.0F, 2.0F, 0.0F, false);
		bone7_r6.setTextureOffset(89, 310).addBox(3.0062F, -6.1862F, -0.8823F, 2.0F, 2.0F, 2.0F, 0.0F, false);

		bone7_r7 = new ModelRenderer(this);
		bone7_r7.setRotationPoint(3.4835F, 17.5682F, -6.9407F);
		bone7.addChild(bone7_r7);
		setRotationAngle(bone7_r7, -0.6372F, -0.2705F, 0.9494F);
		bone7_r7.setTextureOffset(50, 304).addBox(1.9436F, 1.592F, -0.8823F, 2.0F, 2.0F, 2.0F, 0.0F, false);
		bone7_r7.setTextureOffset(114, 310).addBox(-5.8346F, -6.1862F, -0.8823F, 2.0F, 2.0F, 2.0F, 0.0F, false);

		bone7_r8 = new ModelRenderer(this);
		bone7_r8.setRotationPoint(3.4835F, 17.5682F, -6.9407F);
		bone7.addChild(bone7_r8);
		setRotationAngle(bone7_r8, -0.2725F, -0.6364F, 0.1646F);
		bone7_r8.setTextureOffset(0, 361).addBox(-1.7514F, -6.5F, -0.8723F, 4.0F, 11.0F, 2.0F, 0.0F, false);

		bone7_r9 = new ModelRenderer(this);
		bone7_r9.setRotationPoint(-3.2334F, 17.5682F, -6.9407F);
		bone7.addChild(bone7_r9);
		setRotationAngle(bone7_r9, -0.2725F, 0.6364F, -0.1646F);
		bone7_r9.setTextureOffset(31, 361).addBox(-2.2486F, -6.5F, -0.8723F, 4.0F, 11.0F, 2.0F, 0.0F, false);

		bone5 = new ModelRenderer(this);
		bone5.setRotationPoint(10.4071F, -21.2101F, 15.8569F);
		xiabanshen.addChild(bone5);
		setRotationAngle(bone5, 0.1309F, 0.0F, 0.0F);

		bone5_r1 = new ModelRenderer(this);
		bone5_r1.setRotationPoint(5.0F, 46.9702F, -1.455F);
		bone5.addChild(bone5_r1);
		setRotationAngle(bone5_r1, 0.5806F, -0.4323F, -0.0608F);
		bone5_r1.setTextureOffset(266, 60).addBox(3.2693F, -24.4572F, 18.2454F, 2.0F, 2.0F, 2.0F, 0.0F, false);
		bone5_r1.setTextureOffset(41, 165).addBox(5.2693F, -19.0599F, 16.0246F, 1.0F, 2.0F, 2.0F, 0.0F, false);
		bone5_r1.setTextureOffset(49, 165).addBox(5.2794F, -23.6561F, 20.6208F, 1.0F, 2.0F, 2.0F, 0.0F, false);

		bone5_r2 = new ModelRenderer(this);
		bone5_r2.setRotationPoint(5.0F, 46.9702F, -1.455F);
		bone5.addChild(bone5_r2);
		setRotationAngle(bone5_r2, -0.2048F, -0.4323F, -0.0608F);
		bone5_r2.setTextureOffset(422, 103).addBox(5.2693F, -31.3085F, -2.1463F, 1.0F, 6.0F, 4.0F, 0.0F, false);
		bone5_r2.setTextureOffset(410, 490).addBox(3.2694F, -42.6953F, -4.3924F, 2.0F, 12.0F, 4.0F, 0.0F, false);

		bone5_r3 = new ModelRenderer(this);
		bone5_r3.setRotationPoint(5.0F, 46.9702F, -1.455F);
		bone5.addChild(bone5_r3);
		setRotationAngle(bone5_r3, 0.1826F, -0.259F, -0.1465F);
		bone5_r3.setTextureOffset(298, 466).addBox(4.7665F, -35.9208F, 3.8654F, 2.0F, 19.0F, 5.0F, 0.0F, false);

		bone5_r4 = new ModelRenderer(this);
		bone5_r4.setRotationPoint(5.0F, 46.9702F, -1.455F);
		bone5.addChild(bone5_r4);
		setRotationAngle(bone5_r4, 0.5317F, -0.259F, -0.1465F);
		bone5_r4.setTextureOffset(150, 382).addBox(4.2029F, -37.1216F, 15.7829F, 3.0F, 9.0F, 6.0F, 0.0F, false);

		bone5_r5 = new ModelRenderer(this);
		bone5_r5.setRotationPoint(5.0F, 46.9702F, -1.455F);
		bone5.addChild(bone5_r5);
		setRotationAngle(bone5_r5, 0.7029F, -0.2624F, -0.1382F);
		bone5_r5.setTextureOffset(491, 195).addBox(1.9448F, -38.3135F, 25.8981F, 6.0F, 7.0F, 2.0F, 0.0F, false);
		bone5_r5.setTextureOffset(29, 0).addBox(4.6948F, -37.3135F, 26.8981F, 3.0F, 11.0F, 6.0F, 0.0F, false);
		bone5_r5.setTextureOffset(49, 268).addBox(2.1948F, -37.3135F, 26.8981F, 2.0F, 11.0F, 6.0F, 0.0F, false);

		bone8 = new ModelRenderer(this);
		bone8.setRotationPoint(-10.9071F, -21.2101F, 15.8569F);
		xiabanshen.addChild(bone8);
		setRotationAngle(bone8, 0.1309F, 0.0F, 0.0F);

		bone8_r1 = new ModelRenderer(this);
		bone8_r1.setRotationPoint(-5.0F, 46.9702F, -1.455F);
		bone8.addChild(bone8_r1);
		setRotationAngle(bone8_r1, 0.5806F, 0.4323F, 0.0608F);
		bone8_r1.setTextureOffset(172, 176).addBox(-5.2693F, -24.4572F, 18.2454F, 2.0F, 2.0F, 2.0F, 0.0F, false);
		bone8_r1.setTextureOffset(0, 165).addBox(-6.5193F, -19.0599F, 16.0246F, 1.0F, 2.0F, 2.0F, 0.0F, false);
		bone8_r1.setTextureOffset(24, 165).addBox(-6.5294F, -23.6561F, 20.6208F, 1.0F, 2.0F, 2.0F, 0.0F, false);

		bone8_r2 = new ModelRenderer(this);
		bone8_r2.setRotationPoint(-5.0F, 46.9702F, -1.455F);
		bone8.addChild(bone8_r2);
		setRotationAngle(bone8_r2, -0.2048F, 0.4323F, 0.0608F);
		bone8_r2.setTextureOffset(54, 414).addBox(-6.5494F, -31.3085F, -2.1463F, 1.0F, 6.0F, 4.0F, 0.0F, false);
		bone8_r2.setTextureOffset(282, 387).addBox(-5.2794F, -42.6953F, -4.3924F, 2.0F, 12.0F, 4.0F, 0.0F, false);

		bone8_r3 = new ModelRenderer(this);
		bone8_r3.setRotationPoint(-5.0F, 46.9702F, -1.455F);
		bone8.addChild(bone8_r3);
		setRotationAngle(bone8_r3, 0.1826F, 0.259F, 0.1465F);
		bone8_r3.setTextureOffset(307, 134).addBox(-6.7665F, -35.9208F, 3.8654F, 2.0F, 19.0F, 5.0F, 0.0F, false);

		bone8_r4 = new ModelRenderer(this);
		bone8_r4.setRotationPoint(-5.0F, 46.9702F, -1.455F);
		bone8.addChild(bone8_r4);
		setRotationAngle(bone8_r4, 0.5317F, 0.259F, 0.1465F);
		bone8_r4.setTextureOffset(106, 382).addBox(-7.2029F, -37.1216F, 15.7829F, 3.0F, 9.0F, 6.0F, 0.0F, false);

		bone8_r5 = new ModelRenderer(this);
		bone8_r5.setRotationPoint(-5.0F, 46.9702F, -1.455F);
		bone8.addChild(bone8_r5);
		setRotationAngle(bone8_r5, 0.7029F, 0.2624F, 0.1382F);
		bone8_r5.setTextureOffset(109, 265).addBox(-8.1948F, -38.3135F, 25.8981F, 6.0F, 7.0F, 2.0F, 0.0F, false);
		bone8_r5.setTextureOffset(0, 0).addBox(-7.6948F, -37.3135F, 26.8981F, 3.0F, 11.0F, 6.0F, 0.0F, false);
		bone8_r5.setTextureOffset(30, 268).addBox(-4.1948F, -37.3135F, 26.8981F, 2.0F, 11.0F, 6.0F, 0.0F, false);
	}

	@Override
	public void setRotationAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks,
			float netHeadYaw, float headPitch) {
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		xiabanshen.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}