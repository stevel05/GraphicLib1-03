package com.stevel05.rtest;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.debug.*;

public class glshape extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("com.stevel05.rtest", "com.stevel05.rtest.glshape", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", com.stevel05.rtest.glshape.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4j.object.JavaObject _tjo = null;
public Object _mtag = null;
public com.stevel05.rtest.glshape_static _glshape_static = null;
public anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper  _asnode() throws Exception{
 //BA.debugLineNum = 232;BA.debugLine="Public Sub AsNode As Node";
 //BA.debugLineNum = 233;BA.debugLine="Return TJO";
if (true) return (anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_tjo.getObject()));
 //BA.debugLineNum = 234;BA.debugLine="End Sub";
return null;
}
public String  _bringtofront() throws Exception{
 //BA.debugLineNum = 250;BA.debugLine="Sub BringToFront";
 //BA.debugLineNum = 251;BA.debugLine="TJO.RunMethod(\"toFront\",Null)";
_tjo.RunMethod("toFront",(Object[])(__c.Null));
 //BA.debugLineNum = 252;BA.debugLine="End Sub";
return "";
}
public com.stevel05.rtest.glshape  _castshape(Object _shape) throws Exception{
com.stevel05.rtest.glarc _a = null;
com.stevel05.rtest.glshape _s = null;
com.stevel05.rtest.glcircle _c = null;
com.stevel05.rtest.glcubiccurve _cc = null;
com.stevel05.rtest.glellipse _e = null;
com.stevel05.rtest.glline _l = null;
com.stevel05.rtest.glpath _p = null;
com.stevel05.rtest.glpolygon _po = null;
com.stevel05.rtest.glquadcurve _q = null;
com.stevel05.rtest.glrectangle _r = null;
com.stevel05.rtest.glsvgpath _v = null;
com.stevel05.rtest.gltext _t = null;
 //BA.debugLineNum = 136;BA.debugLine="Sub CastShape(Shape As Object) As GLShape";
 //BA.debugLineNum = 138;BA.debugLine="Select True";
switch (BA.switchObjectToInt(__c.True,_shape instanceof com.stevel05.rtest.glarc,_shape instanceof com.stevel05.rtest.glarc,_shape instanceof com.stevel05.rtest.glcubiccurve,_shape instanceof com.stevel05.rtest.glellipse,_shape instanceof com.stevel05.rtest.glline,_shape instanceof com.stevel05.rtest.glpath,_shape instanceof com.stevel05.rtest.glpolygon,_shape instanceof com.stevel05.rtest.glquadcurve,_shape instanceof com.stevel05.rtest.glrectangle,_shape instanceof com.stevel05.rtest.glsvgpath,_shape instanceof com.stevel05.rtest.gltext)) {
case 0: {
 //BA.debugLineNum = 140;BA.debugLine="Dim A As GLArc = Shape";
_a = (com.stevel05.rtest.glarc)(_shape);
 //BA.debugLineNum = 141;BA.debugLine="Dim S As GLShape";
_s = new com.stevel05.rtest.glshape();
 //BA.debugLineNum = 142;BA.debugLine="S.Initialize";
_s._initialize(ba);
 //BA.debugLineNum = 143;BA.debugLine="S.setObject(A.getObject)";
_s._setobject((anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_a._getobject())));
 break; }
case 1: {
 //BA.debugLineNum = 146;BA.debugLine="Dim C As GLCircle = Shape";
_c = (com.stevel05.rtest.glcircle)(_shape);
 //BA.debugLineNum = 147;BA.debugLine="Dim S As GLShape";
_s = new com.stevel05.rtest.glshape();
 //BA.debugLineNum = 148;BA.debugLine="S.Initialize";
_s._initialize(ba);
 //BA.debugLineNum = 149;BA.debugLine="S.setObject(C.getObject)";
_s._setobject((anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_c._getobject())));
 break; }
