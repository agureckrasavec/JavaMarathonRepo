package finalProject;

public enum GameCell {
    FREE_CELL("□"), //Ячейка типа "море"
    SHIP_CELL("■"), //Используется для однопалбного корабля
    SHIP21_CELL("■"), //Используется для 1 двухпалубного корабля
    SHIP22_CELL("■"), //Используется для 2 двухпалубного корабля
    SHIP23_CELL("■"), //Используется для 3 двухпалубного корабля
    SHIP31_CELL("■"), //Используется для 1 трехпалубного корабля
    SHIP32_CELL("■"), //Используется для 2 трехпалубного корабля
    SHIP4_CELL("■"), //Используется для четырехпалубного корабля
    SHIP_HALO("▤"), //Используется для ореола корабля
    PADDED_CELL("⛝"), //Ячейка тип "попадание"
    MISS_CELL("▩"); //Ячейка промаха используемая в дополнительной матрице

    private String img;

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    GameCell(String img) {
        this.img = img;
    }

    @Override
    public String toString() {
        return img;
    }
}
