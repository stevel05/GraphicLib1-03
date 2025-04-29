B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=10.2
@EndOfDesignText@
'Static code module
Sub Process_Globals
	Private fx As JFX
End Sub

Public Sub LocalToParent(Node As JavaObject, X As Double, Y As Double) As Double()
	Dim Result(2) As Double
	Dim P2d As JavaObject = Node.RunMethod("localToParent",Array(X,Y))
	Result(0) = P2d.RunMethod("getX",Null)
	Result(1) = P2d.RunMethod("getY",Null)
	Return Result
End Sub