case 2: {
 //BA.debugLineNum = 152;BA.debugLine="Dim CC As GLCubicCurve = Shape";
_cc = (com.stevel05.rtest.glcubiccurve)(_shape);
 //BA.debugLineNum = 153;BA.debugLine="Dim S As GLShape";
_s = new com.stevel05.rtest.glshape();
 //BA.debugLineNum = 154;BA.debugLine="S.Initialize";
_s._initialize(ba);
 //BA.debugLineNum = 155;BA.debugLine="S.setObject(CC.getObject)";
_s._setobject((anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_cc._getobject())));
 break; }
case 3: {
 //BA.debugLineNum = 158;BA.debugLine="Dim E As GLEllipse = Shape";
_e = (com.stevel05.rtest.glellipse)(_shape);
 //BA.debugLineNum = 159;BA.debugLine="Dim S As GLShape";
_s = new com.stevel05.rtest.glshape();
 //BA.debugLineNum = 160;BA.debugLine="S.Initialize";
_s._initialize(ba);
 //BA.debugLineNum = 161;BA.debugLine="S.setObject(E.getObject)";
_s._setobject((anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_e._getobject())));
 break; }
case 4: {
 //BA.debugLineNum = 164;BA.debugLine="Dim L As GLLine = Shape";
_l = (com.stevel05.rtest.glline)(_shape);
 //BA.debugLineNum = 165;BA.debugLine="Dim S As GLShape";
_s = new com.stevel05.rtest.glshape();
 //BA.debugLineNum = 166;BA.debugLine="S.Initialize";
_s._initialize(ba);
 //BA.debugLineNum = 167;BA.debugLine="S.setObject(L.getObject)";
_s._setobject((anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_l._getobject())));
 break; }
case 5: {
 //BA.debugLineNum = 170;BA.debugLine="Dim P As GLPath = Shape";
_p = (com.stevel05.rtest.glpath)(_shape);
 //BA.debugLineNum = 171;BA.debugLine="Dim S As GLShape";
_s = new com.stevel05.rtest.glshape();
 //BA.debugLineNum = 172;BA.debugLine="S.Initialize";
_s._initialize(ba);
 //BA.debugLineNum = 173;BA.debugLine="S.setObject(P.getObject)";
_s._setobject((anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_p._getobject())));
 break; }
case 6: {
 //BA.debugLineNum = 176;BA.debugLine="Dim PO As GLPolygon = Shape";
_po = (com.stevel05.rtest.glpolygon)(_shape);
 //BA.debugLineNum = 177;BA.debugLine="Dim S As GLShape";
_s = new com.stevel05.rtest.glshape();
 //BA.debugLineNum = 178;BA.debugLine="S.Initialize";
_s._initialize(ba);
 //BA.debugLineNum = 179;BA.debugLine="S.setObject(PO.getObject)";
_s._setobject((anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_po._getobject())));
 break; }
case 7: {
 //BA.debugLineNum = 182;BA.debugLine="Dim Q As GLQuadCurve = Shape";
_q = (com.stevel05.rtest.glquadcurve)(_shape);
 //BA.debugLineNum = 183;BA.debugLine="Dim S As GLShape";
_s = new com.stevel05.rtest.glshape();
 //BA.debugLineNum = 184;BA.debugLine="S.Initialize";
_s._initialize(ba);
 //BA.debugLineNum = 185;BA.debugLine="S.setObject(Q.getObject)";
_s._setobject((anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_q._getobject())));
 break; }
case 8: {
 //BA.debugLineNum = 188;BA.debugLine="Dim R As GLRectangle = Shape";
_r = (com.stevel05.rtest.glrectangle)(_shape);
 //BA.debugLineNum = 189;BA.debugLine="Dim S As GLShape";
_s = new com.stevel05.rtest.glshape();
 //BA.debugLineNum = 190;BA.debugLine="S.Initialize";
_s._initialize(ba);
 //BA.debugLineNum = 191;BA.debugLine="S.setObject(R.getObject)";
_s._setobject((anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_r._getobject())));
 break; }
