package com.stevel05.rtest;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.debug.*;

public class gllineargradient extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("com.stevel05.rtest", "com.stevel05.rtest.gllineargradient", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", com.stevel05.rtest.gllineargradient.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4j.object.JavaObject _tjo = null;
public com.stevel05.rtest.glshape_static _glshape_static = null;
public anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper  _asnode() throws Exception{
 //BA.debugLineNum = 68;BA.debugLine="Public Sub AsNode As Node";
 //BA.debugLineNum = 69;BA.debugLine="Return TJO";
if (true) return (anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_tjo.getObject()));
 //BA.debugLineNum = 70;BA.debugLine="End Sub";
return null;
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 5;BA.debugLine="Private TJO As JavaObject";
_tjo = new anywheresoftware.b4j.object.JavaObject();
 //BA.debugLineNum = 6;BA.debugLine="End Sub";
return "";
}
public String  _create(double _startx,double _starty,double _endx,double _endy,boolean _proportional,String _cyclemethod,anywheresoftware.b4a.objects.collections.List _stops) throws Exception{
anywheresoftware.b4a.objects.collections.List _stopslist = null;
com.stevel05.rtest.glstop _s = null;
anywheresoftware.b4j.object.JavaObject _jo = null;
 //BA.debugLineNum = 11;BA.debugLine="Public Sub Create(StartX As Double, StartY As Doub";
 //BA.debugLineNum = 12;BA.debugLine="Dim StopsList As List";
_stopslist = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 13;BA.debugLine="StopsList.Initialize";
_stopslist.Initialize();
 //BA.debugLineNum = 14;BA.debugLine="For Each S As GLStop In Stops";
final anywheresoftware.b4a.BA.IterableList group3 = _stops;
final int groupLen3 = group3.getSize();
for (int index3 = 0;index3 < groupLen3 ;index3++){
_s = (com.stevel05.rtest.glstop)(group3.Get(index3));
 //BA.debugLineNum = 15;BA.debugLine="StopsList.Add(S.getObject)";
_stopslist.Add(_s._getobject());
 }
;
 //BA.debugLineNum = 17;BA.debugLine="Dim JO As JavaObject";
_jo = new anywheresoftware.b4j.object.JavaObject();
 //BA.debugLineNum = 18;BA.debugLine="JO.InitializeStatic(\"javafx.scene.paint.CycleMeth";
_jo.InitializeStatic("javafx.scene.paint.CycleMethod");
 //BA.debugLineNum = 19;BA.debugLine="TJO.InitializeNewInstance(\"javafx.scene.paint.Lin";
_tjo.InitializeNewInstance("javafx.scene.paint.LinearGradient",new Object[]{(Object)(_startx),(Object)(_starty),(Object)(_endx),(Object)(_endy),(Object)(_proportional),_jo.RunMethod("valueOf",new Object[]{(Object)(_cyclemethod)}),(Object)(_stopslist.getObject())});
 //BA.debugLineNum = 20;BA.debugLine="End Sub";
return "";
}
public String  _getcyclemethod() throws Exception{
 //BA.debugLineNum = 23;BA.debugLine="Public Sub getCycleMethod As String";
 //BA.debugLineNum = 24;BA.debugLine="Return TJO.RunMethodJO(\"getCycleMethod\",Null).Run";
if (true) return BA.ObjectToString(_tjo.RunMethodJO("getCycleMethod",(Object[])(__c.Null)).RunMethod("toString",(Object[])(__c.Null)));
 //BA.debugLineNum = 25;BA.debugLine="End Sub";
return "";
}
public double  _getendx() throws Exception{
 //BA.debugLineNum = 27;BA.debugLine="Public Sub getEndX As Double";
 //BA.debugLineNum = 28;BA.debugLine="Return TJO.RunMethod(\"getEndX\",Null)";
if (true) return (double)(BA.ObjectToNumber(_tjo.RunMethod("getEndX",(Object[])(__c.Null))));
 //BA.debugLineNum = 29;BA.debugLine="End Sub";
return 0;
}
public double  _getendy() throws Exception{
 //BA.debugLineNum = 31;BA.debugLine="Public Sub getEndY As Double";
 //BA.debugLineNum = 32;BA.debugLine="Return TJO.RunMethod(\"getEndY\",Null)";
if (true) return (double)(BA.ObjectToNumber(_tjo.RunMethod("getEndY",(Object[])(__c.Null))));
 //BA.debugLineNum = 33;BA.debugLine="End Sub";
return 0;
}
public anywheresoftware.b4j.object.JavaObject  _getjavaobject() throws Exception{
 //BA.debugLineNum = 65;BA.debugLine="Public Sub getJavaObject As JavaObject";
 //BA.debugLineNum = 66;BA.debugLine="Return TJO";
if (true) return _tjo;
 //BA.debugLineNum = 67;BA.debugLine="End Sub";
return null;
}
public Object  _getobject() throws Exception{
 //BA.debugLineNum = 59;BA.debugLine="Public Sub getObject As Object";
 //BA.debugLineNum = 60;BA.debugLine="Return TJO";
if (true) return (Object)(_tjo.getObject());
 //BA.debugLineNum = 61;BA.debugLine="End Sub";
return null;
}
public double  _getstartx() throws Exception{
 //BA.debugLineNum = 35;BA.debugLine="Public Sub getStartX As Double";
 //BA.debugLineNum = 36;BA.debugLine="Return TJO.RunMethod(\"getStartX\",Null)";
if (true) return (double)(BA.ObjectToNumber(_tjo.RunMethod("getStartX",(Object[])(__c.Null))));
 //BA.debugLineNum = 37;BA.debugLine="End Sub";
return 0;
}
public double  _getstarty() throws Exception{
 //BA.debugLineNum = 39;BA.debugLine="Public Sub getStartY As Double";
 //BA.debugLineNum = 40;BA.debugLine="Return TJO.RunMethod(\"getStartY\",Null)";
if (true) return (double)(BA.ObjectToNumber(_tjo.RunMethod("getStartY",(Object[])(__c.Null))));
 //BA.debugLineNum = 41;BA.debugLine="End Sub";
return 0;
}
public anywheresoftware.b4a.objects.collections.List  _getstops() throws Exception{
anywheresoftware.b4a.objects.collections.List _l = null;
anywheresoftware.b4a.objects.collections.List _rl = null;
anywheresoftware.b4j.object.JavaObject _s = null;
com.stevel05.rtest.glstop _st = null;
 //BA.debugLineNum = 43;BA.debugLine="Public Sub getStops As List";
 //BA.debugLineNum = 44;BA.debugLine="Dim L As List = TJO.RunMethod(\"getStops\",Null)";
_l = new anywheresoftware.b4a.objects.collections.List();
_l.setObject((java.util.List)(_tjo.RunMethod("getStops",(Object[])(__c.Null))));
 //BA.debugLineNum = 45;BA.debugLine="Dim RL As List";
_rl = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 46;BA.debugLine="RL.Initialize";
_rl.Initialize();
 //BA.debugLineNum = 47;BA.debugLine="For Each S As JavaObject In L";
_s = new anywheresoftware.b4j.object.JavaObject();
final anywheresoftware.b4a.BA.IterableList group4 = _l;
final int groupLen4 = group4.getSize();
for (int index4 = 0;index4 < groupLen4 ;index4++){
_s.setObject((java.lang.Object)(group4.Get(index4)));
 //BA.debugLineNum = 48;BA.debugLine="Dim ST As GLStop";
_st = new com.stevel05.rtest.glstop();
 //BA.debugLineNum = 49;BA.debugLine="ST.Initialize";
_st._initialize(ba);
 //BA.debugLineNum = 50;BA.debugLine="ST.setObject(S)";
_st._setobject((Object)(_s.getObject()));
 //BA.debugLineNum = 51;BA.debugLine="RL.Add(ST)";
_rl.Add((Object)(_st));
 }
;
 //BA.debugLineNum = 53;BA.debugLine="Return RL";
if (true) return _rl;
 //BA.debugLineNum = 54;BA.debugLine="End Sub";
return null;
}
public String  _initialize(anywheresoftware.b4a.BA _ba) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 9;BA.debugLine="Public Sub Initialize";
 //BA.debugLineNum = 10;BA.debugLine="End Sub";
return "";
}
public boolean  _isproportional() throws Exception{
 //BA.debugLineNum = 56;BA.debugLine="Public Sub IsProportional As Boolean";
 //BA.debugLineNum = 57;BA.debugLine="Return TJO.RunMethod(\"isProportional\",Null)";
if (true) return BA.ObjectToBoolean(_tjo.RunMethod("isProportional",(Object[])(__c.Null)));
 //BA.debugLineNum = 58;BA.debugLine="End Sub";
return false;
}
public String  _setobject(Object _obj) throws Exception{
 //BA.debugLineNum = 62;BA.debugLine="Public Sub setObject(Obj As Object)";
 //BA.debugLineNum = 63;BA.debugLine="TJO = Obj";
_tjo.setObject((java.lang.Object)(_obj));
 //BA.debugLineNum = 64;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
