package com.stevel05.rtest;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.debug.*;

public class glradialgradient extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("com.stevel05.rtest", "com.stevel05.rtest.glradialgradient", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", com.stevel05.rtest.glradialgradient.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4j.object.JavaObject _tjo = null;
public Object _mtag = null;
public com.stevel05.rtest.glshape_static _glshape_static = null;
public anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper  _asnode() throws Exception{
 //BA.debugLineNum = 73;BA.debugLine="Public Sub AsNode As Node";
 //BA.debugLineNum = 74;BA.debugLine="Return TJO";
if (true) return (anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_tjo.getObject()));
 //BA.debugLineNum = 75;BA.debugLine="End Sub";
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
public String  _create(double _focusangle,double _focusdistance,double _centerx,double _centery,double _radius,boolean _proportional,String _cyclemethod,anywheresoftware.b4a.objects.collections.List _stops) throws Exception{
anywheresoftware.b4a.objects.collections.List _stopslist = null;
com.stevel05.rtest.glstop _s = null;
anywheresoftware.b4j.object.JavaObject _jo = null;
 //BA.debugLineNum = 15;BA.debugLine="Public Sub Create(FocusAngle As Double, FocusDista";
 //BA.debugLineNum = 16;BA.debugLine="Dim StopsList As List";
_stopslist = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 17;BA.debugLine="StopsList.Initialize";
_stopslist.Initialize();
 //BA.debugLineNum = 18;BA.debugLine="For Each S As GLStop In Stops";
final anywheresoftware.b4a.BA.IterableList group3 = _stops;
final int groupLen3 = group3.getSize();
for (int index3 = 0;index3 < groupLen3 ;index3++){
_s = (com.stevel05.rtest.glstop)(group3.Get(index3));
 //BA.debugLineNum = 19;BA.debugLine="StopsList.Add(S.getObject)";
_stopslist.Add(_s._getobject());
 }
;
 //BA.debugLineNum = 21;BA.debugLine="Dim JO As JavaObject";
_jo = new anywheresoftware.b4j.object.JavaObject();
 //BA.debugLineNum = 22;BA.debugLine="JO.InitializeStatic(\"javafx.scene.paint.CycleMeth";
_jo.InitializeStatic("javafx.scene.paint.CycleMethod");
 //BA.debugLineNum = 23;BA.debugLine="TJO.InitializeNewInstance(\"javafx.scene.paint.Rad";
_tjo.InitializeNewInstance("javafx.scene.paint.RadialGradient",new Object[]{(Object)(_focusangle),(Object)(_focusdistance),(Object)(_centerx),(Object)(_centery),(Object)(_radius),(Object)(_proportional),_jo.RunMethod("valueOf",new Object[]{(Object)(_cyclemethod)}),(Object)(_stopslist.getObject())});
 //BA.debugLineNum = 24;BA.debugLine="End Sub";
return "";
}
public double  _getcenterx() throws Exception{
 //BA.debugLineNum = 27;BA.debugLine="Public Sub getCenterX As Double";
 //BA.debugLineNum = 28;BA.debugLine="Return TJO.RunMethod(\"getCenterX\",Null)";
if (true) return (double)(BA.ObjectToNumber(_tjo.RunMethod("getCenterX",(Object[])(__c.Null))));
 //BA.debugLineNum = 29;BA.debugLine="End Sub";
return 0;
}
public double  _getcentery() throws Exception{
 //BA.debugLineNum = 31;BA.debugLine="Public Sub getCenterY As Double";
 //BA.debugLineNum = 32;BA.debugLine="Return TJO.RunMethod(\"getCenterY\",Null)";
if (true) return (double)(BA.ObjectToNumber(_tjo.RunMethod("getCenterY",(Object[])(__c.Null))));
 //BA.debugLineNum = 33;BA.debugLine="End Sub";
return 0;
}
public String  _getcyclemethod() throws Exception{
 //BA.debugLineNum = 35;BA.debugLine="Public Sub getCycleMethod As String";
 //BA.debugLineNum = 36;BA.debugLine="Return TJO.RunMethodJO(\"getCycleMethod\",Null).Run";
if (true) return BA.ObjectToString(_tjo.RunMethodJO("getCycleMethod",(Object[])(__c.Null)).RunMethod("toString",(Object[])(__c.Null)));
 //BA.debugLineNum = 37;BA.debugLine="End Sub";
return "";
}
public double  _getfocusangle() throws Exception{
 //BA.debugLineNum = 39;BA.debugLine="Public Sub getFocusAngle As Double";
 //BA.debugLineNum = 40;BA.debugLine="Return TJO.RunMethod(\"getFocusAngle\",Null)";
if (true) return (double)(BA.ObjectToNumber(_tjo.RunMethod("getFocusAngle",(Object[])(__c.Null))));
 //BA.debugLineNum = 41;BA.debugLine="End Sub";
return 0;
}
public double  _getfocusdistance() throws Exception{
 //BA.debugLineNum = 43;BA.debugLine="Public Sub getFocusDistance As Double";
 //BA.debugLineNum = 44;BA.debugLine="Return TJO.RunMethod(\"getFocusDistance\",Null)";
if (true) return (double)(BA.ObjectToNumber(_tjo.RunMethod("getFocusDistance",(Object[])(__c.Null))));
 //BA.debugLineNum = 45;BA.debugLine="End Sub";
return 0;
}
public String  _getid() throws Exception{
 //BA.debugLineNum = 82;BA.debugLine="Sub getID As String";
 //BA.debugLineNum = 83;BA.debugLine="Return TJO.RunMethod(\"getId\",Null)";
if (true) return BA.ObjectToString(_tjo.RunMethod("getId",(Object[])(__c.Null)));
 //BA.debugLineNum = 84;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4j.object.JavaObject  _getjavaobject() throws Exception{
 //BA.debugLineNum = 76;BA.debugLine="Public Sub getJavaObject As JavaObject";
 //BA.debugLineNum = 77;BA.debugLine="Return TJO";
if (true) return _tjo;
 //BA.debugLineNum = 78;BA.debugLine="End Sub";
return null;
}
public Object  _getobject() throws Exception{
 //BA.debugLineNum = 67;BA.debugLine="Public Sub getObject As Object";
 //BA.debugLineNum = 68;BA.debugLine="Return TJO";
if (true) return (Object)(_tjo.getObject());
 //BA.debugLineNum = 69;BA.debugLine="End Sub";
return null;
}
public double  _getradius() throws Exception{
 //BA.debugLineNum = 47;BA.debugLine="Public Sub getRadius As Double";
 //BA.debugLineNum = 48;BA.debugLine="Return TJO.RunMethod(\"getRadius\",Null)";
if (true) return (double)(BA.ObjectToNumber(_tjo.RunMethod("getRadius",(Object[])(__c.Null))));
 //BA.debugLineNum = 49;BA.debugLine="End Sub";
return 0;
}
public anywheresoftware.b4a.objects.collections.List  _getstops() throws Exception{
anywheresoftware.b4a.objects.collections.List _l = null;
anywheresoftware.b4a.objects.collections.List _rl = null;
anywheresoftware.b4j.object.JavaObject _s = null;
com.stevel05.rtest.glstop _st = null;
 //BA.debugLineNum = 51;BA.debugLine="Public Sub getStops As List";
 //BA.debugLineNum = 52;BA.debugLine="Dim L As List = TJO.RunMethod(\"getStops\",Null)";
_l = new anywheresoftware.b4a.objects.collections.List();
_l.setObject((java.util.List)(_tjo.RunMethod("getStops",(Object[])(__c.Null))));
 //BA.debugLineNum = 53;BA.debugLine="Dim RL As List";
_rl = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 54;BA.debugLine="RL.Initialize";
_rl.Initialize();
 //BA.debugLineNum = 55;BA.debugLine="For Each S As JavaObject In L";
_s = new anywheresoftware.b4j.object.JavaObject();
final anywheresoftware.b4a.BA.IterableList group4 = _l;
final int groupLen4 = group4.getSize();
for (int index4 = 0;index4 < groupLen4 ;index4++){
_s.setObject((java.lang.Object)(group4.Get(index4)));
 //BA.debugLineNum = 56;BA.debugLine="Dim ST As GLStop";
_st = new com.stevel05.rtest.glstop();
 //BA.debugLineNum = 57;BA.debugLine="ST.Initialize";
_st._initialize(ba);
 //BA.debugLineNum = 58;BA.debugLine="ST.setObject(S)";
_st._setobject((Object)(_s.getObject()));
 //BA.debugLineNum = 59;BA.debugLine="RL.Add(ST)";
_rl.Add((Object)(_st));
 }
;
 //BA.debugLineNum = 61;BA.debugLine="Return RL";
if (true) return _rl;
 //BA.debugLineNum = 62;BA.debugLine="End Sub";
return null;
}
public Object  _gettag() throws Exception{
 //BA.debugLineNum = 88;BA.debugLine="Sub getTag As Object";
 //BA.debugLineNum = 89;BA.debugLine="Return mTag";
if (true) return _mtag;
 //BA.debugLineNum = 90;BA.debugLine="End Sub";
return null;
}
public String  _initialize(anywheresoftware.b4a.BA _ba) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 10;BA.debugLine="Public Sub Initialize";
 //BA.debugLineNum = 12;BA.debugLine="End Sub";
return "";
}
public boolean  _isproportional() throws Exception{
 //BA.debugLineNum = 64;BA.debugLine="Public Sub IsProportional As Boolean";
 //BA.debugLineNum = 65;BA.debugLine="Return TJO.RunMethod(\"isProportional\",Null)";
if (true) return BA.ObjectToBoolean(_tjo.RunMethod("isProportional",(Object[])(__c.Null)));
 //BA.debugLineNum = 66;BA.debugLine="End Sub";
return false;
}
public String  _setid(String _id) throws Exception{
 //BA.debugLineNum = 79;BA.debugLine="Sub setID(ID As String)";
 //BA.debugLineNum = 80;BA.debugLine="TJO.RunMethod(\"setId\",Array(ID))";
_tjo.RunMethod("setId",new Object[]{(Object)(_id)});
 //BA.debugLineNum = 81;BA.debugLine="End Sub";
return "";
}
public String  _setobject(Object _obj) throws Exception{
 //BA.debugLineNum = 70;BA.debugLine="Public Sub setObject(Obj As Object)";
 //BA.debugLineNum = 71;BA.debugLine="TJO = Obj";
_tjo.setObject((java.lang.Object)(_obj));
 //BA.debugLineNum = 72;BA.debugLine="End Sub";
return "";
}
public String  _settag(Object _tag) throws Exception{
 //BA.debugLineNum = 85;BA.debugLine="Sub setTag(Tag As Object)";
 //BA.debugLineNum = 86;BA.debugLine="mTag = Tag";
_mtag = _tag;
 //BA.debugLineNum = 87;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
