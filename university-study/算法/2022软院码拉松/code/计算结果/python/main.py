from operator import index
from turtle import left, right


def caculate(str):

    def f(s:str):
        if s[-1]=="T" : return s[2]
        if s[-1]=="F" : return s[0]
    
    str = str[::-1]
    while n:=len(str)>1:
        index = str.find("?")
        left = str[index:-3]
        right = str[index+2:]
        mid = f(str[index-3:index+2])
        str = left + right + mid
    return str


if __name__ == '__main__':
    str = input()
    print(caculate(str))