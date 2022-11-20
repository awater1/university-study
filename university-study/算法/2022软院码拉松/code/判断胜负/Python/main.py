def canWin(s):
    """
        :type s: str
        :rtype: bool
        """
    for i in range(len(s) - 1):
        if s[i:i + 2] == "++" and not canWin(s[:i] + "--" + s[i + 2:]):
            return True
    return False


if __name__ == '__main__':
    s = input()
    print(canWin(s))
