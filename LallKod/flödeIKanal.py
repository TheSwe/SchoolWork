stepSize = 0.001

flowConstant = 0.5
flowLinearIncrease = 0.66666666667

shapeConstant = 3
shapeLinearIncrease = 0

centerValue = 3

currentValue = 2
flowRateTotal = 0

while currentValue < centerValue:
    flowRateTotal += (shapeConstant + shapeLinearIncrease*currentValue)*stepSize*(flowConstant + flowLinearIncrease*currentValue)
    print (flowRateTotal)
    currentValue += stepSize

print(flowRateTotal*2)