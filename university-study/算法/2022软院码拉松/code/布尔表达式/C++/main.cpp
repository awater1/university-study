#include <iostream>
#include <stack>
#include <string>

using namespace std;

bool trueOrFalse(string expression) {
    int n = expression.size();
        stack<bool> st1;
        stack<char> st2;
        for (char c : expression) {
            switch(c) {
                case 'f':
                    st1.push(false);
                    break;
                case 't':
                    st1.push(true);
                    break;
                case '!':
                case '&':
                case '|':
                case ',':
                    st2.push(c);
                    break;
                case ')':
                {
                    // ¼ÆËã¶ººÅÊýÁ¿
                    int num = -1;
                    char s;
                    do {
                        s = st2.top();
                        st2.pop();
                        num ++;
                    } while (s == ',');
                    switch (s) {
                        case '!':
                        {
                            bool v = st1.top();
                            st1.pop();
                            v = !v;
                            st1.push(v);
                            break;
                        }
                        case '&':
                        {
                            bool v = st1.top();
                            st1.pop();
                            while (num -- ) {
                                v &= st1.top();
                                st1.pop();
                            }
                            st1.push(v);
                            break;
                        }
                        case '|':
                        {
                            bool v = st1.top();
                            st1.pop();
                            while (num -- ) {
                                v |= st1.top();
                                st1.pop();
                            }
                            st1.push(v);
                            break;
                        }
                    }
                    break;
                }
            }
        }
        return st1.top();
}

int main()

{

string str;

cin>>str;

cout<<trueOrFalse(str)<<endl;

return 0;

}
