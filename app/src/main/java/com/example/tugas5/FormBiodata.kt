package com.example.tugas5

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Checkbox
import androidx.compose.material3.CheckboxDefaults
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp

@Composable
fun FormBiodata(modifier: Modifier = Modifier) {
    var textNamaDepan by remember { mutableStateOf("") }
    var textNamaBelakang by remember { mutableStateOf("") }
    var textEmail by remember { mutableStateOf("") }
    var textTglLahir by remember { mutableStateOf("") }
    var textExperience by remember { mutableStateOf("") }

    var skillAndroid by remember { mutableStateOf(false) }
    var skillUiUx by remember { mutableStateOf(false) }
    var skillWeb by remember { mutableStateOf(false) }

    Box(
        modifier = modifier.fillMaxSize()
    ) {
        Image(
            painter = painterResource(id = R.drawable.spider_neon),
            contentDescription = stringResource(id = R.string.desc_bg),
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .fillMaxWidth()
                .height(dimensionResource(id = R.dimen.header_height))
                .align(Alignment.TopCenter)
        )

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight()
                .padding(top = dimensionResource(id = R.dimen.box_floating_top))
                .clip(
                    RoundedCornerShape(
                        topStart = dimensionResource(id = R.dimen.box_corner_radius),
                        topEnd = dimensionResource(id = R.dimen.box_corner_radius)
                    )
                )
                .background(colorResource(id = R.color.box_bg))
                .padding(dimensionResource(id = R.dimen.padding_screen))
        ) {
            Column(
                modifier = Modifier.fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = stringResource(id = R.string.form_biodata),
                    color = colorResource(id = R.color.purple_title),
                    fontSize = dimensionResource(id = R.dimen.font_title).value.sp,
                    fontWeight = FontWeight.Bold
                )

                Spacer(modifier = Modifier.height(dimensionResource(id = R.dimen.spacing_small)))

                Text(
                    text = stringResource(id = R.string.subtitle),
                    color = colorResource(id = R.color.gray_subtitle),
                    fontSize = dimensionResource(id = R.dimen.font_subtitle).value.sp
                )

                Spacer(modifier = Modifier.height(dimensionResource(id = R.dimen.spacing_large)))

                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.spacedBy(dimensionResource(id = R.dimen.spacing_medium))
                ) {
                    OutlinedTextField(
                        value = textNamaDepan,
                        singleLine = true,
                        shape = RoundedCornerShape(dimensionResource(id = R.dimen.corner_field)),
                        modifier = Modifier.weight(1f),
                        label = { Text(text = stringResource(id = R.string.nama_depan)) },
                        onValueChange = { textNamaDepan = it }
                    )

                    OutlinedTextField(
                        value = textNamaBelakang,
                        singleLine = true,
                        shape = RoundedCornerShape(dimensionResource(id = R.dimen.corner_field)),
                        modifier = Modifier.weight(1f),
                        label = { Text(text = stringResource(id = R.string.nama_belakang)) },
                        onValueChange = { textNamaBelakang = it }
                    )
                }

                Spacer(modifier = Modifier.height(dimensionResource(id = R.dimen.spacing_medium)))

                OutlinedTextField(
                    value = textEmail,
                    singleLine = true,
                    shape = RoundedCornerShape(dimensionResource(id = R.dimen.corner_field)),
                    modifier = Modifier.fillMaxWidth(),
                    label = { Text(text = stringResource(id = R.string.email)) },
                    onValueChange = { textEmail = it }
                )

                Spacer(modifier = Modifier.height(dimensionResource(id = R.dimen.spacing_medium)))

                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.spacedBy(dimensionResource(id = R.dimen.spacing_medium))
                ) {
                    OutlinedTextField(
                        value = textTglLahir,
                        singleLine = true,
                        shape = RoundedCornerShape(dimensionResource(id = R.dimen.corner_field)),
                        modifier = Modifier.weight(1f),
                        label = { Text(text = stringResource(id = R.string.tgl_lahir)) },
                        onValueChange = { textTglLahir = it }
                    )

                    OutlinedTextField(
                        value = textExperience,
                        singleLine = true,
                        shape = RoundedCornerShape(dimensionResource(id = R.dimen.corner_field)),
                        modifier = Modifier.weight(1f),
                        label = { Text(text = stringResource(id = R.string.experience)) },
                        onValueChange = { textExperience = it }
                    )
                }

                Spacer(modifier = Modifier.height(dimensionResource(id = R.dimen.spacing_large)))

                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.Start
                ) {
                    Text(
                        text = stringResource(id = R.string.pilih_skill),
                        color = colorResource(id = R.color.text_input),
                        fontSize = dimensionResource(id = R.dimen.font_label).value.sp,
                        fontWeight = FontWeight.Bold
                    )
                }

                Spacer(modifier = Modifier.height(dimensionResource(id = R.dimen.spacing_small)))

                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Checkbox(
                            checked = skillAndroid,
                            onCheckedChange = { skillAndroid = it },
                            colors = CheckboxDefaults.colors(
                                checkedColor = colorResource(id = R.color.purple_title)
                            )
                        )
                        Text(
                            text = stringResource(id = R.string.skill_android),
                            fontSize = dimensionResource(id = R.dimen.font_label).value.sp
                        )
                    }

                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Checkbox(
                            checked = skillUiUx,
                            onCheckedChange = { skillUiUx = it },
                            colors = CheckboxDefaults.colors(
                                checkedColor = colorResource(id = R.color.purple_title)
                            )
                        )
                        Text(
                            text = stringResource(id = R.string.skill_uiux),
                            fontSize = dimensionResource(id = R.dimen.font_label).value.sp
                        )
                    }

                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Checkbox(
                            checked = skillWeb,
                            onCheckedChange = { skillWeb = it },
                            colors = CheckboxDefaults.colors(
                                checkedColor = colorResource(id = R.color.purple_title)
                            )
                        )
                        Text(
                            text = stringResource(id = R.string.skill_web),
                            fontSize = dimensionResource(id = R.dimen.font_label).value.sp
                        )
                    }
                }

                Spacer(modifier = Modifier.height(dimensionResource(id = R.dimen.spacing_large)))

                Button(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(dimensionResource(id = R.dimen.btn_height)),
                    shape = RoundedCornerShape(dimensionResource(id = R.dimen.btn_corner)),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = colorResource(id = R.color.btn_bg),
                        contentColor = colorResource(id = R.color.btn_text)
                    ),
                    onClick = { }
                ) {
                    Text(
                        text = stringResource(id = R.string.proceed),
                        fontSize = dimensionResource(id = R.dimen.font_btn).value.sp,
                        fontWeight = FontWeight.Bold
                    )
                }
            }
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun FormBiodataPreview() {
    FormBiodata()
}
