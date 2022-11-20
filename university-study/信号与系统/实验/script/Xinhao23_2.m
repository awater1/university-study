a = [ 1 1 1];
b = [0 1];
sys = tf(b,a); % 获取系统模型
t = -20:0.01:20; % 对时间 t 进行离散抽样
ft = cos(t)+cos(10*t);
y = lsim(sys,ft,t);
plot(t,y);
xlabel('t/s')
ylabel('y(t)')