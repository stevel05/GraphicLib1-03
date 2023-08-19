﻿B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=5.51
@EndOfDesignText@
'Class Module
Sub Class_Globals
	'Private fx As JFX ' Uncomment if required for B4j only

	Private TJO As JavaObject
	Private mTag As Object
End Sub

'Initializes the object. You can add parameters to this method if needed.
Public Sub Initialize

End Sub

'Creates an empty instance of Arc.
Public Sub Create()
	'If a JavaObject has been passed, you may need to create it here and remove the parameter
	TJO.InitializeNewInstance("javafx.scene.shape.Arc",Null)
End Sub

'Creates a new instance of Arc.
Public Sub Create2(CenterX As Double, CenterY As Double, RadiusX As Double, RadiusY As Double, StartAngle As Double, Length As Double)
	'If a JavaObject has been passed, you may need to create it here and remove the parameter
	TJO.InitializeNewInstance("javafx.scene.shape.Arc",Array As Object(CenterX, CenterY, RadiusX, RadiusY, StartAngle, Length))
End Sub

'Gets the value of the property centerX.
Public Sub getCenterX As Double
	Return TJO.RunMethod("getCenterX",Null)
End Sub
'Gets the value of the property centerY.
Public Sub getCenterY As Double
	Return TJO.RunMethod("getCenterY",Null)
End Sub
'Gets the value of the property length.
Public Sub getLength As Double
	Return TJO.RunMethod("getLength",Null)
End Sub
'Gets the value of the property radiusX.
Public Sub getRadiusX As Double
	Return TJO.RunMethod("getRadiusX",Null)
End Sub
'Gets the value of the property radiusY.
Public Sub getRadiusY As Double
	Return TJO.RunMethod("getRadiusY",Null)
End Sub
'Gets the value of the property startAngle.
Public Sub getStartAngle As Double
	Return TJO.RunMethod("getStartAngle",Null)
End Sub
'Gets the value of the property type.
Public Sub get_Type As String
	Return TJO.RunMethodJO("getType",Null).RunMethod("toString",Null)
End Sub
'Sets the value of the property centerX.
Public Sub setCenterX(Value As Double)
	TJO.RunMethod("setCenterX",Array As Object(Value))
End Sub
'Sets the value of the property centerY.
Public Sub setCenterY(Value As Double)
	TJO.RunMethod("setCenterY",Array As Object(Value))
End Sub
'Sets the value of the property length.
Public Sub setLength(Value As Double)
	TJO.RunMethod("setLength",Array As Object(Value))
End Sub
'Sets the value of the property radiusX.
Public Sub setRadiusX(Value As Double)
	TJO.RunMethod("setRadiusX",Array As Object(Value))
End Sub
'Sets the value of the property radiusY.
Public Sub setRadiusY(Value As Double)
	TJO.RunMethod("setRadiusY",Array As Object(Value))
End Sub
'Sets the value of the property startAngle.
Public Sub setStartAngle(Value As Double)
	TJO.RunMethod("setStartAngle",Array As Object(Value))
End Sub
'Sets the value of the property type.
Public Sub set_Type(Value As String)
	Dim JO As JavaObject
	JO.InitializeStatic("javafx.scene.shape.ArcType")
	TJO.RunMethod("setType",Array As Object(JO.RunMethod("valueOf",Array(Value))))
End Sub
Public Sub GetObject As Object
	Return TJO
End Sub
Public Sub SetObject(Obj As Object)
	TJO = Obj
End Sub
Public Sub AsNode As Node
	Return TJO
End Sub
Public Sub AsB4xView As B4XView
	Return TJO
End Sub
Public Sub getJavaObject As JavaObject
	Return TJO
End Sub
Sub setID(ID As String)
	TJO.RunMethod("setId",Array(ID))
End Sub
Sub getID As String
	Return TJO.RunMethod("getId",Null)
End Sub
Sub setTag(Tag As Object)
	mTag = Tag
End Sub
Sub getTag As Object
	Return mTag
End Sub

'Inherited Methods

'Gets the value of the property fill.
Public Sub getFill As Object
	Return TJO.RunMethod("getFill",Null)
End Sub
'Gets the value of the property stroke.
Public Sub getStroke As Object
	Return TJO.RunMethod("getStroke",Null)
End Sub
'Defines the array representing the lengths of the dash segments.
Public Sub getStrokeDashArray As List
	Return TJO.RunMethod("getStrokeDashArray",Null)
