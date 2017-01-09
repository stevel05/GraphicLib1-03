package com.stevel05.rtest;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.debug.*;

public class glstop extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("com.stevel05.rtest", "com.stevel05.rtest.glstop", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", com.stevel05.rtest.glstop.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4j.objects.JFX _fx = null;
public anywheresoftware.b4j.object.JavaObject _tjo = null;
public Object _mtag = null;
public com.stevel05.rtest.glshape_static _glshape_static = null;
public anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper  _asnode() throws Exception{
 //BA.debugLineNum = 34;BA.debugLine="Public Sub AsNode As Node";
 //BA.debugLineNum = 35;BA.debugLine="Return TJO";
if (true) return (anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_tjo.getObject()));
 //BA.debugLineNum = 36;BA.debugLine="End Sub";
return null;
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Private fx As JFX ' Uncomment if required for B4j";
_fx = new anywheresoftware.b4j.objects.JFX();
 //BA.debugLineNum = 5;BA.debugLine="Private TJO As JavaObject";
_tjo = new anywheresoftware.b4j.object.JavaObject();
 //BA.debugLineNum = 6;BA.debugLine="Private mTag As Object";
_mtag = new Object();
 //BA.debugLineNum = 7;BA.debugLine="End Sub";
return "";
}
public String  _create(double _offset,Object _color) throws Exception{
anywheresoftware.b4j.object.JavaObject _colorjo = null;
anywheresoftware.b4j.object.JavaObject _pcolor = null;
 //BA.debugLineNum = 13;BA.debugLine="Public Sub Create(Offset As Double, Color As Objec";
 //BA.debugLineNum = 14;BA.debugLine="Dim ColorJO As JavaObject = Color";
_colorjo = new anywheresoftware.b4j.object.JavaObject();
_colorjo.setObject((java.lang.Object)(_color));
 //BA.debugLineNum = 15;BA.debugLine="Dim PColor As JavaObject";
_pcolor = new anywheresoftware.b4j.object.JavaObject();
 //BA.debugLineNum = 16;BA.debugLine="PColor.InitializeStatic(\"javafx.scene.paint.Color";
_pcolor.InitializeStatic("javafx.scene.paint.Color");
 //BA.debugLineNum = 18;BA.debugLine="TJO.InitializeNewInstance(\"javafx.scene.paint.Sto";
_tjo.InitializeNewInstance("javafx.scene.paint.Stop",new Object[]{(Object)(_offset),_pcolor.RunMethod("valueOf",new Object[]{_colorjo.RunMethod("toString",(Object[])(__c.Null))})});
 //BA.debugLineNum = 19;BA.debugLine="End Sub";
return "";
}
public Object  _getcolor() throws Exception{
 //BA.debugLineNum = 21;BA.debugLine="Public Sub getColor As Object";
 //BA.debugLineNum = 22;BA.debugLine="Return TJO.RunMethod(\"getColor\",Null)";
if (true) return _tjo.RunMethod("getColor",(Object[])(__c.Null));
 //BA.debugLineNum = 23;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4j.object.JavaObject  _getjavaobject() throws Exception{
 //BA.debugLineNum = 37;BA.debugLine="Public Sub getJavaObject As JavaObject";
 //BA.debugLineNum = 38;BA.debugLine="Return TJO";
if (true) return _tjo;
 //BA.debugLineNum = 39;BA.debugLine="End Sub";
return null;
}
public Object  _getobject() throws Exception{
 //BA.debugLineNum = 28;BA.debugLine="Public Sub getObject As Object";
 //BA.debugLineNum = 29;BA.debugLine="Return TJO";
if (true) return (Object)(_tjo.getObject());
 //BA.debugLineNum = 30;BA.debugLine="End Sub";
return null;
}
public double  _getoffset() throws Exception{
 //BA.debugLineNum = 25;BA.debugLine="Public Sub getOffset As Double";
 //BA.debugLineNum = 26;BA.debugLine="Return TJO.RunMethod(\"getOffset\",Null)";
if (true) return (double)(BA.ObjectToNumber(_tjo.RunMethod("getOffset",(Object[])(__c.Null))));
 //BA.debugLineNum = 27;BA.debugLine="End Sub";
return 0;
}
public Object  _gettag() throws Exception{
 //BA.debugLineNum = 43;BA.debugLine="Sub getTag As Object";
 //BA.debugLineNum = 44;BA.debugLine="Return mTag";
if (true) return _mtag;
 //BA.debugLineNum = 45;BA.debugLine="End Sub";
return null;
}
public String  _initialize(anywheresoftware.b4a.BA _ba) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 10;BA.debugLine="Public Sub Initialize";
 //BA.debugLineNum = 11;BA.debugLine="End Sub";
return "";
}
public String  _setobject(Object _obj) throws Exception{
 //BA.debugLineNum = 31;BA.debugLine="Public Sub setObject(Obj As Object)";
 //BA.debugLineNum = 32;BA.debugLine="TJO = Obj";
_tjo.setObject((java.lang.Object)(_obj));
 //BA.debugLineNum = 33;BA.debugLine="End Sub";
return "";
}
public String  _settag(Object _tag) throws Exception{
 //BA.debugLineNum = 40;BA.debugLine="Sub setTag(Tag As Object)";
 //BA.debugLineNum = 41;BA.debugLine="mTag = Tag";
_mtag = _tag;
 //BA.debugLineNum = 42;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
