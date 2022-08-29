const hover_event = document.getElementById("hover_event");
const menu = document.getElementById("menu");
hover_event.addEventListener("mouseover", () => {
  if (menu.style.display === "block") {
    menu.style.display = "none";
  } else {
    menu.style.display = "block";
  }
});

const add_menu = document.getElementsByClassName("add_menu");
const add_menu_list = document.getElementsByClassName("add_menu_list");
console.log(add_menu_list[0].style.display);
for (let i = 0; i < document.getElementsByClassName("add_menu").length; i++) {
  add_menu[i].addEventListener("mouseover", () => {
    add_menu_list[i].style.opacity = "1";
  });
  add_menu[i].addEventListener("mouseout", () => {
    add_menu_list[i].style.opacity = "0";
  });
}
