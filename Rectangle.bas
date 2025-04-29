Type=Class
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

	'TJO.InitializeNewInstance("javafx.scene.shape.Rectangle",Null)
End Sub

'Creates an empty instance of Rectangle.
Public Sub Create()
	'If a JavaObject has been passed, you may need to create it here and remove the parameter
	TJO.InitializeNewInstance("javafx.scene.shape.Rectangle",Null)
End Sub

'Creates a new instance of Rectangle with the given size.
Public Sub Create2(Width As Double, Height As Double)
	'If a JavaObject has been passed, you may need to create it here and remove the parameter
	TJO.InitializeNewInstance("javafx.scene.shape.Rectangle",Array As Object(Width, Height))
End Sub

'Creates a new instance of Rectangle with the given position and size.
Public Sub Create3(X As Double, Y As Double, Width As Double, Height As Double)
	'If a JavaObject has been passed, you may need to create it here and remove the parameter
	TJO.InitializeNewInstance("javafx.scene.shape.Rectangle",Array As Object(X, Y, Width, Height))
End Sub

'Creates a new instance of Rectangle with the given size and fill.
Public Sub Create4(Width As Double, Height As Double, Fill As Paint)
	'If a JavaObject has been passed, you may need to create it here and remove the parameter
	TJO.InitializeNewInstance("javafx.scene.shape.Rectangle",Array As Object(Width, Height, Fill))
End Sub

'Gets the value of the property arcHeight.
Public Sub GetArcHeight As Double
	Return TJO.RunMethod("getArcHeight",Null)
End Sub
'Gets the value of the property arcWidth.
Public Sub GetArcWidth As Double
	Return TJO.RunMethod("getArcWidth",Null)
End Sub
'Gets the value of the property height.
Public Sub GetHeight As Double
	Return TJO.RunMethod("getHeight",Null)
End Sub
'Gets the value of the property width.
Public Sub GetWidth As Double
	Return TJO.RunMethod("getWidth",Null)
End Sub
'Gets the value of the property x.
Public Sub GetX As Double
	Return TJO.RunMethod("getX",Null)
End Sub
'Gets the value of the property y.
Public Sub GetY As Double
	Return TJO.RunMethod("getY",Null)
End Sub
'Sets the value of the property arcHeight.
Public Sub SetArcHeight(Value As Double)
	TJO.RunMethod("setArcHeight",Array As Object(Value))
End Sub
'Sets the value of the property arcWidth.
Public Sub SetArcWidth(Value As Double)
	TJO.RunMethod("setArcWidth",Array As Object(Value))
End Sub
'Sets the value of the property height.
Public Sub SetHeight(Value As Double)
	TJO.RunMethod("setHeight",Array As Object(Value))
End Sub
'Sets the value of the property width.
Public Sub SetWidth(Value As Double)
	TJO.RunMethod("setWidth",Array As Object(Value))
End Sub
'Sets the value of the property x.
Public Sub SetX(Value As Double)
	TJO.RunMethod("setX",Array As Object(Value))
End Sub
'Sets the value of the property y.
Public Sub SetY(Value As Double)
	TJO.RunMethod("setY",Array As Object(Value))
End Sub
Public Sub GetObject As Object
	Return TJO
End Sub
Public Sub SetObject (R As JavaObject)
	TJO = R
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
Public Sub Subtract(Shape1 As Rectangle, Shape2 As Rectangle) As Shape
	Dim S As Shape
	S.Initialize
	Return S.Subtract(Shape1,Shape2)
End Sub
'Returns a new Shape which is created as a union of the specified input shapes.
Public Sub Union(Shape1 As Rectangle, Shape2 As Rectangle) As Shape
	Dim S As Shape
	S.Initialize
	Return S.Union(Shape1,Shape2)
End Sub
'Returns a new Shape which is created as an intersection of the specified input shapes.
Public Sub Intersect(Shape1 As Rectangle, Shape2 As Rectangle) As Shape
	Dim S As Shape
	S.Initialize
	Return S.Intersect(Shape1,Shape2)
End Sub

