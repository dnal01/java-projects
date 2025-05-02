// LET THEM ...
const EAT_CAKE:&str = r#"Flavor,Vegan,Price,Emoji
Unicornammon,true,2.00,🦄
Goal Berry,false,3.50,⛳
Chocolate,false,6.00,🍫
Marshmallow,false,6.00,🪢
Vanilla,false,2.99,🍦
Red Velvet,false,8.00,🧁
Carrot,true,2.30,🥕
"#;

fn main() {
    let rows = EAT_CAKE.lines();
    let mut header: Vec<&str> = Vec::new();

    for line in rows {
        let line = line.trim();
        if header.is_empty() && !line.is_empty() {
            header = line.split(',').collect();
        }
        println!("{}", line);
    }

}
