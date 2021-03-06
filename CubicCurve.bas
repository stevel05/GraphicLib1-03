﻿Type=Class
Version=2.75
ModulesStructureVersion=1
B4J=true
@EndOfDesignText@
'Class Module
Sub Class_Globals
	'Private fx As JFX ' Uncomment if required for B4j only

	Private TJO As JavaObject
End Sub

'Initializes the object. You can add parameters to this method if needed.
Public Sub Initialize

	TJO.InitializeNewInstance("javafx.scene.shape.CubicCurve",Null)
End Sub

'Creates an empty instance of CubicCurve.
Public Sub Create()
	'If a JavaObject has been passed, you may need to create it here and remove the parameter
	TJO.InitializeNewInstance("javafx.scene.shape.CubicCurve",Null)
End Sub

'Creates a new instance of CubicCurve.
Public Sub Create2(StartX As Double, StartY As Double, ControlX1 As Double, ControlY1 As Double, ControlX2 As Double, ControlY2 As Double, EndX As Double, EndY As Double)
	'If a JavaObject has been passed, you may need to create it here and remove the parameter
	TJO.InitializeNewInstance("javafx.scene.shape.CubicCurve",Array As Object(StartX, StartY, ControlX1, ControlY1, ControlX2, ControlY2, EndX, EndY))
End Sub

'Gets the value of the property controlX1.
Public Sub GetControlX1 As Double
	Return TJO.RunMethod("getControlX1",Null)
End Sub
'Gets the value of the property controlX2.
Public Sub GetControlX2 As Double
	Return TJO.RunMethod("getControlX2",Null)
End Sub
'Gets the value of the property controlY1.
Public Sub GetControlY1 As Double
	Return TJO.RunMethod("getControlY1",Null)
End Sub
'Gets the value of the property controlY2.
Public Sub GetControlY2 As Double
	Return TJO.RunMethod("getControlY2",Null)
End Sub
'Gets the value of the property endX.
Public Sub GetEndX As Double
	Return TJO.RunMethod("getEndX",Null)
End Sub
'Gets the value of the property endY.
Public Sub GetEndY As Double
	Return TJO.RunMethod("getEndY",Null)
End Sub
'Gets the value of the property startX.
Public Sub GetStartX As Double
	Return TJO.RunMethod("getStartX",Null)
End Sub
'Gets the value of the property startY.
Public Sub GetStartY As Double
	Return TJO.RunMethod("getStartY",Null)
End Sub
'Sets the value of the property controlX1.
Public Sub SetControlX1(Value As Double)
	TJO.RunMethod("setControlX1",Array As Object(Value))
End Sub
'Sets the value of the property controlX2.
Public Sub SetControlX2(Value As Double)
	TJO.RunMethod("setControlX2",Array As Object(Value))
End Sub
'Sets the value of the property controlY1.
Public Sub SetControlY1(Value As Double)
	TJO.RunMethod("setControlY1",Array As Object(Value))
End Sub
'Sets the value of the property controlY2.
Public Sub SetControlY2(Value As Double)
	TJO.RunMethod("setControlY2",Array As Object(Value))
End Sub
'Sets the value of the property endX.
Public Sub SetEndX(Value As Double)
	TJO.RunMethod("setEndX",Array As Object(Value))
End Sub
'Sets the value of the property endY.
Public Sub SetEndY(Value As Double)
	TJO.RunMethod("setEndY",Array As Object(Value))
End Sub
'Sets the value of the property startX.
Public Sub SetStartX(Value As Double)
	TJO.RunMethod("setStartX",Array As Object(Value))
End Sub
'Sets the value of the property startY.
Public Sub SetStartY(Value As Double)
	TJO.RunMethod("setStartY",Array As Object(Value))
End Sub
Public Sub GetObject As Object
	Return TJO
End Sub
Public Sub SetObject(Obj As JavaObject)
	TJO = Obj
End Sub

'Inherited Methods

'Gets the value of the property fill.
Public Sub GetFill As Paint
	Return TJO.RunMethod("getFill",Null)
End Sub
'Gets the value of the property stroke.
Public Sub GetStroke As Paint
	Return TJO.RunMethod("getStroke",Null)
End Sub
'Defines the array representing the lengths of the dash segments.
Public Sub GetStrokeDashArray As List
	Return TJO.RunMethod("getStrokeDashArray",Null)
End Sub
'Gets the value of the property strokeDashOffset.
Public Sub GetStrokeDashOffset As Double
	Return TJO.RunMethod("getStrokeDashOffset",Null)
End Sub
'Gets the value of the property strokeLineCap.
Public Sub GetStrokeLineCap As JavaObject
	Return TJO.RunMethod("getStrokeLineCap",Null)
End Sub
'Gets the value of the property strokeLineJoin.
Public Sub GetStrokeLineJoin As Int
	Return TJO.RunMethod("getStrokeLineJoin",Null)
End Sub
'Gets the value of the property strokeMiterLimit.
Public Sub GetStrokeMiterLimit As Double
	Return TJO.RunMethod("getStrokeMiterLimit",Null)
End Sub
'Gets the value of the property strokeType.
Public Sub GetStrokeType As Int
	Return TJO.RunMethod("getStrokeType",Null)
End Sub
'Gets the value of the property strokeWidth.
Public Sub GetStrokeWidth As Double
	Return TJO.RunMethod("getStrokeWidth",Null)
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
Public Sub SetStroke(Value As Paint)
	TJO.RunMethod("setStroke",Array As Object(Value))
End Sub
'Sets the value of the property strokeDashOffset.
Public Sub SetStrokeDashOffset(Value As Double)
	TJO.RunMethod("setStrokeDashOffset",Array As Object(Value))
End Sub
'Sets the value of the property strokeLineCap.
Public Sub SetStrokeLineCap(Value As String)
	Dim S As Shape 
	S.Initialize
	S.SetObject(TJO)
	S.SetStrokeLineCap(Value)
End Sub
'Sets the value of the property strokeLineJoin.
Public Sub SetStrokeLineJoin(Value As String)
	Dim S As Shape 
	S.Initialize
	S.SetObject(TJO)
	S.SetStrokeLineJoin(Value)
End Sub
'Sets the value of the property strokeMiterLimit.
Public Sub SetStrokeMiterLimit(Value As Double)
	TJO.RunMethod("setStrokeMiterLimit",Array As Object(Value))
End Sub
'Sets the value of the property strokeType.
Public Sub SetStrokeType(Value As JavaObject)
	Dim S As Shape 
	S.Initialize
	S.SetObject(TJO)
	S.SetStrokeType(Value)
End Sub
'Sets the value of the property strokeWidth.
Public Sub SetStrokeWidth(Value As Double)
	TJO.RunMethod("setStrokeWidth",Array As Object(Value))
End Sub
'Returns a new Shape which is created by subtracting the specified second shape from the first shape.
Public Sub Subtract(Shape1 As CubicCurve, Shape2 As CubicCurve) As Shape
	Dim S As Shape
	S.Initialize
	Return S.Subtract(Shape1,Shape2)
End Sub
'Returns a new Shape which is created as a union of the specified input shapes.
Public Sub Union(Shape1 As CubicCurve, Shape2 As CubicCurve) As Shape
	Dim S As Shape
	S.Initialize
	Return S.Union(Shape1,Shape2)
End Sub
'Returns a new Shape which is created as an intersection of the specified input shapes.
Public Sub Intersect(Shape1 As CubicCurve, Shape2 As CubicCurve) As Shape
	Dim S As Shape
	S.Initialize
	Return S.Intersect(Shape1,Shape2)
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