let clickCount = 0
  

let tv = document.getElementById('tv_svg');
tv.addEventListener('click', function () {
   document.getElementById('tv').style.opacity = 1;
   clickCount++;
   winOverlay();
})

let lamp = document.getElementById('lamp');
let light = document.getElementById('light');
let wall1 = document.getElementById('wall1_svg');
let wall2 = document.getElementById('wall2_svg');
let tall_lamp = document.getElementById('tall_svg');

lamp.addEventListener('click', changeOpacityLamp);

light.addEventListener('click', changeOpacityLight);

wall1.addEventListener('click', changeOpacityWall1);

wall2.addEventListener('click', changeOpacityWall2);

tall_lamp.addEventListener('click', changeOpacityTallLamp);

function changeOpacityLamp() {
   document.getElementById('circle').style.opacity = 1;  
   clickCount++
   winOverlay();
}

function changeOpacityLight() {
   document.getElementById('light').style.opacity = 1;  
   clickCount++
   winOverlay();
}

function changeOpacityWall1() {
   document.getElementById('wall1').style.opacity = 1; 
   clickCount++ 
   winOverlay();
}

function changeOpacityWall2() {
   document.getElementById('wall2').style.opacity = 1;  
   clickCount++
   winOverlay();
}

function changeOpacityTallLamp() {
   document.getElementById('tall_lamp').style.opacity = 1;  
   clickCount++
   winOverlay();
}

function winOverlay() {
   if (clickCount === 6) {
      document.getElementsByClassName('overlay')[0].style.display = "block"; 
      clickCount = 0;
   }  
}
 

