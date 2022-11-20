 string getPermutation(int n, int k) {
        static constexpr int FAC[] = {1, 1, 2, 6, 24, 120, 720, 5040, 40320, 362880};	// 阶乘

        vector<int> rest;  // 存放当前可选数，有序
        for(int i = 1;i <= n;i++)
            rest.push_back(i);

        k--;    //要先 -1 才是其康托展开的值
        string ans = "";
        ans.reserve(n);

        for(int i = n; i >= 1; i--)
        {
            int r = k % FAC[i-1];
            int t = k / FAC[i-1];
            k = r;
            ans += to_string(rest[t]);          // 剩余数里第t+1个数为当前位
            rest.erase(rest.begin() + t);       // 移除选做当前位的数
        }

        return ans;
}