case 9: {
 //BA.debugLineNum = 194;BA.debugLine="Dim V As GLSVGPath = Shape";
_v = (com.stevel05.rtest.glsvgpath)(_shape);
 //BA.debugLineNum = 195;BA.debugLine="Dim S As GLShape";
_s = new com.stevel05.rtest.glshape();
 //BA.debugLineNum = 196;BA.debugLine="S.Initialize";
_s._initialize(ba);
 //BA.debugLineNum = 197;BA.debugLine="S.setObject(V.getObject)";
_s._setobject((anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_v._getobject())));
 break; }
case 10: {
 //BA.debugLineNum = 200;BA.debugLine="Dim T As GLText = Shape";
_t = (com.stevel05.rtest.gltext)(_shape);
 //BA.debugLineNum = 201;BA.debugLine="Dim S As GLShape";
_s = new com.stevel05.rtest.glshape();
 //BA.debugLineNum = 202;BA.debugLine="Dim S As GLShape";
_s = new com.stevel05.rtest.glshape();
 //BA.debugLineNum = 203;BA.debugLine="S.Initialize";
_s._initialize(ba);
 //BA.debugLineNum = 204;BA.debugLine="S.setObject(T.getObject)";
_s._setobject((anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_t._getobject())));
 break; }
}
;
 //BA.debugLineNum = 208;BA.debugLine="Return S";
if (true) return _s;
 //BA.debugLineNum = 209;BA.debugLine="End Sub";
return null;
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
 //BA.debugLineNum = 13;BA.debugLine="Public Sub Create";
 //BA.debugLineNum = 14;BA.debugLine="TJO.InitializeNewInstance(\"javafx.scene.shape.Sha";
_tjo.InitializeNewInstance("javafx.scene.shape.Shape",(Object[])(__c.Null));
 //BA.debugLineNum = 15;BA.debugLine="End Sub";
