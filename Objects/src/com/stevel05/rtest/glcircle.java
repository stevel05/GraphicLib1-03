package com.stevel05.rtest;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.debug.*;

public class glcircle extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("com.stevel05.rtest", "com.stevel05.rtest.glcircle", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", com.stevel05.rtest.glcircle.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4j.object.JavaObject _tjo = null;
public Object _mtag = null;
public com.stevel05.rtest.glshape_static _glshape_static = null;
public anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper  _asnode() throws Exception{
 //BA.debugLineNum = 74;BA.debugLine="Public Sub AsNode As Node";
 //BA.debugLineNum = 75;BA.debugLine="Return TJO";
if (true) return (anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_tjo.getObject()));
 //BA.debugLineNum = 76;BA.debugLine="End Sub";
return null;
}
public String  _bringtofront() throws Exception{
 //BA.debugLineNum = 214;BA.debugLine="Sub BringToFront";
 //BA.debugLineNum = 215;BA.debugLine="TJO.RunMethod(\"toFront\",Null)";
_tjo.RunMethod("toFront",(Object[])(__c.Null));
 //BA.debugLineNum = 216;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 15;BA.debugLine="Public Sub Create()";
 //BA.debugLineNum = 17;BA.debugLine="TJO.InitializeNewInstance(\"javafx.scene.shape.Cir";
_tjo.InitializeNewInstance("javafx.scene.shape.Circle",(Object[])(__c.Null));
 //BA.debugLineNum = 18;BA.debugLine="End Sub";
return "";
}
public String  _create2(double _radius) throws Exception{
 //BA.debugLineNum = 21;BA.debugLine="Public Sub Create2(Radius As Double)";
 //BA.debugLineNum = 23;BA.debugLine="TJO.InitializeNewInstance(\"javafx.scene.shape.Cir";
_tjo.InitializeNewInstance("javafx.scene.shape.Circle",new Object[]{(Object)(_radius)});
 //BA.debugLineNum = 24;BA.debugLine="End Sub";
return "";
}
public String  _create3(double _centerx,double _centery,double _radius) throws Exception{
 //BA.debugLineNum = 27;BA.debugLine="Public Sub Create3(CenterX As Double, CenterY As D";
 //BA.debugLineNum = 29;BA.debugLine="TJO.InitializeNewInstance(\"javafx.scene.shape.Cir";
_tjo.InitializeNewInstance("javafx.scene.shape.Circle",new Object[]{(Object)(_centerx),(Object)(_centery),(Object)(_radius)});
 //BA.debugLineNum = 30;BA.debugLine="End Sub";
return "";
}
public String  _create4(double _centerx,double _centery,double _radius,anywheresoftware.b4j.object.JavaObject _fill) throws Exception{
 //BA.debugLineNum = 33;BA.debugLine="Public Sub Create4(CenterX As Double, CenterY As D";
 //BA.debugLineNum = 35;BA.debugLine="TJO.InitializeNewInstance(\"javafx.scene.shape.Cir";
_tjo.InitializeNewInstance("javafx.scene.shape.Circle",new Object[]{(Object)(_centerx),(Object)(_centery),(Object)(_radius),(Object)(_fill.getObject())});
 //BA.debugLineNum = 36;BA.debugLine="End Sub";
return "";
}
public String  _create5(double _radius,anywheresoftware.b4j.object.JavaObject _fill) throws Exception{
 //BA.debugLineNum = 39;BA.debugLine="Public Sub Create5(Radius As Double, Fill As JavaO";
 //BA.debugLineNum = 41;BA.debugLine="TJO.InitializeNewInstance(\"javafx.scene.shape.Cir";
_tjo.InitializeNewInstance("javafx.scene.shape.Circle",new Object[]{(Object)(_radius),(Object)(_fill.getObject())});
 //BA.debugLineNum = 42;BA.debugLine="End Sub";
return "";
}
public double  _getcenterx() throws Exception{
 //BA.debugLineNum = 45;BA.debugLine="Public Sub getCenterX As Double";
 //BA.debugLineNum = 46;BA.debugLine="Return TJO.RunMethod(\"getCenterX\",Null)";
if (true) return (double)(BA.ObjectToNumber(_tjo.RunMethod("getCenterX",(Object[])(__c.Null))));
 //BA.debugLineNum = 47;BA.debugLine="End Sub";
return 0;
}
public double  _getcentery() throws Exception{
 //BA.debugLineNum = 49;BA.debugLine="Public Sub getCenterY As Double";
 //BA.debugLineNum = 50;BA.debugLine="Return TJO.RunMethod(\"getCenterY\",Null)";
if (true) return (double)(BA.ObjectToNumber(_tjo.RunMethod("getCenterY",(Object[])(__c.Null))));
 //BA.debugLineNum = 51;BA.debugLine="End Sub";
return 0;
}
public Object  _getfill() throws Exception{
 //BA.debugLineNum = 96;BA.debugLine="Public Sub getFill As Object";
 //BA.debugLineNum = 97;BA.debugLine="Return TJO.RunMethod(\"getFill\",Null)";
if (true) return _tjo.RunMethod("getFill",(Object[])(__c.Null));
 //BA.debugLineNum = 98;BA.debugLine="End Sub";
return null;
}
public String  _getid() throws Exception{
 //BA.debugLineNum = 83;BA.debugLine="Sub getID As String";
 //BA.debugLineNum = 84;BA.debugLine="Return TJO.RunMethod(\"getId\",Null)";
if (true) return BA.ObjectToString(_tjo.RunMethod("getId",(Object[])(__c.Null)));
 //BA.debugLineNum = 85;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4j.object.JavaObject  _getjavaobject() throws Exception{
 //BA.debugLineNum = 77;BA.debugLine="Public Sub getJavaObject As JavaObject";
 //BA.debugLineNum = 78;BA.debugLine="Return TJO";
if (true) return _tjo;
 //BA.debugLineNum = 79;BA.debugLine="End Sub";
return null;
}
public int  _getminheight() throws Exception{
double _h = 0;
 //BA.debugLineNum = 210;BA.debugLine="Public Sub getMinHeight As Int";
 //BA.debugLineNum = 211;BA.debugLine="Dim H As Double = -1";
_h = -1;
 //BA.debugLineNum = 212;BA.debugLine="Return TJO.RunMethod(\"prefHeight\",Array(H))";
if (true) return (int)(BA.ObjectToNumber(_tjo.RunMethod("prefHeight",new Object[]{(Object)(_h)})));
 //BA.debugLineNum = 213;BA.debugLine="End Sub";
return 0;
}
public int  _getminwidth() throws Exception{
double _h = 0;
 //BA.debugLineNum = 206;BA.debugLine="Public Sub getMinWidth As Int";
 //BA.debugLineNum = 207;BA.debugLine="Dim H As Double = -1";
_h = -1;
 //BA.debugLineNum = 208;BA.debugLine="Return TJO.RunMethod(\"prefWidth\",Array(H))";
if (true) return (int)(BA.ObjectToNumber(_tjo.RunMethod("prefWidth",new Object[]{(Object)(_h)})));
 //BA.debugLineNum = 209;BA.debugLine="End Sub";
return 0;
}
public Object  _getobject() throws Exception{
 //BA.debugLineNum = 68;BA.debugLine="Public Sub getObject As Object";
 //BA.debugLineNum = 69;BA.debugLine="Return TJO";
if (true) return (Object)(_tjo.getObject());
 //BA.debugLineNum = 70;BA.debugLine="End Sub";
return null;
}
public int  _getprefheight() throws Exception{
double _h = 0;
 //BA.debugLineNum = 202;BA.debugLine="Public Sub getPrefHeight As Int";
 //BA.debugLineNum = 203;BA.debugLine="Dim H As Double = -1";
_h = -1;
 //BA.debugLineNum = 204;BA.debugLine="Return TJO.RunMethod(\"prefHeight\",Array(H))";
if (true) return (int)(BA.ObjectToNumber(_tjo.RunMethod("prefHeight",new Object[]{(Object)(_h)})));
 //BA.debugLineNum = 205;BA.debugLine="End Sub";
return 0;
}
public int  _getprefwidth() throws Exception{
double _h = 0;
 //BA.debugLineNum = 198;BA.debugLine="Public Sub getPrefWidth As Int";
 //BA.debugLineNum = 199;BA.debugLine="Dim H As Double = -1";
_h = -1;
 //BA.debugLineNum = 200;BA.debugLine="Return TJO.RunMethod(\"prefWidth\",Array(H))";
if (true) return (int)(BA.ObjectToNumber(_tjo.RunMethod("prefWidth",new Object[]{(Object)(_h)})));
 //BA.debugLineNum = 201;BA.debugLine="End Sub";
return 0;
}
public double  _getradius() throws Exception{
 //BA.debugLineNum = 53;BA.debugLine="Public Sub getRadius As Double";
 //BA.debugLineNum = 54;BA.debugLine="Return TJO.RunMethod(\"getRadius\",Null)";
if (true) return (double)(BA.ObjectToNumber(_tjo.RunMethod("getRadius",(Object[])(__c.Null))));
 //BA.debugLineNum = 55;BA.debugLine="End Sub";
return 0;
}
public Object  _getstroke() throws Exception{
 //BA.debugLineNum = 100;BA.debugLine="Public Sub getStroke As Object";
 //BA.debugLineNum = 101;BA.debugLine="Return TJO.RunMethod(\"getStroke\",Null)";
if (true) return _tjo.RunMethod("getStroke",(Object[])(__c.Null));
 //BA.debugLineNum = 102;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.List  _getstrokedasharray() throws Exception{
 //BA.debugLineNum = 104;BA.debugLine="Public Sub getStrokeDashArray As List";
 //BA.debugLineNum = 105;BA.debugLine="Return TJO.RunMethod(\"getStrokeDashArray\",Null)";
if (true) return (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_tjo.RunMethod("getStrokeDashArray",(Object[])(__c.Null))));
 //BA.debugLineNum = 106;BA.debugLine="End Sub";
