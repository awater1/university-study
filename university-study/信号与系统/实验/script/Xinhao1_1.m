t=-1:0.01:4; % time vector; unit: second
x_t = sin(2*pi*t).*[heaviside(t)-heaviside(t-3)]; % function vector
figure; plot(t,x_t); % show the figure
axis([min(t) max(t) min(x_t) max(x_t)]) % limit the axis
title('x(t) signal'); 
xlabel('t [s]');
ylabel('x(t)');