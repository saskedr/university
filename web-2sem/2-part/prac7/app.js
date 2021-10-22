let c = document.querySelector("canvas");
let ctx = c.getContext("2d");
ctx.font = "30px Arial";
ctx.fillText("Дерябин Александр Валерьевич", 10, 50);



ctx.beginPath();
ctx.arc(75, 250, 40, 0, 2 * Math.PI);
ctx.stroke();
ctx.beginPath();
ctx.arc(75, 250, 30, 0, 2 * Math.PI);
ctx.stroke();
ctx.fillRect(25,400,100,200);
ctx.clearRect(40,415,70,70);

ctx.beginPath();
ctx.moveTo(60, 100);
ctx.lineTo(110, 150);
ctx.lineTo(110, 50);
ctx.fill();

ctx.beginPath();
ctx.moveTo(75, 100);
ctx.lineTo(100, 125);
ctx.lineTo(100, 75);
ctx.fillStyle = "white"
ctx.fill();