return null;
}
public double  _getstrokedashoffset() throws Exception{
 //BA.debugLineNum = 108;BA.debugLine="Public Sub getStrokeDashOffset As Double";
 //BA.debugLineNum = 109;BA.debugLine="Return TJO.RunMethod(\"getStrokeDashOffset\",Null)";
if (true) return (double)(BA.ObjectToNumber(_tjo.RunMethod("getStrokeDashOffset",(Object[])(__c.Null))));
 //BA.debugLineNum = 110;BA.debugLine="End Sub";
return 0;
}
public String  _getstrokelinecap() throws Exception{
 //BA.debugLineNum = 112;BA.debugLine="Public Sub getStrokeLineCap As String";
 //BA.debugLineNum = 113;BA.debugLine="Return TJO.RunMethodJO(\"getStrokeLineCap\",Null).R";
if (true) return BA.ObjectToString(_tjo.RunMethodJO("getStrokeLineCap",(Object[])(__c.Null)).RunMethod("toString",(Object[])(__c.Null)));
 //BA.debugLineNum = 114;BA.debugLine="End Sub";
return "";
}
public String  _getstrokelinejoin() throws Exception{
 //BA.debugLineNum = 116;BA.debugLine="Public Sub getStrokeLineJoin As String";
 //BA.debugLineNum = 117;BA.debugLine="Return TJO.RunMethodJO(\"getStrokeLineJoin\",Null).";
if (true) return BA.ObjectToString(_tjo.RunMethodJO("getStrokeLineJoin",(Object[])(__c.Null)).RunMethod("toString",(Object[])(__c.Null)));
 //BA.debugLineNum = 118;BA.debugLine="End Sub";
return "";
}
public double  _getstrokemiterlimit() throws Exception{
 //BA.debugLineNum = 120;BA.debugLine="Public Sub getStrokeMiterLimit As Double";
 //BA.debugLineNum = 121;BA.debugLine="Return TJO.RunMethod(\"getStrokeMiterLimit\",Null)";
if (true) return (double)(BA.ObjectToNumber(_tjo.RunMethod("getStrokeMiterLimit",(Object[])(__c.Null))));
 //BA.debugLineNum = 122;BA.debugLine="End Sub";
return 0;
}
public String  _getstroketype() throws Exception{
 //BA.debugLineNum = 124;BA.debugLine="Public Sub getStrokeType As String";
 //BA.debugLineNum = 125;BA.debugLine="Return TJO.RunMethodJO(\"getStrokeType\",Null).RunM";
if (true) return BA.ObjectToString(_tjo.RunMethodJO("getStrokeType",(Object[])(__c.Null)).RunMethod("toString",(Object[])(__c.Null)));
 //BA.debugLineNum = 126;BA.debugLine="End Sub";
return "";
}
public double  _getstrokewidth() throws Exception{
 //BA.debugLineNum = 128;BA.debugLine="Public Sub getStrokeWidth As Double";
 //BA.debugLineNum = 129;BA.debugLine="Return TJO.RunMethod(\"getStrokeWidth\",Null)";
if (true) return (double)(BA.ObjectToNumber(_tjo.RunMethod("getStrokeWidth",(Object[])(__c.Null))));
 //BA.debugLineNum = 130;BA.debugLine="End Sub";
return 0;
}
public Object  _gettag() throws Exception{
 //BA.debugLineNum = 89;BA.debugLine="Sub getTag As Object";
 //BA.debugLineNum = 90;BA.debugLine="Return mTag";
if (true) return _mtag;
 //BA.debugLineNum = 91;BA.debugLine="End Sub";
return null;
}
public String  _initialize(anywheresoftware.b4a.BA _ba) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 10;BA.debugLine="Public Sub Initialize";
 //BA.debugLineNum = 12;BA.debugLine="End Sub";
