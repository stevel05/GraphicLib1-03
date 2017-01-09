package com.stevel05.rtest;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.debug.*;

public class glshape_static extends Object{
public static glshape_static mostCurrent = new glshape_static();

public static BA ba;
static {
		ba = new  anywheresoftware.b4j.objects.FxBA("com.stevel05.rtest", "com.stevel05.rtest.glshape_static", null);
		ba.loadHtSubs(glshape_static.class);
        if (ba.getClass().getName().endsWith("ShellBA")) {
			
			ba.raiseEvent2(null, true, "SHELL", false);
			ba.raiseEvent2(null, true, "CREATE", true, "com.stevel05.rtest.glshape_static", ba);
		}
	}
    public static Class<?> getObject() {
		return glshape_static.class;
	}

 public static anywheresoftware.b4a.keywords.Common __c = null;
public static anywheresoftware.b4j.objects.JFX _fx = null;
public static String _strokelinecap_butt = "";
public static String _strokelinecap_round = "";
public static String _strokelinecap_square = "";
public static String _strokelinejoin_bevel = "";
public static String _strokelinejoin_miter = "";
public static String _strokelinejoin_round = "";
public static String _stroketype_centered = "";
public static String _stroketype_inside = "";
public static String _stroketype_outside = "";
public static String _fillrule_even_odd = "";
public static String _fillrule_non_zero = "";
public static String _arctype_chord = "";
public static String _arctype_open = "";
public static String _arctype_round = "";
public static String _textbounds_logical = "";
public static String _textbounds_visual = "";
public static String _fontsmoothing_gray = "";
public static String _fontsmoothing_lcd = "";
public static String _textalignment_center = "";
public static String _textalignment_justify = "";
public static String _textalignment_left = "";
public static String _textalignment_right = "";
public static String _textorigin_baseline = "";
public static String _textorigin_bottom = "";
public static String _textorigin_center = "";
public static String _textorigin_top = "";
public static String _cyclemethod_no_cycle = "";
public static String _cyclemethod_reflect = "";
public static String _cyclemethod_repeat = "";
public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Private fx As JFX";
_fx = new anywheresoftware.b4j.objects.JFX();
 //BA.debugLineNum = 4;BA.debugLine="Public Const STROKELINECAP_BUTT As String = \"BUTT";
_strokelinecap_butt = "BUTT";
 //BA.debugLineNum = 5;BA.debugLine="Public Const STROKELINECAP_ROUND As String = \"ROU";
_strokelinecap_round = "ROUND";
 //BA.debugLineNum = 6;BA.debugLine="Public Const STROKELINECAP_SQUARE As String = \"SQ";
_strokelinecap_square = "SQUARE";
 //BA.debugLineNum = 8;BA.debugLine="Public Const STROKELINEJOIN_BEVEL As String = \"BE";
_strokelinejoin_bevel = "BEVEL";
 //BA.debugLineNum = 9;BA.debugLine="Public Const STROKELINEJOIN_MITER As String = \"MI";
_strokelinejoin_miter = "MITER";
 //BA.debugLineNum = 10;BA.debugLine="Public Const STROKELINEJOIN_ROUND As String = \"RO";
_strokelinejoin_round = "ROUND";
 //BA.debugLineNum = 12;BA.debugLine="Public Const STROKETYPE_CENTERED As String = \"CEN";
_stroketype_centered = "CENTERED";
 //BA.debugLineNum = 13;BA.debugLine="Public Const STROKETYPE_INSIDE As String = \"INSID";
_stroketype_inside = "INSIDE";
 //BA.debugLineNum = 14;BA.debugLine="Public Const STROKETYPE_OUTSIDE As String = \"OUTS";
_stroketype_outside = "OUTSIDE";
 //BA.debugLineNum = 16;BA.debugLine="Public Const FILLRULE_EVEN_ODD As String = \"EVEN_";
_fillrule_even_odd = "EVEN_ODD";
 //BA.debugLineNum = 17;BA.debugLine="Public Const FILLRULE_NON_ZERO As String = \"NON_Z";
_fillrule_non_zero = "NON_ZERO";
 //BA.debugLineNum = 19;BA.debugLine="Public Const ARCTYPE_CHORD As String = \"CHORD\"";
_arctype_chord = "CHORD";
 //BA.debugLineNum = 20;BA.debugLine="Public Const ARCTYPE_OPEN As String = \"OPEN\"";
_arctype_open = "OPEN";
 //BA.debugLineNum = 21;BA.debugLine="Public Const ARCTYPE_ROUND As String = \"ROUND\"";
_arctype_round = "ROUND";
 //BA.debugLineNum = 23;BA.debugLine="Public Const TEXTBOUNDS_LOGICAL As String = \"LOGI";
_textbounds_logical = "LOGICAL";
 //BA.debugLineNum = 24;BA.debugLine="Public Const TEXTBOUNDS_VISUAL As String = \"VISUA";
_textbounds_visual = "VISUAL";
 //BA.debugLineNum = 26;BA.debugLine="Public Const FONTSMOOTHING_GRAY As String = \"GRAY";
_fontsmoothing_gray = "GRAY";
 //BA.debugLineNum = 27;BA.debugLine="Public Const FONTSMOOTHING_LCD As String = \"LCD\"";
_fontsmoothing_lcd = "LCD";
 //BA.debugLineNum = 29;BA.debugLine="Public Const TEXTALIGNMENT_CENTER As String = \"CE";
_textalignment_center = "CENTER";
 //BA.debugLineNum = 30;BA.debugLine="Public Const TEXTALIGNMENT_JUSTIFY As String = \"J";
_textalignment_justify = "JUSTIFY";
 //BA.debugLineNum = 31;BA.debugLine="Public Const TEXTALIGNMENT_LEFT As String = \"LEFT";
_textalignment_left = "LEFT";
 //BA.debugLineNum = 32;BA.debugLine="Public Const TEXTALIGNMENT_RIGHT As String = \"RIG";
_textalignment_right = "RIGHT";
 //BA.debugLineNum = 34;BA.debugLine="Public Const TEXTORIGIN_BASELINE As String = \"BAS";
_textorigin_baseline = "BASELINE";
 //BA.debugLineNum = 35;BA.debugLine="Public Const TEXTORIGIN_BOTTOM As String = \"BOTTO";
_textorigin_bottom = "BOTTOM";
 //BA.debugLineNum = 36;BA.debugLine="Public Const TEXTORIGIN_CENTER As String = \"CENTE";
_textorigin_center = "CENTER";
 //BA.debugLineNum = 37;BA.debugLine="Public Const TEXTORIGIN_TOP As String = \"TOP\"";
_textorigin_top = "TOP";
 //BA.debugLineNum = 39;BA.debugLine="Public Const CYCLEMETHOD_NO_CYCLE As String = \"NO";
_cyclemethod_no_cycle = "NO_CYCLE";
 //BA.debugLineNum = 40;BA.debugLine="Public Const CYCLEMETHOD_REFLECT As String = \"REF";
_cyclemethod_reflect = "REFLECT";
 //BA.debugLineNum = 41;BA.debugLine="Public Const CYCLEMETHOD_REPEAT As String = \"REPE";
_cyclemethod_repeat = "REPEAT";
 //BA.debugLineNum = 45;BA.debugLine="End Sub";
return "";
}
}
