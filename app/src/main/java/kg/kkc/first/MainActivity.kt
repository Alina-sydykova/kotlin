package kg.kkc.first

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            UsersList()
        }
    }
}


// одна карточка


@Composable
fun ProfileCard() {
    // Внешний Column 
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
    ) {

        // Box  карточка с фоном
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .clip(RoundedCornerShape(20.dp))
                .background(Color(0xFF263238))
                .padding(16.dp)
        ) {

            //  три строки шли друг под другом
            Column(
                verticalArrangement = Arrangement.spacedBy(16.dp)
            ) {

                //  аватар + имя и профессия
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.spacedBy(12.dp)
                ) {
                    // Круглый аватар
                    Box(
                        modifier = Modifier
                            .size(64.dp)
                            .clip(CircleShape)
                            .background(Color(0xFF42A5F5)),
                        contentAlignment = Alignment.Center
                    ) {
                        Text(
                            text = "Т",
                            fontSize = 28.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color.White
                        )
                    }

                    // Имя и профессия друг под другом
                    Column {
                        Text(
                            text = "Тилек Абдрахманов",
                            fontSize = 20.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color.White
                        )
                        Text(
                            text = "Android-разработчик",
                            fontSize = 14.sp,
                            color = Color.LightGray
                        )
                    }
                }

                // три блока статистики
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.spacedBy(8.dp)
                ) {
                    // Блок 1
                    Column(
                        modifier = Modifier
                            .weight(1f)
                            .clip(RoundedCornerShape(12.dp))
                            .background(Color(0xFF37474F))
                            .padding(vertical = 10.dp),
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Text("12", fontSize = 22.sp, fontWeight = FontWeight.Bold, color = Color.White)
                        Text("проектов", fontSize = 12.sp, color = Color.LightGray)
                    }

                    // Блок 2
                    Column(
                        modifier = Modifier
                            .weight(1f)
                            .clip(RoundedCornerShape(12.dp))
                            .background(Color(0xFF37474F))
                            .padding(vertical = 10.dp),
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Text("48", fontSize = 22.sp, fontWeight = FontWeight.Bold, color = Color.White)
                        Text("задач", fontSize = 12.sp, color = Color.LightGray)
                    }

                    // Блок 3
                    Column(
                        modifier = Modifier
                            .weight(1f)
                            .clip(RoundedCornerShape(12.dp))
                            .background(Color(0xFF37474F))
                            .padding(vertical = 10.dp),
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Text("5", fontSize = 22.sp, fontWeight = FontWeight.Bold, color = Color.White)
                        Text("лет опыта", fontSize = 12.sp, color = Color.LightGray)
                    }
                }

                //  две кнопки
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.spacedBy(8.dp)
                ) {
                    Button(
                        onClick = { },
                        modifier = Modifier.weight(1f)
                    ) {
                        Text("Написать")
                    }

                    Button(
                        onClick = { },
                        modifier = Modifier.weight(1f)
                    ) {
                        Text("Подписаться")
                    }
                }
            }
        }
    }
}


//  три карточки через forEach


//  хранятся данные одного человека
data class User(
    val name: String,
    val profession: String,
    val projects: Int,
    val tasks: Int,
    val years: Int
)

@Composable
fun UsersList() {
    // Список из трёх людей
    val users = listOf(
        User("Тилек Абдрахманов", "Android-разработчик", 12, 48, 5),
        User("Айгерим Сатыбалдиева", "UI/UX-дизайнер", 20, 85, 4),
        User("Нурлан Эсенов", "Backend-разработчик", 9, 63, 7)
    )

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .verticalScroll(rememberScrollState())
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        // Для каждого человека рисуем свою карточку
        users.forEach { user ->

            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .clip(RoundedCornerShape(20.dp))
                    .background(Color(0xFF263238))
                    .padding(16.dp)
            ) {
                Column(
                    verticalArrangement = Arrangement.spacedBy(16.dp)
                ) {

                    //  аватар + имя и профессия
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.spacedBy(12.dp)
                    ) {
                        Box(
                            modifier = Modifier
                                .size(64.dp)
                                .clip(CircleShape)
                                .background(Color(0xFF42A5F5)),
                            contentAlignment = Alignment.Center
                        ) {
                            Text(
                                text = user.name.first().toString(),
                                fontSize = 28.sp,
                                fontWeight = FontWeight.Bold,
                                color = Color.White
                            )
                        }

                        Column {
                            Text(
                                text = user.name,
                                fontSize = 20.sp,
                                fontWeight = FontWeight.Bold,
                                color = Color.White
                            )
                            Text(
                                text = user.profession,
                                fontSize = 14.sp,
                                color = Color.LightGray
                            )
                        }
                    }

                    //  статистика
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.spacedBy(8.dp)
                    ) {
                        Column(
                            modifier = Modifier
                                .weight(1f)
                                .clip(RoundedCornerShape(12.dp))
                                .background(Color(0xFF37474F))
                                .padding(vertical = 10.dp),
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            Text("${user.projects}", fontSize = 22.sp, fontWeight = FontWeight.Bold, color = Color.White)
                            Text("проектов", fontSize = 12.sp, color = Color.LightGray)
                        }

                        Column(
                            modifier = Modifier
                                .weight(1f)
                                .clip(RoundedCornerShape(12.dp))
                                .background(Color(0xFF37474F))
                                .padding(vertical = 10.dp),
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            Text("${user.tasks}", fontSize = 22.sp, fontWeight = FontWeight.Bold, color = Color.White)
                            Text("задач", fontSize = 12.sp, color = Color.LightGray)
                        }

                        Column(
                            modifier = Modifier
                                .weight(1f)
                                .clip(RoundedCornerShape(12.dp))
                                .background(Color(0xFF37474F))
                                .padding(vertical = 10.dp),
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            Text("${user.years}", fontSize = 22.sp, fontWeight = FontWeight.Bold, color = Color.White)
                            Text("лет опыта", fontSize = 12.sp, color = Color.LightGray)
                        }
                    }

                    //  кнопки
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.spacedBy(8.dp)
                    ) {
                        Button(onClick = { }, modifier = Modifier.weight(1f)) {
                            Text("Написать")
                        }
                        Button(onClick = { }, modifier = Modifier.weight(1f)) {
                            Text("Подписаться")
                        }
                    }
                }
            }
        }
    }
}

// чтобы видеть результат 
@Preview(showBackground = true)
@Composable
fun ProfileCardPreview() {
    ProfileCard()
}

@Preview(showBackground = true)
@Composable
fun UsersListPreview() {
    UsersList()
}