return "";
}
public com.stevel05.rtest.glshape  _intersect(com.stevel05.rtest.glcircle _shape1,com.stevel05.rtest.glcircle _shape2) throws Exception{
com.stevel05.rtest.glshape _s = null;
 //BA.debugLineNum = 193;BA.debugLine="Public Sub Intersect(Shape1 As GLCircle, Shape2 As";
 //BA.debugLineNum = 194;BA.debugLine="Dim S As GLShape";
_s = new com.stevel05.rtest.glshape();
 //BA.debugLineNum = 195;BA.debugLine="S.Initialize";
_s._initialize(ba);
 //BA.debugLineNum = 196;BA.debugLine="Return S.Intersect(Shape1,Shape2)";
if (true) return _s._intersect((Object)(_shape1),(Object)(_shape2));
 //BA.debugLineNum = 197;BA.debugLine="End Sub";
return null;
}
public boolean  _issmooth() throws Exception{
 //BA.debugLineNum = 132;BA.debugLine="Public Sub IsSmooth As Boolean";
 //BA.debugLineNum = 133;BA.debugLine="Return TJO.RunMethod(\"isSmooth\",Null)";
if (true) return BA.ObjectToBoolean(_tjo.RunMethod("isSmooth",(Object[])(__c.Null)));
 //BA.debugLineNum = 134;BA.debugLine="End Sub";
return false;
}
public String  _setcenterx(double _value) throws Exception{
 //BA.debugLineNum = 57;BA.debugLine="Public Sub setCenterX(Value As Double)";
 //BA.debugLineNum = 58;BA.debugLine="TJO.RunMethod(\"setCenterX\",Array As Object(Value)";
_tjo.RunMethod("setCenterX",new Object[]{(Object)(_value)});
 //BA.debugLineNum = 59;BA.debugLine="End Sub";
return "";
}
public String  _setcentery(double _value) throws Exception{
 //BA.debugLineNum = 61;BA.debugLine="Public Sub setCenterY(Value As Double)";
 //BA.debugLineNum = 62;BA.debugLine="TJO.RunMethod(\"setCenterY\",Array As Object(Value)";
_tjo.RunMethod("setCenterY",new Object[]{(Object)(_value)});
 //BA.debugLineNum = 63;BA.debugLine="End Sub";
return "";
}
public String  _setfill(Object _value) throws Exception{
 //BA.debugLineNum = 136;BA.debugLine="Public Sub setFill(Value As Object)";
 //BA.debugLineNum = 137;BA.debugLine="TJO.RunMethod(\"setFill\",Array As Object(Value))";
_tjo.RunMethod("setFill",new Object[]{_value});
 //BA.debugLineNum = 138;BA.debugLine="End Sub";
return "";
}
public String  _setid(String _id) throws Exception{
 //BA.debugLineNum = 80;BA.debugLine="Sub setID(ID As String)";
 //BA.debugLineNum = 81;BA.debugLine="TJO.RunMethod(\"setId\",Array(ID))";
_tjo.RunMethod("setId",new Object[]{(Object)(_id)});
 //BA.debugLineNum = 82;BA.debugLine="End Sub";
return "";
}
public String  _setobject(Object _obj) throws Exception{
 //BA.debugLineNum = 71;BA.debugLine="Public Sub setObject(Obj As Object)";
 //BA.debugLineNum = 72;BA.debugLine="TJO = Obj";
_tjo.setObject((java.lang.Object)(_obj));
 //BA.debugLineNum = 73;BA.debugLine="End Sub";
return "";
}
public String  _setradius(double _value) throws Exception{
 //BA.debugLineNum = 65;BA.debugLine="Public Sub setRadius(Value As Double)";
 //BA.debugLineNum = 66;BA.debugLine="TJO.RunMethod(\"setRadius\",Array As Object(Value))";
_tjo.RunMethod("setRadius",new Object[]{(Object)(_value)});
 //BA.debugLineNum = 67;BA.debugLine="End Sub";
return "";
}
public String  _setsmooth(boolean _value) throws Exception{
 //BA.debugLineNum = 140;BA.debugLine="Public Sub setSmooth(Value As Boolean)";
 //BA.debugLineNum = 141;BA.debugLine="TJO.RunMethod(\"setSmooth\",Array As Object(Value))";
_tjo.RunMethod("setSmooth",new Object[]{(Object)(_value)});
 //BA.debugLineNum = 142;BA.debugLine="End Sub";
return "";
}
public String  _setstroke(Object _value) throws Exception{
 //BA.debugLineNum = 144;BA.debugLine="Public Sub setStroke(Value As Object)";
 //BA.debugLineNum = 145;BA.debugLine="TJO.RunMethod(\"setStroke\",Array As Object(Value))";
_tjo.RunMethod("setStroke",new Object[]{_value});
 //BA.debugLineNum = 146;BA.debugLine="End Sub";
return "";
}
public String  _setstrokedashoffset(double _value) throws Exception{
 //BA.debugLineNum = 148;BA.debugLine="Public Sub setStrokeDashOffset(Value As Double)";
 //BA.debugLineNum = 149;BA.debugLine="TJO.RunMethod(\"setStrokeDashOffset\",Array As Obje";
_tjo.RunMethod("setStrokeDashOffset",new Object[]{(Object)(_value)});
 //BA.debugLineNum = 150;BA.debugLine="End Sub";
return "";
}
public String  _setstrokelinecap(String _value) throws Exception{
com.stevel05.rtest.glshape _s = null;
 //BA.debugLineNum = 152;BA.debugLine="Public Sub setStrokeLineCap(Value As String)";
 //BA.debugLineNum = 153;BA.debugLine="Dim S As GLShape";
_s = new com.stevel05.rtest.glshape();
 //BA.debugLineNum = 154;BA.debugLine="S.Initialize";
_s._initialize(ba);
 //BA.debugLineNum = 155;BA.debugLine="S.setObject(TJO)";
_s._setobject(_tjo);
 //BA.debugLineNum = 156;BA.debugLine="S.setStrokeLineCap(Value)";
_s._setstrokelinecap(_value);
 //BA.debugLineNum = 157;BA.debugLine="End Sub";
return "";
}
public String  _setstrokelinejoin(String _value) throws Exception{
com.stevel05.rtest.glshape _s = null;
 //BA.debugLineNum = 159;BA.debugLine="Public Sub setStrokeLineJoin(Value As String)";
 //BA.debugLineNum = 160;BA.debugLine="Dim S As GLShape";
_s = new com.stevel05.rtest.glshape();
 //BA.debugLineNum = 161;BA.debugLine="S.Initialize";
_s._initialize(ba);
 //BA.debugLineNum = 162;BA.debugLine="S.setObject(TJO)";
_s._setobject(_tjo);
 //BA.debugLineNum = 163;BA.debugLine="S.setStrokeLineJoin(Value)";
_s._setstrokelinejoin(_value);
 //BA.debugLineNum = 164;BA.debugLine="End Sub";
return "";
}
public String  _setstrokemiterlimit(double _value) throws Exception{
 //BA.debugLineNum = 166;BA.debugLine="Public Sub setStrokeMiterLimit(Value As Double)";
 //BA.debugLineNum = 167;BA.debugLine="TJO.RunMethod(\"setStrokeMiterLimit\",Array As Obje";
_tjo.RunMethod("setStrokeMiterLimit",new Object[]{(Object)(_value)});
 //BA.debugLineNum = 168;BA.debugLine="End Sub";
return "";
}
public String  _setstroketype(String _value) throws Exception{
com.stevel05.rtest.glshape _s = null;
 //BA.debugLineNum = 170;BA.debugLine="Public Sub setStrokeType(Value As String)";
 //BA.debugLineNum = 171;BA.debugLine="Dim S As GLShape";
_s = new com.stevel05.rtest.glshape();
 //BA.debugLineNum = 172;BA.debugLine="S.Initialize";
_s._initialize(ba);
 //BA.debugLineNum = 173;BA.debugLine="S.setObject(TJO)";
_s._setobject(_tjo);
 //BA.debugLineNum = 174;BA.debugLine="S.setStrokeType(Value)";
_s._setstroketype(_value);
 //BA.debugLineNum = 175;BA.debugLine="End Sub";
return "";
}
public String  _setstrokewidth(double _value) throws Exception{
 //BA.debugLineNum = 177;BA.debugLine="Public Sub setStrokeWidth(Value As Double)";
 //BA.debugLineNum = 178;BA.debugLine="TJO.RunMethod(\"setStrokeWidth\",Array As Object(Va";
_tjo.RunMethod("setStrokeWidth",new Object[]{(Object)(_value)});
 //BA.debugLineNum = 179;BA.debugLine="End Sub";
return "";
}
public String  _settag(Object _tag) throws Exception{
 //BA.debugLineNum = 86;BA.debugLine="Sub setTag(Tag As Object)";
 //BA.debugLineNum = 87;BA.debugLine="mTag = Tag";
_mtag = _tag;
 //BA.debugLineNum = 88;BA.debugLine="End Sub";
return "";
}
public com.stevel05.rtest.glshape  _subtract(com.stevel05.rtest.glcircle _shape1,com.stevel05.rtest.glcircle _shape2) throws Exception{
com.stevel05.rtest.glshape _s = null;
 //BA.debugLineNum = 181;BA.debugLine="Public Sub Subtract(Shape1 As GLCircle, Shape2 As";
 //BA.debugLineNum = 182;BA.debugLine="Dim S As GLShape";
_s = new com.stevel05.rtest.glshape();
 //BA.debugLineNum = 183;BA.debugLine="S.Initialize";
_s._initialize(ba);
 //BA.debugLineNum = 184;BA.debugLine="Return S.Subtract(Shape1,Shape2)";
if (true) return _s._subtract((Object)(_shape1),(Object)(_shape2));
 //BA.debugLineNum = 185;BA.debugLine="End Sub";
return null;
}
public com.stevel05.rtest.glshape  _union(com.stevel05.rtest.glcircle _shape1,com.stevel05.rtest.glcircle _shape2) throws Exception{
com.stevel05.rtest.glshape _s = null;
 //BA.debugLineNum = 187;BA.debugLine="Public Sub Union(Shape1 As GLCircle, Shape2 As GLC";
 //BA.debugLineNum = 188;BA.debugLine="Dim S As GLShape";
_s = new com.stevel05.rtest.glshape();
 //BA.debugLineNum = 189;BA.debugLine="S.Initialize";
_s._initialize(ba);
 //BA.debugLineNum = 190;BA.debugLine="Return S.Union(Shape1,Shape2)";
if (true) return _s._union((Object)(_shape1),(Object)(_shape2));
 //BA.debugLineNum = 191;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
