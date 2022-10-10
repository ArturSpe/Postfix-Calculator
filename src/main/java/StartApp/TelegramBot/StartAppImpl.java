package StartApp.TelegramBot;

import Calculation.FunctionMapImpl;
import Calculator.PostfixCalculator;
import Operators.OperatorPrecedenceImpl;
import StartApp.StartApp;
import StringsProcessing.ParsingString;
import StringsProcessing.StringValidationImpl;

public class StartAppImpl implements StartApp {

    @Override
    public String start(String expression) {
        try {
            new StringValidationImpl().checkString(expression);
            double resultPostfix = new PostfixCalculator(new ParsingString(), new OperatorPrecedenceImpl(), new FunctionMapImpl())
                    .calculate(expression);
            return "Результат: " + resultPostfix;
        }catch (Exception e){
            return "Ошибка: " +"\""+ e.getMessage() +"\""+ "\nПопробуйте еще раз \nВозможные символы: +, -, *, /, (, )";
        }
    }
}

