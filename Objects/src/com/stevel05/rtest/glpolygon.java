package com.stevel05.rtest;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.debug.*;

public class glpolygon extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("com.stevel05.rtest", "com.stevel05.rtest.glpolygon", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", com.stevel05.rtest.glpolygon.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4j.object.JavaObject _tjo = null;
public Object _mtag = null;
public com.stevel05.rtest.glshape_static _glshape_static = null;
public anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper  _asnode() throws Exception{
 //BA.debugLineNum = 44;BA.debugLine="Public Sub AsNode As Node";
 //BA.debugLineNum = 45;BA.debugLine="Return TJO";
if (true) return (anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_tjo.getObject()));
 //BA.debugLineNum = 46;BA.debugLine="End Sub";
return null;
}
public String  _bringtofront() throws Exception{
 //BA.debugLineNum = 185;BA.debugLine="Sub BringToFront";
 //BA.debugLineNum = 186;BA.debugLine="TJO.RunMethod(\"toFront\",Null)";
_tjo.RunMethod("toFront",(Object[])(__c.Null));
 //BA.debugLineNum = 187;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 17;BA.debugLine="TJO.InitializeNewInstance(\"javafx.scene.shape.Pol";
_tjo.InitializeNewInstance("javafx.scene.shape.Polygon",(Object[])(__c.Null));
 //BA.debugLineNum = 18;BA.debugLine="End Sub";
return "";
}
public String  _create2(double[] _points) throws Exception{
 //BA.debugLineNum = 21;BA.debugLine="Public Sub Create2(Points() As Double)";
 //BA.debugLineNum = 22;BA.debugLine="TJO.InitializeNewInstance(\"javafx.scene.shape.Pol";
_tjo.InitializeNewInstance("javafx.scene.shape.Polygon",new Object[]{(Object)(_points)});
 //BA.debugLineNum = 23;BA.debugLine="End Sub";
return "";
}
public Object  _getfill() throws Exception{
 //BA.debugLineNum = 66;BA.debugLine="Public Sub getFill As Object";
 //BA.debugLineNum = 67;BA.debugLine="Return TJO.RunMethod(\"getFill\",Null)";
if (true) return _tjo.RunMethod("getFill",(Object[])(__c.Null));
 //BA.debugLineNum = 68;BA.debugLine="End Sub";
return null;
}
public String  _getid() throws Exception{
 //BA.debugLineNum = 53;BA.debugLine="Sub getID As String";
 //BA.debugLineNum = 54;BA.debugLine="Return TJO.RunMethod(\"getId\",Null)";
if (true) return BA.ObjectToString(_tjo.RunMethod("getId",(Object[])(__c.Null)));
 //BA.debugLineNum = 55;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4j.object.JavaObject  _getjavaobject() throws Exception{
 //BA.debugLineNum = 47;BA.debugLine="Public Sub getJavaObject As JavaObject";
 //BA.debugLineNum = 48;BA.debugLine="Return TJO";
if (true) return _tjo;
 //BA.debugLineNum = 49;BA.debugLine="End Sub";
return null;
}
public int  _getminheight() throws Exception{
double _h = 0;
 //BA.debugLineNum = 181;BA.debugLine="Public Sub getMinHeight As Int";
 //BA.debugLineNum = 182;BA.debugLine="Dim H As Double = -1";
_h = -1;
 //BA.debugLineNum = 183;BA.debugLine="Return TJO.RunMethod(\"prefHeight\",Array(H))";
if (true) return (int)(BA.ObjectToNumber(_tjo.RunMethod("prefHeight",new Object[]{(Object)(_h)})));
 //BA.debugLineNum = 184;BA.debugLine="End Sub";
return 0;
}
public int  _getminwidth() throws Exception{
double _h = 0;
 //BA.debugLineNum = 177;BA.debugLine="Public Sub getMinWidth As Int";
 //BA.debugLineNum = 178;BA.debugLine="Dim H As Double = -1";
_h = -1;
 //BA.debugLineNum = 179;BA.debugLine="Return TJO.RunMethod(\"prefWidth\",Array(H))";
if (true) return (int)(BA.ObjectToNumber(_tjo.RunMethod("prefWidth",new Object[]{(Object)(_h)})));
 //BA.debugLineNum = 180;BA.debugLine="End Sub";
return 0;
}
public Object  _getobject() throws Exception{
 //BA.debugLineNum = 38;BA.debugLine="Public Sub getObject As Object";
 //BA.debugLineNum = 39;BA.debugLine="Return TJO";
if (true) return (Object)(_tjo.getObject());
 //BA.debugLineNum = 40;BA.debugLine="End Sub";
return null;
}
public double[]  _getpoints() throws Exception{
anywheresoftware.b4j.object.JavaObject _ol = null;
double[] _result = null;
anywheresoftware.b4j.object.JavaObject _iterator = null;
int _i = 0;
 //BA.debugLineNum = 26;BA.debugLine="Public Sub getPoints As Double()";
 //BA.debugLineNum = 28;BA.debugLine="Dim OL As JavaObject = TJO.RunMethod(\"getPoints\",";
_ol = new anywheresoftware.b4j.object.JavaObject();
_ol.setObject((java.lang.Object)(_tjo.RunMethod("getPoints",(Object[])(__c.Null))));
 //BA.debugLineNum = 29;BA.debugLine="Dim Result(OL.RunMethod(\"size\",Null)) As Double";
_result = new double[(int)(BA.ObjectToNumber(_ol.RunMethod("size",(Object[])(__c.Null))))];
;
 //BA.debugLineNum = 30;BA.debugLine="Dim Iterator As JavaObject = OL.RunMethod(\"iterat";
_iterator = new anywheresoftware.b4j.object.JavaObject();
_iterator.setObject((java.lang.Object)(_ol.RunMethod("iterator",(Object[])(__c.Null))));
 //BA.debugLineNum = 31;BA.debugLine="Dim i As Int = 0";
_i = (int) (0);
 //BA.debugLineNum = 32;BA.debugLine="Do While Iterator.RunMethod(\"hasNext\",Null)";
while (BA.ObjectToBoolean(_iterator.RunMethod("hasNext",(Object[])(__c.Null)))) {
 //BA.debugLineNum = 33;BA.debugLine="Result(i) = Iterator.RunMethod(\"next\",Null)";
_result[_i] = (double)(BA.ObjectToNumber(_iterator.RunMethod("next",(Object[])(__c.Null))));
 //BA.debugLineNum = 34;BA.debugLine="i=i+1";
_i = (int) (_i+1);
 }
;
 //BA.debugLineNum = 36;BA.debugLine="Return Result";
if (true) return _result;
 //BA.debugLineNum = 37;BA.debugLine="End Sub";
return null;
}
public int  _getprefheight() throws Exception{
double _h = 0;
 //BA.debugLineNum = 173;BA.debugLine="Public Sub getPrefHeight As Int";
 //BA.debugLineNum = 174;BA.debugLine="Dim H As Double = -1";
_h = -1;
 //BA.debugLineNum = 175;BA.debugLine="Return TJO.RunMethod(\"prefHeight\",Array(H))";
if (true) return (int)(BA.ObjectToNumber(_tjo.RunMethod("prefHeight",new Object[]{(Object)(_h)})));
 //BA.debugLineNum = 176;BA.debugLine="End Sub";
return 0;
}
public int  _getprefwidth() throws Exception{
double _h = 0;
 //BA.debugLineNum = 169;BA.debugLine="Public Sub getPrefWidth As Int";
 //BA.debugLineNum = 170;BA.debugLine="Dim H As Double = -1";
_h = -1;
 //BA.debugLineNum = 171;BA.debugLine="Return TJO.RunMethod(\"prefWidth\",Array(H))";
if (true) return (int)(BA.ObjectToNumber(_tjo.RunMethod("prefWidth",new Object[]{(Object)(_h)})));
 //BA.debugLineNum = 172;BA.debugLine="End Sub";
return 0;
}
public Object  _getstroke() throws Exception{
 //BA.debugLineNum = 70;BA.debugLine="Public Sub getStroke As Object";
 //BA.debugLineNum = 71;BA.debugLine="Return TJO.RunMethod(\"getStroke\",Null)";
if (true) return _tjo.RunMethod("getStroke",(Object[])(__c.Null));
 //BA.debugLineNum = 72;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.List  _getstrokedasharray() throws Exception{
 //BA.debugLineNum = 74;BA.debugLine="Public Sub getStrokeDashArray As List";
 //BA.debugLineNum = 75;BA.debugLine="Return TJO.RunMethod(\"getStrokeDashArray\",Null)";
if (true) return (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_tjo.RunMethod("getStrokeDashArray",(Object[])(__c.Null))));
 //BA.debugLineNum = 76;BA.debugLine="End Sub";
