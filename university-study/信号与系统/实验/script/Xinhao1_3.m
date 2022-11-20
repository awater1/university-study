t=-3:0.01:3; % time vector; unit: second
y_t = 2.*rectpuls(0.5*t); % function vector
figure; plot(t,y_t); % show the figure
axis([min(t) max(t) 0 2.5]) % limit the axis
title('y(t) signal'); 
xlabel('t [s]');
ylabel('y(t)');