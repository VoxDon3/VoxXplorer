.class public final synthetic Lax/f1/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lax/q7/u;


# instance fields
.field public final synthetic q:I


# direct methods
.method public synthetic constructor <init>(I)V
    .registers 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lax/f1/g;->q:I

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .registers 2

    .line 1
    iget v0, p0, Lax/f1/g;->q:I

    invoke-static {v0}, Lax/f1/e$b;->b(I)Landroid/os/HandlerThread;

    move-result-object v0

    return-object v0
.end method