return "";
}
public Object  _getfill() throws Exception{
 //BA.debugLineNum = 17;BA.debugLine="Public Sub getFill As Object";
 //BA.debugLineNum = 18;BA.debugLine="Return TJO.RunMethod(\"getFill\",Null)";
if (true) return _tjo.RunMethod("getFill",(Object[])(__c.Null));
 //BA.debugLineNum = 19;BA.debugLine="End Sub";
return null;
}
public String  _getid() throws Exception{
 //BA.debugLineNum = 241;BA.debugLine="Sub getID As String";
 //BA.debugLineNum = 242;BA.debugLine="Return TJO.RunMethod(\"getId\",Null)";
if (true) return BA.ObjectToString(_tjo.RunMethod("getId",(Object[])(__c.Null)));
 //BA.debugLineNum = 243;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4j.object.JavaObject  _getjavaobject() throws Exception{
 //BA.debugLineNum = 235;BA.debugLine="Public Sub getJavaObject As JavaObject";
 //BA.debugLineNum = 236;BA.debugLine="Return TJO";
if (true) return _tjo;
 //BA.debugLineNum = 237;BA.debugLine="End Sub";
return null;
}
public int  _getminheight() throws Exception{
double _h = 0;
 //BA.debugLineNum = 222;BA.debugLine="Public Sub getMinHeight As Int";
 //BA.debugLineNum = 223;BA.debugLine="Dim H As Double = -1";
_h = -1;
 //BA.debugLineNum = 224;BA.debugLine="Return TJO.RunMethod(\"prefHeight\",Array(H))";
if (true) return (int)(BA.ObjectToNumber(_tjo.RunMethod("prefHeight",new Object[]{(Object)(_h)})));
 //BA.debugLineNum = 225;BA.debugLine="End Sub";
return 0;
}
public int  _getminwidth() throws Exception{
double _h = 0;
 //BA.debugLineNum = 218;BA.debugLine="Public Sub getMinWidth As Int";
 //BA.debugLineNum = 219;BA.debugLine="Dim H As Double = -1";
_h = -1;
 //BA.debugLineNum = 220;BA.debugLine="Return TJO.RunMethod(\"prefWidth\",Array(H))";
if (true) return (int)(BA.ObjectToNumber(_tjo.RunMethod("prefWidth",new Object[]{(Object)(_h)})));
 //BA.debugLineNum = 221;BA.debugLine="End Sub";
return 0;
}
public Object  _getobject() throws Exception{
 //BA.debugLineNum = 226;BA.debugLine="Public Sub getObject As Object";
 //BA.debugLineNum = 227;BA.debugLine="Return TJO";
if (true) return (Object)(_tjo.getObject());
 //BA.debugLineNum = 228;BA.debugLine="End Sub";
return null;
}
public int  _getprefheight() throws Exception{
double _h = 0;
 //BA.debugLineNum = 214;BA.debugLine="Public Sub getPrefHeight As Int";
 //BA.debugLineNum = 215;BA.debugLine="Dim H As Double = -1";
_h = -1;
 //BA.debugLineNum = 216;BA.debugLine="Return TJO.RunMethod(\"prefHeight\",Array(H))";
if (true) return (int)(BA.ObjectToNumber(_tjo.RunMethod("prefHeight",new Object[]{(Object)(_h)})));
 //BA.debugLineNum = 217;BA.debugLine="End Sub";
return 0;
}
public int  _getprefwidth() throws Exception{
double _h = 0;
 //BA.debugLineNum = 210;BA.debugLine="Public Sub getPrefWidth As Int";
 //BA.debugLineNum = 211;BA.debugLine="Dim H As Double = -1";
_h = -1;
 //BA.debugLineNum = 212;BA.debugLine="Return TJO.RunMethod(\"prefWidth\",Array(H))";
if (true) return (int)(BA.ObjectToNumber(_tjo.RunMethod("prefWidth",new Object[]{(Object)(_h)})));
 //BA.debugLineNum = 213;BA.debugLine="End Sub";
return 0;
}
public anywheresoftware.b4j.object.JavaObject  _getstroke() throws Exception{
 //BA.debugLineNum = 21;BA.debugLine="Public Sub getStroke As JavaObject";
 //BA.debugLineNum = 22;BA.debugLine="Return TJO.RunMethod(\"getStroke\",Null)";
if (true) return (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_tjo.RunMethod("getStroke",(Object[])(__c.Null))));
 //BA.debugLineNum = 23;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4j.object.JavaObject  _getstrokedasharray() throws Exception{
 //BA.debugLineNum = 25;BA.debugLine="Public Sub getStrokeDashArray As JavaObject";
 //BA.debugLineNum = 26;BA.debugLine="Return TJO.RunMethod(\"getStrokeDashArray\",Null)";
if (true) return (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_tjo.RunMethod("getStrokeDashArray",(Object[])(__c.Null))));
 //BA.debugLineNum = 27;BA.debugLine="End Sub";