End Sub
'Gets the value of the property strokeDashOffset.
Public Sub getStrokeDashOffset As Double
	Return TJO.RunMethod("getStrokeDashOffset",Null)
End Sub
'Gets the value of the property strokeLineCap.
Public Sub getStrokeLineCap As String
	Return TJO.RunMethodJO("getStrokeLineCap",Null).RunMethod("toString",Null)
End Sub
'Gets the value of the property strokeLineJoin.
Public Sub getStrokeLineJoin As String
	Return TJO.RunMethodJO("getStrokeLineJoin",Null).RunMethod("toString",Null)
End Sub
'Gets the value of the property strokeMiterLimit.
Public Sub getStrokeMiterLimit As Double
	Return TJO.RunMethod("getStrokeMiterLimit",Null)
End Sub
'Gets the value of the property strokeType.
Public Sub getStrokeType As String
	Return TJO.RunMethodJO("getStrokeType",Null).RunMethod("toString",Null)
End Sub
'Gets the value of the property strokeWidth.
Public Sub getStrokeWidth As Double
	Return TJO.RunMethod("getStrokeWidth",Null)
End Sub
'Gets the value of the property smooth.
Public Sub IsSmooth As Boolean
	Return TJO.RunMethod("isSmooth",Null)
End Sub
'Sets the value of the property fill.
Public Sub setFill(Value As Object)
	TJO.RunMethod("setFill",Array As Object(Value))
End Sub
'Sets the value of the property smooth.
Public Sub setSmooth(Value As Boolean)
	TJO.RunMethod("setSmooth",Array As Object(Value))
End Sub
'Sets the value of the property stroke.
Public Sub setStroke(Value As Object)
	TJO.RunMethod("setStroke",Array As Object(Value))
End Sub
'Sets the value of the property strokeDashOffset.
Public Sub setStrokeDashOffset(Value As Double)
	TJO.RunMethod("setStrokeDashOffset",Array As Object(Value))
End Sub
'Sets the value of the property strokeLineCap.
Public Sub setStrokeLineCap(Value As String)
	Dim S As GLShape 
	S.Initialize
	S.SetObject(TJO)
	S.setStrokeLineCap(Value)
End Sub
'Sets the value of the property strokeLineJoin.
Public Sub setStrokeLineJoin(Value As String)
	Dim S As GLShape 
	S.Initialize
	S.SetObject(TJO)
	S.setStrokeLineJoin(Value)
End Sub
'Sets the value of the property strokeMiterLimit.
Public Sub setStrokeMiterLimit(Value As Double)
	TJO.RunMethod("setStrokeMiterLimit",Array As Object(Value))
End Sub
'Sets the value of the property strokeType.
Public Sub setStrokeType(Value As String)
	Dim S As GLShape 
	S.Initialize
	S.SetObject(TJO)
	S.setStrokeType(Value)
End Sub
'Sets the value of the property strokeWidth.
Public Sub setStrokeWidth(Value As Double)
	TJO.RunMethod("setStrokeWidth",Array As Object(Value))
End Sub
'Returns a new Shape which is created by subtracting the specified second shape from the first shape.
Public Sub Subtract(Shape1 As GLArc, Shape2 As GLArc) As GLShape
	Dim S As GLShape
	S.Initialize
	Return S.Subtract(Shape1,Shape2)
End Sub
'Returns a new Shape which is created as a union of the specified input shapes.
Public Sub Union(Shape1 As GLArc, Shape2 As GLArc) As GLShape
	Dim S As GLShape
	S.Initialize
	Return S.Union(Shape1,Shape2)
End Sub
'Returns a new Shape which is created as an intersection of the specified input shapes.
Public Sub Intersect(Shape1 As GLArc, Shape2 As GLArc) As GLShape
	Dim S As GLShape
	S.Initialize
	Return S.Intersect(Shape1,Shape2)
End Sub

Public Sub getPrefWidth As Int
	Dim H As Double = -1
	Return TJO.RunMethod("prefWidth",Array(H))
End Sub
Public Sub getPrefHeight As Int
	Dim H As Double = -1
	Return TJO.RunMethod("prefHeight",Array(H))
End Sub
Public Sub getMinWidth As Int
	Dim H As Double = -1
	Return TJO.RunMethod("prefWidth",Array(H))
End Sub
Public Sub getMinHeight As Int
	Dim H As Double = -1
	Return TJO.RunMethod("prefHeight",Array(H))
End Sub
Public Sub BringToFront
	TJO.RunMethod("toFront",Null)
End Sub