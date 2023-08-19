Type=Class
Version=2.75
ModulesStructureVersion=1
B4J=true
@EndOfDesignText@
'Class Module
Sub Class_Globals
	'Private fx As JFX ' Uncomment if required for B4j only
	Private NativeMe As JavaObject
	Private TJO As JavaObject
End Sub

Public Sub Initialize()
	NativeMe = Me
End Sub
'Construct an empty shape
Public Sub Create
	TJO.InitializeNewInstance("javafx.scene.shape.Shape",Null)
End Sub
'Gets the value of the property fill.
Public Sub GetFill As Paint
	Return TJO.RunMethod("getFill",Null)
End Sub
'Gets the value of the property stroke.
Public Sub GetStroke As JavaObject
	Return TJO.RunMethod("getStroke",Null)
End Sub
'Defines the array representing the lengths of the dash segments.
Public Sub GetStrokeDashArray As JavaObject
	Return TJO.RunMethod("getStrokeDashArray",Null)
End Sub
'Gets the value of the property strokeDashOffset.
Public Sub GetStrokeDashOffset As Double
	Return TJO.RunMethod("getStrokeDashOffset",Null)
End Sub
'Gets the value of the property strokeLineCap.
Public Sub GetStrokeLineCap As Int
	Return TJO.RunMethod("getStrokeLineCap",Null)
End Sub
'Gets the value of the property strokeLineJoin.
Public Sub GetStrokeLineJoin As JavaObject
	Return TJO.RunMethod("getStrokeLineJoin",Null)
End Sub
'Gets the value of the property strokeMiterLimit.
Public Sub GetStrokeMiterLimit As Double
	Return TJO.RunMethod("getStrokeMiterLimit",Null)
End Sub
'Gets the value of the property strokeType.
Public Sub GetStrokeType As JavaObject
	Return TJO.RunMethod("getStrokeType",Null)
End Sub
'Gets the value of the property strokeWidth.
Public Sub GetStrokeWidth As Double
	Return TJO.RunMethod("getStrokeWidth",Null)
End Sub
'Returns a new Shape which is created as an intersection of the specified input shapes.
Public Sub Intersect(Shape1 As JavaObject, Shape2 As JavaObject) As Shape
	Select True
		Case Shape1 Is Rectangle
			Dim R1 As Rectangle = Shape1
			
			Dim S1 As Shape
			S1.Initialize
			S1.SetObject(R1.GetObject)
	End Select
	Select True
		Case Shape2 Is Rectangle
			Dim R2 As Rectangle = Shape2
			
			Dim S2 As Shape
			S2.Initialize
			S2.SetObject(R2.GetObject)
			
	End Select
	Dim S As Shape
	Dim SJO As JavaObject
	SJO.InitializeStatic("javafx.scene.shape.Shape")
	S.SetObject(SJO.RunMethod("intersect",Array As Object(S1.GetObject, S2.GetObject)))
	Return S
	
End Sub
'Gets the value of the property smooth.
Public Sub IsSmooth As Boolean
	Return TJO.RunMethod("isSmooth",Null)
End Sub
'Sets the value of the property fill.
Public Sub SetFill(Value As Paint)
	TJO.RunMethod("setFill",Array As Object(Value))
End Sub
'Sets the value of the property smooth.
Public Sub SetSmooth(Value As Boolean)
	TJO.RunMethod("setSmooth",Array As Object(Value))
End Sub
'Sets the value of the property stroke.
Public Sub SetStroke(Value As JavaObject)
	TJO.RunMethod("setStroke",Array As Object(Value))
End Sub
'Sets the value of the property strokeDashOffset.
Public Sub SetStrokeDashOffset(Value As Double)
	TJO.RunMethod("setStrokeDashOffset",Array As Object(Value))
End Sub
'Sets the value of the property strokeLineCap.
Public Sub SetStrokeLineCap(Value As String)
	Dim EnumVal As JavaObject = NativeMe.RunMethod("jGetStrokeLineCap",Array As Object(Value))
	TJO.RunMethod("setStrokeLineCap",Array(EnumVal))
