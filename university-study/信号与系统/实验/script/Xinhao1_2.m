t=-2:0.01:8; % time vector; unit: second
h_t = [exp(-t)-exp((-2)*t)].*heaviside(t); % function vector
figure; plot(t,h_t); % show the figure
axis([min(t) max(t) 0 0.3]) % limit the axis
title('h(t) signal'); 
xlabel('t [s]');
ylabel('h(t)');