return null;
}
public double  _getstrokedashoffset() throws Exception{
 //BA.debugLineNum = 29;BA.debugLine="Public Sub getStrokeDashOffset As Double";
 //BA.debugLineNum = 30;BA.debugLine="Return TJO.RunMethod(\"getStrokeDashOffset\",Null)";
if (true) return (double)(BA.ObjectToNumber(_tjo.RunMethod("getStrokeDashOffset",(Object[])(__c.Null))));
 //BA.debugLineNum = 31;BA.debugLine="End Sub";
return 0;
}
public String  _getstrokelinecap() throws Exception{
 //BA.debugLineNum = 33;BA.debugLine="Public Sub getStrokeLineCap As String";
 //BA.debugLineNum = 34;BA.debugLine="Return TJO.RunMethodJO(\"getStrokeLineCap\",Null).R";
if (true) return BA.ObjectToString(_tjo.RunMethodJO("getStrokeLineCap",(Object[])(__c.Null)).RunMethod("toString",(Object[])(__c.Null)));
 //BA.debugLineNum = 35;BA.debugLine="End Sub";
return "";
}
public String  _getstrokelinejoin() throws Exception{
 //BA.debugLineNum = 37;BA.debugLine="Public Sub getStrokeLineJoin As String";
 //BA.debugLineNum = 38;BA.debugLine="Return TJO.RunMethodJO(\"getStrokeLineJoin\",Null).";
if (true) return BA.ObjectToString(_tjo.RunMethodJO("getStrokeLineJoin",(Object[])(__c.Null)).RunMethod("toString",(Object[])(__c.Null)));
 //BA.debugLineNum = 39;BA.debugLine="End Sub";
return "";
}
public double  _getstrokemiterlimit() throws Exception{
 //BA.debugLineNum = 41;BA.debugLine="Public Sub getStrokeMiterLimit As Double";
 //BA.debugLineNum = 42;BA.debugLine="Return TJO.RunMethod(\"getStrokeMiterLimit\",Null)";
if (true) return (double)(BA.ObjectToNumber(_tjo.RunMethod("getStrokeMiterLimit",(Object[])(__c.Null))));
 //BA.debugLineNum = 43;BA.debugLine="End Sub";
return 0;
}
public String  _getstroketype() throws Exception{
 //BA.debugLineNum = 45;BA.debugLine="Public Sub getStrokeType As String";
 //BA.debugLineNum = 46;BA.debugLine="Return TJO.RunMethodJO(\"getStrokeType\",Null).RunM";
if (true) return BA.ObjectToString(_tjo.RunMethodJO("getStrokeType",(Object[])(__c.Null)).RunMethod("toString",(Object[])(__c.Null)));
 //BA.debugLineNum = 47;BA.debugLine="End Sub";
return "";
}
public double  _getstrokewidth() throws Exception{
 //BA.debugLineNum = 49;BA.debugLine="Public Sub getStrokeWidth As Double";
 //BA.debugLineNum = 50;BA.debugLine="Return TJO.RunMethod(\"getStrokeWidth\",Null)";
if (true) return (double)(BA.ObjectToNumber(_tjo.RunMethod("getStrokeWidth",(Object[])(__c.Null))));
 //BA.debugLineNum = 51;BA.debugLine="End Sub";
return 0;
}
public Object  _gettag() throws Exception{
 //BA.debugLineNum = 247;BA.debugLine="Sub getTag As Object";
 //BA.debugLineNum = 248;BA.debugLine="Return mTag";
if (true) return _mtag;
 //BA.debugLineNum = 249;BA.debugLine="End Sub";
return null;
}
public String  _initialize(anywheresoftware.b4a.BA _ba) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 9;BA.debugLine="Public Sub Initialize()";
 //BA.debugLineNum = 11;BA.debugLine="End Sub";
return "";
}
public com.stevel05.rtest.glshape  _intersect(Object _shape1,Object _shape2) throws Exception{
com.stevel05.rtest.glshape _s1 = null;
com.stevel05.rtest.glshape _s2 = null;
com.stevel05.rtest.glshape _s = null;
anywheresoftware.b4j.object.JavaObject _sjo = null;
 //BA.debugLineNum = 53;BA.debugLine="Public Sub Intersect(Shape1 As Object, Shape2 As O";
 //BA.debugLineNum = 55;BA.debugLine="Dim S1 As GLShape = CastShape(Shape1)";
_s1 = _castshape(_shape1);
 //BA.debugLineNum = 56;BA.debugLine="Dim S2 As GLShape = CastShape(Shape2)";
_s2 = _castshape(_shape2);
 //BA.debugLineNum = 58;BA.debugLine="Dim S As GLShape";
_s = new com.stevel05.rtest.glshape();
 //BA.debugLineNum = 59;BA.debugLine="Dim SJO As JavaObject";
_sjo = new anywheresoftware.b4j.object.JavaObject();
 //BA.debugLineNum = 60;BA.debugLine="SJO.InitializeStatic(\"javafx.scene.shape.Shape\")";
_sjo.InitializeStatic("javafx.scene.shape.Shape");
 //BA.debugLineNum = 61;BA.debugLine="S.setObject(SJO.RunMethod(\"intersect\",Array As Ob";
_s._setobject((anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_sjo.RunMethod("intersect",new Object[]{_s1._getobject(),_s2._getobject()}))));
 //BA.debugLineNum = 62;BA.debugLine="Return S";
