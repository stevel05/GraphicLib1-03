package com.stevel05.rtest;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.debug.*;

public class gltext extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("com.stevel05.rtest", "com.stevel05.rtest.gltext", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", com.stevel05.rtest.gltext.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4j.object.JavaObject _tjo = null;
public Object _mtag = null;
public com.stevel05.rtest.glshape_static _glshape_static = null;
public anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper  _asnode() throws Exception{
 //BA.debugLineNum = 147;BA.debugLine="Public Sub AsNode As Node";
 //BA.debugLineNum = 148;BA.debugLine="Return TJO";
if (true) return (anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_tjo.getObject()));
 //BA.debugLineNum = 149;BA.debugLine="End Sub";
return null;
}
public String  _bringtofront() throws Exception{
 //BA.debugLineNum = 292;BA.debugLine="Sub BringToFront";
 //BA.debugLineNum = 293;BA.debugLine="TJO.RunMethod(\"toFront\",Null)";
_tjo.RunMethod("toFront",(Object[])(__c.Null));
 //BA.debugLineNum = 294;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 5;BA.debugLine="Private TJO As JavaObject";
_tjo = new anywheresoftware.b4j.object.JavaObject();
 //BA.debugLineNum = 6;BA.debugLine="Private mTag As Object";
_mtag = new Object();
 //BA.debugLineNum = 7;BA.debugLine="End Sub";
return "";
}
public String  _create() throws Exception{
 //BA.debugLineNum = 16;BA.debugLine="Public Sub Create()";
 //BA.debugLineNum = 17;BA.debugLine="TJO.InitializeNewInstance(\"javafx.scene.text.Text";
_tjo.InitializeNewInstance("javafx.scene.text.Text",(Object[])(__c.Null));
 //BA.debugLineNum = 18;BA.debugLine="End Sub";
return "";
}
public String  _create2(double _x,double _y,String _text) throws Exception{
 //BA.debugLineNum = 21;BA.debugLine="Public Sub Create2(X As Double, Y As Double, Text";
 //BA.debugLineNum = 22;BA.debugLine="TJO.InitializeNewInstance(\"javafx.scene.text.Text";
_tjo.InitializeNewInstance("javafx.scene.text.Text",new Object[]{(Object)(_x),(Object)(_y),(Object)(_text)});
 //BA.debugLineNum = 23;BA.debugLine="End Sub";
return "";
}
public String  _create3(String _text) throws Exception{
 //BA.debugLineNum = 26;BA.debugLine="Public Sub Create3(Text As String)";
 //BA.debugLineNum = 27;BA.debugLine="TJO.InitializeNewInstance(\"javafx.scene.text.Text";
_tjo.InitializeNewInstance("javafx.scene.text.Text",new Object[]{(Object)(_text)});
 //BA.debugLineNum = 28;BA.debugLine="End Sub";
return "";
}
public double  _getbaselineoffset() throws Exception{
 //BA.debugLineNum = 31;BA.debugLine="Public Sub getBaselineOffset As Double";
 //BA.debugLineNum = 32;BA.debugLine="Return TJO.RunMethod(\"getBaselineOffset\",Null)";
if (true) return (double)(BA.ObjectToNumber(_tjo.RunMethod("getBaselineOffset",(Object[])(__c.Null))));
 //BA.debugLineNum = 33;BA.debugLine="End Sub";
return 0;
}
public String  _getboundstype() throws Exception{
 //BA.debugLineNum = 35;BA.debugLine="Public Sub getBoundsType As String";
 //BA.debugLineNum = 36;BA.debugLine="Return TJO.RunMethodJO(\"getBoundsType\",Null).RunM";
if (true) return BA.ObjectToString(_tjo.RunMethodJO("getBoundsType",(Object[])(__c.Null)).RunMethod("toString",(Object[])(__c.Null)));
 //BA.debugLineNum = 37;BA.debugLine="End Sub";
return "";
}
public Object  _getfill() throws Exception{
 //BA.debugLineNum = 173;BA.debugLine="Public Sub getFill As Object";
 //BA.debugLineNum = 174;BA.debugLine="Return TJO.RunMethod(\"getFill\",Null)";
if (true) return _tjo.RunMethod("getFill",(Object[])(__c.Null));
 //BA.debugLineNum = 175;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4j.objects.JFX.FontWrapper  _getfont() throws Exception{
 //BA.debugLineNum = 39;BA.debugLine="Public Sub getFont As Font";
 //BA.debugLineNum = 40;BA.debugLine="Return TJO.RunMethod(\"getFont\",Null)";
if (true) return (anywheresoftware.b4j.objects.JFX.FontWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.JFX.FontWrapper(), (javafx.scene.text.Font)(_tjo.RunMethod("getFont",(Object[])(__c.Null))));
 //BA.debugLineNum = 41;BA.debugLine="End Sub";
return null;
}
public String  _getfontsmoothingtype() throws Exception{
 //BA.debugLineNum = 43;BA.debugLine="Public Sub getFontSmoothingType As String";
 //BA.debugLineNum = 44;BA.debugLine="Return TJO.RunMethodJO(\"getFontSmoothingType\",Nul";
if (true) return BA.ObjectToString(_tjo.RunMethodJO("getFontSmoothingType",(Object[])(__c.Null)).RunMethod("toString",(Object[])(__c.Null)));
 //BA.debugLineNum = 45;BA.debugLine="End Sub";
return "";
}
public String  _getid() throws Exception{
 //BA.debugLineNum = 159;BA.debugLine="Sub getID As String";
 //BA.debugLineNum = 160;BA.debugLine="Return TJO.RunMethod(\"getId\",Null)";
if (true) return BA.ObjectToString(_tjo.RunMethod("getId",(Object[])(__c.Null)));
 //BA.debugLineNum = 161;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4j.object.JavaObject  _getjavaobject() throws Exception{
 //BA.debugLineNum = 150;BA.debugLine="Public Sub getJavaObject As JavaObject";
 //BA.debugLineNum = 151;BA.debugLine="Return TJO";
if (true) return _tjo;
 //BA.debugLineNum = 152;BA.debugLine="End Sub";
return null;
}
public double  _getlayoutx() throws Exception{
 //BA.debugLineNum = 74;BA.debugLine="Public Sub getLayoutX As Double";
 //BA.debugLineNum = 75;BA.debugLine="Return TJO.RunMethod(\"getLayoutX\",Null)";
if (true) return (double)(BA.ObjectToNumber(_tjo.RunMethod("getLayoutX",(Object[])(__c.Null))));
 //BA.debugLineNum = 76;BA.debugLine="End Sub";
return 0;
}
public double  _getlayouty() throws Exception{
 //BA.debugLineNum = 78;BA.debugLine="Public Sub getLayoutY As Double";
 //BA.debugLineNum = 79;BA.debugLine="Return TJO.RunMethod(\"getLayoutY\",Null)";
if (true) return (double)(BA.ObjectToNumber(_tjo.RunMethod("getLayoutY",(Object[])(__c.Null))));
 //BA.debugLineNum = 80;BA.debugLine="End Sub";
return 0;
}
public double  _getminheight() throws Exception{
double _h = 0;
 //BA.debugLineNum = 288;BA.debugLine="Public Sub getMinHeight As Double";
 //BA.debugLineNum = 289;BA.debugLine="Dim H As Double = -1";
_h = -1;
 //BA.debugLineNum = 290;BA.debugLine="Return TJO.RunMethod(\"prefHeight\",Array(H))";
if (true) return (double)(BA.ObjectToNumber(_tjo.RunMethod("prefHeight",new Object[]{(Object)(_h)})));
 //BA.debugLineNum = 291;BA.debugLine="End Sub";
return 0;
}
public double  _getminwidth() throws Exception{
double _h = 0;
 //BA.debugLineNum = 284;BA.debugLine="Public Sub getMinWidth As Double";
 //BA.debugLineNum = 285;BA.debugLine="Dim H As Double = -1";
_h = -1;
 //BA.debugLineNum = 286;BA.debugLine="Return TJO.RunMethod(\"prefWidth\",Array(H))";
if (true) return (double)(BA.ObjectToNumber(_tjo.RunMethod("prefWidth",new Object[]{(Object)(_h)})));
 //BA.debugLineNum = 287;BA.debugLine="End Sub";
return 0;
}
public Object  _getobject() throws Exception{
 //BA.debugLineNum = 144;BA.debugLine="Public Sub getObject As Object";
 //BA.debugLineNum = 145;BA.debugLine="Return TJO";
if (true) return (Object)(_tjo.getObject());
 //BA.debugLineNum = 146;BA.debugLine="End Sub";
return null;
}
public double  _getprefheight() throws Exception{
double _h = 0;
 //BA.debugLineNum = 280;BA.debugLine="Public Sub getPrefHeight As Double";
 //BA.debugLineNum = 281;BA.debugLine="Dim H As Double = -1";
_h = -1;
 //BA.debugLineNum = 282;BA.debugLine="Return TJO.RunMethod(\"prefHeight\",Array(H))";
if (true) return (double)(BA.ObjectToNumber(_tjo.RunMethod("prefHeight",new Object[]{(Object)(_h)})));
 //BA.debugLineNum = 283;BA.debugLine="End Sub";
return 0;
}
public double  _getprefwidth() throws Exception{
double _h = 0;
 //BA.debugLineNum = 276;BA.debugLine="Public Sub getPrefWidth As Double";
 //BA.debugLineNum = 277;BA.debugLine="Dim H As Double = -1";
_h = -1;
 //BA.debugLineNum = 278;BA.debugLine="Return TJO.RunMethod(\"prefWidth\",Array(H))";
if (true) return (double)(BA.ObjectToNumber(_tjo.RunMethod("prefWidth",new Object[]{(Object)(_h)})));
 //BA.debugLineNum = 279;BA.debugLine="End Sub";
return 0;
}
public Object  _getstroke() throws Exception{
 //BA.debugLineNum = 177;BA.debugLine="Public Sub getStroke As Object";
 //BA.debugLineNum = 178;BA.debugLine="Return TJO.RunMethod(\"getStroke\",Null)";
if (true) return _tjo.RunMethod("getStroke",(Object[])(__c.Null));
 //BA.debugLineNum = 179;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.List  _getstrokedasharray() throws Exception{
 //BA.debugLineNum = 181;BA.debugLine="Public Sub getStrokeDashArray As List";
 //BA.debugLineNum = 182;BA.debugLine="Return TJO.RunMethod(\"getStrokeDashArray\",Null)";
if (true) return (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_tjo.RunMethod("getStrokeDashArray",(Object[])(__c.Null))));
 //BA.debugLineNum = 183;BA.debugLine="End Sub";
