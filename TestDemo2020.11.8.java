import java.util.*;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 联想
 * Date: 2020-11-05
 * Time: 15:56
 */






//约瑟夫问题
class Joseph {
    public int getResult(int n) {
        if(n < 1) return -1;
        List<Integer> list = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            list.add(i);
        }
        int j = 3;
        while (j <= n) {
            
        }




        return 0;
    }
}
class Joseph1 {
    public  int getResult(int n) {
        // write code here
        if (n < 1) {
            return -1;
        }

        LinkedList<Integer> idList = new LinkedList<>();
        for(int i = 1; i <= n; i += 2){//第一轮偶数全都出局，所以初始化列表只需要奇数就行
            idList.add(i);
        }

        int j = 3;//第二轮开始就是报三个数了
        while(j <= n){
            idList.addFirst(idList.removeLast());//尾部移动到头部

            int len = idList.size();
            int k = 1;
            for(int i = 1; i <= len; i++){//删除时注意列表是在不停缩短的
                if (i % j != 1) {
                    idList.remove(i - k);
                    k++;
                }
            }

            if(idList.size() <= j){
                return idList.getLast();
            }

            j++;
        }

        return 1;
    }

}

//844. 比较含退格的字符串
class Solution8 {
    public boolean backspaceCompare(String S, String T) {
        return delete(S).equals(delete(T));
    }
    public String delete (String str) {
        //初始化一个可变字符串StringBuffer
        StringBuffer sb = new StringBuffer();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char ch = str.charAt(i);
            if (ch != '#') {
                //遍历添加原来字符串中的字符
                sb.append(ch);
            }
            else {
                if(sb.length() > 0) {
                    sb.deleteCharAt(sb.length() - 1);
                    //删除指定位置元素
                }
            }
        }
        return sb.toString();
    }
}


class Solution7 {
    public boolean backspaceCompare(String S, String T) {
        //先解码，再比较
        //字符串S解码
        int outS = 0;//定义当前退格数量
        StringBuilder sbS = new StringBuilder();//初始化解码后字符串
        for(int i=S.length()-1;i>=0;i--){//倒序遍历
            char ch = S.charAt(i);//获取当前字符
            if('#'==ch){//如果是#，当前退格数量自增
                outS++;
            } else {
                if(outS>0){//如果当前退格数量大于0，不记录当前字符，当前退格数量自减
                    outS--;
                } else {//反之则记录当前字符的值
                    sbS.append(ch);
                }
            }
        }
        String s = sbS.reverse().toString();//此处可以反转，也可以不反转，s和t均不反转，直接比较也可

        //字符串T解码，与S过程完全相同
        int outT = 0;
        StringBuilder sbT = new StringBuilder();
        for(int i=T.length()-1;i>=0;i--){
            char ch = T.charAt(i);
            if('#'==ch){
                outT++;
            } else {
                if(outT>0){
                    outT--;
                } else {
                    sbT.append(ch);
                }
            }
        }
        String t = sbT.reverse().toString();
        if(s.equals(t)) {
            return true;
        }
        return false;
    }
}


    //1，数组方法
class Solution2 {
    public int calPoints(String[] ops) {
        int[] s = new int[1001];
        int j = 0;
        int sum = 0;
        for (int i = 0; i < ops.length; i++) {
            switch (ops[i]) {
                case "+":
                    s[j] = s[j - 1] + s[j - 2];
                    j++;
                    break;
                case "D":
                    s[j] = s[j - 1] * 2;
                    j++;
                    break;
                case "C":
                    j--;
                    break;
                default:
                    s[j] = Integer.valueOf(ops[i]);
                    j++;
                    break;
            }
        }
        for (int i = 0; i < j; i++) {
            sum += s[i];
        }
        return sum;
    }
}
     //2,栈方法
class Solution6 {
    public int calPoints(String[] ops) {
        Stack<Integer> stack = new Stack<>();
        int num1 = 0;
        int num2 = 0;
        int result = 0;
        for (int i = 0; i < ops.length; i++) {
            switch (ops[i]) {
                case "+" :
                    //弹出去记录下来再放回去
                    num1 = stack.pop();
                    num2 = stack.pop();
                    stack.push(num2);
                    stack.push(num1);
                    stack.push(num1 + num2);
                    break;
                case "D" :
                    stack.push(stack.peek()*2);
                    break;
                case "C" :
                    stack.pop();
                    break;
                default:
                    stack.push(Integer.parseInt(ops[i]));
                    break;
            }
        }
        while (!stack.isEmpty()) {
            result += stack.pop();
        }
        return result;
    }
}



//栈的压入弹出顺序是否正确
class Solution5 {
    public boolean IsPopOrder(int [] pushA,int [] popA) {
        Stack<Integer> stack = new Stack<>();
        int num = 0;
        for (int i = 0; i < pushA.length; i++) {
            stack.push(pushA[i]);
            //如果栈不为空，且栈顶元素是目标序列的第1个元素，则弹出
            while (!stack.isEmpty() && stack.peek() == popA[num]) {
                stack.pop();
                num++;  //元素弹出后开始检测popA下一个
            }
        }
        return stack.isEmpty();
    }
}

//逆波兰表达式求值
    //1,栈方法
class Solution4 {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        int result = 0;
        int a ;
        for (int i = 0; i < tokens.length; i++) {
            switch (tokens[i]) {
                case "+" :
                    a = stack.pop();
                    result = a + stack.pop() ;
                    stack.push(result);
                    break;
                case "-" :
                    a = stack.pop();
                    result = stack.pop() - a;
                    stack.push(result);
                    break;
                case "*" :
                    a = stack.pop();
                    result = a * stack.pop();
                    stack.push(result);
                    break;
                case "/" :
                    a = stack.pop();
                    result = stack.pop() / a;
                    stack.push(result);
                    break;
                default:
                    stack.push(Integer.parseInt(tokens[i]));
                    break;
            }
        }
        return stack.peek();
    }
}


    //数组方法
class Solution1 {
    public int evalRPN(String[] tokens) {
        int[] arr = new int[tokens.length];
        int j = 0;
        for (int i = 0; i < tokens.length; i++) {
            switch (tokens[i]){
                case "+" :
                    arr[j - 2] += arr[j-1];
                    j--;
                    break;
                case "-" :
                    arr[j - 2] -= arr[j-1];
                    j--;
                    break;
                case "*" :
                    arr[j - 2] *= arr[j-1];
                    j--;
                    break;
                case "/" :
                    arr[j - 2] /= arr[j-1];
                    j--;
                    break;
                default:
                    arr[j++] = Integer.parseInt(tokens[i]);
            }
        }
        return arr[0];
    }
}




//股票价格跨度
class StockSpanner {
    Stack<Integer> prices;
    Stack<Integer> weights;

    public StockSpanner() {
        prices = new Stack<>();
        weights = new Stack<>();
    }
    public int next(int price) {
        int x = 1;
        while (!prices.empty() && prices.peek() <= price) {
            prices.pop();
            x += weights.pop();
        }
        prices.push(price);
        weights.push(x);
        return x;
    }
}

