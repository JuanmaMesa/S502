package cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.model.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "Game-Dice")
public class GameDiceEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "dice1")
    private byte dice1;

    @Column(name = "dice2")
    private byte dice2;

    @Column(name = "win")
    private boolean win;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "playerID")
    private PlayerEntity player;

    @Transient
    private final byte winValue = 7;



    //TODO  hacer timestamp ( a que hora se jugo la partida)






}
