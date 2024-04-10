import turtle
import math

def drawGraph(xList, yList):
    maxY = 100
    minY = -100
    div = 1
    yListAdjusted = []
    if max(yList) > maxY:
        div = max(yList)/maxY
        for i in range(0, len(yList)):
            yListAdjusted.append(yList[i]/div)

    if min(yList) < minY:
        div = abs(min(yList)/maxY)
        for i in range(0, len(yList)):
            yListAdjusted.append(yList[i]/div)

    turtle.setworldcoordinates( min(xList)-1, min(yListAdjusted)-1, max(xList)+1, max(yListAdjusted)+1 )
    turtle.penup()
    turtle.goto(xList[0], yListAdjusted[0])
    turtle.pendown()
    turtle.write(yList[0])
    for i in range(1, len(xList)):
        turtle.goto(xList[i], yListAdjusted[i])
    turtle.penup()
    
    
    turtle.backward(xList[-1]*0.2)
    turtle.right(90)
    turtle.forward(yListAdjusted[-1]*0.03)
    turtle.pendown()
    turtle.write(round(yList[-1],2) )
    turtle.penup()
    turtle.goto(xList[0], yList[0])
    print(turtle.screensize())

def calcEulerStege(xList, yList, ydList, maxX, step):
    ydList.append(xList[-1]*yList[-1]+2)
    xList.append(xList[-1]+step)
    yList.append(yList[-1]+ydList[-1]*step)

    if maxX <= xList[-1]:
        drawGraph(xList, yList)
    else:
        calcEulerStege(xList, yList, ydList, maxX, step)

calcEulerStege([0],[1],[0],5,0.01)