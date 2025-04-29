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

Public Sub MoveTo(X As Double, Y As Double) As GLMoveTo
	Dim Element As GLMoveTo
	Element.Initialize
	Element.Create2(X,Y)
	Return Element
End Sub

Public Sub LineTo(X As Double, Y As Double) As GLLineTo
	Dim Element As GLLineTo
	Element.Initialize
	Element.Create2(X,Y)
	Return Element
End Sub

Public Sub Path(Elements As List) As GLPath
	Dim P As GLPath
	P.Initialize
	P.Create2(Elements)
	Return P
End Sub


