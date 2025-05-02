const cake_data:&str = r#"Flavor,Vegan,Price,Emoji
Unicornammon,true,2.00,🦄
Goal Berry,false,3.50,⛳
Chocolate,false,6.00,🍫
Marshmallow,false,6.00,🪢
Vanilla,false,2.99,🍦
Red Velvet,false,8.00,🧁
Carrot,true,2.30,🥕
"#;

fn main() {
    let mut lines = cake_data.lines();
    eprintln!("{}", lines.next());
}
