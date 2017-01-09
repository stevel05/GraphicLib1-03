﻿Type=Class
Version=4.7
ModulesStructureVersion=1
B4J=true
@EndOfDesignText@
'Class Module
Sub Class_Globals
	'Private fx As JFX ' Uncomment if required for B4j only

	Private TJO As JavaObject
	Private mTag As Object
End Sub

'Create an empty Object
Public Sub Initialize()
	TJO.InitializeNewInstance("javafx.scene.shape.SVGPath",Null)

End Sub

'Gets the value of the property content.
Public Sub getContent As String
	Return TJO.RunMethod("getContent",Null)
End Sub
'Gets the value of the property fillRule.
Public Sub getFillRule As String
	Return TJO.RunMethodJO("getFillRule",Null).RunMethod("toString",Null)
End Sub
'Sets the value of the property content.
Public Sub setContent(Value As String)
	TJO.RunMethod("setContent",Array As Object(Value))
End Sub
'Sets the value of the property fillRule.
Public Sub setFillRule(Value As String)
	Dim JO As JavaObject
	JO.InitializeStatic("javafx.scene.shape.FillRule")
	TJO.RunMethod("setFillRule",Array As Object(JO.RunMethod("valueOf",Array(Value))))
End Sub
Public Sub getObject As Object
	Return TJO
End Sub
Public Sub AsNode As Node
	Return TJO
End Sub
Public Sub getJavaObject As JavaObject
	Return TJO
End Sub
Public Sub setObject(Obj As Object)
	TJO = Obj
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
	S.setObject(TJO)
	S.setStrokeLineCap(Value)
End Sub
'Sets the value of the property strokeLineJoin.
Public Sub setStrokeLineJoin(Value As String)
	Dim S As GLShape 
	S.Initialize
	S.setObject(TJO)
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
	S.setObject(TJO)
	S.setStrokeType(Value)
End Sub
'Sets the value of the property strokeWidth.
Public Sub setStrokeWidth(Value As Double)
	TJO.RunMethod("setStrokeWidth",Array As Object(Value))
End Sub
'Returns a new Shape which is created by subtracting the specified second shape from the first shape.
Public Sub Subtract(Shape1 As GLSVGPath, Shape2 As GLSVGPath) As GLShape
	Dim S As GLShape
	S.Initialize
	Return S.Subtract(Shape1,Shape2)
End Sub
'Returns a new Shape which is created as a union of the specified input shapes.
Public Sub Union(Shape1 As GLSVGPath, Shape2 As GLSVGPath) As GLShape
	Dim S As GLShape
	S.Initialize
	Return S.Union(Shape1,Shape2)
End Sub
'Returns a new Shape which is created as an intersection of the specified input shapes.
Public Sub Intersect(Shape1 As GLSVGPath, Shape2 As GLSVGPath) As GLShape
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
Sub BringToFront
	TJO.RunMethod("toFront",Null)
End Sub