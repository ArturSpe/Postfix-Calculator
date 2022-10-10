package Calculator;

import Calculation.FunctionMapImpl;
import Calculation.FunctionMap;
import Operators.OperatorPrecedence;
import Operators.OperatorPrecedenceImpl;
import StringsProcessing.TransformationString;
import StringsProcessing.ParsingString;

class CalculatorHelper {

    final OperatorPrecedence operatorPrecedence;
    final FunctionMap calculation;
    final TransformationString transformationString;

    public CalculatorHelper(TransformationString stringToToken, OperatorPrecedence operatorPrecedence, FunctionMap calculation) {

        this.operatorPrecedence = operatorPrecedence;
        this.calculation = calculation;
        this.transformationString = stringToToken;

    }

}