return null;
}
public double  _getstrokedashoffset() throws Exception{
 //BA.debugLineNum = 185;BA.debugLine="Public Sub getStrokeDashOffset As Double";
 //BA.debugLineNum = 186;BA.debugLine="Return TJO.RunMethod(\"getStrokeDashOffset\",Null)";
if (true) return (double)(BA.ObjectToNumber(_tjo.RunMethod("getStrokeDashOffset",(Object[])(__c.Null))));
 //BA.debugLineNum = 187;BA.debugLine="End Sub";
return 0;
}
public String  _getstrokelinecap() throws Exception{
 //BA.debugLineNum = 189;BA.debugLine="Public Sub getStrokeLineCap As String";
 //BA.debugLineNum = 190;BA.debugLine="Return TJO.RunMethodJO(\"getStrokeLineCap\",Null).R";
if (true) return BA.ObjectToString(_tjo.RunMethodJO("getStrokeLineCap",(Object[])(__c.Null)).RunMethod("toString",(Object[])(__c.Null)));
 //BA.debugLineNum = 191;BA.debugLine="End Sub";
return "";
}
public String  _getstrokelinejoin() throws Exception{
 //BA.debugLineNum = 193;BA.debugLine="Public Sub getStrokeLineJoin As String";
 //BA.debugLineNum = 194;BA.debugLine="Return TJO.RunMethodJO(\"getStrokeLineJoin\",Null).";
if (true) return BA.ObjectToString(_tjo.RunMethodJO("getStrokeLineJoin",(Object[])(__c.Null)).RunMethod("toString",(Object[])(__c.Null)));
 //BA.debugLineNum = 195;BA.debugLine="End Sub";
return "";
}
public double  _getstrokemiterlimit() throws Exception{
 //BA.debugLineNum = 197;BA.debugLine="Public Sub getStrokeMiterLimit As Double";
 //BA.debugLineNum = 198;BA.debugLine="Return TJO.RunMethod(\"getStrokeMiterLimit\",Null)";
if (true) return (double)(BA.ObjectToNumber(_tjo.RunMethod("getStrokeMiterLimit",(Object[])(__c.Null))));
 //BA.debugLineNum = 199;BA.debugLine="End Sub";
return 0;
}
public String  _getstroketype() throws Exception{
 //BA.debugLineNum = 201;BA.debugLine="Public Sub getStrokeType As String";
 //BA.debugLineNum = 202;BA.debugLine="Return TJO.RunMethodJO(\"getStrokeType\",Null).RunM";
if (true) return BA.ObjectToString(_tjo.RunMethodJO("getStrokeType",(Object[])(__c.Null)).RunMethod("toString",(Object[])(__c.Null)));
 //BA.debugLineNum = 203;BA.debugLine="End Sub";
return "";
}
public double  _getstrokewidth() throws Exception{
 //BA.debugLineNum = 205;BA.debugLine="Public Sub getStrokeWidth As Double";
 //BA.debugLineNum = 206;BA.debugLine="Return TJO.RunMethod(\"getStrokeWidth\",Null)";
if (true) return (double)(BA.ObjectToNumber(_tjo.RunMethod("getStrokeWidth",(Object[])(__c.Null))));
 //BA.debugLineNum = 207;BA.debugLine="End Sub";
return 0;
}
public String  _getstyle() throws Exception{
 //BA.debugLineNum = 46;BA.debugLine="Sub getStyle As String";
 //BA.debugLineNum = 47;BA.debugLine="Return TJO.RunMethod(\"getStyle\",Null)";
if (true) return BA.ObjectToString(_tjo.RunMethod("getStyle",(Object[])(__c.Null)));
 //BA.debugLineNum = 48;BA.debugLine="End Sub";
return "";
}
public Object  _gettag() throws Exception{
 //BA.debugLineNum = 165;BA.debugLine="Sub getTag As Object";
 //BA.debugLineNum = 166;BA.debugLine="Return mTag";
if (true) return _mtag;
 //BA.debugLineNum = 167;BA.debugLine="End Sub";
return null;
}
public String  _gettext() throws Exception{
 //BA.debugLineNum = 50;BA.debugLine="Public Sub getText As String";
 //BA.debugLineNum = 51;BA.debugLine="Return TJO.RunMethod(\"getText\",Null)";
if (true) return BA.ObjectToString(_tjo.RunMethod("getText",(Object[])(__c.Null)));
 //BA.debugLineNum = 52;BA.debugLine="End Sub";
return "";
}
public String  _gettextalignment() throws Exception{
 //BA.debugLineNum = 54;BA.debugLine="Public Sub getTextAlignment As String";
 //BA.debugLineNum = 55;BA.debugLine="Return TJO.RunMethodJO(\"getTextAlignment\",Null).R";
if (true) return BA.ObjectToString(_tjo.RunMethodJO("getTextAlignment",(Object[])(__c.Null)).RunMethod("toString",(Object[])(__c.Null)));
 //BA.debugLineNum = 56;BA.debugLine="End Sub";
return "";
}
public String  _gettextorigin() throws Exception{
 //BA.debugLineNum = 58;BA.debugLine="Public Sub getTextOrigin As String";
 //BA.debugLineNum = 59;BA.debugLine="Return TJO.RunMethodJO(\"getTextOrigin\",Null).RunM";
if (true) return BA.ObjectToString(_tjo.RunMethodJO("getTextOrigin",(Object[])(__c.Null)).RunMethod("toString",(Object[])(__c.Null)));
 //BA.debugLineNum = 60;BA.debugLine="End Sub";
return "";
}
public double  _getwrappingwidth() throws Exception{
 //BA.debugLineNum = 62;BA.debugLine="Public Sub getWrappingWidth As Double";
 //BA.debugLineNum = 63;BA.debugLine="Return TJO.RunMethod(\"getWrappingWidth\",Null)";
if (true) return (double)(BA.ObjectToNumber(_tjo.RunMethod("getWrappingWidth",(Object[])(__c.Null))));
 //BA.debugLineNum = 64;BA.debugLine="End Sub";
return 0;
}
public double  _getx() throws Exception{
 //BA.debugLineNum = 66;BA.debugLine="Public Sub getX As Double";
 //BA.debugLineNum = 67;BA.debugLine="Return TJO.RunMethod(\"getX\",Null)";
if (true) return (double)(BA.ObjectToNumber(_tjo.RunMethod("getX",(Object[])(__c.Null))));
 //BA.debugLineNum = 68;BA.debugLine="End Sub";
return 0;
}
public double  _gety() throws Exception{
 //BA.debugLineNum = 70;BA.debugLine="Public Sub getY As Double";
 //BA.debugLineNum = 71;BA.debugLine="Return TJO.RunMethod(\"getY\",Null)";
if (true) return (double)(BA.ObjectToNumber(_tjo.RunMethod("getY",(Object[])(__c.Null))));
 //BA.debugLineNum = 72;BA.debugLine="End Sub";
return 0;
}
public String  _initialize(anywheresoftware.b4a.BA _ba) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 10;BA.debugLine="Public Sub Initialize";
 //BA.debugLineNum = 12;BA.debugLine="TJO.InitializeNewInstance(\"javafx.scene.text.Text";
