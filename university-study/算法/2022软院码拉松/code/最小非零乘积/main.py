if __name__ == '__main__':
    p = int(input())
    ans = (2 ** p - 1) * pow(2 ** p - 2, 2 ** (p - 1) - 1, 10 ** 9 + 7) % (10 ** 9 + 7)
    print(ans)
