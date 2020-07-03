package com.example.materialdialogreport

import android.app.Dialog
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.FrameLayout
import com.afollestad.materialdialogs.MaterialDialog
import com.google.android.material.bottomsheet.BottomSheetBehavior
import com.google.android.material.bottomsheet.BottomSheetDialog
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import com.google.android.material.dialog.MaterialAlertDialogBuilder

class BottomSheetDialog : BottomSheetDialogFragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.bottom_sheet_dialog, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<Button>(R.id.button).setOnClickListener {
            MaterialAlertDialogBuilder(requireContext())
                .setTitle("Example dialog title")
                .setMessage("Did you notice the flicker in the background")
                .setPositiveButton("Yes", null)
                .setNegativeButton("No", null)
                .show()
        }

        view.findViewById<Button>(R.id.button_expected).setOnClickListener {
            MaterialDialog(requireContext()).show {
                title(text ="Example dialog title")
                message(text = "This is how I expect a dialog to appear")
            }
        }
    }
}