_tjo.InitializeNewInstance("javafx.scene.text.Text",(Object[])(__c.Null));
 //BA.debugLineNum = 13;BA.debugLine="End Sub";
return "";
}
public com.stevel05.rtest.glshape  _intersect(com.stevel05.rtest.gltext _shape1,com.stevel05.rtest.gltext _shape2) throws Exception{
com.stevel05.rtest.glshape _s = null;
 //BA.debugLineNum = 270;BA.debugLine="Public Sub Intersect(Shape1 As GLText, Shape2 As G";
 //BA.debugLineNum = 271;BA.debugLine="Dim S As GLShape";
_s = new com.stevel05.rtest.glshape();
 //BA.debugLineNum = 272;BA.debugLine="S.Initialize";
_s._initialize(ba);
 //BA.debugLineNum = 273;BA.debugLine="Return S.Intersect(Shape1,Shape2)";
if (true) return _s._intersect((Object)(_shape1),(Object)(_shape2));
 //BA.debugLineNum = 274;BA.debugLine="End Sub";
return null;
}
public boolean  _issmooth() throws Exception{
 //BA.debugLineNum = 209;BA.debugLine="Public Sub IsSmooth As Boolean";
 //BA.debugLineNum = 210;BA.debugLine="Return TJO.RunMethod(\"isSmooth\",Null)";
if (true) return BA.ObjectToBoolean(_tjo.RunMethod("isSmooth",(Object[])(__c.Null)));
 //BA.debugLineNum = 211;BA.debugLine="End Sub";
return false;
}
public boolean  _isstrikethrough() throws Exception{
 //BA.debugLineNum = 82;BA.debugLine="Public Sub IsStrikethrough As Boolean";
 //BA.debugLineNum = 83;BA.debugLine="Return TJO.RunMethod(\"isStrikethrough\",Null)";
if (true) return BA.ObjectToBoolean(_tjo.RunMethod("isStrikethrough",(Object[])(__c.Null)));
 //BA.debugLineNum = 84;BA.debugLine="End Sub";
return false;
}
public boolean  _isunderline() throws Exception{
 //BA.debugLineNum = 86;BA.debugLine="Public Sub IsUnderline As Boolean";
 //BA.debugLineNum = 87;BA.debugLine="Return TJO.RunMethod(\"isUnderline\",Null)";
if (true) return BA.ObjectToBoolean(_tjo.RunMethod("isUnderline",(Object[])(__c.Null)));
 //BA.debugLineNum = 88;BA.debugLine="End Sub";
return false;
}
public String  _setboundstype(String _value) throws Exception{
anywheresoftware.b4j.object.JavaObject _jo = null;
 //BA.debugLineNum = 90;BA.debugLine="Public Sub setBoundsType(Value As String)";
 //BA.debugLineNum = 91;BA.debugLine="Dim JO As JavaObject";
_jo = new anywheresoftware.b4j.object.JavaObject();
 //BA.debugLineNum = 92;BA.debugLine="JO.InitializeStatic(\"javafx.scene.text.TextBounds";
_jo.InitializeStatic("javafx.scene.text.TextBoundsType");
 //BA.debugLineNum = 93;BA.debugLine="TJO.RunMethod(\"setBoundsType\",Array As Object(JO.";
_tjo.RunMethod("setBoundsType",new Object[]{_jo.RunMethod("valueOf",new Object[]{(Object)(_value)})});
 //BA.debugLineNum = 94;BA.debugLine="End Sub";
return "";
}
public String  _setfill(Object _value) throws Exception{
 //BA.debugLineNum = 213;BA.debugLine="Public Sub setFill(Value As Object)";
 //BA.debugLineNum = 214;BA.debugLine="TJO.RunMethod(\"setFill\",Array As Object(Value))";
_tjo.RunMethod("setFill",new Object[]{_value});
 //BA.debugLineNum = 215;BA.debugLine="End Sub";
return "";
}
public String  _setfont(anywheresoftware.b4j.objects.JFX.FontWrapper _value) throws Exception{
 //BA.debugLineNum = 96;BA.debugLine="Public Sub setFont(Value As Font)";
 //BA.debugLineNum = 97;BA.debugLine="TJO.RunMethod(\"setFont\",Array As Object(Value))";
_tjo.RunMethod("setFont",new Object[]{(Object)(_value.getObject())});
 //BA.debugLineNum = 98;BA.debugLine="End Sub";
return "";
}
public String  _setfontsmoothingtype(String _value) throws Exception{
anywheresoftware.b4j.object.JavaObject _jo = null;
 //BA.debugLineNum = 100;BA.debugLine="Public Sub setFontSmoothingType(Value As String)";
 //BA.debugLineNum = 101;BA.debugLine="Dim JO As JavaObject";
_jo = new anywheresoftware.b4j.object.JavaObject();
 //BA.debugLineNum = 102;BA.debugLine="JO.InitializeStatic(\"javafx.scene.text.FontSmooth";
_jo.InitializeStatic("javafx.scene.text.FontSmoothingType");
 //BA.debugLineNum = 103;BA.debugLine="TJO.RunMethod(\"setFontSmoothingType\",Array As Obj";
_tjo.RunMethod("setFontSmoothingType",new Object[]{_jo.RunMethod("valueOf",new Object[]{(Object)(_value)})});
 //BA.debugLineNum = 104;BA.debugLine="End Sub";
return "";
}
public String  _setid(String _id) throws Exception{
 //BA.debugLineNum = 156;BA.debugLine="Sub setID(ID As String)";
 //BA.debugLineNum = 157;BA.debugLine="TJO.RunMethod(\"setId\",Array(ID))";
_tjo.RunMethod("setId",new Object[]{(Object)(_id)});
 //BA.debugLineNum = 158;BA.debugLine="End Sub";
return "";
}
public String  _setobject(Object _obj) throws Exception{
 //BA.debugLineNum = 153;BA.debugLine="Public Sub setObject(Obj As Object)";
 //BA.debugLineNum = 154;BA.debugLine="TJO = Obj";
_tjo.setObject((java.lang.Object)(_obj));
 //BA.debugLineNum = 155;BA.debugLine="End Sub";
return "";
}
public String  _setsmooth(boolean _value) throws Exception{
 //BA.debugLineNum = 217;BA.debugLine="Public Sub setSmooth(Value As Boolean)";
 //BA.debugLineNum = 218;BA.debugLine="TJO.RunMethod(\"setSmooth\",Array As Object(Value))";
_tjo.RunMethod("setSmooth",new Object[]{(Object)(_value)});
 //BA.debugLineNum = 219;BA.debugLine="End Sub";
return "";
}
public String  _setstrikethrough(boolean _value) throws Exception{
 //BA.debugLineNum = 106;BA.debugLine="Public Sub setStrikethrough(Value As Boolean)";
 //BA.debugLineNum = 107;BA.debugLine="TJO.RunMethod(\"setStrikethrough\",Array As Object(";
_tjo.RunMethod("setStrikethrough",new Object[]{(Object)(_value)});
 //BA.debugLineNum = 108;BA.debugLine="End Sub";
return "";
}
public String  _setstroke(Object _value) throws Exception{
 //BA.debugLineNum = 221;BA.debugLine="Public Sub setStroke(Value As Object)";
 //BA.debugLineNum = 222;BA.debugLine="TJO.RunMethod(\"setStroke\",Array As Object(Value))";
_tjo.RunMethod("setStroke",new Object[]{_value});
 //BA.debugLineNum = 223;BA.debugLine="End Sub";
return "";
}
public String  _setstrokedashoffset(double _value) throws Exception{
 //BA.debugLineNum = 225;BA.debugLine="Public Sub setStrokeDashOffset(Value As Double)";
 //BA.debugLineNum = 226;BA.debugLine="TJO.RunMethod(\"setStrokeDashOffset\",Array As Obje";
_tjo.RunMethod("setStrokeDashOffset",new Object[]{(Object)(_value)});
 //BA.debugLineNum = 227;BA.debugLine="End Sub";
return "";
}
public String  _setstrokelinecap(String _value) throws Exception{
com.stevel05.rtest.glshape _s = null;
 //BA.debugLineNum = 229;BA.debugLine="Public Sub setStrokeLineCap(Value As String)";
 //BA.debugLineNum = 230;BA.debugLine="Dim S As GLShape";
_s = new com.stevel05.rtest.glshape();
 //BA.debugLineNum = 231;BA.debugLine="S.Initialize";
_s._initialize(ba);
 //BA.debugLineNum = 232;BA.debugLine="S.setObject(TJO)";
_s._setobject(_tjo);
 //BA.debugLineNum = 233;BA.debugLine="S.setStrokeLineCap(Value)";
_s._setstrokelinecap(_value);
 //BA.debugLineNum = 234;BA.debugLine="End Sub";
return "";
}
public String  _setstrokelinejoin(String _value) throws Exception{
com.stevel05.rtest.glshape _s = null;
 //BA.debugLineNum = 236;BA.debugLine="Public Sub setStrokeLineJoin(Value As String)";
 //BA.debugLineNum = 237;BA.debugLine="Dim S As GLShape";
_s = new com.stevel05.rtest.glshape();
 //BA.debugLineNum = 238;BA.debugLine="S.Initialize";
_s._initialize(ba);
 //BA.debugLineNum = 239;BA.debugLine="S.setObject(TJO)";
_s._setobject(_tjo);
 //BA.debugLineNum = 240;BA.debugLine="S.setStrokeLineJoin(Value)";
_s._setstrokelinejoin(_value);
 //BA.debugLineNum = 241;BA.debugLine="End Sub";
return "";
}
public String  _setstrokemiterlimit(double _value) throws Exception{
 //BA.debugLineNum = 243;BA.debugLine="Public Sub setStrokeMiterLimit(Value As Double)";
 //BA.debugLineNum = 244;BA.debugLine="TJO.RunMethod(\"setStrokeMiterLimit\",Array As Obje";
_tjo.RunMethod("setStrokeMiterLimit",new Object[]{(Object)(_value)});
 //BA.debugLineNum = 245;BA.debugLine="End Sub";
return "";
}
public String  _setstroketype(String _value) throws Exception{
com.stevel05.rtest.glshape _s = null;
 //BA.debugLineNum = 247;BA.debugLine="Public Sub setStrokeType(Value As String)";
 //BA.debugLineNum = 248;BA.debugLine="Dim S As GLShape";
_s = new com.stevel05.rtest.glshape();
 //BA.debugLineNum = 249;BA.debugLine="S.Initialize";
_s._initialize(ba);
 //BA.debugLineNum = 250;BA.debugLine="S.setObject(TJO)";
_s._setobject(_tjo);
 //BA.debugLineNum = 251;BA.debugLine="S.setStrokeType(Value)";
_s._setstroketype(_value);
 //BA.debugLineNum = 252;BA.debugLine="End Sub";
return "";
}
public String  _setstrokewidth(double _value) throws Exception{
 //BA.debugLineNum = 254;BA.debugLine="Public Sub setStrokeWidth(Value As Double)";
 //BA.debugLineNum = 255;BA.debugLine="TJO.RunMethod(\"setStrokeWidth\",Array As Object(Va";
_tjo.RunMethod("setStrokeWidth",new Object[]{(Object)(_value)});
 //BA.debugLineNum = 256;BA.debugLine="End Sub";
return "";
}
public String  _setstyle(String _style) throws Exception{
 //BA.debugLineNum = 109;BA.debugLine="Sub setStyle(Style As String)";
 //BA.debugLineNum = 110;BA.debugLine="TJO.RunMethod(\"setStyle\",Array(Style))";
_tjo.RunMethod("setStyle",new Object[]{(Object)(_style)});
 //BA.debugLineNum = 111;BA.debugLine="End Sub";
return "";
}
public String  _settag(Object _tag) throws Exception{
 //BA.debugLineNum = 162;BA.debugLine="Sub setTag(Tag As Object)";
 //BA.debugLineNum = 163;BA.debugLine="mTag = Tag";
_mtag = _tag;
 //BA.debugLineNum = 164;BA.debugLine="End Sub";
return "";
}
public String  _settext(String _value) throws Exception{
 //BA.debugLineNum = 113;BA.debugLine="Public Sub setText(Value As String)";
 //BA.debugLineNum = 114;BA.debugLine="TJO.RunMethod(\"setText\",Array As Object(Value))";
_tjo.RunMethod("setText",new Object[]{(Object)(_value)});
 //BA.debugLineNum = 115;BA.debugLine="End Sub";
return "";
}
public String  _settextalignment(String _value) throws Exception{
anywheresoftware.b4j.object.JavaObject _jo = null;
 //BA.debugLineNum = 117;BA.debugLine="Public Sub setTextAlignment(Value As String)";
 //BA.debugLineNum = 118;BA.debugLine="Dim JO As JavaObject";
_jo = new anywheresoftware.b4j.object.JavaObject();
 //BA.debugLineNum = 119;BA.debugLine="JO.InitializeStatic(\"javafx.scene.text.TextAlignm";
_jo.InitializeStatic("javafx.scene.text.TextAlignment");
 //BA.debugLineNum = 120;BA.debugLine="TJO.RunMethod(\"setTextAlignment\",Array As Object(";
_tjo.RunMethod("setTextAlignment",new Object[]{_jo.RunMethod("valueOf",new Object[]{(Object)(_value)})});
 //BA.debugLineNum = 121;BA.debugLine="End Sub";
return "";
}
public String  _settextorigin(String _value) throws Exception{
anywheresoftware.b4j.object.JavaObject _jo = null;
 //BA.debugLineNum = 123;BA.debugLine="Public Sub setTextOrigin(Value As String)";
 //BA.debugLineNum = 124;BA.debugLine="Dim JO As JavaObject";
_jo = new anywheresoftware.b4j.object.JavaObject();
 //BA.debugLineNum = 125;BA.debugLine="JO.InitializeStatic(\"javafx.geometry.VPos\")";
_jo.InitializeStatic("javafx.geometry.VPos");
 //BA.debugLineNum = 126;BA.debugLine="TJO.RunMethod(\"setTextOrigin\",Array As Object(JO.";
_tjo.RunMethod("setTextOrigin",new Object[]{_jo.RunMethod("valueOf",new Object[]{(Object)(_value)})});
 //BA.debugLineNum = 127;BA.debugLine="End Sub";
return "";
}
public String  _setunderline(boolean _value) throws Exception{
 //BA.debugLineNum = 129;BA.debugLine="Public Sub setUnderline(Value As Boolean)";
 //BA.debugLineNum = 130;BA.debugLine="TJO.RunMethod(\"setUnderline\",Array As Object(Valu";
_tjo.RunMethod("setUnderline",new Object[]{(Object)(_value)});
 //BA.debugLineNum = 131;BA.debugLine="End Sub";
return "";
}
public String  _setwrappingwidth(double _value) throws Exception{
 //BA.debugLineNum = 133;BA.debugLine="Public Sub setWrappingWidth(Value As Double)";
 //BA.debugLineNum = 134;BA.debugLine="TJO.RunMethod(\"setWrappingWidth\",Array As Object(";
_tjo.RunMethod("setWrappingWidth",new Object[]{(Object)(_value)});
 //BA.debugLineNum = 135;BA.debugLine="End Sub";
return "";
}
public String  _setx(double _value) throws Exception{
 //BA.debugLineNum = 137;BA.debugLine="Public Sub setX(Value As Double)";
 //BA.debugLineNum = 138;BA.debugLine="TJO.RunMethod(\"setLayoutX\",Array As Object(Value)";
_tjo.RunMethod("setLayoutX",new Object[]{(Object)(_value)});
 //BA.debugLineNum = 139;BA.debugLine="End Sub";
return "";
}
public String  _sety(double _value) throws Exception{
 //BA.debugLineNum = 141;BA.debugLine="Public Sub setY(Value As Double)";
 //BA.debugLineNum = 142;BA.debugLine="TJO.RunMethod(\"setLayoutY\",Array As Object(Value)";
_tjo.RunMethod("setLayoutY",new Object[]{(Object)(_value)});
 //BA.debugLineNum = 143;BA.debugLine="End Sub";
return "";
}
public com.stevel05.rtest.glshape  _subtract(com.stevel05.rtest.gltext _shape1,com.stevel05.rtest.gltext _shape2) throws Exception{
com.stevel05.rtest.glshape _s = null;
 //BA.debugLineNum = 258;BA.debugLine="Public Sub Subtract(Shape1 As GLText, Shape2 As GL";
 //BA.debugLineNum = 259;BA.debugLine="Dim S As GLShape";
_s = new com.stevel05.rtest.glshape();
 //BA.debugLineNum = 260;BA.debugLine="S.Initialize";
_s._initialize(ba);
 //BA.debugLineNum = 261;BA.debugLine="Return S.Subtract(Shape1,Shape2)";
if (true) return _s._subtract((Object)(_shape1),(Object)(_shape2));
 //BA.debugLineNum = 262;BA.debugLine="End Sub";
return null;
}
public com.stevel05.rtest.glshape  _union(com.stevel05.rtest.gltext _shape1,com.stevel05.rtest.gltext _shape2) throws Exception{
com.stevel05.rtest.glshape _s = null;
 //BA.debugLineNum = 264;BA.debugLine="Public Sub Union(Shape1 As GLText, Shape2 As GLTex";
 //BA.debugLineNum = 265;BA.debugLine="Dim S As GLShape";
_s = new com.stevel05.rtest.glshape();
 //BA.debugLineNum = 266;BA.debugLine="S.Initialize";
_s._initialize(ba);
 //BA.debugLineNum = 267;BA.debugLine="Return S.Union(Shape1,Shape2)";
if (true) return _s._union((Object)(_shape1),(Object)(_shape2));
 //BA.debugLineNum = 268;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