if (true) return _s;
 //BA.debugLineNum = 64;BA.debugLine="End Sub";
return null;
}
public boolean  _issmooth() throws Exception{
 //BA.debugLineNum = 66;BA.debugLine="Public Sub IsSmooth As Boolean";
 //BA.debugLineNum = 67;BA.debugLine="Return TJO.RunMethod(\"isSmooth\",Null)";
if (true) return BA.ObjectToBoolean(_tjo.RunMethod("isSmooth",(Object[])(__c.Null)));
 //BA.debugLineNum = 68;BA.debugLine="End Sub";
return false;
}
public String  _setfill(Object _value) throws Exception{
 //BA.debugLineNum = 70;BA.debugLine="Public Sub setFill(Value As Object)";
 //BA.debugLineNum = 71;BA.debugLine="TJO.RunMethod(\"setFill\",Array As Object(Value))";
_tjo.RunMethod("setFill",new Object[]{_value});
 //BA.debugLineNum = 72;BA.debugLine="End Sub";
return "";
}
public String  _setid(String _id) throws Exception{
 //BA.debugLineNum = 238;BA.debugLine="Sub setID(ID As String)";
 //BA.debugLineNum = 239;BA.debugLine="TJO.RunMethod(\"setId\",Array(ID))";
_tjo.RunMethod("setId",new Object[]{(Object)(_id)});
 //BA.debugLineNum = 240;BA.debugLine="End Sub";
return "";
}
public String  _setobject(anywheresoftware.b4j.object.JavaObject _obj) throws Exception{
 //BA.debugLineNum = 229;BA.debugLine="Public Sub setObject(Obj As JavaObject)";
 //BA.debugLineNum = 230;BA.debugLine="TJO = Obj";
_tjo = _obj;
 //BA.debugLineNum = 231;BA.debugLine="End Sub";
return "";
}
public String  _setsmooth(boolean _value) throws Exception{
 //BA.debugLineNum = 74;BA.debugLine="Public Sub setSmooth(Value As Boolean)";
 //BA.debugLineNum = 75;BA.debugLine="TJO.RunMethod(\"setSmooth\",Array As Object(Value))";
_tjo.RunMethod("setSmooth",new Object[]{(Object)(_value)});
 //BA.debugLineNum = 76;BA.debugLine="End Sub";
return "";
}
public String  _setstroke(anywheresoftware.b4j.object.JavaObject _value) throws Exception{
 //BA.debugLineNum = 78;BA.debugLine="Public Sub setStroke(Value As JavaObject)";
 //BA.debugLineNum = 79;BA.debugLine="TJO.RunMethod(\"setStroke\",Array As Object(Value))";
_tjo.RunMethod("setStroke",new Object[]{(Object)(_value.getObject())});
 //BA.debugLineNum = 80;BA.debugLine="End Sub";
return "";
}
public String  _setstrokedashoffset(double _value) throws Exception{
 //BA.debugLineNum = 82;BA.debugLine="Public Sub setStrokeDashOffset(Value As Double)";
 //BA.debugLineNum = 83;BA.debugLine="TJO.RunMethod(\"setStrokeDashOffset\",Array As Obje";
_tjo.RunMethod("setStrokeDashOffset",new Object[]{(Object)(_value)});
 //BA.debugLineNum = 84;BA.debugLine="End Sub";
return "";
}
public String  _setstrokelinecap(String _value) throws Exception{
anywheresoftware.b4j.object.JavaObject _jo = null;
 //BA.debugLineNum = 86;BA.debugLine="Public Sub setStrokeLineCap(Value As String)";
 //BA.debugLineNum = 87;BA.debugLine="Dim JO As JavaObject";
_jo = new anywheresoftware.b4j.object.JavaObject();
 //BA.debugLineNum = 88;BA.debugLine="JO.InitializeStatic(\"javafx.scene.shape.StrokeLin";
_jo.InitializeStatic("javafx.scene.shape.StrokeLineCap");
 //BA.debugLineNum = 89;BA.debugLine="TJO.RunMethod(\"setStrokeLineCap\",Array(JO.RunMeth";
_tjo.RunMethod("setStrokeLineCap",new Object[]{_jo.RunMethod("valueOf",new Object[]{(Object)(_value)})});
 //BA.debugLineNum = 90;BA.debugLine="End Sub";
return "";
}
public String  _setstrokelinejoin(String _value) throws Exception{
anywheresoftware.b4j.object.JavaObject _jo = null;
 //BA.debugLineNum = 92;BA.debugLine="Public Sub setStrokeLineJoin(Value As String)";
 //BA.debugLineNum = 93;BA.debugLine="Dim JO As JavaObject";
_jo = new anywheresoftware.b4j.object.JavaObject();
 //BA.debugLineNum = 94;BA.debugLine="JO.InitializeStatic(\"javafx.scene.shape.StrokeLin";
_jo.InitializeStatic("javafx.scene.shape.StrokeLineJoin");
 //BA.debugLineNum = 95;BA.debugLine="TJO.RunMethod(\"setStrokeLineJoin\",Array As Object";
_tjo.RunMethod("setStrokeLineJoin",new Object[]{_jo.RunMethod("valueOf",new Object[]{(Object)(_value)})});
 //BA.debugLineNum = 96;BA.debugLine="End Sub";
return "";
}
public String  _setstrokemiterlimit(double _value) throws Exception{
 //BA.debugLineNum = 98;BA.debugLine="Public Sub setStrokeMiterLimit(Value As Double)";
 //BA.debugLineNum = 99;BA.debugLine="TJO.RunMethod(\"setStrokeMiterLimit\",Array As Obje";
_tjo.RunMethod("setStrokeMiterLimit",new Object[]{(Object)(_value)});
 //BA.debugLineNum = 100;BA.debugLine="End Sub";
return "";
}
public String  _setstroketype(String _value) throws Exception{
anywheresoftware.b4j.object.JavaObject _jo = null;
 //BA.debugLineNum = 102;BA.debugLine="Public Sub setStrokeType(Value As String)";
 //BA.debugLineNum = 103;BA.debugLine="Dim JO As JavaObject";
_jo = new anywheresoftware.b4j.object.JavaObject();
 //BA.debugLineNum = 104;BA.debugLine="JO.InitializeStatic(\"javafx.scene.shape.StrokeTyp";
_jo.InitializeStatic("javafx.scene.shape.StrokeType");
 //BA.debugLineNum = 105;BA.debugLine="TJO.RunMethod(\"setStrokeType\",Array As Object(JO.";
_tjo.RunMethod("setStrokeType",new Object[]{_jo.RunMethod("valueOf",new Object[]{(Object)(_value)})});
 //BA.debugLineNum = 106;BA.debugLine="End Sub";
return "";
}
public String  _setstrokewidth(double _value) throws Exception{
 //BA.debugLineNum = 108;BA.debugLine="Public Sub setStrokeWidth(Value As Double)";
 //BA.debugLineNum = 109;BA.debugLine="TJO.RunMethod(\"setStrokeWidth\",Array As Object(Va";
_tjo.RunMethod("setStrokeWidth",new Object[]{(Object)(_value)});
 //BA.debugLineNum = 110;BA.debugLine="End Sub";
return "";
}
public String  _settag(Object _tag) throws Exception{
 //BA.debugLineNum = 244;BA.debugLine="Sub setTag(Tag As Object)";
 //BA.debugLineNum = 245;BA.debugLine="mTag = Tag";
_mtag = _tag;
 //BA.debugLineNum = 246;BA.debugLine="End Sub";
return "";
}
public com.stevel05.rtest.glshape  _subtract(Object _shape1,Object _shape2) throws Exception{
com.stevel05.rtest.glshape _s1 = null;
com.stevel05.rtest.glshape _s2 = null;
com.stevel05.rtest.glshape _s = null;
anywheresoftware.b4j.object.JavaObject _sjo = null;
 //BA.debugLineNum = 112;BA.debugLine="Public Sub Subtract(Shape1 As Object, Shape2 As Ob";
 //BA.debugLineNum = 114;BA.debugLine="Dim S1 As GLShape = CastShape(Shape1)";
_s1 = _castshape(_shape1);
 //BA.debugLineNum = 115;BA.debugLine="Dim S2 As GLShape = CastShape(Shape2)";
_s2 = _castshape(_shape2);
 //BA.debugLineNum = 117;BA.debugLine="Dim S As GLShape";
_s = new com.stevel05.rtest.glshape();
 //BA.debugLineNum = 118;BA.debugLine="Dim SJO As JavaObject";
_sjo = new anywheresoftware.b4j.object.JavaObject();
 //BA.debugLineNum = 119;BA.debugLine="SJO.InitializeStatic(\"javafx.scene.shape.Shape\")";
_sjo.InitializeStatic("javafx.scene.shape.Shape");
 //BA.debugLineNum = 120;BA.debugLine="S.setObject(SJO.RunMethod(\"subtract\",Array As Obj";
_s._setobject((anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_sjo.RunMethod("subtract",new Object[]{_s1._getobject(),_s2._getobject()}))));
 //BA.debugLineNum = 121;BA.debugLine="Return S";