return null;
}
public double  _getstrokedashoffset() throws Exception{
 //BA.debugLineNum = 78;BA.debugLine="Public Sub getStrokeDashOffset As Double";
 //BA.debugLineNum = 79;BA.debugLine="Return TJO.RunMethod(\"getStrokeDashOffset\",Null)";
if (true) return (double)(BA.ObjectToNumber(_tjo.RunMethod("getStrokeDashOffset",(Object[])(__c.Null))));
 //BA.debugLineNum = 80;BA.debugLine="End Sub";
return 0;
}
public String  _getstrokelinecap() throws Exception{
 //BA.debugLineNum = 82;BA.debugLine="Public Sub getStrokeLineCap As String";
 //BA.debugLineNum = 83;BA.debugLine="Return TJO.RunMethodJO(\"getStrokeLineCap\",Null).R";
if (true) return BA.ObjectToString(_tjo.RunMethodJO("getStrokeLineCap",(Object[])(__c.Null)).RunMethod("toString",(Object[])(__c.Null)));
 //BA.debugLineNum = 84;BA.debugLine="End Sub";
return "";
}
public String  _getstrokelinejoin() throws Exception{
 //BA.debugLineNum = 86;BA.debugLine="Public Sub getStrokeLineJoin As String";
 //BA.debugLineNum = 87;BA.debugLine="Return TJO.RunMethodJO(\"getStrokeLineJoin\",Null).";
if (true) return BA.ObjectToString(_tjo.RunMethodJO("getStrokeLineJoin",(Object[])(__c.Null)).RunMethod("toString",(Object[])(__c.Null)));
 //BA.debugLineNum = 88;BA.debugLine="End Sub";
return "";
}
public double  _getstrokemiterlimit() throws Exception{
 //BA.debugLineNum = 90;BA.debugLine="Public Sub getStrokeMiterLimit As Double";
 //BA.debugLineNum = 91;BA.debugLine="Return TJO.RunMethod(\"getStrokeMiterLimit\",Null)";
if (true) return (double)(BA.ObjectToNumber(_tjo.RunMethod("getStrokeMiterLimit",(Object[])(__c.Null))));
 //BA.debugLineNum = 92;BA.debugLine="End Sub";
return 0;
}
public String  _getstroketype() throws Exception{
 //BA.debugLineNum = 94;BA.debugLine="Public Sub getStrokeType As String";
 //BA.debugLineNum = 95;BA.debugLine="Return TJO.RunMethodJO(\"getStrokeType\",Null).RunM";
if (true) return BA.ObjectToString(_tjo.RunMethodJO("getStrokeType",(Object[])(__c.Null)).RunMethod("toString",(Object[])(__c.Null)));
 //BA.debugLineNum = 96;BA.debugLine="End Sub";
return "";
}
public double  _getstrokewidth() throws Exception{
 //BA.debugLineNum = 98;BA.debugLine="Public Sub getStrokeWidth As Double";
 //BA.debugLineNum = 99;BA.debugLine="Return TJO.RunMethod(\"getStrokeWidth\",Null)";
if (true) return (double)(BA.ObjectToNumber(_tjo.RunMethod("getStrokeWidth",(Object[])(__c.Null))));
 //BA.debugLineNum = 100;BA.debugLine="End Sub";
return 0;
}
public Object  _gettag() throws Exception{
 //BA.debugLineNum = 59;BA.debugLine="Sub getTag As Object";
 //BA.debugLineNum = 60;BA.debugLine="Return mTag";
if (true) return _mtag;
 //BA.debugLineNum = 61;BA.debugLine="End Sub";
return null;
}
public String  _initialize(anywheresoftware.b4a.BA _ba) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 10;BA.debugLine="Public Sub Initialize";
 //BA.debugLineNum = 12;BA.debugLine="End Sub";
