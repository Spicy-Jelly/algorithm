package NowCoder.HuaWei;
import java.util.*;
/**
 * 四则运算
 * @author SpicyJelly
 * @param 3+2*{1+2*[-4/(8-6)+7]}
 */
public class HJ50 {
	static public void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        //String 这个类没有append方法，String是一个值，很难变化
        StringBuilder str = new StringBuilder();
        while(scanner.hasNext()){
            str.append(scanner.next());
        }
        HJ50 so = new HJ50();
        int[] Current = {0};
        int re = so.calculate(str,Current);
        System.out.println(re);
    }

	    public int calculate(final StringBuilder str,int[] Current){
	        if(Current[0] == str.length()) return 0;
	        //建立一个加栈
	        Stack<Integer> stack = new Stack<Integer>();
	        //当当前字符串有效的时候，iterator
	        while(Current[0] < str.length()){
	            //记录当前字符串的值
	            char key = str.charAt(Current[0]);
	            //如果是加法，则不考虑
	            if(key == '+'){
	                Current[0]++;
	            }//if
	            /**如果是减法，先记录符号，然后看后面的字符类型
	            *如果是数字，则计算数值，并乘上符号位
	            *如果是括号，则递归调用函数，算出括号内的值，并乘上符号位
	            *二者都需要入栈
	            */
	            else if(key == '-'){
	                //后面可能跟数字，也可能跟括号
	                int symbol = -1;
	                Current[0]++;
	                int num = 0;
	                key = str.charAt(Current[0]);
	                if(key >= '0' && key <= '9'){
	                    num = getNumber(str,Current);
	                }//if
	                else if(key == '(' || key == '[' || key == '{'){
	                    Current[0]++;
	                    num = calculate(str,Current);
	                }//else if
	                num *= -1;
	                stack.push(num);
	            }//else if
	            /**如果是乘除，则出栈top，接着看下一个数值
	            有两种可能，一种是数字，一种是括号
	            */
	            else if(key == '*' || key == '/'){
	                char symbol = key;
	                int first = stack.pop();
	                Current[0]++;
	                key = str.charAt(Current[0]);
	                int second = 0;
	                if(key >= '0' && key <= '9'){
	                    second = getNumber(str,Current);
	                }
	                else if(key == '(' || key == '[' || key == '{'){
	                    Current[0]++;
	                    second = calculate(str,Current);
	                }
	                try{
	                    if(symbol == '*')
	                        stack.push(first * second);
	                    else if(symbol == '/')
	                        stack.push(first / second);
	                }catch(Exception e){}
	            }

	            /**如果是数字的话，返回数字的值，并入栈
	            */
	            else if(key >= '0' && key <= '9'){
	                int num = getNumber(str,Current);
	                stack.push(num);
	            }//else if
	            /**
	            如果是左括号，则递归求解括号里的表达式
	            */
	            else if(key == '(' || key == '[' || key == '{'){
	                Current[0]++;
	                int re = calculate(str,Current);
	                stack.push(re);
	            }//else if
	            else if(key == ')' || key == ']' || key == '}'){
	                Current[0]++;
	                return Sum(stack);
	            }
	        }//while
	        return Sum(stack);
	    }//calculate
	    int getNumber(final StringBuilder str,int[] Current){
	        int re = 0;
	        while(str.charAt(Current[0]) >= '0' && str.charAt(Current[0]) <= '9'){
	            re = re * 10 + str.charAt(Current[0]) - '0';
	            Current[0]++;
	            if(Current[0] == str.length()) break;
	        }//while
	        return re;
	    }
	    int Sum(Stack<Integer> stack){
	        int re = 0;
	        while(!stack.empty()) re += stack.pop();
	        return re;
	    }
	
}