if (true) return _s;
 //BA.debugLineNum = 122;BA.debugLine="End Sub";
return null;
}
public com.stevel05.rtest.glshape  _union(Object _shape1,Object _shape2) throws Exception{
com.stevel05.rtest.glshape _s1 = null;
com.stevel05.rtest.glshape _s2 = null;
com.stevel05.rtest.glshape _s = null;
anywheresoftware.b4j.object.JavaObject _sjo = null;
 //BA.debugLineNum = 124;BA.debugLine="Public Sub Union(Shape1 As Object, Shape2 As Objec";
 //BA.debugLineNum = 126;BA.debugLine="Dim S1 As GLShape = CastShape(Shape1)";
_s1 = _castshape(_shape1);
 //BA.debugLineNum = 127;BA.debugLine="Dim S2 As GLShape = CastShape(Shape2)";
_s2 = _castshape(_shape2);
 //BA.debugLineNum = 129;BA.debugLine="Dim S As GLShape";
_s = new com.stevel05.rtest.glshape();
 //BA.debugLineNum = 130;BA.debugLine="Dim SJO As JavaObject";
_sjo = new anywheresoftware.b4j.object.JavaObject();
 //BA.debugLineNum = 131;BA.debugLine="SJO.InitializeStatic(\"javafx.scene.shape.Shape\")";
_sjo.InitializeStatic("javafx.scene.shape.Shape");
 //BA.debugLineNum = 132;BA.debugLine="S.setObject(SJO.RunMethod(\"union\",Array As Object";
_s._setobject((anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_sjo.RunMethod("union",new Object[]{_s1._getobject(),_s2._getobject()}))));
 //BA.debugLineNum = 133;BA.debugLine="Return S";
if (true) return _s;
 //BA.debugLineNum = 134;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