End Sub
'Sets the value of the property strokeLineJoin.
Public Sub SetStrokeLineJoin(Value As String)
	Dim EnumVal As JavaObject = NativeMe.RunMethod("jGetStrokeLineJoin",Array As Object(Value))
	TJO.RunMethod("setStrokeLineJoin",Array As Object(EnumVal))
End Sub
'Sets the value of the property strokeMiterLimit.
Public Sub SetStrokeMiterLimit(Value As Double)
	TJO.RunMethod("setStrokeMiterLimit",Array As Object(Value))
End Sub
'Sets the value of the property strokeType.
Public Sub SetStrokeType(Value As JavaObject)
	Dim EnumVal As JavaObject = NativeMe.RunMethod("jGetStrokeType",Array As Object(Value))
	TJO.RunMethod("setStrokeType",Array As Object(EnumVal))
End Sub
'Sets the value of the property strokeWidth.
Public Sub SetStrokeWidth(Value As Double)
	TJO.RunMethod("setStrokeWidth",Array As Object(Value))
End Sub
'Returns a new Shape which is created by subtracting the specified second shape from the first shape.
Public Sub Subtract(Shape1 As JavaObject, Shape2 As JavaObject) As Shape
	Select True
		Case Shape1 Is Rectangle
			Dim R1 As Rectangle = Shape1
			
			Dim S1 As Shape
			S1.Initialize
			S1.SetObject(R1.GetObject)
	End Select
	Select True
		Case Shape2 Is Rectangle
			Dim R2 As Rectangle = Shape2
			
			Dim S2 As Shape
			S2.Initialize
			S2.SetObject(R2.GetObject)
			
	End Select
	Dim S As Shape
	Dim SJO As JavaObject
	SJO.InitializeStatic("javafx.scene.shape.Shape")
	S.SetObject(SJO.RunMethod("subtract",Array As Object(S1.GetObject, S2.GetObject)))
	Return S
End Sub
'Returns a new Shape which is created as a union of the specified input shapes.
Public Sub Union(Shape1 As JavaObject, Shape2 As JavaObject) As Shape
	Select True
		Case Shape1 Is Rectangle
			Dim R1 As Rectangle = Shape1
			
			Dim S1 As Shape
			S1.Initialize
			S1.SetObject(R1.GetObject)
	End Select
	Select True
		Case Shape2 Is Rectangle
			Dim R2 As Rectangle = Shape2
			
			Dim S2 As Shape
			S2.Initialize
			S2.SetObject(R2.GetObject)
			
	End Select
	Dim S As Shape
	Dim SJO As JavaObject
	SJO.InitializeStatic("javafx.scene.shape.Shape")
	S.SetObject(SJO.RunMethod("union",Array As Object(S1.GetObject, S2.GetObject)))
	Return S
End Sub
Public Sub GetPrefWidth As Int
	Dim H As Double = -1
	Return TJO.RunMethod("prefWidth",Array(H))
End Sub
Public Sub GetPrefHeight As Int
	Dim H As Double = -1
	Return TJO.RunMethod("prefHeight",Array(H))
End Sub
Public Sub GetMinWidth As Int
	Dim H As Double = -1
	Return TJO.RunMethod("prefWidth",Array(H))
End Sub
Public Sub GetMinHeight As Int
	Dim H As Double = -1
	Return TJO.RunMethod("prefHeight",Array(H))
End Sub
Public Sub GetObject As Object
	Return TJO
End Sub
Public Sub SetObject(Obj As JavaObject)
	TJO = Obj
End Sub
#If java
	import javafx.scene.shape.StrokeLineCap;
	import javafx.scene.shape.StrokeLineJoin;
	import javafx.scene.shape.StrokeType;
	
	public StrokeLineCap jGetStrokeLineCap(String str){
		return StrokeLineCap.valueOf(str);
	}
	public StrokeLineJoin jGetStrokeLineJoin(String str){
		return StrokeLineJoin.valueOf(str);
	}
	public StrokeType jGetStrokeType(String str){
		return StrokeType.valueOf(str);
	}
	
#End If