return "";
}
public com.stevel05.rtest.glshape  _intersect(com.stevel05.rtest.glpolygon _shape1,com.stevel05.rtest.glpolygon _shape2) throws Exception{
com.stevel05.rtest.glshape _s = null;
 //BA.debugLineNum = 163;BA.debugLine="Public Sub Intersect(Shape1 As GLPolygon, Shape2 A";
 //BA.debugLineNum = 164;BA.debugLine="Dim S As GLShape";
_s = new com.stevel05.rtest.glshape();
 //BA.debugLineNum = 165;BA.debugLine="S.Initialize";
_s._initialize(ba);
 //BA.debugLineNum = 166;BA.debugLine="Return S.Intersect(Shape1,Shape2)";
if (true) return _s._intersect((Object)(_shape1),(Object)(_shape2));
 //BA.debugLineNum = 167;BA.debugLine="End Sub";
return null;
}
public boolean  _issmooth() throws Exception{
 //BA.debugLineNum = 102;BA.debugLine="Public Sub IsSmooth As Boolean";
 //BA.debugLineNum = 103;BA.debugLine="Return TJO.RunMethod(\"isSmooth\",Null)";
if (true) return BA.ObjectToBoolean(_tjo.RunMethod("isSmooth",(Object[])(__c.Null)));
 //BA.debugLineNum = 104;BA.debugLine="End Sub";
return false;
}
public String  _setfill(Object _value) throws Exception{
 //BA.debugLineNum = 106;BA.debugLine="Public Sub setFill(Value As Object)";
 //BA.debugLineNum = 107;BA.debugLine="TJO.RunMethod(\"setFill\",Array As Object(Value))";
_tjo.RunMethod("setFill",new Object[]{_value});
 //BA.debugLineNum = 108;BA.debugLine="End Sub";
return "";
}
public String  _setid(String _id) throws Exception{
 //BA.debugLineNum = 50;BA.debugLine="Sub setID(ID As String)";
 //BA.debugLineNum = 51;BA.debugLine="TJO.RunMethod(\"setId\",Array(ID))";
_tjo.RunMethod("setId",new Object[]{(Object)(_id)});
 //BA.debugLineNum = 52;BA.debugLine="End Sub";
return "";
}
public String  _setobject(Object _obj) throws Exception{
 //BA.debugLineNum = 41;BA.debugLine="Public Sub setObject(Obj As Object)";
 //BA.debugLineNum = 42;BA.debugLine="TJO = Obj";
_tjo.setObject((java.lang.Object)(_obj));
 //BA.debugLineNum = 43;BA.debugLine="End Sub";
return "";
}
public String  _setsmooth(boolean _value) throws Exception{
 //BA.debugLineNum = 110;BA.debugLine="Public Sub setSmooth(Value As Boolean)";
 //BA.debugLineNum = 111;BA.debugLine="TJO.RunMethod(\"setSmooth\",Array As Object(Value))";
_tjo.RunMethod("setSmooth",new Object[]{(Object)(_value)});
 //BA.debugLineNum = 112;BA.debugLine="End Sub";
return "";
}
public String  _setstroke(Object _value) throws Exception{
 //BA.debugLineNum = 114;BA.debugLine="Public Sub setStroke(Value As Object)";
 //BA.debugLineNum = 115;BA.debugLine="TJO.RunMethod(\"setStroke\",Array As Object(Value))";
_tjo.RunMethod("setStroke",new Object[]{_value});
 //BA.debugLineNum = 116;BA.debugLine="End Sub";
return "";
}
public String  _setstrokedashoffset(double _value) throws Exception{
 //BA.debugLineNum = 118;BA.debugLine="Public Sub setStrokeDashOffset(Value As Double)";
 //BA.debugLineNum = 119;BA.debugLine="TJO.RunMethod(\"setStrokeDashOffset\",Array As Obje";
_tjo.RunMethod("setStrokeDashOffset",new Object[]{(Object)(_value)});
 //BA.debugLineNum = 120;BA.debugLine="End Sub";
return "";
}
public String  _setstrokelinecap(String _value) throws Exception{
com.stevel05.rtest.glshape _s = null;
 //BA.debugLineNum = 122;BA.debugLine="Public Sub setStrokeLineCap(Value As String)";
 //BA.debugLineNum = 123;BA.debugLine="Dim S As GLShape";
_s = new com.stevel05.rtest.glshape();
 //BA.debugLineNum = 124;BA.debugLine="S.Initialize";
_s._initialize(ba);
 //BA.debugLineNum = 125;BA.debugLine="S.setObject(TJO)";
_s._setobject(_tjo);
 //BA.debugLineNum = 126;BA.debugLine="S.setStrokeLineCap(Value)";
_s._setstrokelinecap(_value);
 //BA.debugLineNum = 127;BA.debugLine="End Sub";
return "";
}
public String  _setstrokelinejoin(String _value) throws Exception{
com.stevel05.rtest.glshape _s = null;
 //BA.debugLineNum = 129;BA.debugLine="Public Sub setStrokeLineJoin(Value As String)";
 //BA.debugLineNum = 130;BA.debugLine="Dim S As GLShape";
_s = new com.stevel05.rtest.glshape();
 //BA.debugLineNum = 131;BA.debugLine="S.Initialize";
_s._initialize(ba);
 //BA.debugLineNum = 132;BA.debugLine="S.setObject(TJO)";
_s._setobject(_tjo);
 //BA.debugLineNum = 133;BA.debugLine="S.setStrokeLineJoin(Value)";
_s._setstrokelinejoin(_value);
 //BA.debugLineNum = 134;BA.debugLine="End Sub";
return "";
}
public String  _setstrokemiterlimit(double _value) throws Exception{
 //BA.debugLineNum = 136;BA.debugLine="Public Sub setStrokeMiterLimit(Value As Double)";
 //BA.debugLineNum = 137;BA.debugLine="TJO.RunMethod(\"setStrokeMiterLimit\",Array As Obje";
_tjo.RunMethod("setStrokeMiterLimit",new Object[]{(Object)(_value)});
 //BA.debugLineNum = 138;BA.debugLine="End Sub";
return "";
}
public String  _setstroketype(String _value) throws Exception{
com.stevel05.rtest.glshape _s = null;
 //BA.debugLineNum = 140;BA.debugLine="Public Sub setStrokeType(Value As String)";
 //BA.debugLineNum = 141;BA.debugLine="Dim S As GLShape";
_s = new com.stevel05.rtest.glshape();
 //BA.debugLineNum = 142;BA.debugLine="S.Initialize";
_s._initialize(ba);
 //BA.debugLineNum = 143;BA.debugLine="S.setObject(TJO)";
_s._setobject(_tjo);
 //BA.debugLineNum = 144;BA.debugLine="S.setStrokeType(Value)";
_s._setstroketype(_value);
 //BA.debugLineNum = 145;BA.debugLine="End Sub";
return "";
}
public String  _setstrokewidth(double _value) throws Exception{
 //BA.debugLineNum = 147;BA.debugLine="Public Sub setStrokeWidth(Value As Double)";
 //BA.debugLineNum = 148;BA.debugLine="TJO.RunMethod(\"setStrokeWidth\",Array As Object(Va";
_tjo.RunMethod("setStrokeWidth",new Object[]{(Object)(_value)});
 //BA.debugLineNum = 149;BA.debugLine="End Sub";
return "";
}
public String  _settag(Object _tag) throws Exception{
 //BA.debugLineNum = 56;BA.debugLine="Sub setTag(Tag As Object)";
 //BA.debugLineNum = 57;BA.debugLine="mTag = Tag";
_mtag = _tag;
 //BA.debugLineNum = 58;BA.debugLine="End Sub";
return "";
}
public com.stevel05.rtest.glshape  _subtract(com.stevel05.rtest.glpolygon _shape1,com.stevel05.rtest.glpolygon _shape2) throws Exception{
com.stevel05.rtest.glshape _s = null;
 //BA.debugLineNum = 151;BA.debugLine="Public Sub Subtract(Shape1 As GLPolygon, Shape2 As";
 //BA.debugLineNum = 152;BA.debugLine="Dim S As GLShape";
_s = new com.stevel05.rtest.glshape();
 //BA.debugLineNum = 153;BA.debugLine="S.Initialize";
_s._initialize(ba);
 //BA.debugLineNum = 154;BA.debugLine="Return S.Subtract(Shape1,Shape2)";
if (true) return _s._subtract((Object)(_shape1),(Object)(_shape2));
 //BA.debugLineNum = 155;BA.debugLine="End Sub";
return null;
}
public com.stevel05.rtest.glshape  _union(com.stevel05.rtest.glpolygon _shape1,com.stevel05.rtest.glpolygon _shape2) throws Exception{
com.stevel05.rtest.glshape _s = null;
 //BA.debugLineNum = 157;BA.debugLine="Public Sub Union(Shape1 As GLPolygon, Shape2 As GL";
 //BA.debugLineNum = 158;BA.debugLine="Dim S As GLShape";
_s = new com.stevel05.rtest.glshape();
 //BA.debugLineNum = 159;BA.debugLine="S.Initialize";
_s._initialize(ba);
 //BA.debugLineNum = 160;BA.debugLine="Return S.Union(Shape1,Shape2)";
if (true) return _s._union((Object)(_shape1),(Object)(_shape2));
 //BA.debugLineNum = 161;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
